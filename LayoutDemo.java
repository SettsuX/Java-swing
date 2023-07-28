import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutDemo extends JFrame implements ActionListener {
    private JTextField tf1;
    private JPasswordField tp1;
    private JButton bt1;
    private JLabel lb1, lb2, lb3, lb4;

    LayoutDemo(){
        this.setSize(600, 400);
        this.setTitle("Login");

        lb1 = new JLabel("Login");
        lb1.setBounds(265, 50, 200, 50);
        lb1.setFont(new Font("Serif", Font.PLAIN, 30));
        this.add(lb1);

        lb2 = new JLabel("Username");
        lb2.setBounds(250, 90, 200, 50);
        this.add(lb2);

        tf1 = new JTextField(20);  
        tf1.setBounds(250,130,100,25);
        this.add(tf1);

        lb3 = new JLabel("Password");
        lb3.setBounds(250, 150, 200, 50);
        this.add(lb3);

        tp1 = new JPasswordField(20);  
        tp1.setBounds(250,190,100,25);
        this.add(tp1);

        bt1 = new JButton("Login");
        bt1.setBounds(250, 250, 100, 30);
        bt1.addActionListener(this);
        this.add(bt1);

        lb4 = new JLabel("");
        lb4.setBounds(280, 280, 200, 50);
        lb4.setForeground(Color.RED);
        this.add(lb4);

        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent a) {
        String user = tf1.getText();
        String pass = new String (tp1.getPassword());
        if(user.equals("Admin") && pass.equals("Admin")){
            new MyUI();
            this.dispose(); 
        }
        else{
            lb4.setText("Error");   
        }
        
    }
}
