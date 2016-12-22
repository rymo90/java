import javax.swing.JFrame; // basic java futer

class gui_frame_objakt{
  public static void main(String[] args) {

    gui_with_jframe redwan = new gui_with_jframe();

    redwan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    redwan.setSize(275,180);
    redwan.setVisible(true);
  }
}
