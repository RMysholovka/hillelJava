package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RMysholovka on 09.11.2015.
 */
public class CalculusLisener implements ActionListener {
    private JTextField textField;
    private int firstOperand;

    public CalculusLisener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonPressed = e.getActionCommand();
        System.out.println(buttonPressed + " button pressed");


        switch (buttonPressed) {
            case "+":
                firstOperand = Integer.parseInt(textField.getText());
                textField.setText("");
                break;
            case "=":
                Integer secondOperand = Integer.parseInt(textField.getText());
                secondOperand += firstOperand;
                textField.setText(secondOperand.toString());
                break;
            default:
                textField.setText(textField.getText() + buttonPressed);
        }
    }
}
