package UserInterfaceComponentswithSwing;

import javax.swing.*;
import java.awt.*;

public class AllLayoutsDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AllLayoutsDemo::new);
    }

    public AllLayoutsDemo() {
        JFrame frame = new JFrame("Layout Managers Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // TabbedPane to switch layouts
        JTabbedPane tabs = new JTabbedPane();

        tabs.add("No Layout", createNoLayoutPanel());
        tabs.add("FlowLayout", createFlowLayoutPanel());
        tabs.add("BorderLayout", createBorderLayoutPanel());
        tabs.add("GridLayout", createGridLayoutPanel());
        tabs.add("GridBagLayout", createGridBagLayoutPanel());
        tabs.add("GroupLayout", createGroupLayoutPanel());

        frame.add(tabs);
        frame.setVisible(true);
    }

    // 1. No Layout (Absolute Positioning)
    private JPanel createNoLayoutPanel() {
        JPanel panel = new JPanel(null); // no layout manager
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        b1.setBounds(50, 50, 100, 30);
        b2.setBounds(200, 100, 100, 30);
        panel.add(b1);
        panel.add(b2);
        return panel;
    }

    // 2. FlowLayout
    private JPanel createFlowLayoutPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        return panel;
    }

    // 3. BorderLayout
    private JPanel createBorderLayoutPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);
        panel.add(new JButton("East"), BorderLayout.EAST);
        panel.add(new JButton("West"), BorderLayout.WEST);
        panel.add(new JButton("Center"), BorderLayout.CENTER);
        return panel;
    }

    // 4. GridLayout
    private JPanel createGridLayoutPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 3, 10, 10));
        for (int i = 1; i <= 6; i++) {
            panel.add(new JButton("B" + i));
        }
        return panel;
    }

    // 5. GridBagLayout
    private JPanel createGridBagLayoutPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // padding around components

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("0,0"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JButton("1,0"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JButton("0,1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JButton("1,1"), gbc);

        return panel;
    }

    // 6. GroupLayout
    private JPanel createGroupLayoutPanel() {
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(b1)
                        .addComponent(b2)
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(b1)
                        .addComponent(b2)
        );

        return panel;
    }
}

