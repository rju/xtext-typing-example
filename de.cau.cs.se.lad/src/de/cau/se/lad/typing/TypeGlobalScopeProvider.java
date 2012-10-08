/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.se.lad.typing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

import de.cau.cs.se.lad.types.TypesPackage;

/**
 * This class is a derivative of {@link org.eclipse.xtext.xbase.jvmmodel.JvmGlobalScopeProvider
 * JvmGlobalScopeProvider}.
 * 
 * @author chsch
 */
@SuppressWarnings("restriction")
public class TypeGlobalScopeProvider extends DefaultGlobalScopeProvider { 
    @Inject
    private PrimitiveTypeScopeProvider typeScopeProvider;
    
    @Override
    public IScope getScope(Resource resource, EReference reference, Predicate<IEObjectDescription> filter) {
            IScope parentTypeScope = getParentTypeScope(resource, reference, filter, reference.getEReferenceType());
            return super.getScope(parentTypeScope, resource, false, reference.getEReferenceType(), filter);
    }

    protected IScope getParentTypeScope(Resource resource, EReference reference,
            Predicate<IEObjectDescription> filter, EClass referenceType) {
        IScope parentTypeScope = IScope.NULLSCOPE;
        if (EcoreUtil2.isAssignableFrom(TypesPackage.Literals.TYPE, referenceType)) {
            parentTypeScope = typeScopeProvider.getScope(resource, reference, filter);
        }
        return parentTypeScope;
    }
    
}
