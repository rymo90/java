import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class event extends JFrame{

  private JTextField item1;
  private JTextField item2;
  private JTextField item3;
  private JPasswordField passwordField;

  public event(){
    super("The Titel");
    setLayout(new FlowLayout());

    item1 = new JTextField(10);
    add(item1);
    item2 = new JTextField("Enter text here");
    add(item2);

    item3 = new JTextField("Uneditable", 20);
    item3.setEditable(false);
    add(item3);

    passwordField = new JPasswordField("mypass");
    add(passwordField);

    thehandler handler = new thehandler();
    item1.addActionListner(handler);
    item2.addActionListner(handler);
    item3.addActionListner(handler);

    passwordField.addActionListner(handler);

  }

  private class thehandler implements ActionListner{
    
  }

}
