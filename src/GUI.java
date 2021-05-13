import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton addEvent = new JButton("Add Event");
        JButton deleteEvent = new JButton("Delete Event");
        JLabel eventNameLabel = new JLabel("Event Name Here");
        JTextField eventName = new JTextField(10);

        JLabel locationLabel = new JLabel("Event Location Here");
        JTextField location = new JTextField(10);

        JLabel timeLabel = new JLabel("Event Time Here");
        JTextField time = new JTextField(10);
        JLabel timeline = new JLabel("Timeline");

        JLabel freeHours = new JLabel("Free Hours");

        JPanel mainPanel = new JPanel();
        JPanel rightPanel = new JPanel(); // panel for "EAST"
        JPanel leftPanel = new JPanel();// panel for "WEST"

        //Colors
        Color custom1 = new Color(158, 219, 235);
        rightPanel.setBackground(Color.orange);
        //rightPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        mainPanel.setBackground(Color.lightGray);
        //mainPanel.setBorder(BorderFactory.createLineBorder(Color.blue));
        leftPanel.setBackground(custom1);
        //leftPanel.setBorder(BorderFactory.createLineBorder(Color.red));
        //mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        frame.setLayout(new BorderLayout());
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));
        leftPanel.setLayout(new FlowLayout());
        mainPanel.setLayout(new FlowLayout());

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(leftPanel, BorderLayout.WEST);
        leftPanel.add(freeHours);

        mainPanel.add(timeline);

        rightPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        rightPanel.add(eventNameLabel);
        rightPanel.add(eventName);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        rightPanel.add(locationLabel);
        rightPanel.add(location);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        rightPanel.add(timeLabel);
        rightPanel.add(time);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        rightPanel.add(addEvent);
        rightPanel.add(deleteEvent);


        //frame.add(addEvent, BorderLayout.EAST);
        //frame.add(deleteEvent, BorderLayout.WEST);
        //frame.add(eventName, BorderLayout.WEST);
        frame.setTitle("Down4That");
        //frame.add(location);
        //frame.add(time);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

}
