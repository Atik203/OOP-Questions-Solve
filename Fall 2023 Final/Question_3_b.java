import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question_3_b extends JFrame implements ActionListener {

    JButton max = new JButton("Max");
    JButton min = new JButton("Min");
    JButton avg = new JButton("Avg");
    JButton clr = new JButton("Clear");

    JLabel num1 = new JLabel("Number 1");
    JLabel num2 = new JLabel("Number 2");
    JLabel num3 = new JLabel("Number 3");
    JLabel result = new JLabel("Result");

    JTextField n1 = new JTextField( 5);
    JTextField n2 = new JTextField(5);
    JTextField n3 = new JTextField(5);
    JTextField res = new JTextField(5);

    Font f = new Font("Arial", Font.BOLD, 20);

    public Question_3_b() {
        super("Question 3");


        max.addActionListener(this);
        min.addActionListener(this);
        avg.addActionListener(this);
        clr.addActionListener(this);

        num1.setFont(f);
        num2.setFont(f);
        num3.setFont(f);
        result.setFont(f);
        n1.setFont(f);
        n2.setFont(f);
        n3.setFont(f);
        res.setFont(f);
        max.setFont(f);
        min.setFont(f);
        avg.setFont(f);
        clr.setFont(f);


        add(num1);
        add(n1);
        add(num2);
        add(n2);
        add(num3);
        add(n3);
        add(result);
        add(res);


        add(max);
        add(min);
        add(avg);
        add(clr);


        setSize(850, 500);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question_3_b();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(n1.getText());
        int b = Integer.parseInt(n2.getText());
        int c = Integer.parseInt(n3.getText());
        if(e.getSource() == max) {
            int max = Math.max(a, Math.max(b, c));
            res.setText(String.valueOf(max));
        } else if (e.getSource() == min) {
            int min = Math.min(a, Math.min(b, c));
            res.setText(String.valueOf(min));
        }
        else if (e.getSource() == avg) {
            double avg = (a + b + c) / 3.0;
            res.setText(String.format("%.2f", avg));
        }
        else if (e.getSource() == clr) {
            n1.setText("");
            n2.setText("");
            n3.setText("");
            res.setText("");
        }
    }
}
