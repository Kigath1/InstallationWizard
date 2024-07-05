import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class War_app4 extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    War_app4 frame = new War_app4();
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
    public War_app4() {
        setTitle("Third Wizard");
        setBounds(100, 100, 574, 479);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel user_prompt_panel = new JPanel();
        user_prompt_panel.setBounds(10, 21, 253, 261);
        getContentPane().add(user_prompt_panel);
        user_prompt_panel.setLayout(null);

        JLabel dbString_label = new JLabel("Database Connection String:");
        dbString_label.setFont(new Font("Tahoma", Font.PLAIN, 13));
        dbString_label.setBounds(10, 54, 175, 22);
        user_prompt_panel.add(dbString_label);

        JTextField dbString_tfield = new JTextField();
        dbString_tfield.setBounds(10, 73, 213, 20);
        user_prompt_panel.add(dbString_tfield);
        dbString_tfield.setColumns(10);

        JLabel uname_label = new JLabel("Username:");
        uname_label.setFont(new Font("Tahoma", Font.PLAIN, 13));
        uname_label.setBounds(10, 104, 118, 22);
        user_prompt_panel.add(uname_label);

        JTextField uname_tfield = new JTextField();
        uname_tfield.setBounds(10, 123, 213, 20);
        user_prompt_panel.add(uname_tfield);
        uname_tfield.setColumns(10);

        JLabel pass_label = new JLabel("Password:");
        pass_label.setFont(new Font("Tahoma", Font.PLAIN, 13));
        pass_label.setBounds(10, 154, 90, 20);
        user_prompt_panel.add(pass_label);

        JLabel user_label = new JLabel("User Details");
        user_label.setHorizontalAlignment(SwingConstants.CENTER);
        user_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
        user_label.setBounds(10, 22, 213, 21);
        user_prompt_panel.add(user_label);

        JButton btn_verify = new JButton("Verify");
        btn_verify.setBounds(67, 227, 89, 23);
        btn_verify.setEnabled(false);
        user_prompt_panel.add(btn_verify);

        JPasswordField user_pass = new JPasswordField();
        user_pass.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) { // watch for key strokes
                if (uname_tfield.getText().isEmpty() || dbString_tfield.getText().isEmpty()) {
                    btn_verify.setEnabled(false);
                } else {
                    btn_verify.setEnabled(true);
                }
            }
        });
        user_pass.setBounds(10, 175, 203, 20);
        user_prompt_panel.add(user_pass);


        JPanel SMPT_panel = new JPanel();
        SMPT_panel.setBounds(267, 21, 281, 321);
        getContentPane().add(SMPT_panel);
        SMPT_panel.setLayout(null);

        JLabel smtp_heading = new JLabel("SMTP Details Field");
        smtp_heading.setFont(new Font("Tahoma", Font.PLAIN, 15));
        smtp_heading.setHorizontalAlignment(SwingConstants.CENTER);
        smtp_heading.setBounds(29, 11, 183, 31);
        SMPT_panel.add(smtp_heading);

        JLabel host_error_lbl = new JLabel("");
        host_error_lbl.setHorizontalAlignment(SwingConstants.CENTER);
        host_error_lbl.setBounds(101, 67, 161, 16);
        SMPT_panel.add(host_error_lbl);

        JLabel port_error_lbl = new JLabel("");
        port_error_lbl.setHorizontalAlignment(SwingConstants.CENTER);
        port_error_lbl.setBounds(101, 127, 161, 19);
        SMPT_panel.add(port_error_lbl);

        JLabel uname_error_lbl = new JLabel("");
        uname_error_lbl.setHorizontalAlignment(SwingConstants.CENTER);
        uname_error_lbl.setBounds(109, 186, 153, 19);
        SMPT_panel.add(uname_error_lbl);

        JLabel pass_error_lbl = new JLabel("");
        pass_error_lbl.setBounds(109, 248, 153, 19);
        SMPT_panel.add(pass_error_lbl);

        JLabel smpt_host_lbl = new JLabel("SMTP Host: ");
        smpt_host_lbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
        smpt_host_lbl.setBounds(10, 53, 115, 19);
        SMPT_panel.add(smpt_host_lbl);

        JTextField tfield_host = new JTextField();
        tfield_host.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                host_error_lbl.setEnabled(false);
            }
        });
        tfield_host.setBounds(10, 84, 252, 20);
        SMPT_panel.add(tfield_host);
        tfield_host.setColumns(10);

        JLabel smtp_port_lbl = new JLabel("SMTP Port No: ");
        smtp_port_lbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
        smtp_port_lbl.setBounds(10, 115, 115, 19);
        SMPT_panel.add(smtp_port_lbl);

        JTextField tfield_port = new JTextField();
        tfield_port.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                port_error_lbl.setEnabled(false);
            }
        });
        tfield_port.setColumns(10);
        tfield_port.setBounds(10, 145, 252, 20);
        SMPT_panel.add(tfield_port);

        JLabel smtp_uname_lbl = new JLabel("SMTP Uername: ");
        smtp_uname_lbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
        smtp_uname_lbl.setBounds(10, 176, 115, 19);
        SMPT_panel.add(smtp_uname_lbl);

        JTextField tfield_uname = new JTextField();
        tfield_uname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                uname_error_lbl.setEnabled(false);
            }
        });
        tfield_uname.setColumns(10);
        tfield_uname.setBounds(10, 206, 252, 20);
        SMPT_panel.add(tfield_uname);

        JLabel smtp_pass_lbl = new JLabel("SMTP Password: ");
        smtp_pass_lbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
        smtp_pass_lbl.setBounds(10, 237, 115, 19);
        SMPT_panel.add(smtp_pass_lbl);

        JPasswordField smtp_pass = new JPasswordField();
        smtp_pass.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                pass_error_lbl.setEnabled(false);
            }
        });
        smtp_pass.setBounds(10, 266, 169, 20);
        SMPT_panel.add(smtp_pass);

        JButton btn_cancel = new JButton("Cancel");
        btn_cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_cancel.setBounds(471, 406, 77, 23);
        getContentPane().add(btn_cancel);

        JButton btn_next = new JButton("Next");
        btn_next.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent e) {

                boolean valid = true;

                // Validate fields
                if (tfield_host.getText().trim().isEmpty()) {
                    host_error_lbl.setText("Please provide SMTP Host");
                    valid = false;
                }

                if (tfield_port.getText().trim().isEmpty()) {
                    port_error_lbl.setText("Please provide SMTP Port");
                    valid = false;
                }

                if (tfield_uname.getText().trim().isEmpty()) {
                    uname_error_lbl.setText("Please provide SMTP Username");
                    valid = false;
                }

                if (smtp_pass.getText().trim().isEmpty()) {
                    pass_error_lbl.setText("Please provide SMTP Password");
                    valid = false;
                }

                if (valid) {
                    // Proceed to next frame or action
                    // For now, let's just print a message
                    System.out.println("Next button clicked. Proceeding...");
                }
            }
        });
        btn_next.setBounds(384, 406, 77, 23);
        getContentPane().add(btn_next);

        JButton btn_back = new JButton("Back");
        btn_back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Replace this with your actual back action
                dispose();
                War_app3 win3 = new War_app3(null);
                win3.setVisible(true);
            }
        });
        btn_back.setBounds(297, 406, 77, 23);
        getContentPane().add(btn_back);

        // Set this frame visible
        setVisible(true);
    }
}
