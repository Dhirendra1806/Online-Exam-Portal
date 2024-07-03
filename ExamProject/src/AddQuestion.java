import java.sql.*;
import javax.swing.*;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;

public class AddQuestion extends JFrame {
    JButton btn,btn1,btn2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField la;
    JTextField tf,tf1,tf2,tf3,tf4,tf5,tfid;
    String nam,sub;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public AddQuestion() {
        initComponents();
    }
    public AddQuestion(String nm) {
        nam=nm;
    	initComponents();
    }
    private void initComponents() {
        l1 = new JLabel();
        l2 = new JLabel();
        tf = new JTextField();
        tfid = new JTextField();
        l3 = new JLabel();
        tf1 = new JTextField();
        l4 = new JLabel();
        tf2 = new JTextField();
        l5 = new JLabel();
        tf3 = new JTextField();
        l6 = new JLabel();
        tf4 = new JTextField();
        l7 = new JLabel();
        tf5 = new JTextField();
        btn1 = new JButton();
        btn = new JButton();
        btn2 = new JButton();
        l8 = new JLabel();
        la = new JTextField();
        l9=new JLabel();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        l1.setFont(new Font("Tahoma", 0, 24)); 
        l1.setForeground(new Color(0, 0, 255));
        l1.setText("Add Question Panel");

        l2.setFont(new Font("Tahoma", 0, 14)); 
        l2.setForeground(new Color(0, 0, 255));
        l2.setText("Q.");
        
        tf.setFont(new Font("Tahoma", 0, 14)); 
        
        l3.setFont(new Font("Tahoma", 0, 12)); 
        l3.setForeground(new Color(51, 51, 255));
        l3.setText("Option :");
        
        tf1.setFont(new Font("Tahoma", 0, 12)); 
        
        l4.setFont(new Font("Tahoma", 0, 12)); 
        l4.setForeground(new Color(51, 0, 255));
        l4.setText("Option :");
        
        l5.setFont(new Font("Tahoma", 0, 12)); 
        l5.setForeground(new Color(0, 0, 204));
        l5.setText("Option :");
        
        l6.setFont(new Font("Tahoma", 0, 12)); 
        l6.setForeground(new Color(0, 0, 204));
        l6.setText("Option :");
        
        l7.setFont(new Font("Tahoma", 0, 12)); 
        l7.setForeground(new Color(0, 0, 255));
        l7.setText("Answer.");
        
        btn1.setBackground(new Color(0, 255, 0));
        btn1.setFont(new Font("Tahoma", 0, 14)); 
        btn1.setForeground(new Color(0, 0, 204));
        btn1.setText("Add");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn.setBackground(new Color(0, 204, 51));
        btn.setFont(new Font("Tahoma", 0, 14)); 
        btn.setForeground(new Color(0, 0, 204));
        btn.setText("Back");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        btn2.setBackground(new Color(51, 204, 0));
        btn2.setFont(new Font("Tahoma", 0, 14)); 
        btn2.setForeground(new Color(51, 0, 255));
        btn2.setText("Reset");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        l8.setFont(new Font("Tahoma", 0, 14)); 
        l8.setForeground(new Color(51, 0, 204));
        l8.setText("Language :");
        
        l9.setFont(new Font("Tahoma", 1, 18)); 
        l9.setForeground(new Color(204,0, 0));
        l9.setText(nam);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btn, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l7, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf5, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l5, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf3, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(l4, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                            .addComponent(l6, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf2, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                            .addComponent(tf4)))
                                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(l8, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(la, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(l3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(tf, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(l1, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(l9, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(l1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(l2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(tf3, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(l5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tf4, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tf5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addComponent(l7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(la, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pack();
    }
    private void btn1ActionPerformed(ActionEvent evt) {                                     
     String s1,s2,s3,s4,s5,s6,ql;
     s1=tf.getText();
     s2=tf1.getText();
     s3=tf2.getText();
     s4=tf3.getText();
     s5=tf4.getText();
     s6=tf5.getText();
     ql=la.getText();
     QuetionSave(s1,ql,s2,s3,s4,s5,s6);
     this.setVisible(false);
     new AddQuestion(nam).setVisible(true);
    }                                    
    private void btn2ActionPerformed(ActionEvent evt) {                                     
      this.setVisible(false);
     new AddQuestion(nam).setVisible(true);
    }                                    
    private void btnActionPerformed(ActionEvent evt) {                                    
        this.setVisible(false);
        new AdminFram(nam).setVisible(true);
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
            Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AddQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        	EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQuestion().setVisible(true);
            }
        });
    }
    private void QuetionSave(String s1, String ql,String s2, String s3, String s4, String s5, String s6) {
    		if(ql.equalsIgnoreCase("Java")){
    			sub="java";
    		}
    		else if (ql.equalsIgnoreCase("C")) {
				sub="c";
			}
    		else if(ql.equalsIgnoreCase("C#")){
    			sub="c_sharp";
    		}
    		else if(ql.equalsIgnoreCase("Html")){
    			sub="html";
    		}
    		else if(ql.equalsIgnoreCase("Python")){
    			sub="python";
    		}
    		else if(ql.equalsIgnoreCase("PHP")){
    			sub="php";
    		}
        try{
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
        	String str="INSERT INTO "+sub+" (Question, Opt1, Opt2, Opt3, Opt4, Answer)  values(?,?,?,?,?,?)";
            ps=con.prepareStatement(str);
            ps.setString(1, s1);
            ps.setString(2, s2);
            ps.setString(3, s3);
            ps.setString(4, s4);
            ps.setString(5, s5);
            ps.setString(6, s6);
            @SuppressWarnings("unused")
			int g=ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}