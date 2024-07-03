import javax.swing.*;
import java.sql.*;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;


public class DeleteQuestion extends JFrame {
    JButton btn,jButton1;
    JLabel l,l1,l3,l4;
    JTextField tf,tf1;
    String nam;
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DeleteQuestion() {
        initComponents();
    }
	public DeleteQuestion(String nm) {
        nam=nm;
		initComponents();
    }
    private void initComponents() {

        l = new JLabel();
        l1 = new JLabel();
        tf = new JTextField();
        l3 = new JLabel();
        l4=new JLabel();
        tf1 = new JTextField();
        btn = new JButton();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        l.setFont(new Font("Tahoma", 0, 24));
        l.setForeground(new Color(0, 0, 255));
        l.setText("Select Question Id to Delete");

        l1.setFont(new Font("Tahoma", 0, 14));
        l1.setForeground(new Color(0, 0, 255));
        l1.setText("ID :");

        tf.setFont(new Font("Tahoma", 0, 14)); 
        tf.setForeground(new Color(51, 51, 255));

        l3.setFont(new Font("Tahoma", 0, 14)); 
        l3.setForeground(new Color(0, 0, 204));
        l3.setText("Language :");
        
        l4.setFont(new Font("Tahoma", 1, 18)); 
        l4.setForeground(new Color( 204,0, 0));
        l4.setText(nam);

        tf1.setFont(new Font("Tahoma", 0, 14)); 
        tf1.setForeground(new Color(0, 0, 255));

        btn.setBackground(new Color(0, 255, 0));
        btn.setFont(new Font("Tahoma", 0, 14)); 
        btn.setForeground(new Color(0, 0, 204));
        btn.setText("Delete");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new Color(0, 255, 0));
        jButton1.setFont(new Font("Tahoma", 0, 14)); 
        jButton1.setForeground(new Color(0, 0, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btn, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(l3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf)
                            .addComponent(tf1, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(l, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(l, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(l4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(l1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(l3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf1)
                        .addGap(7, 7, 7)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        pack();
    }       
    private void btnActionPerformed(ActionEvent evt) {                                    
        int a;
        String s="";
        a=Integer.parseInt(tf.getText());
        if(tf1.getText().equalsIgnoreCase("Java")){
        	s="java";
        }
        if(tf1.getText().equalsIgnoreCase("C")){
        	s="c";
        }
        if(tf1.getText().equalsIgnoreCase("C++")){
        	s="cpp";
        }
        if(tf1.getText().equalsIgnoreCase("HTML")){
        	s="html";
        }
        if(tf1.getText().equalsIgnoreCase(".Net")){
        	s="dotnet";
        }
        if(tf1.getText().equalsIgnoreCase("PHP")){
        	s="php";
        }
        DeleteQ(a,s);
        this.setVisible(false);
        new DeleteQuestion(nam).setVisible(true);
    }                                   
    private void jButton1ActionPerformed(ActionEvent evt) {                                         
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
            Logger.getLogger(DeleteQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DeleteQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DeleteQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DeleteQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
       EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteQuestion().setVisible(true);
            }
        });
    }
    private void DeleteQ(int a, String s) {
        Connection c;
        PreparedStatement ps;
    
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
            String strq="DELETE FROM examkp."+s+" WHERE Qid =?;";
            ps=c.prepareStatement(strq);
            ps.setInt(1, a);
            @SuppressWarnings("unused")
			int g=ps.executeUpdate();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
   }
