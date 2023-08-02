/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.languages.mockup.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import uk.ac.kcl.inf.languages.mockup.ui.internal.MockupActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UiMockupLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MockupActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MockupActivator activator = MockupActivator.getInstance();
		return activator != null ? activator.getInjector(MockupActivator.UK_AC_KCL_INF_LANGUAGES_MOCKUP_UIMOCKUPLANGUAGE) : null;
	}

}
