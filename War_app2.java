import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.SwingConstants;

public class War_app2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldFilePath;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    War_app2 frame = new War_app2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public War_app2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textFieldFilePath = new JTextField();
        // Set default path to user's desktop
        textFieldFilePath.setText(FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath());
        textFieldFilePath.setBounds(100, 60, 300, 23);
        contentPane.add(textFieldFilePath);
        textFieldFilePath.setColumns(10);

        JButton btnBrowse = new JButton("Browse");
        btnBrowse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Browse button functionality to select installation path
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    textFieldFilePath.setText(selectedFile.getAbsolutePath());
                }
            }
        });
        btnBrowse.setBounds(100, 94, 89, 23);
        contentPane.add(btnBrowse);

        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the next frame
                War_app3 secondFrame = new War_app3(textFieldFilePath.getText());
                secondFrame.setVisible(true);
                dispose(); // Close current frame
            }
        });
        btnNext.setBounds(200, 227, 89, 23);
        contentPane.add(btnNext);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the program
            }
        });
        btnCancel.setBounds(300, 227, 89, 23);
        contentPane.add(btnCancel);
        
        JLabel lblNewLabel = new JLabel("File Path: ");
        lblNewLabel.setBounds(10, 64, 80, 19);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Select Path to create file ");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(44, 22, 245, 19);
        contentPane.add(lblNewLabel_1);
    }
}
