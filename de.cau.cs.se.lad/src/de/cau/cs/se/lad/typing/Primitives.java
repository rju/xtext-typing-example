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
package de.cau.cs.se.lad.typing;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.xtext.xbase.lib.Functions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * This class is a derivative of {@link org.eclipse.xtext.common.types.util.Primitives} and 
 * {@link org.eclipse.xtext.common.types.access.impl.Primitives}.
 * 
 * Use toString() to get a String representation of the particular entries rather than name()
 * as toString() returns the lowerCase representation.
 * 
 * @author chsch
 */
@SuppressWarnings("restriction")
public enum Primitives {
    /** primitve types for lad */
    Boolean,
    Int,
    Float,
    File,
    String;
    
    public String toString() {
        return this.name().toLowerCase();
    }
    
    public static final Collection<String> ALL_PRIMITIVE_TYPES = ListExtensions.map(
            Arrays.asList(Primitives.class.getEnumConstants()),
            new Functions.Function1<Primitives, String>() {

                public String apply(Primitives p) {
                    return p.toString();
                }

            });

}
