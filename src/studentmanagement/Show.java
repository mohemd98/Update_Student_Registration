/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Administrator
 */
public class Show extends javax.swing.JFrame {

    connect c = new connect();
    int t = 0;

    DefaultTableModel tblmodel;

    public Show() {
        initComponents();
        showusers();
        jButton2.setVisible(false);
        jButton3.setVisible(false);
    }

    public void serching(String string) {
        tblmodel = (DefaultTableModel) jTable2.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblmodel);
        jTable2.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(string));
    }

    public void showusers() {
        if (t == 0) {
            try {
                String sgl = "select * from student";
                c.rs = c.stmt.executeQuery(sgl);
                while (c.rs.next()) {
                    String id = c.rs.getString("id");
                    String user = c.rs.getString("username");
                    String em = c.rs.getString("email");
                    String unv = c.rs.getString("college");
                    String coll = c.rs.getString("unver");
                    String div = c.rs.getString("division");
                    String doc = c.rs.getString("documentNum");
                    String gov = c.rs.getString("Governorate");
                    String gen = c.rs.getString("gender");
                    String brith = c.rs.getString("birthday");
                    String date = c.rs.getString("DateRegistration");
                    String nat = c.rs.getString("NationalityNumber");
                    String pho = c.rs.getString("phone");
                    String im = c.rs.getString("img");
                    String exm = c.rs.getString("examno");
                    String ra = c.rs.getString("rate");
                    String sty = c.rs.getString("study");
                    String tbData[] = {id, user, em, unv, coll, div, doc, gov, gen, brith, date, nat, pho, im, exm, ra, sty};
                    tblmodel = (DefaultTableModel) jTable2.getModel();
                    tblmodel.addRow(tbData);
                }
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Error calling data");
            }

        }
        t = 1;
    }

    public void updata() {
        String sgl = "select * from student";
        try {
            c.pd = c.con.prepareStatement(sgl);
            c.rs = c.pd.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(c.rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                c.rs.close();
                c.pd.close();
            } catch (Exception e) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\رجوع2.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 63, 60));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\طباعة2.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("serch");

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "email", "University", "collage", "div", "DoctNum", "Gover", "gender", "birthday", "reg", "NationalityNumbernull", "phone", "img", "examNo", "rate", "study"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowHeight(35);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\صوره شخص.png")); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\حذف-2.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\تعديل2.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(453, 453, 453)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addContainerGap(70, Short.MAX_VALUE))))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dashbord AP = new dashbord();
        AP.setLocationRelativeTo(AP);
        AP.setTitle("AddProducts");
        AP.setVisible(true);

        AP.setSize(1084, 643);
        AP.setLocation(120, 50);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int selectedIndex = jTable2.getSelectedRow();
        //  int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        String id = model.getValueAt(selectedIndex, 0).toString();
        int dialogresult = JOptionPane.showConfirmDialog(null, "Really want to delete it?", "waring", JOptionPane.YES_NO_OPTION);
        if (dialogresult == JOptionPane.YES_NO_OPTION) {
            try {
                c.pd = c.con.prepareStatement("delete from  student where id = ?");
                c.pd.setString(1, id);
                c.pd.executeUpdate();
                JOptionPane.showMessageDialog(this, "Deleted successfully");
                updata();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, " error");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int i = jTable2.getSelectedRow();

        AddStudent AS = new AddStudent();
        AS.setVisible(true);
        AS.jButton3.setVisible(true);
        AS.jButton2.setVisible(false);
        AS.setTitle("AddStudent");
         AS.setSize(1340,580);
        AS.setLocation(20, 60);
        AS.forid.setText(jTable2.getModel().getValueAt(i, 0).toString());
        AS.username.setText(jTable2.getModel().getValueAt(i, 1).toString());
        AS.email.setText(jTable2.getModel().getValueAt(i, 2).toString());
        String combo = tblmodel.getValueAt(i, 3).toString();
        for (int j = 0; j < AS.University.getItemCount(); j++) {
            if (AS.University.getItemAt(j).toString().equalsIgnoreCase(combo)) {
                AS.University.setSelectedIndex(j);
            }
        }
        String combo2 = tblmodel.getValueAt(i, 4).toString();
        for (int j = 0; j < AS.collage.getItemCount(); j++) {
            if (AS.collage.getItemAt(j).toString().equalsIgnoreCase(combo2)) {
                AS.collage.setSelectedIndex(j);
            }
        }
        AS.division.setText(jTable2.getModel().getValueAt(i, 5).toString());
        AS.documentNum.setText(jTable2.getModel().getValueAt(i, 6).toString());
        AS.Governorate.setText(jTable2.getModel().getValueAt(i, 7).toString());

        String type = jTable2.getModel().getValueAt(i, 8).toString();
        if (type.equals("female")) {
            AS.female.setSelected(true);
        } else {
            AS.male.setSelected(true);
        }
        try {
            Date timecreate = new SimpleDateFormat("yyyy-MM-dd").parse((String) jTable2.getValueAt(i, 9));
            AS.birthday.setDate(timecreate);
        } catch (Exception e) {
        }

        AS.NationalityNumber.setText(jTable2.getModel().getValueAt(i, 11).toString());
        AS.phone.setText(jTable2.getModel().getValueAt(i, 12).toString());
        AS.path.setText(jTable2.getModel().getValueAt(i, 13).toString());

        String dd = jTable2.getModel().getValueAt(i, 13).toString();
        AS.examNo.setText(jTable2.getModel().getValueAt(i, 14).toString());
        AS.rate.setText(jTable2.getModel().getValueAt(i, 15).toString());
        String sty = jTable2.getModel().getValueAt(i, 16).toString();
        if (sty.equals("morning")) {
            AS.morning.setSelected(true);
        } else {
            AS.evening.setSelected(true);
        }
        ImageIcon imaog = new ImageIcon(dd);
        AS.jLabel10.setIcon(imaog);

        this.dispose();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        jTable2.setModel(new DefaultTableModel(null, new String[]{"id", "name", "email", "collage", "div", "DoctNum", "Gover", "gender", "birthday", "reg", "NationalityNumbernull", "phone", "img", "examNo", "rate", "study"}));
        try {
            String sql = "select * from student where concat(username,college,study,gender) like '%" + jTextField1.getText() + "%' ";
            c.rs = c.stmt.executeQuery(sql);
            while (c.rs.next()) {
                String id = c.rs.getString("id");
                String user = c.rs.getString("username");
                String em = c.rs.getString("email");
                String unv = c.rs.getString("college");
                String coll = c.rs.getString("unver");
                String div = c.rs.getString("division");
                String doc = c.rs.getString("documentNum");
                String gov = c.rs.getString("Governorate");
                String gen = c.rs.getString("gender");
                String brith = c.rs.getString("birthday");
                String date = c.rs.getString("DateRegistration");
                String nat = c.rs.getString("NationalityNumber");
                String pho = c.rs.getString("phone");
                String im = c.rs.getString("img");
                String exm = c.rs.getString("examno");
                String ra = c.rs.getString("rate");
                String sty = c.rs.getString("study");
                String tbData[] = {id, user, em, unv, coll, div, doc, gov, gen, brith, date, nat, pho, im, exm, ra, sty};
                tblmodel = (DefaultTableModel) jTable2.getModel();
                tblmodel.addRow(tbData);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error calling data");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        AddStudent z2 = new AddStudent();
        int i = jTable2.getSelectedRow();
        JTextField formimg = new JTextField();
        formimg.setText(jTable2.getModel().getValueAt(i, 13).toString());
        ImageIcon imaog = new ImageIcon(formimg.getText());
        jLabel1.setIcon(imaog);
        z2.jLabel10.setIcon(imaog);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MessageFormat header = new MessageFormat("Employees");
        MessageFormat footer = new MessageFormat("page(1)");

        try {
            //   t2.print(t2.printMode.NORMAL,header,footer);
            jTable2.print(JTable.PrintMode.NORMAL, footer, footer);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
