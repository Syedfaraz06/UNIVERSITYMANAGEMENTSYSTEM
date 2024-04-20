package university;
import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("<html><b>Developed By:</b><br>SYED FARAZ AHMED,<br>THIPPANI SONALI BONICCA,<br>RIJAN RAYAMAJHI</html>");
        name.setBounds(70, 220, 550, 100); // Adjust height to accommodate multiple lines
        name.setFont(new Font("Tahoma", Font.BOLD, 20)); // Decrease font size for better readability
        add(name);

        JLabel rollno = new JLabel("<html><b>Roll number:</b><br>2021BIFT07AED023,<br>2021BIFT07AED029,<br>2021BIFT07AED011</html>"); 
        rollno.setBounds(70, 340, 550, 100); // Adjust height to accommodate multiple lines
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 20)); // Decrease font size for better readability
        add(rollno);
        
        JLabel contact = new JLabel("<html><b>Contact:</b><br>syedfarazahmed777@gmail.com,<br>sthippani@gmail.com,<br>rrijanBTECH21@ced.alliance.edu.in</html>");
        contact.setBounds(70, 460, 550, 100); // Adjust height to accommodate multiple lines
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20)); // Decrease font size for better readability
        add(contact);

        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}