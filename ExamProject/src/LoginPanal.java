import javax.swing.*;
import java.sql.*;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPanal extends JFrame {
	 	JButton btn,btn1,btn2;
	    JLabel l1,l2,jLabel3;
	    JPasswordField pf;
	    JTextField tf;
	    Connection con;
	    ResultSet rs;
	    PreparedStatement ps;
	    String nm,pass,usr="admin";
	   
	private static final long serialVersionUID = 1L;
	public LoginPanal() {
        initComponents();
    }
    private void initComponents() {

        l1 = new JLabel();
        l2 = new JLabel();
        tf = new JTextField();
        jLabel3 = new JLabel();
        pf = new JPasswordField();
        btn = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        l1.setFont(new Font("Tahoma", 0, 24));
        l1.setForeground(new Color(102, 102, 255));
        l1.setText("Please Login");

        l2.setFont(new Font("Tahoma", 0, 14));
        l2.setForeground(new Color(102, 0, 255));
        l2.setText("User Id :");

        tf.setFont(new Font("Tahoma", 0, 14));
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });
        jLabel3.setFont(new Font("Tahoma", 0, 14));
        jLabel3.setForeground(new Color(51, 51, 255));
        jLabel3.setText("Password :");
        pf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pfActionPerformed(evt);
            }
        });
        btn.setBackground(new Color(0, 255, 51));
        btn.setFont(new Font("Tahoma", 0, 14));
        btn.setForeground(new Color(51, 51, 255));
        btn.setText("New");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        btn1.setBackground(new Color(0, 255, 102));
        btn1.setFont(new Font("Tahoma", 0, 14));
        btn1.setForeground(new Color(51, 51, 255));
        btn1.setText("Login");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn2.setBackground(new Color(0, 255, 0));
        btn2.setFont(new Font("Tahoma", 0, 14)); 
        btn2.setForeground(new Color(51, 51, 255));
        btn2.setText("Cancel");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
     
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(l1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3,GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(l2, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btn)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(tf)
                            .addComponent(pf,GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(btn2)))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 45,GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pf)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn,GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1,GroupLayout.PREFERRED_SIZE, 34,GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2,GroupLayout.PREFERRED_SIZE, 34,GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }                        
    private void tfActionPerformed(ActionEvent evt) {                                   
    }                                  
    private void pfActionPerformed(ActionEvent evt) {                                   
    }                                  
    private void btnActionPerformed(ActionEvent evt) {                                    
   
    	this.setVisible(false);
        new NewRegister().setVisible(true);
    }                                   
    @SuppressWarnings("deprecation")
	private void btn1ActionPerformed(ActionEvent evt) {                                     
       String s=tf.getText();
       String s1=pf.getText();
       try{
    	   Class.forName("oracle.jdbc.driver.OracleDriver");
    	   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    	   String str="Select * FROM usertable where Name=? and Password=?";
           ps=con.prepareStatement(str);
           ps.setString(1, s);
           ps.setString(2, s1);
           rs=ps.executeQuery();
           while(rs.next()){
        	   JOptionPane.showMessageDialog(this,"hello");
            nm=rs.getString(1);
            pass=rs.getString(3);
          }
       }catch (Exception e) {
    	  System.out.println(e.getMessage());
	}
       if(s.equalsIgnoreCase(usr) && s1.equalsIgnoreCase("12345")){
           this.setVisible(false);
           new AdminFram(usr).setVisible(true);
       }
       else if(s.equalsIgnoreCase(nm) && s1.equalsIgnoreCase(pass)){
           this.setVisible(false);
           new SelectExam(nm).setVisible(true);
       }
       else{
           this.setVisible(false);
           new WarningPage().setVisible(true); 
       }
    }                                    
    private void btn2ActionPerformed(ActionEvent evt) {                                     
        System.exit(0);
    }                                    
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginPanal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LoginPanal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LoginPanal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginPanal.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanal().setVisible(true);
            }
        });
    }                
}