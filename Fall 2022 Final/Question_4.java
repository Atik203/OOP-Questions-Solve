import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question_4
{
    public static void main(String[] args) {
        JFrame f = new JFrame("Run");

        final int[] counter = {3};

           JLabel label = new JLabel();
           JButton button = new JButton("Click");


   // write code here

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(counter[0] == 0){
                    label.setText("GO!");
                    counter[0] = 3;
                }else{
                    label.setText( counter[0] + "...");
                    counter[0]--;
                }

            }
        });


        f.add(label);
        f.add(button);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);


    }
}
