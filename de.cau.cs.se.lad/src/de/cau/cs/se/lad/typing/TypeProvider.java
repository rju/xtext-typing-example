package de.cau.cs.se.lad.typing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import de.cau.cs.se.lad.types.Type;

/**
 * 
 * @author chsch -- initial contribution
 * @author rju
 * 
 */
public class TypeProvider implements Resource.Factory, ITypeProvider {

	private final LadTypeURIHelper typeUriHelper;

	private final ResourceSet resourceSet;

	private final PrimitiveTypeFactory primitiveTypeFactory;

	/**
	 * @param resourceSet
	 */
	public TypeProvider(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
		registerProtocol(resourceSet);
		primitiveTypeFactory = new PrimitiveTypeFactory();
		typeUriHelper = new LadTypeURIHelper();
	}

	protected void registerProtocol(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
		        .put(LadURIHelperConstants.PROTOCOL, this);
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	public Iterable<Type> getAllTypes() {
		// Get the (already created) types from the helper resource and cast the list to a list of
		// types.
		return IterableExtensions.map(
		        getResourceSet().getResource(
		                URI.createURI(LadURIHelperConstants.PROTOCOL + ":"
		                        + LadURIHelperConstants.PRIMITIVES), true).getContents(),
		        new Function1<EObject, Type>() {
			        public Type apply(EObject p) {
				        return (Type) p;
			        }
		        });
	}

	/**
	 * Find the type for a given name and return it.
	 * 
	 * @param name The name of the type.
	 * @return Returns the primitive type for a given type name, or null.
	 */
	public Type findTypeByName(String name) {
		if (Strings.isEmpty(name))
			throw new IllegalArgumentException("null");
		URI resourceURI = typeUriHelper.createResourceURI();
		TypeResource resource = (TypeResource) getResourceSet().getResource(resourceURI, true);
		Type result = (Type) resource.getEObject(name); 
		return result;
	}

	/**
	 * Create a type resource for a given URI and assign a PrimitiveMirror to it.
	 * 
	 * @param uri The URI for the resource
	 */
	public TypeResource createResource(URI uri) {
		TypeResource result = new TypeResource(uri);
		final PrimitiveMirror mirror = createMirror(uri);
		if (mirror != null)
			result.setMirror(mirror);
		return result;
	}

	/**
	 * Create a mirror only for primitive types. Throws errors for URIs with a fragment (the stuff
	 * after the # in the URI) and for URIs which are neither references to primitive or object
	 * types.
	 * 
	 * @param resourceURI The URI the mirror is created for.
	 * @return Returns the mirror for primitive types and null for object-types.
	 */
	private PrimitiveMirror createMirror(URI resourceURI) {
		if (resourceURI.hasFragment())
			throw new IllegalArgumentException("Cannot create mirror for uri '"
			        + resourceURI.toString() + "'");
		String name = resourceURI.path();
		if (LadURIHelperConstants.PRIMITIVES.equals(name))
			return new PrimitiveMirror(primitiveTypeFactory);
		if (!name.startsWith(LadURIHelperConstants.OBJECTS))
			throw new IllegalArgumentException("Invalid resource uri '" + resourceURI.toString()
			        + "'");
		return null;
	}

	/**
	 * @returns Returns the URI helper for the type system. 
	 */
	public LadTypeURIHelper getTypeUriHelper() {
		return typeUriHelper;
	}

}
