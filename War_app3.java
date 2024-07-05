import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class War_app3 extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

    /**
     * Create the frame.
     */
    public War_app3(String selectedFilePath) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblFilePath = new JLabel("Selected File Path:");
        lblFilePath.setBounds(10, 50, 150, 23);
        contentPane.add(lblFilePath);

        JLabel lblSelectedFilePath = new JLabel(selectedFilePath);
        lblSelectedFilePath.setBounds(150, 50, 300, 23);
        contentPane.add(lblSelectedFilePath);

        JButton btnGenerateFile = new JButton("Create File");
        btnGenerateFile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Generate file at the selected file path
            	String filePath = selectedFilePath + File.separator + "generated_file.txt";
            	File file = new File(filePath);

            	if (file.exists()) {
            	    JOptionPane.showMessageDialog(null, "File already exists.", "Warning", JOptionPane.WARNING_MESSAGE);
            	} else {
            	    try {
            	        Files.createFile(Paths.get(filePath));
            	        JOptionPane.showMessageDialog(null, "File generated successfully.");
            	    } catch (IOException ex) {
            	        ex.printStackTrace();
            	        JOptionPane.showMessageDialog(null, "Failed to generate file.", "Error", JOptionPane.ERROR_MESSAGE);
            	    }
            	}
            	War_app4 win4 = new War_app4();
        		win4.show();
            	
            	dispose();
            }
        });
        btnGenerateFile.setBounds(150, 100, 150, 23);
        contentPane.add(btnGenerateFile);
        
        JButton btnNewButton = new JButton("Cancel");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        btnNewButton.setBounds(335, 227, 89, 23);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Back");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		War_app2 win2 = new War_app2();
        		win2.show();
        		
        		dispose();
        	}
        });
        btnNewButton_1.setBounds(236, 227, 89, 23);
        contentPane.add(btnNewButton_1);
    }
}
