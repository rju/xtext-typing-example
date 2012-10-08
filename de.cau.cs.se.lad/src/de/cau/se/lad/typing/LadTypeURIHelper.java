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

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.common.types.access.jdt.TypeURIHelper;

/**
 * @author chsch
 */
public class LadTypeURIHelper extends TypeURIHelper {

    public URI createResourceURI(String signature) {
        return URI.createURI(LadURIHelperConstants.PROTOCOL + ':' + LadURIHelperConstants.PRIMITIVES);
    }
    
}
