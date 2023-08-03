import java.awt.Dimension;
import javax.swing.*;

public class UserScreenScreen extends JFrame {
	private User user;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@6f1c788 firstName;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@1ba928ee lastName;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@2b35262e isAdult;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@2aedda77 save;
	
	public UserScreenScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("UserScreen Screen");
		initComponents();
		pack();
		setVisible(true);
	}
	
	private void initComponents() {
		user = new User();
		add(user);
		firstName = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@6f1c788();
		user.add(new JLabel("firstName"));
		user.add(firstName);
		lastName = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@1ba928ee();
		user.add(new JLabel("lastName"));
		user.add(lastName);
		isAdult = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@2b35262e();
		user.add(new JLabel("isAdult"));
		user.add(isAdult);
		save = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@2aedda77();
		user.add(new JLabel("save"));
		user.add(save);
		// Initialize other components here
	}

	// Getters and setters for attributes here

	// Optional methods for additional functionality

}
