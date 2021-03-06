package com.uniandes.cspsolver;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teo
 */
public class InputCSPJFrame extends javax.swing.JFrame {
    
	private MainCSPSolver solver;
	
    /**
     * Creates new form InputCSPJFrame
     */
    public InputCSPJFrame() {
    	setResizable(false);
    	initComponents();
    	solver= new MainCSPSolver();
    	initCSP04();
    	updateCluesList();
    }
    
    private void initCSP01(){
    	d1TF.setText("{4,5,6,7}");
		Clue c= InputPattern.parseStringToClue("A1>6");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A3=A2+1");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B2=6");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B1=A4+1");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B3=5");
		solver.addClue(c);
	}
	
	private void initCSP02(){
		d1TF.setText("{1,2,3,4}");
		Clue c= InputPattern.parseStringToClue("A1=B1+0");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A3=2 XOR B3=2");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A3>B2+0");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B4=3");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B3>A4+0");
		solver.addClue(c);
	}
	
	private void initCSP03(){
		d1TF.setText("{3,4,5,6}");
		Clue c= InputPattern.parseStringToClue("A1=3");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B3=6");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B1=3 XOR A2=3");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B2=A4+1");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A2=B4+2");
		solver.addClue(c);
	}
	
	private void initCSP04(){
		d1TF.setText("{375,440,505,570}");
		Clue c= InputPattern.parseStringToClue("A2<B4+0");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B3<A3+0");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A1=440 XOR B4=440");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A1=570");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B1=A4+130");
		solver.addClue(c);
	}
	
	private void initCSP05(){
		d1TF.setText("{1,2,3,4}");
		Clue c= InputPattern.parseStringToClue("ALLDIFF(A1,B2)");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B2=A3+2");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B1=2");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A4=B4+0");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A1 NOT_IN(1,2)");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B2 NOT_IN(1,2)");
		solver.addClue(c);
	}
	
	private void initCSP06(){
		d1TF.setText("{1,2,3,4}");
		Clue c= InputPattern.parseStringToClue("B3<B4");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A2=B1+2");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B1=2");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A1=2");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A3=1");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B2=A4+1");
		solver.addClue(c);
	}
	
	private void initCSP07(){
		d1TF.setText("{1,2,3,4}");
		Clue c= InputPattern.parseStringToClue("B3<B4");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B1=A2-2");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("B1=2");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A1=2");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A3=1");
		solver.addClue(c);
		c= InputPattern.parseStringToClue("A4=B2-1");
		solver.addClue(c);
	}
    
    public void addClue(SingleClue c){
        solver.addClue(c);
    }
    
    public void updateCluesList(){
        DefaultListModel<String> model= new DefaultListModel<String>();
        List<Clue> clues = solver.getClues();
        for (int i = 0; i < clues.size(); i++) {
            Clue c = clues.get(i);
            model.addElement(c.toString());
        }
        cluesJList.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cluesJList = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        solveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Independent Dimension Domain", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Dependent Dimensions", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        lblDim = new JLabel();
        lblDim.setText("Dim01");
        
        dim01TF = new JTextField();
        dim01TF.setText("{\"A1\",\"A2\",\"A3\",\"A4\"}");
        
        lblDim_1 = new JLabel();
        lblDim_1.setText("Dim02");
        
        dim02TF = new JTextField();
        dim02TF.setText("{\"B1\",\"B2\",\"B3\",\"B4\"}");
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(gl_panel_1.createSequentialGroup()
        					.addComponent(lblDim, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(dim01TF))
        				.addGroup(gl_panel_1.createSequentialGroup()
        					.addComponent(lblDim_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(dim02TF, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(178, Short.MAX_VALUE))
        );
        gl_panel_1.setVerticalGroup(
        	gl_panel_1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel_1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
        				.addComponent(dim01TF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblDim))
        			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel_1.createSequentialGroup()
        					.addGap(14)
        					.addComponent(lblDim_1))
        				.addGroup(gl_panel_1.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(dim02TF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(panel_1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
        				.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 296, Short.MAX_VALUE))
        			.addContainerGap(3, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(22, Short.MAX_VALUE))
        );
        jLabel1 = new javax.swing.JLabel();
        
                jLabel1.setText("Domain");
        d1TF = new javax.swing.JTextField();
        d1TF.setText("{1,2,3,4}");
        
                d1TF.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField1ActionPerformed(evt);
                    }
                });
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(d1TF, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(186, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(d1TF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1))
        			.addContainerGap())
        );
        panel.setLayout(gl_panel);
        jPanel1.setLayout(jPanel1Layout);

        jTabbedPane1.addTab("Variables Domains", jPanel1);

        cluesJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(cluesJList);

        jButton2.setLabel("REMOVE");
        jButton2.setName("removeClueBtn"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setLabel("ADD");
        jButton3.setName("addClueBtn"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(0, 0, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addComponent(jButton3)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jButton2))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)))
        			.addGap(181))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2)
        				.addComponent(jButton3))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jTabbedPane1.addTab("Clues", jPanel2);

        solveBtn.setText("SOLVE");
        solveBtn.setName("solveCSPBtn"); // NOI18N
        solveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(InputCSPJFrame.class.getResource("/images/GameBoard.png")));
        
        JScrollPane scrollPane = new JScrollPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
        				.addComponent(solveBtn)
        				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblNewLabel)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(solveBtn)
        					.addGap(10)
        					.addComponent(scrollPane))
        				.addComponent(lblNewLabel))
        			.addContainerGap())
        );
        
        solutionTPane = new JTextPane();
        solutionTPane.setContentType("text/html");
        solutionTPane.setEditable(false);
        scrollPane.setViewportView(solutionTPane);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	String domainAsString=d1TF.getText();
    	if(InputPattern.validateDomainInput(domainAsString)){
    		String dim01AsString=dim01TF.getText();
    		String dim02AsString=dim02TF.getText();
    		if(InputPattern.validateVariablesAliases(dim01AsString) && InputPattern.validateVariablesAliases(dim02AsString)){
    			this.initVariables();
            	solver.initFacts();
            	solver.solve();
            	solutionTPane.setText(solver.getSolution().toHtml());
            	
    		}else{
    			JOptionPane.showMessageDialog(null, "El conjunto de aliases de variables de alguna dimension no satisface el formato {\"v1\",\"v2\",\"v3\",\"v4\"}", "Aliases de variables en dimension invalido", JOptionPane.ERROR_MESSAGE);
    		}
    			
    	}else{
    		JOptionPane.showMessageDialog(null, "El dominio no satisface el formato {v1,v2,v3,v4}", "Dominio Invalido", JOptionPane.ERROR_MESSAGE);
    	}
    	
    }
    
    private void initVariables(){
    	String domainAsString =d1TF.getText();
    	Pattern p = Pattern.compile(InputPattern.DOMAIN_PATTERN);
		Matcher m= p.matcher(domainAsString);
		if(m.find()){
			domainAsString= m.group("domain");
		}
    	domainAsString= domainAsString.replaceAll("\\s+", "");
		String values[]= domainAsString.split(",");
    	for(char i='A'; i<='B'; i++){
    		p = Pattern.compile(InputPattern.FOUR_VARIABLE_ALIASES_PATTERN);
    		String varAliasesAsString=""; 
    		switch(i){
    			case 'A':
    				varAliasesAsString=dim01TF.getText();
    				break;
    			case 'B':
    				varAliasesAsString=dim02TF.getText();
    				break;
    		}
			m= p.matcher(varAliasesAsString);
    		boolean matched=m.find();
    		for(int j=1; j<=4; j++){
    			String varName= ""+i+j;
    			String varAlias=varName;
    			if(matched){
    				varAlias=m.group("alias0"+ j);
    			}
    			
    			for (int k = 0; k < values.length; k++) {
					int value = Integer.parseInt(values[k]);
					Variable v = new Variable();
					v.setGroup(""+i);
	    			v.setName(varName);
	    			v.setAlias(varAlias);
	    			v.setValue(value);
	    			solver.addVariable(v);	
				}
    		}
    	}
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String clueAsString = JOptionPane.showInputDialog("CLue", "Write your clue!!");
    	Clue c =InputPattern.parseStringToClue(clueAsString);
    	if(c!= null){
    		solver.addClue(c);
    		updateCluesList();
    	}else{
    		JOptionPane.showMessageDialog(null, "Clue doesn't match formal language!!", "Invalid Clue", JOptionPane.WARNING_MESSAGE);
    	}
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    	int index = 0;
    	index= cluesJList.getSelectedIndex();
    	if(index>-1){
    		solver.getClues().remove(index);
    		updateCluesList();
    	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputCSPJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputCSPJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputCSPJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputCSPJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputCSPJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList cluesJList;
    private javax.swing.JButton solveBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField d1TF;
    private JPanel panel_1;
    private JLabel lblDim;
    private JTextField dim01TF;
    private JLabel lblDim_1;
    private JTextField dim02TF;
    private JLabel lblNewLabel;
    private JTextPane solutionTPane;
}
