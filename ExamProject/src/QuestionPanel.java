import javax.swing.*;
import java.sql.*;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;

public class QuestionPanel extends JFrame {
	int i=10;
	String mt;
	JButton btn;
    JLabel ll,qid,que,l1;
    JRadioButton rbtn1,rbtn2,rbtn3,rbtn4;
    ButtonGroup gbtn;
	private static final long serialVersionUID = 1L;
	Connection con;
    Statement ps;
    ResultSet rs;
    String n,sb,ans;
    static String nm;
    String lll,op1,op2,op3,op4;
    static int count=1,rightQue=0,id=0;
    static String subject;
    public QuestionPanel(){
    	initComponents();
    }
    public QuestionPanel(String nam,String mt) {
    	nm=nam;
    	subject=mt;
    	System.out.println(nm);
        try{
        	if(count<=i){
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");            
        	String str="SELECT * FROM "+subject+" where Qid='"+count+"'";
            ps=con.createStatement();
            rs=ps.executeQuery(str);
            if(rs.equals("")){
            	System.out.println("Not");
            }else{
            	
            
            while(rs.next()){
                lll=rs.getString(2);
                op1=rs.getString(3);
                op2=rs.getString(4);
                op3=rs.getString(5);
                op4=rs.getString(6);
                ans=rs.getString(7);
            }} 
           }
        	else{
        		this.setVisible(false);
        	}
        	id++;
            n=String.valueOf(id);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        initComponents();
    }
	private void initComponents() {
        que = new JLabel();
        ll = new JLabel();
        l1=new JLabel();
        qid = new JLabel();
        rbtn1 = new JRadioButton();
        rbtn2 = new JRadioButton();
        rbtn3 = new JRadioButton();
        rbtn4 = new JRadioButton();
        btn = new JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        que.setFont(new Font("Tahoma", 0, 14));
        que.setForeground(new Color(0, 0, 255));
        que.setText(lll);
        gbtn=new ButtonGroup();
        gbtn.add(rbtn1);
        gbtn.add(rbtn2);
        gbtn.add(rbtn3);
        gbtn.add(rbtn4);
        
        ll.setFont(new Font("Tahoma", 0, 14));
        ll.setForeground(new Color(0, 0, 255));
        ll.setText("Q.");
        
        l1.setFont(new Font("Tahoma", 1, 14));
        l1.setForeground(new Color(204,0,0));
        l1.setText(nm);
        
        qid.setFont(new Font("Tahoma", 0, 14)); 
        qid.setForeground(new Color(0, 0, 204));
        qid.setText(n);
        
        rbtn1.setFont(new Font("Tahoma", 0, 14));
        rbtn1.setForeground(new Color(0, 0, 255));
        rbtn1.setText(op1);
        rbtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rbtn1ActionPerformed(evt);
            }
        });
        
        rbtn2.setFont(new Font("Tahoma", 0, 14)); 
        rbtn2.setForeground(new Color(0, 51, 204));
        rbtn2.setText(op2);
        rbtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rbtn2ActionPerformed(evt);
            }
        });
        
        rbtn3.setFont(new Font("Tahoma", 0, 14)); 
        rbtn3.setForeground(new Color(0, 0, 204));
        rbtn3.setText(op3);
        rbtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rbtn3ActionPerformed(evt);
            }
        });
        
        rbtn4.setFont(new Font("Tahoma", 0, 14)); 
        rbtn4.setForeground(new Color(0, 0, 204));
        rbtn4.setText(op4);
        rbtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rbtn4ActionPerformed(evt);
            }
        });
        
        btn.setBackground(new Color(0, 204, 51));
        btn.setFont(new Font("Tahoma", 0, 18)); 
        btn.setForeground(new Color(0, 0, 255));
        btn.setText("Next");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ll, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qid, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(que, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbtn3, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(rbtn1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbtn2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbtn4, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(que, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(qid, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ll))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn1)
                    .addComponent(rbtn2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pack();
    }
	private void rbtn1ActionPerformed(ActionEvent evt) {
		mt=rbtn1.getText();
		
	}
	private void rbtn2ActionPerformed(ActionEvent evt) {
		mt=rbtn2.getText();
		
	}
	private void rbtn3ActionPerformed(ActionEvent evt) {
		mt=rbtn3.getText();
		
	}
	private void rbtn4ActionPerformed(ActionEvent evt) {
		mt=rbtn4.getText();
		
	}
    private void btnActionPerformed(ActionEvent evt) {                                    
    	this.setVisible(false);
    	count++;
    	System.out.println(mt);
    	int g=AnsCheck();
    	if(count<=i){
    		new QuestionPanel(nm,subject).setVisible(true);}
    	else{
    		new Result(g,nm,subject).setVisible(true);
    	}
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
            Logger.getLogger(QuestionPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(QuestionPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(QuestionPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(QuestionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionPanel().setVisible(true);
            }
        });
    }
	private int AnsCheck() {
		if(ans.equalsIgnoreCase(mt)){
			System.out.println("Correct");
			rightQue=rightQue+1;
			System.out.println(rightQue);
		}
		else{
			System.out.println("Not Correct");
		}
		return rightQue;
		
	}
}
