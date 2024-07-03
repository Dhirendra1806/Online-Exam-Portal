import javax.swing.*;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;


public class AdminFram extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		JButton btn,btn1,btn2,btn3,btn4;
		JLabel jLabel1,l1;  
		String nm;
    public AdminFram() {
        initComponents();
    }
    public AdminFram(String usr) {
        nm=usr;
    	initComponents();
    }
    private void initComponents() {
        jLabel1 = new JLabel();
        l1=new JLabel();
        btn1 = new JButton();
        btn = new JButton();
        btn3 = new JButton();
        btn2 = new JButton();
        btn4 = new JButton();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        /*jLabel1.setBackground(new Color(51, 255, 0));*/
        jLabel1.setFont(new Font("Tahoma", 0, 24)); 
        jLabel1.setForeground(new Color(51, 51, 255));
        jLabel1.setText("Control Panel");
        
        l1.setFont(new Font("Tahoma", 0, 24)); 
        l1.setForeground(new Color(204, 0, 0));
        l1.setText(nm);
        
        btn1.setBackground(new Color(0, 255, 0));
        btn1.setFont(new Font("Tahoma", 0, 14)); 
        btn1.setForeground(new Color(0, 0, 255));
        btn1.setText("Add Question");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn.setBackground(new Color(51, 255, 51));
        btn.setFont(new Font("Tahoma", 0, 14)); 
        btn.setForeground(new Color(255, 0, 0));
        btn.setText("Logout");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        btn3.setBackground(new Color(0, 204, 0));
        btn3.setFont(new Font("Tahoma", 0, 14)); 
        btn3.setForeground(new Color(0, 0, 255));
        btn3.setText("Users");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn2.setBackground(new Color(0, 255, 51));
        btn2.setFont(new Font("Tahoma", 0, 14)); 
        btn2.setForeground(new Color(0, 0, 255));
        btn2.setText("Delete Question");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.setBackground(new Color(0, 204, 0));
        btn4.setFont(new Font("Tahoma", 0, 14)); 
        btn4.setForeground(new Color(51, 0, 255));
        btn4.setText("Cancel");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btn, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(l1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        pack();
    }
    private void btn1ActionPerformed(ActionEvent evt) {                                     
       this.setVisible(false);
        new AddQuestion(nm).setVisible(true);
    }                                    
    private void btn2ActionPerformed(ActionEvent evt) {                                     
       this.setVisible(false);
       new DeleteQuestion(nm).setVisible(true);
    }
    private void btn3ActionPerformed(ActionEvent evt) {                                     
        this.setVisible(false);
        new LoginPanal().setVisible(true);
    }
    private void btn4ActionPerformed(ActionEvent evt) {                                     
        this.setVisible(false);
        new LoginPanal().setVisible(true);
    }                                    
    private void btnActionPerformed(ActionEvent evt) {                                    
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
            Logger.getLogger(AdminFram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AdminFram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AdminFram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AdminFram.class.getName()).log(Level.SEVERE, null, ex);
        }
        		EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFram().setVisible(true);
            }
        });
    }
}