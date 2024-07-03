import javax.swing.*;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;

public class NewRegister extends JFrame {
	 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		JButton btn;
	    JButton btn1;
	    JRadioButton gf;
	    JRadioButton gm;
	    String g;
	    ButtonGroup r;
	    JLabel jLabel1,l,l1,l2,l3,l4,l5;
	    JTextField tf,tf1,tf2,tf3,tf4;
    public NewRegister() {
        initComponents();
    }
    private void initComponents() {
        jLabel1 = new JLabel();
        l = new JLabel();
        tf = new JTextField();
        l1 = new JLabel();
        tf1 = new JTextField();
        l2 = new JLabel();
        tf2 = new JPasswordField();
        l4 = new JLabel();
        tf3 = new JTextField();
        l3 = new JLabel();
        gm = new JRadioButton();
        gf = new JRadioButton();
        l5 = new JLabel();
        tf4 = new JTextField();
        btn = new JButton();
        btn1 = new JButton();
        r=new ButtonGroup();
        r.add(gm);
        r.add(gf);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setFont(new Font("Castellar", 1, 18)); 
        jLabel1.setForeground(new Color(0, 0, 255));
        jLabel1.setText("New register Form");
        l.setFont(new Font("Tahoma", 0, 14)); 
        l.setForeground(new Color(0, 51, 255));
        l.setText("Name :");
        l1.setFont(new Font("Tahoma", 0, 14)); 
        l1.setForeground(new Color(51, 51, 255));
        l1.setText("E-mail :");
        tf1.setFont(new Font("Tahoma", 0, 14)); 
        l2.setFont(new Font("Tahoma", 0, 14)); 
        l2.setForeground(new Color(0, 0, 255));
        l2.setText("Password :");
        l4.setFont(new Font("Tahoma", 0, 14)); 
        l4.setForeground(new Color(0, 0, 255));
        l4.setText("City :");
        l3.setFont(new Font("Tahoma", 0, 14)); 
        l3.setForeground(new Color(0, 0, 255));
        l3.setText("Gender :");
        gm.setFont(new Font("Tahoma", 0, 14)); 
        gm.setForeground(new Color(0, 0, 255));
        gm.setText("Male");
        gm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                gmActionPerformed(evt);
            }
        });
        gf.setFont(new Font("Tahoma", 0, 14)); 
        gf.setForeground(new Color(0, 0, 255));
        gf.setText("Female");
        gf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                gfActionPerformed(evt);
            }
        });
        l5.setFont(new Font("Tahoma", 0, 14)); 
        l5.setForeground(new Color(51, 51, 255));
        l5.setText("Country :");
        tf4.setFont(new Font("Tahoma", 0, 14)); 
        tf4.setForeground(new Color(51, 0, 255));
        btn.setBackground(new Color(51, 204, 0));
        btn.setFont(new Font("Tahoma", 0, 14)); 
        btn.setForeground(new Color(0, 51, 255));
        btn.setText("Register");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        btn1.setBackground(new Color(0, 255, 0));
        btn1.setFont(new Font("Tahoma", 0, 14)); 
        btn1.setForeground(new Color(0, 51, 204));
        btn1.setText("Cancel");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(l2)
                            .addComponent(l1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addComponent(l, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(tf1)
                            .addComponent(tf2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l5, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btn, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf3, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gm)
                                .addGap(71, 71, 71)
                                .addComponent(gf)))
                        .addGap(4, 4, 4)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tf2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(gm)
                    .addComponent(gf))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tf3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pack();
    }
    private void gmActionPerformed(ActionEvent evt) {
    		g=gm.getText();
	}
    private void gfActionPerformed(ActionEvent evt) {
			g=gf.getText();
	}
    private void btnActionPerformed(ActionEvent evt) {                                    
        String str,str1,str2,str3,str4;
        str=tf.getText();
        str1=tf1.getText();
        str2=tf2.getText();
        str3=tf3.getText();
        str4=tf4.getText();
        /*System.out.print("Action Saved..");*/
        new UserSave(str,str1,str2,g,str3,str4);
        this.setVisible(false);
        new LoginPanal().setVisible(true);
    }                                   

    private void btn1ActionPerformed(ActionEvent evt) {                                     
        this.setVisible(false);
        new LoginPanal().setVisible(true);
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
            Logger.getLogger(NewRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(NewRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NewRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(NewRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
           EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewRegister().setVisible(true);
            }
        });
    }                                        
}