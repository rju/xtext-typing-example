/*
 * Science Blog
 *
 * https://se.informatik.uni-kiel.de/
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

/**
 * The primitive types of the language for app development.
 * 
 * @author Reiner Jung - Initial contribution
 * 
 */
public enum PrimitiveTypes {
	/** primitive types for lad */
	BOOLEAN, INT, FLOAT, FILE, STRING;

	/**
	 * Returns the name of an enumeration value in lower case.
	 * 
	 * @return Lower case name
	 */
	public String lowerCaseName() {
		return this.name().toLowerCase();
	}
}
