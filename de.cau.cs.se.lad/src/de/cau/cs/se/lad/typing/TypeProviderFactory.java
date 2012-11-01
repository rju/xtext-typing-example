/*
 * Science Blog 
 *
 * http://www.se.informatik.uni-kiel.de
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

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

/**
 * The type provider factory controls the type provider, which is created by this class.
 * 
 * @author Christian Schneider - derived this class from
 *         org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory
 * @author Reiner Jung - commentary and cleanups
 */
public class TypeProviderFactory {

	@Inject
	public TypeProviderFactory() {
	}

	/**
	 * Create a new type provider or fetch the already created type provider for the primitive
	 * types.
	 * 
	 * @param resourceSet
	 *            The resource set associated with the type provider.
	 * @return Returns the type provider for primitive types.
	 */
	public ITypeProvider getTypeProvider(ResourceSet resourceSet) {
		if (resourceSet == null) {
			throw new IllegalArgumentException("resourceSet may not be null.");
		} else {
			Object o = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
			        .get(LadURIHelperConstants.PROTOCOL);
			if (o != null) {
				if (!(o instanceof ITypeProvider)) {
					// something went terribly wrong, to be save create a new type provider
					return createTypeProvider(resourceSet);
				} else {
					return (ITypeProvider) o;
				}
			} else
				return createTypeProvider(resourceSet);
		}
	}

	/**
	 * Create a new type provider for primitive types and register it with the resource.
	 * 
	 * @param resourceSet
	 *            The resource set associated with the type provider.
	 * @return Returns the new type provider.
	 */
	private ITypeProvider createTypeProvider(ResourceSet resourceSet) {
			ITypeProvider typeProvider = new TypeProvider(resourceSet);
			resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
			        .put(LadURIHelperConstants.PROTOCOL, typeProvider);
			return typeProvider;

	}

}
