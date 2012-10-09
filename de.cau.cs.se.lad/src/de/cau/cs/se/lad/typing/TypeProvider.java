package de.cau.cs.se.lad.typing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.Signature;
import org.eclipse.xtext.common.types.access.IMirror;
import org.eclipse.xtext.common.types.access.TypeResource;
import org.eclipse.xtext.common.types.access.impl.IndexedJvmTypeAccess;
import org.eclipse.xtext.common.types.access.jdt.TypeURIHelper;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import de.cau.cs.se.lad.types.Type;

/**
 * This class is a derivative of {@link org.eclipse.xtext.common.types.access.jdt.JdtTypeProvider
 * JdtTypeProvider}.
 * 
 * @author chsch
 */
@SuppressWarnings("restriction")
public class TypeProvider implements Resource.Factory, ITypeProvider {

    private TypeURIHelper typeUriHelper = new LadTypeURIHelper();

    private final ResourceSet resourceSet;
    
    private final PrimitiveTypeFactory primitiveTypeFactory;
    
    private final IndexedJvmTypeAccess indexedJvmTypeAccess;

    
    /**
     * @param javaProject
     * @param resourceSet
     */
    public TypeProvider(ResourceSet resourceSet) {
        this(null, resourceSet, null);
    }

    /**
     * @param javaProject
     * @param resourceSet
     */
    public TypeProvider(IJavaProject javaProject, ResourceSet resourceSet) {
        this(javaProject, resourceSet, null);
    }

    /**
     * 
     * @param javaProject
     * @param resourceSet
     * @param indexedJvmTypeAccess
     */
    public TypeProvider(IJavaProject javaProject, ResourceSet resourceSet, IndexedJvmTypeAccess indexedJvmTypeAccess) {
        
        this.indexedJvmTypeAccess = indexedJvmTypeAccess;
        this.resourceSet = resourceSet;
        registerProtocol(resourceSet);
        primitiveTypeFactory = new PrimitiveTypeFactory();
    }
    
    protected void registerProtocol(ResourceSet resourceSet) {
        resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(LadURIHelperConstants.PROTOCOL, this);
    }

    public ResourceSet getResourceSet() {
        return resourceSet;
    }

    /**
     * {@inheritDoc}
     * Additionally introduced.
     * 
     * @author chsch
     */
    public Iterable<Type> getAllTypes() {
        // Get the (already created) types from the helper resource and cast the list to a list of (menges) types.
        //  Sometimes I hate the stubbornness if Java generics. 
        return IterableExtensions.map(
                getResourceForJavaURI(
                        URI.createURI(LadURIHelperConstants.PROTOCOL + ":"
                                + LadURIHelperConstants.PRIMITIVES), true).getContents(),
                new Function1<EObject, Type>() {
                    public Type apply(EObject p) {
                        return (Type) p;
                    }
                });
    }

    public Type findTypeByName(String name) {
        if (Strings.isEmpty(name))
            throw new IllegalArgumentException("null");
        String signature = null;
        try {
            signature = name.startsWith("[") ? name : Signature.createTypeSignature(name, true);
        } catch (IllegalArgumentException e) {
            return null;
        }
        URI resourceURI = typeUriHelper.createResourceURI(signature);
        String resourcePath = resourceURI.path();
        if (resourcePath.startsWith(LadURIHelperConstants.PRIMITIVES)) {
            TypeResource resource = (TypeResource) getResourceForJavaURI(resourceURI, true);
            Type result = findTypeBySignature(signature, resource);
            return result;
        }
        return null;
    }
    
//    public Type findTypeByName2(String name) {
//        if (Strings.isEmpty(name))
//                throw new IllegalArgumentException("null");
//        String signature = null;
//        try {
//                signature = name.startsWith("[") ? name : Signature.createTypeSignature(name, true);
//        } catch (IllegalArgumentException e) {
//                return null;
//        }
//        URI resourceURI = typeUriHelper.createResourceURI(signature);
//        String resourcePath = resourceURI.path();
//        if (resourcePath.startsWith(MengesURIHelperConstants.PRIMITIVES)) {
//                TypeResource resource = (TypeResource) getResourceForJavaURI(resourceURI, true);
//                Type result = findTypeBySignature(signature, resource);
//                return result;
//        }
//        return null;
//    }

    /**
     * @since 2.3
     */
    protected Resource getResourceForJavaURI(URI resourceURI, boolean loadOnDemand) {
        return getResourceSet().getResource(resourceURI, loadOnDemand);
    }
    
    public Type findTypeBySignature(String signature, TypeResource resource) {
        // TODO: Maybe iterate the resource without computing a fragment
        String fragment = typeUriHelper.getFragment(signature);
        return (Type) resource.getEObject(fragment);
    }
    
    public TypeResource createResource(URI uri) {
        TypeResource result = doCreateResource(uri);
        final IMirror createMirror = createMirror(uri);
        if (createMirror != null)
            result.setMirror(createMirror);
        return result;
    }

    protected TypeResource doCreateResource(URI uri) {
        TypeResource result = new TypeResource(uri);
        result.setIndexedJvmTypeAccess(indexedJvmTypeAccess);
        return result;
    }

    public IMirror createMirror(URI resourceURI) {
        if (resourceURI.hasFragment())
                throw new IllegalArgumentException("Cannot create mirror for uri '" + resourceURI.toString() + "'");
        String name = resourceURI.path();
        if (LadURIHelperConstants.PRIMITIVES.equals(name))
                return new PrimitiveMirror(primitiveTypeFactory);
        if (!name.startsWith(LadURIHelperConstants.OBJECTS))
                throw new IllegalArgumentException("Invalid resource uri '" + resourceURI.toString() + "'");
        name = name.substring(LadURIHelperConstants.OBJECTS.length());
        // return createMirrorForFQN(name);
        return null;
    }
    
    public TypeURIHelper getTypeUriHelper() {
        return typeUriHelper;
}

}
