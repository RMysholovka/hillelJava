package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RMysholovka on 09.11.2015.
 */
public class Mainform extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton button1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton plusButton;
    private JButton equaButton;
    private JTextField textField;

    public Mainform() {


        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        button1.addActionListener(new QuitAction());
        ActionListener keyListener = new CalculusLisener(textField);
        button1.addActionListener(keyListener);
        a2Button.addActionListener(keyListener);
        a3Button.addActionListener(keyListener);
        a4Button.addActionListener(keyListener);
        a5Button.addActionListener(keyListener);
        a6Button.addActionListener(keyListener);
        a7Button.addActionListener(keyListener);
        a8Button.addActionListener(keyListener);
        a9Button.addActionListener(keyListener);
        a0Button.addActionListener(keyListener);

        plusButton.addActionListener(keyListener);
        equaButton.addActionListener(keyListener);

        button1.setActionCommand("-");
        a2Button.setActionCommand("+");
        a3Button.setActionCommand("1");
        a4Button.setActionCommand("2");
        a5Button.setActionCommand("3");
        a6Button.setActionCommand("4");
        a7Button.setActionCommand("5");
        a8Button.setActionCommand("6");
        a9Button.setActionCommand("7");
        a0Button.setActionCommand("8");
        plusButton.setActionCommand("9");
        equaButton.setActionCommand("0");

    }


    public static void main(String[] args) {
        new Mainform();
    }

    private static class CalculusLisener implements ActionListener {
        public CalculusLisener(JTextField textField) {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            System.out.println(command + "Key pressed");
        }
    }
}
