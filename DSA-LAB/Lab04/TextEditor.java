import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
public class TextEditor extends JFrame {
    private DLL textList;
    private JTextArea textArea;

    public TextEditor() {
        textList = new DLL();
        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));

        textArea.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                // Update current position in doubly linked list
                int pos = textArea.getCaretPosition();
                textList.current = textList.head;

                for (int i = 0; i < pos; i++) {
                    if (textList.current == null) {
                        break;
                    }
                    textList.current = textList.current.next;
                }
            }
        });

        JButton insertButton = new JButton("Insert");
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Enter text to insert:");
                if (input != null && !input.isEmpty()) {
                    char[] chars = input.toCharArray();
                    for (char c : chars) {
                        textList.insert(c);
                    }
                    updateTextArea();
                }
            }
        });

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textList.delete();
                updateTextArea();
            }
        });

        JButton modifyButton = new JButton("Modify");
        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Enter new character:");
                if (input != null && !input.isEmpty()) {
                    char newData = input.charAt(0);
                    textList.modify(newData);
                    updateTextArea();
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(insertButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(modifyButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setTitle("Text Editor");
    }

    private void updateTextArea() {
        textArea.setText(textList.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextEditor().setVisible(true);
            }
        });
    }
}