
package university;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener{
    
    JMenuItem ex,calc,notepad,facultyInfo,studentInfo,facultyDetails,studentDetails,facultyLeave,studentLeave,facultyLeavedetails,studentLeavedetails,examinationdetails,entermarks,updatefacultyinfo,updatestudentinfo,feestructure,feeform;
    
    Project(){
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2=i1.getImage().getScaledInstance(1530, 800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        JMenuBar mb=new JMenuBar();
        
        
        JMenu newinformation=new JMenu("New Information");
        newinformation.setForeground(Color.blue);
        mb.add(newinformation);
        
        facultyInfo=new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newinformation.add(facultyInfo);
        
        studentInfo=new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newinformation.add(studentInfo);
        
        
        JMenu details=new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);
        
        facultyDetails=new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);
        
        studentDetails=new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.WHITE);
        studentDetails.addActionListener(this);
        details.add(studentDetails);
        
        
        JMenu leave=new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        facultyLeave=new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);
        
        studentLeave=new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        studentLeave.addActionListener(this);
        leave.add(studentLeave);
        
        
        JMenu leaveDetails=new JMenu("Leave Details");
        leaveDetails.setForeground(Color.RED);
        mb.add(leaveDetails);
        
        facultyLeavedetails=new JMenuItem("Faculty Leave Details");
        facultyLeavedetails.setBackground(Color.WHITE);
        facultyLeavedetails.addActionListener(this);
        leaveDetails.add(facultyLeavedetails);
        
        studentLeavedetails=new JMenuItem("Student Leave Details");
        studentLeavedetails.setBackground(Color.WHITE);
        studentLeavedetails.addActionListener(this);
        leaveDetails.add(studentLeavedetails);
        
        
        JMenu exam=new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        examinationdetails=new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        entermarks=new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        
        JMenu updateInfo=new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);
        
        updatefacultyinfo=new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        updatestudentinfo=new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        
        JMenu fee=new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        feestructure=new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        feeform=new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
        
        JMenu utility=new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);
        
        notepad=new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        calc=new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
        
        JMenu exit=new JMenu("Exit");
        exit.setForeground(Color.BLUE   );
        mb.add(exit);
        
        ex=new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        setJMenuBar(mb);
        
//        setSize(1600,850);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                
            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                
            }
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        }else if (msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        }else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        }else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        } else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("About")) {
            new About();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }
    }
    
    
    public static void main(String[] args){
        new Project();
    }

    
    
}
