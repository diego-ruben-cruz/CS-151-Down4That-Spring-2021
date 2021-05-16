import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame {

        public static void main(String[] args) {
                JFrame frame = new JFrame();
                frame.setSize(700, 700);
                // right side of app
                // buttons
                JButton addEvent = new JButton("Add Event");
                JButton deleteEvent = new JButton("Delete Event");
                // event input
                JLabel eventNameLabel = new JLabel("Event Name Here");
                JTextField eventName = new JTextField(50);
                eventName.setMaximumSize(eventName.getPreferredSize());
                // location input
                JLabel locationLabel = new JLabel("Event Location Here");
                JTextField location = new JTextField(50);
                location.setMaximumSize(location.getPreferredSize());
                // time input
                JLabel timeLabel = new JLabel("Event Time Here");
                JTextField time = new JTextField(50);
                time.setMaximumSize(time.getPreferredSize());

                // center of app
                JLabel timelineLabel = new JLabel("Timeline");
                timelineLabel.setHorizontalTextPosition(JLabel.CENTER);

                // left side of app
                JLabel freeHoursLabel = new JLabel("Free Hours");
                JTextField freeHours = new JTextField(10);
                freeHours.setMaximumSize(freeHours.getPreferredSize());
                JCheckBox mon = new JCheckBox("Monday");
                JCheckBox tues = new JCheckBox("Tuesday");
                JCheckBox wed = new JCheckBox("Wednesday");
                JCheckBox thur = new JCheckBox("Thursday");
                JCheckBox fri = new JCheckBox("Friday");
                JCheckBox sat = new JCheckBox("Saturday");
                JCheckBox sun = new JCheckBox("Sunday");
                JButton addHour = new JButton("Add Hours");
                JLabel yourFreeHours = new JLabel("Your Free Hours:");

                JPanel center = new JPanel();
                JPanel left = new JPanel();
                JPanel right = new JPanel();
                // set frame into grid layout with grid layout into 3 columns
                frame.setLayout(new GridLayout(0, 3, 0, 0));
                frame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                frame.add(left);
                frame.add(center);
                frame.add(right);

                // Jpanel Colors
                Color lColor = new Color(255, 153, 153);
                Color cColor = new Color(255, 204, 153);
                Color rColor = new Color(255, 255, 153);
                left.setBackground(lColor);
                center.setBackground(cColor);
                right.setBackground(rColor);

                // left layout
                left.setLayout(new BoxLayout(left, BoxLayout.PAGE_AXIS));
                JPanel left1 = new JPanel();
                JPanel left2 = new JPanel(); // might not need this panel to print outputs out
                left.add(left1);
                left.add(yourFreeHours);
                left.add(left2);

                // left1 layout
                left1.setLayout(new FlowLayout());
                left1.add(freeHoursLabel);
                left1.add(freeHours);
                left1.add(mon);
                left1.add(tues);
                left1.add(wed);
                left1.add(thur);
                left1.add(fri);
                left1.add(sat);
                left1.add(sun);
                left1.add(addHour);

                // left1.setBorder(BorderFactory.createLineBorder(Color.black));
                // left2 layout
                // left2.setBorder(BorderFactory.createLineBorder(Color.GREEN));

                // center layout
                center.setLayout(new FlowLayout());
                center.add(timelineLabel);
                JTextArea timeline = new JTextArea();
                center.add(timeline);

                // right layout
                right.add(Box.createRigidArea(new Dimension(0, 50)));
                right.setLayout(new BoxLayout(right, BoxLayout.PAGE_AXIS));
                right.add(eventNameLabel);
                right.add(Box.createRigidArea(new Dimension(0, 5)));
                right.add(eventName);
                right.add(Box.createRigidArea(new Dimension(0, 5)));
                right.add(locationLabel);
                right.add(Box.createRigidArea(new Dimension(0, 5)));
                right.add(location);
                right.add(Box.createRigidArea(new Dimension(0, 5)));
                right.add(timeLabel);
                right.add(Box.createRigidArea(new Dimension(0, 5)));
                right.add(time);
                right.add(Box.createRigidArea(new Dimension(0, 5)));
                right.add(addEvent);
                right.add(Box.createRigidArea(new Dimension(0, 5)));
                right.add(deleteEvent);
                right.add(Box.createRigidArea(new Dimension(0, 5)));

                // Add event button functionality
                addEvent.addActionListener(e -> {
                        String data = "Event Name: " + eventName.getText() + "    " + " Time: " + time.getText();
                        try {
                                JTextField event = new JTextField(20);
                                JLabel eventNameHolder = new JLabel(location.getText());
                                center.add(eventNameHolder);
                                center.add(event);

                                // voting button labels
                                JLabel upV = new JLabel("Upvote");
                                JLabel downV = new JLabel("Downvote");

                                // up/downvote buttons
                                JButton upVote = new JButton();
                                JButton downVote = new JButton();
                                // makes upvote green, downvote red
                                upVote.setForeground(Color.GREEN);
                                downVote.setForeground(Color.RED);

                                // upvoting button and labels
                                center.add(upV);
                                center.add(upVote);
                                upVote.setText("0");

                                // downvoting button and labels
                                center.add(downV);
                                center.add(downVote);
                                downVote.setText("0");

                                // prints values of the event
                                event.setText(data);
                                event.setEditable(false);

                                // reset text values after adding event
                                eventName.setText("");
                                time.setText("");
                                location.setText("");

                                // upvote counter
                                upVote.addActionListener(new ActionListener() {
                                        int count = 1;

                                        @Override
                                        public void actionPerformed(ActionEvent event) {
                                                upVote.setText(Integer.toString(count++));
                                        }

                                });

                                // downvote counter
                                downVote.addActionListener(new ActionListener() {
                                        int count = -1;

                                        @Override
                                        public void actionPerformed(ActionEvent event) {
                                                downVote.setText(Integer.toString(count--));
                                        }

                                });

                                frame.setVisible(true);

                        } catch (Exception exception) {
                                // do nothing
                        }
                });

                // Basic stuff here
                frame.setTitle("Down4That");
                frame.setPreferredSize(new Dimension(900, 900));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setResizable(true);
                frame.setVisible(true);

        }

}
