//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GUI {
    public static int gues;
    JTextField gues_fld;
    int count = 1;
    int theNumber = (int) (Math.random() * 100.0D + 1.0D);
    JLabel info;
    boolean won;
    JButton gues_btn;
    Font big = new Font("TimesNewRoman", Font.PLAIN, 25);
    Font mid = new Font("TimesNewRoman", Font.PLAIN, 18);
    int previos = 0;

    public GUI() {
    }

    public void build() {
        JFrame frame = new JFrame("GUESS BOX");
        JPanel vert = new JPanel(new GridLayout(7, 1));
        Box horiz = new Box(0);
        horiz.setBorder(new EmptyBorder(1, 20, 1, 20));
        JLabel head = new JLabel("Угадайка от Вадимки");
        head.setHorizontalAlignment(0);
        head.setFont(big);
        JLabel tasking = new JLabel("Угадайте число в диапазоне 0-100");
        tasking.setFont(mid);
        gues_fld = new JTextField(3);
        gues_fld.setFont(big);
        gues_fld.setSize(60, 30);
        gues_fld.addActionListener((event) -> {
            if (!won) {
                check_guess();
            } else {
                exit_app();
            }

        });
        Box horiz_btn = new Box(0);
        gues_btn = new JButton("Мне повезет!");
        gues_btn.setFont(big);
        horiz_btn.add(Box.createHorizontalStrut(150));
        horiz_btn.add(gues_btn);
        horiz_btn.add(Box.createHorizontalStrut(200));
        info = new JLabel("Введите число и нажмите кнопку");
        info.setHorizontalAlignment(0);
        gues_btn.addActionListener((event) -> {
            if (!won) {
                check_guess();
            } else {
                exit_app();
            }

        });
        info.setFont(mid);
        vert.add(head);
        vert.add(Box.createVerticalStrut(30));
        horiz.add(tasking);
        horiz.add(Box.createHorizontalStrut(50));
        horiz.add(gues_fld);
        horiz.add(Box.createHorizontalStrut(50));
        vert.add(horiz);
        vert.add(Box.createVerticalStrut(30));
        vert.add(horiz_btn);
        vert.add(Box.createVerticalStrut(30));
        vert.add(info);
        frame.add(vert);
        frame.setVisible(true);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void check_guess() {
        info.setForeground(Color.BLACK);
        try {
            gues = Integer.parseInt(gues_fld.getText());
            if ((gues>=0&gues<=100)&previos != gues) {
                if (theNumber == gues) {
                    info.setText("Вы угадали! Попыток: " + count);
                    info.setIcon(new ImageIcon("congrats.png"));
                    gues_btn.setText("Выход");
                    won = true;
                } else if (gues < theNumber) {
                    info.setText("Загаданное число больше! Попыток: " + count);
                    info.setIcon(new ImageIcon("up.png"));
                } else {
                    info.setText("Загаданное число меньше! Попыток: " + count);
                    info.setIcon(new ImageIcon("down.png"));
                }
                ++count;
            } else if (0>gues|gues>100) {
                info.setText("Ответ должен быть числом из диапазона 0-100");
                info.setIcon(new ImageIcon("range.png"));
                info.setForeground(Color.RED);
            }
            else {
                info.setText("Повторный ответ!");
                info.setIcon(new ImageIcon("wrong.png"));
                info.setForeground(Color.RED);
            }
            previos = gues;
        } catch (NumberFormatException ex) {
            info.setText("Ответ должен быть числом из диапазона 0-100");
            info.setIcon(new ImageIcon("no_let.png"));
            info.setForeground(Color.RED);
        }
        gues_fld.requestFocus();
        gues_fld.selectAll();
    }

    public void exit_app() {
        System.exit(0);
    }
}
