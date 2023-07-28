import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyUI2 extends JFrame implements ActionListener{
    private JLabel lb0, lb1, lb2, lb3, lb4;
    private JButton bt1, bt2, bt3;
    private JTextField tf1, tf2;
    private int sum;
    MyUI2(int count){
        sum = count;
        this.setSize(600, 800);
        this.setTitle("Receipt");

        lb1 = new JLabel("ออกใบเสร็จ");
        lb1.setBounds(240, 100, 200, 50);
        lb1.setFont(new Font("Tahoma", Font.BOLD, 26));
        this.add(lb1);

        lb0 = new JLabel("ยอดทั้งหมด :                "+count);
        lb0.setBounds(80, 200, 500, 50);
        lb0.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb0);

        lb2 = new JLabel("หมายเลขโทรศัพท์ : ");
        lb2.setBounds(80, 250, 200, 50);
        lb2.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb2);
        tf1 = new JTextField(20);  
        tf1.setBounds(300,265,120,25);
        this.add(tf1);

        lb3 = new JLabel("รหัสคูปองส่วนลด : ");
        lb3.setBounds(80, 300, 200, 50);
        lb3.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb3);
        tf2 = new JTextField(20);  
        tf2.setBounds(300,315,120,25);
        this.add(tf2);

        lb4 = new JLabel("ยอดที่ต้องจ่าย : "+count);
        lb4.setBounds(80, 400, 400, 50);
        lb4.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb4);

        bt1 = new JButton("ตกลง");
        bt1.setBounds(250, 500, 130, 30);
        bt1.addActionListener(this);
        this.add(bt1);

        bt2 = new JButton("ย้อนกลับ");
        bt2.setBounds(250, 560, 130, 30);
        bt2.addActionListener(this);
        this.add(bt2);

        bt3 = new JButton("ออกจากระบบ");
        bt3.setBounds(250, 620, 130, 30);
        bt3.addActionListener(this);
        this.add(bt3);

        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int t1 = sum;
        String code = tf2.getText();
        double count = t1/2;
        if (e.getSource() == bt1){
            if(code.equals("CMRU")){
                lb4.setText("ยอดที่ต้องจ่าย : "+count+" บาท");
            }
            else{
                lb4.setText("ยอดที่ต้องจ่าย : "+t1+" บาท");
            }
        }
        else if (e.getSource() == bt2){
            new MyUI();
            this.dispose();
        }
        else if (e.getSource() == bt3){
            System.exit(0);
        }
    }
}