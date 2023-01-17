package governmentinfo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class IDRegistration extends JFrame{
            IDRegistration(){
                
                JPanel pnl2 = new JPanel();
                pnl2.setLayout(null);
               // JPanel pnl3 = new JPanel();
               // pnl3.setLayout(null);
                
                JLabel title3 = new JLabel("Registration for Government Valid ID");
                JLabel mm1 = new JLabel("Please fill up this form: ");
                JLabel name = new JLabel("Full Name:");
                JLabel age = new JLabel("Age:");
                JLabel emailAdd = new JLabel("Email Address:");
                JLabel contactNo = new JLabel("Contact Number:");
                JLabel address = new JLabel("Address:");
                JLabel religion = new JLabel("Religion:");
                JLabel bday = new JLabel("Date of birth:");
                JLabel gender = new JLabel("Gender: ");
                JLabel info = new JLabel("Please bring any of the following to our office:");
                JLabel info2 = new JLabel("Any ID");
                JLabel info3 = new JLabel("2x2 Picture");
                JLabel info4 = new JLabel("Police Clearance");

                JTextField fldName = new JTextField(18);
                JTextField fldAge = new JTextField(18);
                JTextField fldEmail = new JTextField(18);
                JTextField fldContact = new JTextField(18);
                JTextField fldAddress = new JTextField(18);
                JTextField fldReligion = new JTextField(18);
                JTextField fldBday = new JTextField(18);
                JTextField fldGender = new JTextField(18);
                
                JButton Submit = new JButton("Submit");
                JButton clearAll = new JButton("Clear All");
                JButton Finish = new JButton("Finish");
                
                JTextArea outputArea = new JTextArea(10,25);
                outputArea.setBackground(Color.WHITE);
    	        outputArea.setEditable(false);
    	        //outputArea.setFont(setFont);
    	        outputArea.setSize(900, 400);
                
                info.setForeground(Color.red);
                info2.setForeground(Color.red);
                info3.setForeground(Color.red);
                info4.setForeground(Color.red);
                title3.setForeground(Color.red);
                Font font = new Font ("",Font.CENTER_BASELINE, 35);
                title3.setFont(font);
                
                title3.setBounds(200, 20, 700, 100);
                mm1.setBounds(100, 150, 300, 30);
                name.setBounds(100, 200, 300, 30);
                fldName.setBounds(200, 200, 250, 30);
                age.setBounds(100, 250, 250, 30);
                fldAge.setBounds(200, 250, 250, 30);
                emailAdd.setBounds(100, 300, 300, 30);
                fldEmail.setBounds(200, 300, 250, 30);
                contactNo.setBounds(100, 350, 300, 30);
                fldContact.setBounds(200, 350, 250, 30);
                address.setBounds(100, 400, 300, 30);
                fldAddress.setBounds(200, 400, 250, 30);
                religion.setBounds(100, 450, 300, 30);
                fldReligion.setBounds(200, 450, 250, 30);
                bday.setBounds(500, 200, 300, 30);
                fldBday.setBounds(600, 200, 250, 30);
                gender.setBounds(500, 250, 300, 30);
                fldGender.setBounds(600, 250, 250, 30);
                Submit.setBounds(600, 510, 200, 30);
                clearAll.setBounds(100, 510, 200, 30);
                Finish.setBounds(320,500,80,30);
                pnl2.setBounds(50, 60, 350, 330);
                info.setBounds(600,300,300,100);
                info2.setBounds(600,360,300,100);
                info3.setBounds(600,380,300,100);
                info4.setBounds(600,400,300,100);
                
               // pnl3.setBounds(100, 70, 100, 20);
               
                this.setSize(1000, 650);
                this.setLocation(500, 300);
    	        this.setTitle("Registration");
    	        this.setResizable(false);
    	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setVisible(true);
                this.add(title3);
                this.add(mm1);
                this.add(name);
                this.add(age);
                this.add(emailAdd);
                this.add(contactNo);
                this.add(address);
                this.add(religion);
                this.add(fldName);
                this.add(fldAge);
                this.add(fldEmail);
                this.add(fldContact);
                this.add(fldAddress);
                this.add(fldReligion);
                this.add(bday);
                this.add(gender);
                this.add(Submit);
                this.add(fldBday);
                this.add(fldGender);
                this.add(clearAll);
                this.add(info);
                this.add(info2);
                this.add(info3);
                this.add(info4);
                this.setLayout(null);
                
                clearAll.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                fldName.setText("");
                fldAge.setText("");
                fldEmail.setText("");
                fldContact.setText("");
                fldAddress.setText("");
                fldReligion.setText("");
                fldBday.setText("");
                fldGender.setText("");
                outputArea.setText("");
            }
            });
                
                Submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    FileWriter fw = new FileWriter("register.txt", true);
                    fw.write(fldName.getText() + "\n" + fldAge.getText() + "\n" + 
                            fldEmail.getText() + "\n" + fldContact.getText() + "\n" +
                            fldAddress.getText() + "\n" + fldReligion.getText() + "\n" +
                            fldBday.getText() + "\n" + fldGender.getText());
                    fw.close();
                    JFrame r = new JFrame();
                    JLabel RegInfo = new JLabel("Registration Information");
                    RegInfo.setBounds(150,1,300,100);
                    JOptionPane.showMessageDialog(r, "REGISTRATION COMPLETED");
                    //dispose();
                    JFrame output = new JFrame();
                    String fullName = fldName.getText();
                    String Age = fldAge.getText();
                    String Email = fldEmail.getText();
                    String Contact = fldContact.getText();
                    String Address = fldAddress.getText();
                    String Religion = fldReligion.getText();
                    String Bday = fldBday.getText();
                    String Gender = fldGender.getText();
                    outputArea.append("\n Full Name:    " + fullName + "\n\nAge:     " + Age +
                            "\n\nEmail Address:     " + Email + "\n\nContact:     " + Contact +
                            "\n\nFull Address:     " + Address + "\n\nReligion:     " + Religion +
                            "\n\nDate of Birth:     " + Bday + "\n\nGender:     " + Gender);
                    
                        output.setSize(500, 600);
    			output.setLocation(500, 300);
    			output.setTitle("Output");
    			output.setResizable(false);
    			output.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        output.setLayout(null);
                       
                        output.add(Finish);
                        output.add(pnl2);
                        output.add(RegInfo);
                        
                        Submit.setEnabled(false);
    			
                        pnl2.add(outputArea);
                        
                    
                       
                    
                        output.setVisible(true);
                        
                        Finish.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        fldName.setText("");
                        fldAge.setText("");
                        fldEmail.setText("");
                        fldContact.setText("");
                        fldAddress.setText("");
                        fldReligion.setText("");
                        fldBday.setText("");
                        fldGender.setText("");
                        outputArea.setText("");
                        output.dispose();
                        Submit.setEnabled(true);
                    }
                });
                }catch(Exception c){}
            }
            });
                
        }
}
class SignUp extends JFrame{
        SignUp(){
            //JFrame frame2 = new JFrame();
            JLabel lblUN = new JLabel("USERNAME: ");
            JLabel lblPS = new JLabel("PASSWORD: ");
            JLabel lblGov = new JLabel("Government Information System");
            JLabel lblTitle2 = new JLabel("Create a New Account to register for a valid ID");
            
            JButton btnOkay = new JButton("Okay");
            
            JTextField fldUN = new JTextField(18);
            JPasswordField fldPS = new JPasswordField(18);
            
            //SetBounds
            lblGov.setBounds(60, 20, 200, 30);
            lblTitle2.setBounds(20, 60, 300, 30);
            lblUN.setBounds(15,100,80,30);
            fldUN.setBounds(100,100,150,30);
            lblPS.setBounds(15,150,80,30);
            fldPS.setBounds(100,150,150,30);
            btnOkay.setBounds(100, 200, 150, 30);
            
            //frame settings
            this.setSize(460, 400);
            this.setLocation(500, 300);
    	    this.setTitle("Sign Up");
    	    this.setResizable(false);
    	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.add(lblTitle2);
            this.add(lblGov);
            this.add(lblUN);
            this.add(fldUN);
            this.add(lblPS);
            this.add(fldPS);
            this.add(btnOkay);
            this.setLayout(null);
            
            btnOkay.addActionListener((ActionEvent ae) -> {
                try{
                    FileWriter fw = new FileWriter("login.txt", true);
                    fw.write(fldUN.getText() + "\t" + fldPS.getText() + "\n");
                    fw.close();
                    JFrame r = new JFrame();
                    JOptionPane.showMessageDialog(r, "SIGN UP SUCCESSFUL");
                    dispose();
                }catch(Exception e){}
            });
            
                    }
        
}

    class LoginDemo extends JFrame{
        LoginDemo(){
    
    JPanel pnlMain = new JPanel();
    //JPanel pnlSecond = new JPanel();
    //JLabel
    JLabel lblUN = new JLabel("USERNAME: ");
    JLabel lblPS = new JLabel("PASSWORD: ");
    JLabel lblTitle = new JLabel("Create an account or Log in");
    JLabel lblGov = new JLabel("Government Information System");
    JLabel msg = new JLabel();
    //Textfields
    JTextField fldUN = new JTextField(18);
    JPasswordField fldPS = new JPasswordField(18);
    
    Font setFont = new Font ("",Font.ITALIC, 13);
    Font font = new Font ("",Font.CENTER_BASELINE, 20);
    //Buttons
    JButton btnLogin = new JButton("LOG IN");
    JButton btnSignup = new JButton("SIGN UP");
    

        //Frame Settings
        this.setSize(400, 450);
    	this.setLocation(200, 200);
    	this.setTitle("GOVERNMENT INFORMATION SYSTEM");
    	this.setResizable(false);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(pnlMain);
        this.setVisible(true);
        //frame.setVisible(true);
        
        lblGov.setBounds(45, 20, 420, 30);
        lblTitle.setBounds(100, 60, 200, 30);
        lblUN.setBounds(40,150,80,40);
        fldUN.setBounds(150,150,200,35);
        lblPS.setBounds(40,200,80,40);
        fldPS.setBounds(150,200,200,35);
        btnLogin.setBounds(40,320,100,30);
        btnSignup.setBounds(230,320,100,30);
        msg.setBounds(15, 250, 200, 30);
        
        fldUN.setFont(setFont);
        fldPS.setFont(setFont);
        lblGov.setFont(font);
        lblGov.setForeground(Color.RED);
        msg.setForeground(Color.red);
        //lblUN.setFont(setFont);
        
        //JPanel    
        pnlMain.add(lblUN);
        pnlMain.add(fldUN);
        pnlMain.add(lblPS);
        pnlMain.add(fldPS);
        pnlMain.add(btnLogin);
        pnlMain.add(btnSignup);
        pnlMain.add(lblTitle);
        pnlMain.add(lblGov);
        pnlMain.add(msg);
        pnlMain.setLayout(null);
        pnlMain.setBackground(Color.WHITE);
        
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                boolean matched = false;
                String uname = fldUN.getText().toString();
                String pwd = fldPS.getText().toString();
                
                try{
                    FileReader fr = new FileReader("login.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String line;
                    while((line = br.readLine())!=null){
                        if(line.equals(uname + "\t" + pwd)){
                            matched = true;
                            break;
                    }
                }
                fr.close();
                }catch(Exception c){}
                
                if(matched){
                    dispose();
                    IDRegistration third = new IDRegistration();
                    third.setVisible(true);
                }else{
                    msg.setText("Invalid Username or Password!");
                }
            }
        });
         btnSignup.addActionListener((ActionEvent e) -> {
             SignUp s = new SignUp();
             s.setVisible(true);
             s.setBounds(200,200,500,300);
    });
    }
    }

public class GovernmentInfo{
    public static void main(String[] args) {
        LoginDemo lg = new LoginDemo();
        lg.setVisible(true);
    }
}
                 
    

    
    
    
        


    