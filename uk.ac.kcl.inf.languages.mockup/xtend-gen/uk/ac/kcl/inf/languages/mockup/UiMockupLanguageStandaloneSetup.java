/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.languages.mockup;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class UiMockupLanguageStandaloneSetup extends UiMockupLanguageStandaloneSetupGenerated {
  public static void doSetup() {
    new UiMockupLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
