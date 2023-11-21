import javax.swing.JFrame;
public class GUISwingJFrameExample extends JFrame {
    public GUISwingJFrameExample() {

        super("My first GUI Swing Window");
            this.setSize(400,400);//Size
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);
    }
}
