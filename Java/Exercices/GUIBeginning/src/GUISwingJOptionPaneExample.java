import javax.swing.JOptionPane;
public class GUISwingJOptionPaneExample extends JOptionPane{
    String informação = "My First Dialog Box";
    public GUISwingJOptionPaneExample() {
        super();
        JOptionPane.showMessageDialog(
            getComponentPopupMenu(),
            MESSAGE_PROPERTY,
            TOOL_TIP_TEXT_KEY,
            messageType,
            icon
            );
    }
}
