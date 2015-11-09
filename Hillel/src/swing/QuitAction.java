package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RMysholovka on 09.11.2015.
 */
public class QuitAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
