
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class login extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2;
    Button btn;

    // Constructor should match the class name
    public login() {
        this.setSize(400, 300);

        // Font setup
        Font font = new Font("Serif", Font.ITALIC, 25);

        // Label
        l1 = new Label("Login Form");
        l1.setFont(font);
        l1.setForeground(Color.black);
        l1.setBounds(140, 50, 150, 40);
        this.add(l1);

        // first row
        // label 
        l2 = new Label("user name: ");
        l2.setFont(font);
        l2.setBounds(20, 100, 150, 40);
        this.add(l2);

        // text field
        t1 = new TextField();
        t1.setBounds(170, 100, 150, 40);
        this.add(t1);

        // second row
        // label
        l3 = new Label("password");
        l3.setForeground(Color.black);
        l3.setFont(font);
        l3.setBounds(20, 150, 150, 40);
        this.add(l3);

        // text box
        t2 = new TextField();
        t2.setBounds(170, 150, 150, 40);
        t2.setEchoChar('*');
        this.add(t2);

        // third row button
        btn = new Button("Login");
        btn.setBackground(Color.black);
        btn.setFont(font);
        btn.setForeground(Color.white);
        btn.setBounds(140, 200, 80, 40);
        this.add(btn);
        btn.addActionListener(this);

        this.setTitle("Login page");
        this.setBackground(Color.CYAN);
        this.setLayout(null);
        this.setVisible(true);

        // Window closing event
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = t1.getText();
        String pass = t2.getText();
        if (e.getSource() == btn) {

            if (user.equals("admin") && pass.equals("123")) {
                System.out.println("welcome admin");
            }
            else {
                System.out.println("wrong  ");
            }
        }
    }

    public static void main(String[] args) {
        // Create instance of 'login' class (not 'Login')
        new login();
    }
}
