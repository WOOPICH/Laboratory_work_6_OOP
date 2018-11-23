package woopich.GUI;

import javax.swing.*;

class Logic {

    public static void setLogic(JTextField jTextField, String string, JLabel jLabel, int num, JButton jButton, JButton jButton1) {

        if (jTextField.getText().equals(string)) {
            jTextField.setText("Ураа :)   " + string);
            jButton.setEnabled(false);
            jButton1.setEnabled(true);
        }
        else {
            jLabel.setText("Угадай число " + "           Попытка: " + num);
            if (num == 3) {
                jTextField.setText("Ты неоч :(   " + string);
                jButton.setEnabled(false);
                jButton1.setEnabled(true);
            }
        }
    }

}
