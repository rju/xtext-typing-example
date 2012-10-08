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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.access.IMirror;
import org.eclipse.xtext.common.types.access.TypeResource;
import org.eclipse.xtext.resource.IFragmentProvider;

import de.cau.cs.se.lad.types.TypesPackage;
import de.cau.cs.se.lad.types.PrimitiveType;
import de.cau.cs.se.lad.types.Type;

/**
 * This class is a derivative of {@link org.eclipse.xtext.common.types.access.impl.PrimitiveMirror
 * PrimitiveMirror}.
 * 
 * @author chsch
 */
@SuppressWarnings("restriction")
public class PrimitiveMirror implements IMirror {

    private final ITypeFactory<String> typeFactory;

    public PrimitiveMirror(ITypeFactory<String> typeProvider) {
            this.typeFactory = typeProvider;
    }

    public EObject getEObject(Resource resource, String fragment, IFragmentProvider.Fallback fallback) {
            if (fragment.endsWith("[]")) {
                // TODO
            }
            for (EObject obj: resource.getContents()) {
                    String otherFragment = getFragment(obj, fallback);
                    if (fragment.equals(otherFragment))
                            return obj;
            }
            return fallback.getEObject(fragment);
    }
    
    /**
     * This specialization is introduced to hide the JVMType filtering.
     * {@inheritDoc}
     */
    public String getFragment(EObject obj, IFragmentProvider.Fallback fallback) {
        if (TypesPackage.eINSTANCE.getPrimitiveType().isInstance(obj)) {
            return ((PrimitiveType) obj).getName();
        }
        return fallback.getFragment(obj);
    }
    
    public void initialize(TypeResource typeResource) {
            for(String primitiveType: Primitives.ALL_PRIMITIVE_TYPES) {
                    Type type = typeFactory.createType(primitiveType);
                    typeResource.getContents().add(type);
            }
    }
}
