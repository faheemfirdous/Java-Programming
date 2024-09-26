
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame implements ActionListener{

    Label title, l1, l2, l3;
    TextField num1, num2, result;
    Button add, sub, mul, div, rem, cancel;

    Font font = new Font("Serif", Font.ITALIC, 15);
    Font titlefont = new Font("Serif", Font.BOLD, 25);

    public Calculator() {

        this.setSize(500, 500);
        this.setTitle("Calculator");
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.LIGHT_GRAY);

        // title 
        Label title = new Label("Calculator");
        title.setBounds(200, 60, 150, 50);
        title.setForeground(Color.BLACK);
        title.setFont(titlefont);
        this.add(title);

        // number label
        Label l1 = new Label("Enter num 1");
        l1.setBounds(50, 105, 100, 50);
        l1.setForeground(Color.BLACK);
        l1.setFont(font);
        this.add(l1);
        Label l2 = new Label("Enter num 2");
        l2.setBounds(50, 185, 100, 50);
        l2.setForeground(Color.BLACK);
        l2.setFont(font);
        this.add(l2);

        Label l3 = new Label("Result");
        l3.setBounds(320, 260, 60, 40);
        l3.setForeground(Color.BLACK);
        l3.setFont(font);
        this.add(l3);

        // text field
        num1 = new TextField();
        num1.setBounds(180, 115, 100, 20);
        this.add(num1);

        num2 = new TextField();
        num2.setBounds(180, 195, 100, 20);
        this.add(num2);
        
        result = new TextField();
        result.setBounds(320, 300, 60, 60);
        this.add(result);
        // buttons 
        add = new Button("+");
        add.setFont(font);
        add.setForeground(Color.white);
        add.setBounds(50, 260, 60, 40);
        add.setBackground(Color.darkGray);
        this.add(add);
        add.addActionListener(this);

        sub = new Button("-");
        sub.setFont(font);
        sub.setForeground(Color.white);
        sub.setBounds(50, 300, 60, 40);
        sub.setBackground(Color.darkGray);
        this.add(sub);
        sub.addActionListener(this);

        mul = new Button("*");
        mul.setFont(font);
        mul.setForeground(Color.white);
        mul.setBounds(110, 260, 60, 40);
        mul.setBackground(Color.darkGray);
        this.add(mul);
        mul.addActionListener(this);

        div = new Button("/");
        div.setFont(font);
        div.setForeground(Color.white);
        div.setBounds(110, 300, 60, 40);
        div.setBackground(Color.darkGray);
        this.add(div);
        div.addActionListener(this);

        rem = new Button("%");
        rem.setFont(font);
        rem.setForeground(Color.white);
        rem.setBounds(170, 260, 60, 40);
        rem.setBackground(Color.darkGray);
        this.add(rem);
        rem.addActionListener(this);

        cancel = new Button("X");
        cancel.setFont(font);
        cancel.setForeground(Color.white);
        cancel.setBounds(170, 300, 60, 40);
        cancel.setBackground(Color.darkGray);
        this.add(cancel);
        cancel.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        int numm1 = Integer.parseInt(num1.getText());
        int numm2 = Integer.parseInt(num2.getText());
        if(e.getSource() == add) {
            result.setText(String.valueOf(numm1 + numm2));
        } else if(e.getSource()== sub) {
            result.setText(String.valueOf(numm1 - numm2));
        } else if(e.getSource() == mul) {
            result.setText(String.valueOf(numm1 * numm2));
        } else if (e.getSource() == div) {
            result.setText(String.valueOf(numm1 / numm2));
        }else if (e.getSource() == rem) {
            result.setText(String.valueOf(numm1 % numm2));
        } else if(e.getSource() == cancel) {
            num1.setText("0");
            num2.setText("0");
            result.setText("0");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
