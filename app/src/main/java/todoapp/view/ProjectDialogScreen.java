package todoapp.view;

import java.util.HashSet;
import javax.swing.JOptionPane;
import todoapp.controller.ProjectController;
import todoapp.model.Project;


public class ProjectDialogScreen extends javax.swing.JDialog {

        ProjectController controller;
    
    public ProjectDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
            controller = new ProjectController();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToolbar = new javax.swing.JPanel();
        jLabelToolbarTitle = new javax.swing.JLabel();
        jLabelToolbarSave = new javax.swing.JLabel();
        jPanelProject = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPaneDescription = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setForeground(new java.awt.Color(255, 0, 0));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        setType(java.awt.Window.Type.UTILITY);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanelToolbar.setBackground(new java.awt.Color(0, 153, 102));
        jPanelToolbar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanelToolbarComponentResized(evt);
            }
        });

        jLabelToolbarTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelToolbarTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelToolbarTitle.setText("Projeto");
        jLabelToolbarTitle.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabelToolbarSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolbarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/verifica (1).png"))); // NOI18N
        jLabelToolbarSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToolbarSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolbarLayout = new javax.swing.GroupLayout(jPanelToolbar);
        jPanelToolbar.setLayout(jPanelToolbarLayout);
        jPanelToolbarLayout.setHorizontalGroup(
            jPanelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolbarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelToolbarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelToolbarLayout.setVerticalGroup(
            jPanelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelToolbarSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabelToolbarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelProject.setBackground(java.awt.Color.white);
        jPanelProject.setForeground(new java.awt.Color(102, 102, 102));
        jPanelProject.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelProject.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanelProject.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanelToolbarComponentResized(evt);
            }
        });

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName.setText("Nome");

        jTextFieldName.setBackground(java.awt.Color.white);
        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabelDescription.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescription.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDescription.setText("Descri????o");

        jTextAreaDescription.setBackground(java.awt.Color.white);
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextAreaDescription.setRows(5);
        jScrollPaneDescription.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanelProjectLayout = new javax.swing.GroupLayout(jPanelProject);
        jPanelProject.setLayout(jPanelProjectLayout);
        jPanelProjectLayout.setHorizontalGroup(
            jPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelProjectLayout.setVerticalGroup(
            jPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelProject, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelProject, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jPanelToolbarComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelToolbarComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelToolbarComponentResized

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void jLabelToolbarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToolbarSaveMouseClicked
     
        try{
        Project project = new Project();
        project.setName(jTextFieldName.getText());
        project.setDescription(jTextAreaDescription.getText());
                
        controller.save(project);
        JOptionPane.showMessageDialog(rootPane, "Projeto salvo com sucesso");
       
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
         this.dispose();
    }//GEN-LAST:event_jLabelToolbarSaveMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProjectDialogScreen dialog = new ProjectDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelToolbarSave;
    private javax.swing.JLabel jLabelToolbarTitle;
    private javax.swing.JPanel jPanelProject;
    private javax.swing.JPanel jPanelToolbar;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
