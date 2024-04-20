package university;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddStudent extends JFrame implements ActionListener{
    
    JTextField tfname,tffname,tfaddress,tfphone,tfemails,tfx,tfxii,tfaadhar;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox cbcourse,cbbranch;
    JButton submit,cancel;
    
    Random ran=new Random();
    long first3=Math.abs((ran.nextLong() %9000L)+1000L);
    
    
    AddStudent(){
        setSize(900,700);
        setLocation(350,50);
        
        setLayout(null);
        
        JLabel heading=new JLabel("New Student Details");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        
        JLabel lblnamne=new JLabel("Name");
        lblnamne.setBounds(50,150,100,30);
        lblnamne.setFont(new Font("serif",Font.BOLD,20));
        add(lblnamne);
        
        tfname=new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        
        JLabel lblfnamne=new JLabel("Father's Name");
        lblfnamne.setBounds(450,150,200,30);
        lblfnamne.setFont(new Font("serif",Font.BOLD,20));
        add(lblfnamne);
        
        tffname=new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);
        
        
        JLabel lblfrollno=new JLabel("Roll Number");
        lblfrollno.setBounds(50,200,200,30);
        lblfrollno.setFont(new Font("serif",Font.BOLD,20));
        add(lblfrollno);
        
        labelrollno=new JLabel("2021BIFT07AED"+first3);
        labelrollno.setBounds(200,200,200,30);
        labelrollno.setFont(new Font("serif",Font.BOLD,20));
        add(labelrollno);
        
        JLabel lbldob=new JLabel("Date-of-Birth");
        lbldob.setBounds(450,200,200,30);
        lbldob.setFont(new Font("serif",Font.BOLD,20));
        add(lbldob);
        
        dcdob=new JDateChooser();
        dcdob.setBounds(600,200,150,30);
        add(dcdob);
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(50,250,200,30);
        lbladdress.setFont(new Font("serif",Font.BOLD,20));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);
        
        JLabel lblphone=new JLabel("Phone Number");
        lblphone.setBounds(450,250,200,30);
        lblphone.setFont(new Font("serif",Font.BOLD,20));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);
        
        
        JLabel lblemail=new JLabel("Email ID");
        lblemail.setBounds(50,300,200,30);
        lblemail.setFont(new Font("serif",Font.BOLD,20));
        add(lblemail);
        
        tfemails=new JTextField();
        tfemails.setBounds(200,300,150,30);
        add(tfemails);
        
        JLabel lblx=new JLabel("Class X (%)");
        lblx.setBounds(450,300,200,30);
        lblx.setFont(new Font("serif",Font.BOLD,20));
        add(lblx);
        
        tfx=new JTextField();
        tfx.setBounds(600,300,150,30);
        add(tfx);
        
        JLabel lblxii=new JLabel("Class XII (%)");
        lblxii.setBounds(50,350,200,30);
        lblxii.setFont(new Font("serif",Font.BOLD,20));
        add(lblxii);
        
        tfxii=new JTextField();
        tfxii.setBounds(200,350,150,30);
        add(tfxii);
        
        JLabel lblaadhar=new JLabel("Aadhar Number");
        lblaadhar.setBounds(450,350,200,30);
        lblaadhar.setFont(new Font("serif",Font.BOLD,20));
        add(lblaadhar);
        
        tfaadhar=new JTextField();
        tfaadhar.setBounds(600,350,150,30);
        add(tfaadhar);
        
        JLabel lblcourse=new JLabel("Course");
        lblcourse.setBounds(50,400,200,30);
        lblcourse.setFont(new Font("serif",Font.BOLD,20));
        add(lblcourse);
        
        String[] course={"B.TECH","B.COM","BBA","BCA","MSc","BSc","MBA","MCA","MCom","MA","BA"};
        cbcourse=new JComboBox(course);
        cbcourse.setBounds(200,400,150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        JLabel lblbranch=new JLabel("Branch");
        lblbranch.setBounds(450,400,200,30);
        lblbranch.setFont(new Font("serif",Font.BOLD,20));
        add(lblbranch);
        
        String[] branch={"Computer Science","Areospace","Electrical","Mechanical","Civil","IT","Electronics"};
        cbbranch=new JComboBox(branch);
        cbbranch.setBounds(600,400,150,30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        submit=new JButton("Submit");
        submit.setBounds(250,550,150,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("serif",Font.BOLD,15));
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(450,550,150,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif",Font.BOLD,15));
        add(cancel);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==submit){
            String name=tfname.getText();
            String fname=tffname.getText();
            String rollno=labelrollno.getText();
             Date date = dcdob.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dob = sdf.format(date);
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemails.getText();
            String x=tfx.getText();
            String xii=tfxii.getText();
            String aadhar=tfaadhar.getText();
            String course=(String)cbcourse.getSelectedItem();
            String branch=(String)cbbranch.getSelectedItem();
            
            try{
                String query = "insert into student values('"+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+course+"', '"+branch+"')";
                Conn c=new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==cancel){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddStudent();
    }

    
}
