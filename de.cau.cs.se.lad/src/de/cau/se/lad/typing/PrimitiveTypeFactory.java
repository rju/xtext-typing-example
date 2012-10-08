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

import de.cau.cs.se.lad.types.TypesFactory;
import de.cau.cs.se.lad.types.Type;

/**
 * This class is a derivative of {@link org.eclipse.xtext.common.types.access.impl.PrimitiveTypeFactory
 * PrimitiveTypeFactory}.
 * 
 * @author chsch
 */
@SuppressWarnings("restriction")
public class PrimitiveTypeFactory implements ITypeFactory<String>{

    /**
     * {@inheritDoc}
     */
    public Type createType(String type) {
        Type result = TypesFactory.eINSTANCE.createPrimitiveType();
        result.setName(type);
        return result;
    }

}
