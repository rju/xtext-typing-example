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

import de.cau.cs.se.lad.types.Type;

/**
 * Factory for type management.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API (for the original code in
 *         org.eclipse.xtext.common.types.access.impl.ITypeFactory)
 * @author Christian Schneider - Porting of the original API to this approach
 * @author Reiner Jung - Cleanups and commentary
 */
public interface ITypeFactory<T> {

	/**
	 * Creates a type (actually a primitive type for the given typeId). The typeId can be of
	 * any type, however normally only strings or enumerations are used. 
	 * @param typeId
	 * @return
	 */
	Type createType(T typeId);
}
