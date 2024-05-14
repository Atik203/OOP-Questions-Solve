import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question_3_a extends JFrame implements ActionListener {
    JButton addButton = new JButton("Add");
    int count = 1;

    public Question_3_a() {
        super("Question 3 (a)");


        addButton.addActionListener(this);
        addButton.setBounds(50, 100, 95, 30);
        add(addButton);

        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question_3_a();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addButton)
        {
            JButton newButton = new JButton("Button " + count);
            newButton.setBounds(50, 100, 95, 30);
            add(newButton);
            count++;
            revalidate(); // to refresh the frame
            repaint(); // to ensure the changes are visible

        }
    }
}
