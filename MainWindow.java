import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;

public class MainWindow extends JFrame {

    private JPanel Mainpanel;
    private JTextField txtBhat;
    private JRadioButton rabJapan;
    private JRadioButton rabUSA;
    private JRadioButton rabChina;
    private JRadioButton rabEuro;
    private JLabel JapanResult;
    private JButton butCal;
    private JLabel USAResult;
    private JLabel ChinaResult;
    private JLabel EuroResult;

    public MainWindow() {
        Japan jp = new Japan();
        rabJapan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                jp.JapanCal(Double.parseDouble(txtBhat.getText()));

            }

        });

        USA us = new USA();
        rabUSA.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                us.USACal(Double.parseDouble(txtBhat.getText()));
            }
        });

        China ch = new China();
        rabChina.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                ch.ChinaCal(Double.parseDouble(txtBhat.getText()));
            }
        });
            Euro eu = new Euro();
        rabEuro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                 eu.EuroCal(Double.parseDouble(txtBhat.getText()));
            }
        });
        butCal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

               JapanResult.setText(String.valueOf(jp.JpoutPut()));
               ChinaResult.setText(String.valueOf(ch.ChoutPut()));
               USAResult.setText(String.valueOf(us.UsoutPut()));
               EuroResult.setText(String.valueOf(eu.EuoutPut()));

            }


        });

    }
    public void createframe () {
        MainWindow mw = new MainWindow();
        mw.setContentPane(mw.Mainpanel);
        mw.setTitle("HangMan");
        //mw.setSize(500, 500);
        mw.pack();
        mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mw.setAlwaysOnTop(true);
        mw.setVisible(true);
    }
}
