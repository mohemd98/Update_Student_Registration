package studentmanagement;

//import java.awt.Button;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class AddUser extends javax.swing.JFrame {

    connect c = new connect();
    int t = 0;
    DefaultTableModel tblmodel;

    public AddUser() {
        initComponents();
        showusers();
        jButton5.setVisible(false);
        id.setVisible(false);
        jButton4.setVisible(false);
        jButton3.setVisible(false);
    }

    public void serching(String string) {
        tblmodel = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblmodel);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(string));
    }

    public void showusers() {
        if (t == 0) {
            try {
                String sgl = "select * from users";
                c.rs = c.stmt.executeQuery(sgl);
                while (c.rs.next()) {
                    String id = c.rs.getString("id");
                    String funm = c.rs.getString("fullname");
                    String usn = c.rs.getString("username");
                    String em = c.rs.getString("email");
                    String pss = c.rs.getString("password");
                    String type = c.rs.getString("type");
                    String ag = c.rs.getString("age");
                    String tbData[] = {id, funm, usn, pss, em, type, ag};
                    tblmodel = (DefaultTableModel) jTable1.getModel();
                    tblmodel.addRow(tbData);
                }
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Error calling data");
            }

        }
        t = 1;
    }

    public void updata() {
        String sgl = "select * from users";
        try {
            c.pd = c.con.prepareStatement(sgl);
            c.rs = c.pd.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(c.rs));

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        forSerching = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Admin = new javax.swing.JRadioButton();
        Member = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fullname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        age = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forSerching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                forSerchingKeyReleased(evt);
            }
        });
        getContentPane().add(forSerching, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 193, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("serch");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 50, 20));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 153));

        buttonGroup1.add(Admin);
        Admin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Admin.setText("Admin");

        buttonGroup1.add(Member);
        Member.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Member.setText("Member");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("type");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(Admin)
                .addGap(18, 18, 18)
                .addComponent(Member, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admin)
                    .addComponent(Member)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 290, 310, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\رجوع1.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        fullname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullnameMouseClicked(evt);
            }
        });
        jPanel1.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 90, 185, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 128, 185, -1));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 166, 185, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 204, 185, -1));
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 242, 185, -1));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\طباعة.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 60, 60));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\تحديث.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 60, 60));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\حذف-.jpg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 52, 60));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\تعديل.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 60, 60));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\يوزر.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 60, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("fullname");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 92, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 168, -1, -1));

        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.setText("id");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 10, 60, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "fullname", "USERNAME", "PASSWORD", "EMAIL", "TYPE", "AGE"
            }
        ));
        jTable1.setRowHeight(24);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 346, 1086, 243));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 206, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("age");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 247, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1850, 600));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forSerchingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forSerchingKeyReleased
//        String serch = forSerching.getText();
//        serching(serch);
        jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "fullname", "USERNAME", "PASSWORD", "EMAIL", "TYPE", "AGE"}));
