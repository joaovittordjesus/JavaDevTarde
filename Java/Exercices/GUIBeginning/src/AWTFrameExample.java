import java.awt.Frame;
public class AWTFrameExample extends Frame {
    public AWTFrameExample() {
        super("My First AWT Window");
        this.setSize(400,400);
        this.setVisible(true);
        this.setResizable(false);
    }
}
