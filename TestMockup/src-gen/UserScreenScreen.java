import java.awt.Dimension;
import javax.swing.*;

public class UserScreenScreen extends JFrame {
	private User user;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@9868bc7 firstName;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@187eb920 lastName;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@311f00be isAdult;
	private uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@3f854718 save;
	
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
		firstName = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@9868bc7();
		user.add(new JLabel("firstName"));
		user.add(firstName);
		lastName = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@187eb920();
		user.add(new JLabel("lastName"));
		user.add(lastName);
		isAdult = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@311f00be();
		user.add(new JLabel("isAdult"));
		user.add(isAdult);
		save = new uk.ac.kcl.inf.languages.mockup.uiMockupLanguage.impl.ExpressionImpl@3f854718();
		user.add(new JLabel("save"));
		user.add(save);
	}

}
