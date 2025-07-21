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
    JButton[] alphabeButtons = new JButton[30];
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
    }
}
