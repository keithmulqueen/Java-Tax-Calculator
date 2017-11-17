import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


    public class User extends JFrame implements ActionListener
    {
        private boolean DoECL;
        private String correctPassword = "0000";
        private JLabel enterID, enterRU, enterPassword;
        private JTextField ID, correct, incorrect; 
        private JPasswordField password;
        private JRadioButton buttonOne, buttonTwo;
        private JButton proceed2, cancel2;
        private String passwordCheck;
       
        public User()
        {
            setLayout(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(600,400);
                
            enterRU = new JLabel("Are you a Member of the DoECL:");
            enterRU.setBounds(30, 30, 520, 30);
            add(enterRU);
            
            enterID = new JLabel("Please Enter your user ID:");
            enterID.setBounds(30, 110, 520, 30);
            add(enterID);
     
            ID = new JTextField();                   
            ID.setBounds(30, 140, 520, 30);
            add(ID);
            ID.addActionListener(this);
                
            enterPassword = new JLabel("Please Enter the Company password:");
            enterPassword.setBounds(30, 180, 520, 30);
            add(enterPassword);
     
            password = new JPasswordField();                   
            password.setBounds(30, 210, 520, 30);
            add(password);
            password.addActionListener(this);
           
            
            buttonOne = new JRadioButton("No.");
            buttonOne.setBounds(30, 50, 50, 30);
            add(buttonOne);
            buttonOne.addActionListener(this);
            
            buttonTwo = new JRadioButton("Yes.");
            buttonTwo.setBounds(30, 80, 100, 30);
            add(buttonTwo);
            buttonTwo.addActionListener(this);
            
            ButtonGroup group3 = new ButtonGroup();
            
            group3.add(buttonOne);
            group3.add(buttonTwo);

            buttonOne.addActionListener(this);
            buttonTwo.addActionListener(this);

            proceed2 = new JButton("Okay");
            proceed2.setBounds(30, 300, 100, 30);
            add(proceed2);
            proceed2.addActionListener(this);
            
            
            cancel2 = new JButton("Cancel");
            cancel2.setBounds(170, 300, 100, 30);
            add(cancel2);
            cancel2.addActionListener(this);
            
            correct = new JTextField();                   
            correct.setBounds(30, 250, 520, 30);
            correct.addActionListener(this);
            
            incorrect = new JTextField();                   
            incorrect.setBounds(30, 250, 520, 30);
            incorrect.addActionListener(this);
                
        }
    
        public boolean getDoECL()
        {
            return false;
        }
        
        
        public void setDoECL(boolean DoECL)
        {
            this.DoECL = DoECL;
        }
        
        public void actionPerformed(ActionEvent e)
        {
    
            if(e.getSource() == password)
            {               
                passwordCheck = String.format("%s", e.getActionCommand());
                
                if (passwordCheck == correctPassword)
                {
                    add(correct);
                }
            }
        
            if(e.getSource() == proceed2)
            {   
                Property Property1 = new Property();
            }
            
            if(e.getSource() == cancel2)
            {
                System.exit(EXIT_ON_CLOSE);;
            }   
            
            if(e.getSource() == buttonOne)
            {
                this.DoECL = false;
            }

            if(e.getSource() == buttonTwo)
            {
                this.DoECL = true;
            }
        
        }
    
    }

