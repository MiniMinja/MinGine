import javax.swing.*;
import java.awt.*;
public class Mindow extends JPanel{
  private JFrame frame;
  public Mindow(){

    frame = new JFrame();
    frame.add(this);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setUndecorated(true);
    
    frame.setVisible(true);
  }
}
