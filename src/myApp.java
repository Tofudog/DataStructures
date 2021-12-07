import javax.swing.*;
import java.awt.event.ActionListener;

public class myApp {
    private JButton pushMeButton;
    private JPanel panel1;

    public ActionListener buttonMessage() {
        System.out.println("OW! You pushed me!");
        return null;
    }

    public void pressedButton() {
        pushMeButton.addActionListener(this.buttonMessage());
        pushMeButton.setActionCommand("");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
