/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.languages.mockup.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractUiMockupLanguageValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.UiMockupLanguagePackage.eINSTANCE);
		return result;
	}
}
