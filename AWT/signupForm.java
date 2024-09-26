

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class signupForm extends Frame implements ActionListener {
    
    //constant
    Label title,l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Button btn1, btn2;

    public signupForm() {

        this.setSize(500,500);

        // font 
        Font font = new Font("Serif", Font.ITALIC, 15);
        Font titleFont = new Font("Serif", Font.BOLD, 35);
        
        this.setTitle("Sign Up form");
        this.setBackground(Color.lightGray);
        this.setLayout(null);
        this.setVisible(true);

        // title 
        title = new Label("Sign up");
        title.setBounds(200, 50, 100, 40);
        title.setFont(titleFont);
        title.setForeground(Color.BLACK);
        this.add(title);

        //labels
        l1 = new Label("Full name:");
        l1. setForeground(Color.BLACK);
        l1.setBounds(50, 120,100, 50);
        l1.setFont(font);
        this.add(l1);        
        l2 = new Label("Age:");
        l2. setForeground(Color.BLACK);
        l2.setBounds(50, 180,100, 50);
        l2.setFont(font);
        this.add(l2);        
        l3 = new Label("Gender(M/F):");
        l3. setForeground(Color.BLACK);
        l3.setBounds(50, 240,100, 50);
        l3.setFont(font);
        this.add(l3);        
        l4 = new Label("Address:");
        l4. setForeground(Color.BLACK);
        l4.setBounds(50, 300,100, 50);
        l4.setFont(font);
        this.add(l4);

        // text box
        t1 = new TextField();
        t1.setBounds(180, 130,100, 20);
        this.add(t1);        
        t2 = new TextField();
        t2.setEchoChar('*');
        t2.setBounds(180, 190,100, 20);
        this.add(t2);        
        t3 = new TextField();
        t3.setBounds(180, 250,100, 20);
        this.add(t3);        
        t4 = new TextField();
        t4.setBounds(180, 310,100, 20);
        this.add(t4);

        // buttons
        btn1 = new Button("Sign Up");
        btn1.setForeground(Color.white);
        btn1.setBackground(Color.DARK_GRAY);
        btn1.setBounds(130, 360, 100, 30);
        this.add(btn1);
        btn1.addActionListener(this);
        
        btn2 = new Button("Cancel");
        btn2.setBackground(Color.DARK_GRAY);
        btn2.setForeground(Color.white);
        btn2.setBounds(230, 360, 100, 30);
        this.add(btn2);
        

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });     
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        String age = t2.getText();
        String gender = t3.getText();
        String address = t4.getText();
        if (e.getSource()==btn1) {
            System.out.println("Name->" + name);
            System.out.println("Age->" + age);
            System.out.println("Gender->" + gender);
            System.out.println("Address->" + address);
        }

    }

    public static void main(String[] args) {
        new signupForm();
    }
}
