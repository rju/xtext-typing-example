/*
 * Science Blog
 *
 * http://se.informatik.uni-kiel.de
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

import de.cau.cs.se.lad.types.TypesFactory;
import de.cau.cs.se.lad.types.Type;

/**
 * @author chsch -- initial contribution
 * @author rju -- cleanups
 */
public class PrimitiveTypeFactory implements ITypeFactory<String>{

    /**
     * Create a new type and initialize it with the correct name.
     * 
     * @param name the name of the type to create.
     */
    public Type createType(String name) {
        Type result = TypesFactory.eINSTANCE.createPrimitiveType();
        result.setName(name);
        return result;
    }

}
