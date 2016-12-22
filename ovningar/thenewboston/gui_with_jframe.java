import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;  // import text and picture

public class  gui_with_jframe extends JFrame{
  private JLabel item1;

  public gui_with_jframe(){
    super("The title bar");
    setLayout(new FlowLayout());

    item1 = new JLabel("this is a sentence");
    item1.setToolTipText("This is gona show up on hover");
    add(item1);
  }

}
