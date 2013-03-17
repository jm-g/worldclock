/*
 * WorldClockOptionsPanel.java
 *
 * Created on 25 February 2006, 00:35
 */

package lh.worldclockmodule;

import java.io.File;
import javax.swing.JFileChooser;
import org.openide.util.NbBundle;

/**
 * Option panel, allows to select the path to the configuration file
 *
 * @author Ludovic HOCHET
 * @version $Revision: 1.3 $ $Date: 2006/05/08 22:02:45 $
 */
public class WorldClockOptionsPanel extends javax.swing.JPanel
{
    
    public WorldClockOptionsPanel()
    {
        initComponents();
    }
    
    public void setPath(String path)
    {
        tfPath.setText(path);
    }
    
    public String getPath()
    {
        return tfPath.getText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfPath = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel1.setText(java.util.ResourceBundle.getBundle("lh/worldclockmodule/Bundle").getString("CTL_WorldClockOptionPanelPathLabel"));

        tfPath.setName("tfPath");

        btnSelect.setText("...");
        btnSelect.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelectActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tfPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnSelect)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(tfPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnSelect))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSelectActionPerformed
    {//GEN-HEADEREND:event_btnSelectActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle(NbBundle.getMessage(WorldClockOptionsPanel.class, "CTL_WorldClockOptionPanelSelectButton"));
        String path = tfPath.getText();
        if (!path.equals(""))
        {
            jfc.setSelectedFile(new File(path));
        }
        if (JFileChooser.APPROVE_OPTION == jfc.showOpenDialog(this))
        {
            tfPath.setText(jfc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnSelectActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfPath;
    // End of variables declaration//GEN-END:variables
    
}