package Frame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ServerFrame implements Runnable {

    private JFrame frame;
    private ArrayList<JButton> buttons;

    public ServerFrame() {
        this.frame = new JFrame("Serwer");
    }

    public void renderApplication() {
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(500,300);
        this.frame.setLayout(new FlowLayout());
        this.renderButtons();
        this.frame.setVisible(true);
    }

    public void renderButtons() {
        this.buttons = new ArrayList<>();
        this.buttons.add(new JButton("Rozpocznij pracę portu numer 20 i 21 (FTP)"));
        this.buttons.add(new JButton("Rozpocznij pracę portu numer 22 (SFTP/SSH)"));
        this.buttons.add(new JButton("Rozpocznij pracę portu numer 25 lub 587 (SMTP)"));
        this.buttons.add(new JButton("Rozpocznij pracę portu numer 80 (HTTP)"));
        this.buttons.add(new JButton("Rozpocznij pracę portu numer 110 (POP3)"));
        this.buttons.add(new JButton("Rozpocznij pracę portu numer 143 (IMAP)"));
        this.buttons.add(new JButton("Rozpocznij pracę portu numer 2000 (Baza danych)"));

        for (JButton button: this.buttons) {
            this.frame.add(button);
        }
    }

    public void addActionForButton() {

    }

    @Override
    public void run() {
        this.renderApplication();
    }
}
