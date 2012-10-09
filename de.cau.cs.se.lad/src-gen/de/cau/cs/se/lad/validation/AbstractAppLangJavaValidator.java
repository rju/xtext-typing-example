package de.cau.cs.se.lad.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractAppLangJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.cau.cs.se.lad.appLang.AppLangPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://se.cs.cau.de/lad/types"));
		return result;
	}

}
