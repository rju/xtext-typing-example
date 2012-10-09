
package de.cau.cs.se.lad;

import de.cau.cs.se.lad.AppLangStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AppLangStandaloneSetup extends AppLangStandaloneSetupGenerated{

	public static void doSetup() {
		new AppLangStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

