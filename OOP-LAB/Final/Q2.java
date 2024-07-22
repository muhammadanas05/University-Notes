import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Q2 extends JFrame implements ActionListener {
    private Map<String, String> phoneDirectory;
    private JTextField nameField, numberField;
    private JTextArea displayArea;
    private JButton addButton, searchButton, saveButton;
    private static final String FILE_NAME = "phone_directory.txt";
    public void PhoneDirectoryGUI() {
        phoneDirectory = new HashMap<>();
        setTitle("Phone Directory");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        loadPhoneDirectory();
    }
    private void initComponents() {
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel numberLabel = new JLabel("Number:");
        numberField = new JTextField();
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(numberLabel);
        inputPanel.add(numberField);
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Add");
        searchButton = new JButton("Search");
        saveButton = new JButton("Save");
        addButton.addActionListener(this);
        searchButton.addActionListener(this);
        saveButton.addActionListener(this);
        buttonPanel.add(addButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(saveButton);
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    private void loadPhoneDirectory() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String number = parts[1].trim();
                    phoneDirectory.put(name, number);
                }
            }
            displayDirectory();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void displayDirectory() {
        displayArea.setText("");
        for (Map.Entry<String, String> entry : phoneDirectory.entrySet()) {
            displayArea.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }
    }
    private void savePhoneDirectory() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Map.Entry<String, String> entry : phoneDirectory.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            String number = numberField.getText();
            if (!name.isEmpty() && !number.isEmpty()) {
                phoneDirectory.put(name, number);
                displayDirectory();
                nameField.setText("");
                numberField.setText("");
            }
        } else if (e.getSource() == searchButton) {
            String name = nameField.getText();
            String number = phoneDirectory.get(name);
            if (number != null) {
                JOptionPane.showMessageDialog(this, "Number: " + number, "Search Result",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Name not found in the directory.", "Search Result",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == saveButton) {
            savePhoneDirectory();
            JOptionPane.showMessageDialog(this, "Phone directory saved successfully.", "Save",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Q2 directory = new Q2();
            directory.setVisible(true);
        });
    }
}
