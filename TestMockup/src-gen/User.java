import java.awt.Dimension;
import javax.swing.*;

public class User extends JPanel {
	private String name;
	private Integer age;

	public User() {
	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	initComponents();
	}
	
	private void initComponents() {
		name = new String();
		add(new JLabel("name"));
		add(name);
		age = new Integer();
		add(new JLabel("age"));
		add(age);
	}

}
