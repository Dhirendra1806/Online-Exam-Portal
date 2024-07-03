import java.sql.*;

import javax.swing.*;

import java.util.Calendar;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		JButton btn,btn1,btn2;
	    JLabel l1,l2,l3,l4,l5,l6;
	    String sub;
	    String nam;
	    String str2;
	    int no,max=100;
	    int idno=2;
	    Connection con;
	    PreparedStatement ps;
	    ResultSet rs;
	public Result() {
        initComponents();
    }
	public Result(int rightQue, String nm,String subject) {
    	no=rightQue*10;
    	nam=nm;
    	sub=subject;
    	if(no>=60){
    		str2="Pass";
    	}
    	else{
    		str2="Fail";
    	}
    	initComponents();
	}
    private void initComponents() {

        l2 = new JLabel();
        l3 = new JLabel();
        btn = new JButton();
        l5 = new JLabel();
        btn1 = new JButton();
        btn2 = new JButton();
        l4 = new JLabel();
        l1 = new JLabel();
        l6 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        l2.setFont(new Font("Tahoma", 2, 36)); 
        l2.setForeground(new Color(0, 0, 204));
        l2.setText("    Your Result");

        l3.setFont(new Font("Tahoma", 1, 18)); 
        l3.setForeground(new Color(0, 0, 204));
        l3.setText("Name ="+nam);

        btn.setBackground(new Color(0, 204, 51));
        btn.setFont(new Font("Tahoma", 1, 14)); 
        btn.setForeground(new Color(0, 0, 204));
        btn.setText("Logout");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        l5.setFont(new Font("Tahoma", 1, 18)); 
        l5.setForeground(new Color(0, 0, 204));
        l5.setText("Your Score is ="+no+"/"+max);

        btn1.setBackground(new Color(51, 153, 0));
        btn1.setFont(new Font("Tahoma", 1, 18)); 
        btn1.setForeground(new Color(0, 0, 204));
        btn1.setText("Save");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new Color(0, 204, 0));
        btn2.setFont(new Font("Tahoma", 1, 18)); 
        btn2.setForeground(new Color(0, 0, 153));
        btn2.setText("Cancel");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        l4.setFont(new Font("Tahoma", 1, 18)); 
        l4.setForeground(new Color(0, 0, 255));
        l4.setText("Subject ="+sub+"\t Programming Language");

        l1.setFont(new Font("Tahoma", 1, 18)); 
        l1.setForeground(new Color(0, 0, 255));
        l1.setText("Id     ="+idno);

        l6.setFont(new Font("Tahoma", 1, 18)); 
        l6.setForeground(new Color(0, 0, 204));
        l6.setText("Status ="+str2);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(l6, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.LEADING, layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(l4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                            .addComponent(l5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l2, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(l4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }

    private void btnActionPerformed(ActionEvent evt) {                                    
       this.setVisible(false);
       new LoginPanal().setVisible(true);
    }                                   

    @SuppressWarnings("static-access")
	private void btn1ActionPerformed(ActionEvent evt) {                                     
    	this.setVisible(false);
    	java.util.Date sqdate=Calendar.getInstance().getTime();
    	java.sql.Date dat =new java.sql.Date(sqdate.getTime());
    	SaveData(nam,sub,max,no,str2,dat);
    	new GeneratePDF().data(nam,sub,max,no,str2);
    	new GeneratePDF().main(null);
    	new SelectExam(nam).setVisible(true);

    }                                    

    private void btn2ActionPerformed(ActionEvent evt) {                                     
    	this.setVisible(false);
    	new SelectExam(nam).setVisible(true);
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
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }                                    
    @SuppressWarnings("unused")
	public void SaveData(String str, String str1, int mark, int markObt,String str2,Date dat) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
        	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");            
            String ss="INSERT INTO result(Name, Subject,MaxMarks, MarksObt, Status,Dates) VALUES (?,?,?,?,?,?)";
			ps=con.prepareStatement(ss);
			ps.setString(1, str);
			ps.setString(2, str1);
			ps.setInt(3, mark);
			ps.setInt(4,markObt);
			ps.setString(5, str2);
			ps.setString(6, String.valueOf(dat));
			System.out.println(ss);
			int g=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}