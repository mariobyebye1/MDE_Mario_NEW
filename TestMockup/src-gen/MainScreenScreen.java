import java.awt.Dimension;
import javax.swing.*;

public class MainScreenScreen extends JFrame {
	private User user;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@1a13f55f firstNameLabel;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@396ed2c1 lastNameLabel;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@456c52b6 activeCheckbox;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@2d649350 saveButton;
	
	public MainScreenScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MainScreen Screen");
		initComponents();
		pack();
		setVisible(true);
	}
	
	private void initComponents() {
		user = new User();
		add(user);
		firstNameLabel = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@1a13f55f();
		user.add(new JLabel("firstNameLabel"));
		user.add(firstNameLabel);
		lastNameLabel = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@396ed2c1();
		user.add(new JLabel("lastNameLabel"));
		user.add(lastNameLabel);
		activeCheckbox = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@456c52b6();
		user.add(new JLabel("activeCheckbox"));
		user.add(activeCheckbox);
		saveButton = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@2d649350();
		user.add(new JLabel("saveButton"));
		user.add(saveButton);
		/* Initialize other components here */
	}

	/* Getters and setters for widgets here */

	/* Optional methods for additional functionality */

}
