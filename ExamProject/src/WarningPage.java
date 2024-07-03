import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.*;

public class WarningPage extends JFrame {
    JButton btn,btn1,btn2;
    JLabel jLabel1,jLabel2,l,l1;
    JPasswordField pf;
    JTextField tf;  
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    String nm,pass,usr="Admin";
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public WarningPage() {
        initComponents();
    }
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        l = new JLabel();
        tf = new JTextField();
        l1 = new JLabel();
        pf = new JPasswordField();
        btn = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Tahoma", 0, 24));
        jLabel1.setForeground(new Color(0, 0, 255));
        jLabel1.setText("Please Login");

        jLabel2.setFont(new Font("Tahoma", 0, 14));
        jLabel2.setForeground(new Color(255, 0, 0));
        jLabel2.setText("Please check userid or password");

        l.setFont(new Font("Tahoma", 0, 14));
        l.setForeground(new Color(51, 51, 255));
        l.setText("User Id :");

        tf.setFont(new Font("Tahoma", 0, 14));
        l1.setFont(new Font("Tahoma", 0, 14));
        l1.setForeground(new Color(51, 51, 255));
        l1.setText("Password :");
        btn.setBackground(new Color(0, 255, 0));
        btn.setFont(new Font("Tahoma", 0, 14)); 
        btn.setForeground(new Color(0, 0, 255));
        btn.setText("New");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        btn1.setBackground(new Color(0, 255, 0));
        btn1.setFont(new Font("Tahoma", 0, 14));
        btn1.setForeground(new Color(0, 0, 255));
        btn1.setText("Login");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new Color(0, 204, 0));
        btn2.setFont(new Font("Tahoma", 0, 14));
        btn2.setForeground(new Color(0, 0, 255));
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
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 254,GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(l1, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(l, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1,GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(btn2,GroupLayout.PREFERRED_SIZE, 89,GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf)
                            .addComponent(pf))))
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1,GroupLayout.PREFERRED_SIZE, 154,GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn,GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2,GroupLayout.PREFERRED_SIZE, 24,GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l,GroupLayout.PREFERRED_SIZE, 30,GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf,GroupLayout.PREFERRED_SIZE, 30,GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(l1,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pf,GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn,GroupLayout.PREFERRED_SIZE, 34,GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1,GroupLayout.PREFERRED_SIZE, 34,GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2,GroupLayout.PREFERRED_SIZE, 34,GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
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
    	   Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamKp","root","root");
           String str="Select * FROM examkp.usertable where Name=? and Password=?;";
           ps=con.prepareStatement(str);
           ps.setString(1, s);
           ps.setString(2, s1);
           rs=ps.executeQuery();
           while(rs.next()){
            nm=rs.getString(2);
            pass=rs.getString(4);
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
       this.setVisible(false);
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
            Logger.getLogger(WarningPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(WarningPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(WarningPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(WarningPage.class.getName()).log(Level.SEVERE, null, ex);
        }
             EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WarningPage().setVisible(true);
            }
        });
    }                        
}
