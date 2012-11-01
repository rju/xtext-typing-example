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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

import de.cau.cs.se.lad.types.TypesPackage;

/**
 * Global scope provider for primitive types.
 * 
 * @author Reiner Jung
 *
 */
public class PrimitiveTypeScopeProvider implements IGlobalScopeProvider {

    @Inject
    private TypeProviderFactory typeProviderFactory;
    
    @Inject
    private IQualifiedNameConverter qualifiedNameConverter;

    public SimpleTypeScope createTypeScope(ITypeProvider typeProvider,
            Predicate<IEObjectDescription> filter) {
        return new SimpleTypeScope(typeProvider, qualifiedNameConverter, filter);
    }

    public TypeProviderFactory getTypeProviderFactory() {
        return typeProviderFactory;
    }

    public IScope getScope(Resource resource, EReference reference, Predicate<IEObjectDescription> filter) {
        if (resource == null)
                throw new IllegalStateException("context must be contained in a resource");
        ResourceSet resourceSet = resource.getResourceSet();
        if (resourceSet == null)
                throw new IllegalStateException("context must be contained in a resource set");
        EClass referenceType = reference.getEReferenceType();
        if (EcoreUtil2.isAssignableFrom(TypesPackage.Literals.TYPE, referenceType)) {
                ITypeProvider typeProvider = getTypeProviderFactory().getTypeProvider(resourceSet);
                return createTypeScope(typeProvider, filter);
        } else {
                return IScope.NULLSCOPE;
        }
    }
 

}
