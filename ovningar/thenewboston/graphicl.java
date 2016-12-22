import javax.swing.JOptionPane;

class graphicl{
  public static void main(String[] args) {
    String fn = JOptionPane.showInputDialog("Frist number");
    String sn = JOptionPane.showInputDialog("Secound number");

    int num1 = Integer.parseInt(fn); // converst to nummer
    int num2 = Integer.parseInt(sn); // converst to nummer
    int sum = num1 + num2;

    JOptionPane.showMessageDialog(null, "The answer is " + sum, "the titel", JOptionPane.PLAIN_MESSAGE);
  }
}
// null the position on the mittle
// graphical user interface =  GUI 
