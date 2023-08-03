import java.awt.Dimension;
import javax.swing.*;

public class DashboardScreenScreen extends JFrame {
	private User user;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@1c88bd2 edit;
	
	public DashboardScreenScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("DashboardScreen Screen");
		initComponents();
		pack();
		setVisible(true);
	}
	
	private void initComponents() {
		user = new User();
		add(user);
		edit = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@1c88bd2();
		user.add(new JLabel("edit"));
		user.add(edit);
	}

}
