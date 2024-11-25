package ua.edu.ucu.image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;

import lombok.Getter;

@Getter
public class RealImage implements MyImage {
    private JFrame frame;
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Loading image: " + filename);
            return;
        }

        if (frame == null) {
            frame = new JFrame();
            ImageIcon icon = new ImageIcon(filename);
            JLabel label = new JLabel(icon);
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    } 

    public JFrame getFrame() {
        return frame;
    }
}