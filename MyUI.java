import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyUI extends JFrame implements ActionListener{
    private JTextField tf01, tf02, tf03, tf04, tf05, tf06, tf07, tf08, tf09, tf10, tf11;
    private JLabel lb00, lb0, lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11;
    private JButton bt1, bt2;
    private int count;

    MyUI(){
        this.setSize(600, 800);
        this.setTitle("Main");

        lb00 = new JLabel("ชื่อสินค้า          ราคา                               จำนวน");
        lb00.setBounds(50, 25, 500, 50);
        lb00.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb00);

        lb1 = new JLabel("น้ำดื่ม            15 บาท");
        lb1.setBounds(50, 75, 200, 50);
        lb1.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb1);
        tf01 = new JTextField(20);  
        tf01.setBounds(400,90,100,25);
        this.add(tf01);

        lb2 = new JLabel("น้ำอัดลม        20 บาท");
        lb2.setBounds(50, 125, 200, 50);
        lb2.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb2);
        tf02 = new JTextField(20);  
        tf02.setBounds(400,140,100,25);
        this.add(tf02);

        lb3 = new JLabel("ลูกอม            5  บาท");
        lb3.setBounds(50, 175, 200, 50);
        lb3.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb3);
        tf03 = new JTextField(20);  
        tf03.setBounds(400,190,100,25);
        this.add(tf03);

        lb4 = new JLabel("มาม่า             7  บาท");
        lb4.setBounds(50, 225, 200, 50);
        lb4.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb4);
        tf04 = new JTextField(20);  
        tf04.setBounds(400,240,100,25);
        this.add(tf04);

        lb5 = new JLabel("โจ๊ก               18 บาท");
        lb5.setBounds(50, 275, 200, 50);
        lb5.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb5);
        tf05 = new JTextField(20);  
        tf05.setBounds(400,290,100,25);
        this.add(tf05);

        lb6 = new JLabel("น้ำมัน            50 บาท");
        lb6.setBounds(50, 325, 200, 50);
        lb6.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb6);
        tf06 = new JTextField(20);  
        tf06.setBounds(400,340,100,25);
        this.add(tf06);

        lb7 = new JLabel("น้ำปลา          20 บาท");
        lb7.setBounds(50, 375, 200, 50);
        lb7.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb7);
        tf07 = new JTextField(20);  
        tf07.setBounds(400,390,100,25);
        this.add(tf07);

        lb8 = new JLabel("ซีอิ้วขาว        33 บาท");
        lb8.setBounds(50, 425, 200, 50);
        lb8.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb8);
        tf08 = new JTextField(20);  
        tf08.setBounds(400,440,100,25);
        this.add(tf08);

        lb9 = new JLabel("ยาพารา        20 บาท");
        lb9.setBounds(50, 475, 200, 50);
        lb9.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb9);
        tf09 = new JTextField(20);  
        tf09.setBounds(400,490,100,25);
        this.add(tf09);

        lb10 = new JLabel("อีโน              10 บาท");
        lb10.setBounds(50, 525, 200, 50);
        lb10.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb10);
        tf10 = new JTextField(20);  
        tf10.setBounds(400,540,100,25);
        this.add(tf10);

        lb11 = new JLabel("น้ำแข็ง          5  บาท");
        lb11.setBounds(50, 575, 200, 50);
        lb11.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb11);
        tf11 = new JTextField(20);  
        tf11.setBounds(400,590,100,25);
        this.add(tf11);

        bt1 = new JButton("ตกลง");
        bt1.setBounds(410, 650, 75, 30);
        bt1.addActionListener(this);
        this.add(bt1);

        bt2 = new JButton("เช็คบิล");
        bt2.setBounds(410, 700, 75, 30);
        bt2.addActionListener(this);
        this.add(bt2);

        lb0 = new JLabel("ยอดทั้งหมด : ");
        lb0.setBounds(100, 650, 300, 50);
        lb0.setFont(new Font("Tahoma", Font.BOLD, 20));
        this.add(lb0);

        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int t1 = Integer.parseInt(tf01.getText());
        int t2 = Integer.parseInt(tf02.getText());
        int t3 = Integer.parseInt(tf03.getText());
        int t4 = Integer.parseInt(tf04.getText());
        int t5 = Integer.parseInt(tf05.getText());
        int t6 = Integer.parseInt(tf06.getText());
        int t7 = Integer.parseInt(tf07.getText());
        int t8 = Integer.parseInt(tf08.getText());
        int t9 = Integer.parseInt(tf09.getText());
        int t10 = Integer.parseInt(tf10.getText());
        int t11 = Integer.parseInt(tf11.getText());
        count = (t1*15)+(t2*20)+(t3*5)+(t4*7)+(t5*18)+(t6*50)+(t7*20)+(t8*33)+(t9*20)+(t10*10)+(t11*5);
        if(e.getSource() == bt1){
            lb0.setText("ยอดทั้งหมด : "+count+" บาท");
        }
        else if(e.getSource() == bt2 && count > 0){
            new MyUI2(count);
            this.dispose();
        }
    }
}