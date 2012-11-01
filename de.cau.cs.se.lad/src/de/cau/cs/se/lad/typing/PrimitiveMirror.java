/*
 * Science Blog
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.lad.typing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IFragmentProvider;

import de.cau.cs.se.lad.types.TypesPackage;
import de.cau.cs.se.lad.types.PrimitiveType;
import de.cau.cs.se.lad.types.Type;

/**
 * 
 */
public class PrimitiveMirror {

	private final ITypeFactory<String> typeFactory;

	public PrimitiveMirror(ITypeFactory<String> typeProvider) {
		this.typeFactory = typeProvider;
	}

	// TODO what does that method do. It is called by:
	// XtextResource and TypeResource
	/**
	 * Searches for an object in a resource described by a fragment.
	 * 
	 */
	public EObject getEObject(Resource resource, String fragment,
	        IFragmentProvider.Fallback fallback) {
		for (EObject obj : resource.getContents()) {
			String otherFragment = getFragment(obj, fallback);
			if (fragment.equals(otherFragment))
				return obj;
		}
		return fallback.getEObject(fragment);
	}

	// TODO Why do we need to hide something we do not inherit?
	/**
	 * This specialization is introduced to hide the JVMType filtering. {@inheritDoc}
	 */
	public String getFragment(EObject obj, IFragmentProvider.Fallback fallback) {
		if (TypesPackage.eINSTANCE.getPrimitiveType().isInstance(obj)) {
			return ((PrimitiveType) obj).getName();
		}
		return fallback.getFragment(obj);
	}

	/**
	 * Initialises a given type resource with the primitive types from the type enumeration.
	 * 
	 * @param typeResource
	 *            the type resource to be initialised
	 * 
	 */
	public void initialize(final TypeResource typeResource) {
		for (PrimitiveTypes primitiveType : PrimitiveTypes.values()) {
			Type type = typeFactory.createType(primitiveType.lowerCaseName());
			typeResource.getContents().add(type);
		}
	}
}
