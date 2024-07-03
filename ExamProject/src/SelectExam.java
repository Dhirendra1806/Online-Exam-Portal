import javax.swing.*;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;


public class SelectExam extends JFrame {
    JRadioButton btn,btn1,btn2,btn3,btn4,btn5;
    JButton btn6,btn7,btn8;
    JLabel jLabel1,l1;
    ButtonGroup gbtn;
    String mt,nam,sb="";
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SelectExam() {
        initComponents();
    }
	public SelectExam(String nm) {
        nam=nm;
		initComponents();
    }
    private void initComponents() {
        jLabel1 = new JLabel();
        l1=new JLabel();
        btn = new JRadioButton();
        btn1 = new JRadioButton();
        btn2 = new JRadioButton();
        btn3 = new JRadioButton();
        btn4 = new JRadioButton();
        btn5 = new JRadioButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        gbtn=new ButtonGroup();
        gbtn.add(btn);
        gbtn.add(btn1);
        gbtn.add(btn2);
        gbtn.add(btn3);
        gbtn.add(btn4);
        gbtn.add(btn5);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Tahoma", 0, 18)); 
        jLabel1.setForeground(new Color(102, 102, 255));
        jLabel1.setText("Please Select Your Programming Language");
        
        l1.setFont(new Font("Tahoma", 0, 18)); 
        l1.setForeground(new Color(204, 0, 0));
        l1.setText(nam);

        btn.setText("Java");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        btn1.setText("C");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn2.setText("C++");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn3.setText("HTML");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn4.setText("Python");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn5.setText("PHP");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new Color(102, 255, 51));
        btn6.setFont(new Font("Tahoma", 0, 14)); 
        btn6.setForeground(new Color(0, 0, 255));
        btn6.setText("Start");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setBackground(new Color(51, 255, 0));
        btn7.setFont(new Font("Tahoma", 0, 14)); 
        btn7.setForeground(new Color(51, 51, 255));
        btn7.setText("Cancel");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new Color(0, 204, 0));
        btn8.setFont(new Font("Tahoma", 0, 14)); 
        btn8.setForeground(new Color(255, 0, 0));
        btn8.setText("Logout");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btn6)
                        .addGap(64, 64, 64)
                        .addComponent(btn7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btn)
                            .addComponent(btn3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btn1)
                            .addComponent(btn4))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(btn5)
                            .addComponent(btn2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(l1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(l1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn)
                    .addComponent(btn1)
                    .addComponent(btn2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3)
                    .addComponent(btn4)
                    .addComponent(btn5))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6)
                    .addComponent(btn7))
                .addGap(31, 31, 31))
        );

        pack();
    }
    private void btnActionPerformed(ActionEvent evt) {
    	mt=btn.getText();
		
	}
    private void btn1ActionPerformed(ActionEvent evt) {
    	mt=btn1.getText();
		
	}
    private void btn2ActionPerformed(ActionEvent evt) {
    	if(btn2.getText().equalsIgnoreCase("C++")){
    	mt="cpp";
    	}
	}
    private void btn3ActionPerformed(ActionEvent evt) {
    	mt=btn3.getText();
		
	}
    private void btn4ActionPerformed(ActionEvent evt) {
    	if(btn4.getText().equalsIgnoreCase("Python")){
        	mt="python";
        }
	}
    private void btn5ActionPerformed(ActionEvent evt) {
    	mt=btn5.getText();
		
	}
    private void btn6ActionPerformed(ActionEvent evt) {                                     
      this.setVisible(false);
       new QuestionPanel(nam,mt).setVisible(true);               
    }                                    

    private void btn7ActionPerformed(ActionEvent evt) {                                     
        this.setVisible(false);
    	new LoginPanal().setVisible(true);
    }                                    
    private void btn8ActionPerformed(ActionEvent evt) {                                     
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
            Logger.getLogger(SelectExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SelectExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SelectExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SelectExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectExam().setVisible(true);
            }
        });
    }
}
