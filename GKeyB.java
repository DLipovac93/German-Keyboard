import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class GKeyB implements ActionListener {
    JFrame board;
    JTextField textField;
    JButton[] alphabetButtons = new JButton[30];
    JButton[] functionButtons = new JButton[3];
    JButton A, B, C;
    JButton clr, ply, spc;
    Border border = new LineBorder (Color.BLACK, 5);
    Font myFont = new Font("Cosmic Sans",Font.BOLD,60);

    GKeyB() {
        board = new JFrame("German Keyboard");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(1325, 500);
        board.setLayout(null);
        board.setResizable(true);

        textField = new JTextField();
        textField.setBounds(10, 340, 920, 100);
        textField.setFont(myFont);
        textField.setEditable(false);
        textField.setBorder(border);

        A = new JButton("A");
        B = new JButton("B");
        C = new JButton("C");

        clr = new JButton("Clear");
        ply = new JButton("Play");
        spc = new JButton("_");

        alphabetButtons[0] = A;
        alphabetButtons[1] = B;
        alphabetButtons[2] = C;
        functionButtons[0] = clr;
        functionButtons[1] = ply;
        functionButtons[2] = spc;

        for (int i = 0; i < 29; i++) {
            alphabetButtons[i].addActionListener(this);
            alphabetButtons[i].setFont(myFont);
            alphabetButtons[i].setFocusable(false);
            alphabetButtons[i].setBounds(10 + (i % 10) * (120 +10), 10 + (i / 10) * (100 + 10), 120, 100);
            alphabetButtons[i].setBorder(border);
            board.add(alphabetButtons[i]);
        }

        for (int i = 0; i < 3; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBorder(border);
        }
    }
}