//        if (t == 0) {

        try {

            String sql = "select * from users where concat(fullname,username,id) like '%" + forSerching.getText() + "%' ";
            c.rs = c.stmt.executeQuery(sql);
            while (c.rs.next()) {
                String id = c.rs.getString("id");
                String funm = c.rs.getString("fullname");
                String usn = c.rs.getString("username");
                String em = c.rs.getString("email");
                String pss = c.rs.getString("password");
                String type = c.rs.getString("type");
                String ag = c.rs.getString("age");
                String tbData[] = {id, funm, usn, pss, em, type, ag};
                tblmodel = (DefaultTableModel) jTable1.getModel();
                tblmodel.addRow(tbData);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error calling data");
        }

//        }

    }//GEN-LAST:event_forSerchingKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//        jButton5.setVisible(true);
        jButton2.setVisible(false);
        jButton4.setVisible(true);
        jButton3.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (age.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Date cannot be empty");
        } else {
            String user, ema, pass, type, funm;
            funm = fullname.getText();
            user = username.getText();
            ema = email.getText();
            pass = password.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String timecreate = sdf.format(age.getDate());
            type = "";
            if (Admin.isSelected()) {
                type = Admin.getText();
            }
            if (Member.isSelected()) {
                type = Member.getText();
            }

            if (user.isEmpty() || ema.isEmpty() || pass.isEmpty() || type.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entries cannot be empty");
            } else {
                try {
                    int a = c.stmt.executeUpdate("insert into users values"
                            + "('" + 0 + "','" + user + "','" + pass + "','" + ema + "','" + type + "','" + timecreate + "','" + funm + "')");
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, "The request has been added successfully");
                        updata();
                    } else {
                        JOptionPane.showConfirmDialog(null, "There is a connection error");
                    }
                } catch (Exception e) {
                    System.out.println("Connection error");
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int i = jTable1.getSelectedRow();
        id.setText(jTable1.getModel().getValueAt(i, 0).toString());
        fullname.setText(jTable1.getModel().getValueAt(i, 1).toString());
        username.setText(jTable1.getModel().getValueAt(i, 2).toString());
        password.setText(jTable1.getModel().getValueAt(i, 3).toString());
        email.setText(jTable1.getModel().getValueAt(i, 4).toString());
        String type = jTable1.getModel().getValueAt(i, 5).toString();
        if (type.equals("Admin")) {
            Admin.setSelected(true);
        } else {
            Member.setSelected(true);
        }
        try {
            Date timecreate = new SimpleDateFormat("yyyy-MM-dd").parse((String) jTable1.getValueAt(i, 6));
            age.setDate(timecreate);
        } catch (Exception e) {
        }
        jButton5.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            c.pd = c.con.prepareStatement("UPDATE users SET id=?, username=?,password=? ,email=? , type=? ,  age=? ,fullname=? WHERE id='" + id.getText() + "'");
            c.pd.setString(1, id.getText());
            c.pd.setString(2, username.getText());
            c.pd.setString(3, password.getText());
            c.pd.setString(4, email.getText());
            if (Admin.isSelected()) {
                c.pd.setString(5, Admin.getText());
            } else {
                c.pd.setString(5, Member.getText());
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String timecreate = sdf.format(age.getDate());
            c.pd.setString(6, timecreate);
            c.pd.setString(7, fullname.getText());
            c.pd.execute();
            JOptionPane.showMessageDialog(null, "Update completed successfully");
            updata();
            jButton5.setVisible(false);
            jButton2.setVisible(true);
            jButton4.setVisible(false);
            jButton3.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "There is a connection error");
        } finally {
            try {
                c.pd.close();
                c.rs.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        //  int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        String id = model.getValueAt(selectedIndex, 0).toString();
        int dialogresult = JOptionPane.showConfirmDialog(null, "Really want to delete it?", "waring", JOptionPane.YES_NO_OPTION);
        if (dialogresult == JOptionPane.YES_NO_OPTION) {
            try {
                c.pd = c.con.prepareStatement("delete from  users where id = ?");
                c.pd.setString(1, id);
                c.pd.executeUpdate();
                JOptionPane.showMessageDialog(this, "Deleted successfully");
                updata();
                jButton5.setVisible(false);
                jButton2.setVisible(true);
                jButton4.setVisible(false);
                jButton3.setVisible(false);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "There is a connection error");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MessageFormat header = new MessageFormat("Employees");
        MessageFormat footer = new MessageFormat("page(1)");
        try {
            jTable1.print(JTable.PrintMode.NORMAL, footer, footer);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void fullnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullnameMouseClicked
        jButton2.setVisible(true);
    }//GEN-LAST:event_fullnameMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dashbord DSH = new dashbord();
        DSH.setLocationRelativeTo(DSH);
        DSH.setTitle("AddProducts");
        DSH.setVisible(true);
        DSH.setSize(1084, 643);
        DSH.setLocation(120, 50);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Admin;
    private javax.swing.JRadioButton Member;
    private com.toedter.calendar.JDateChooser age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField forSerching;
    private javax.swing.JTextField fullname;
    private javax.swing.JButton id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
