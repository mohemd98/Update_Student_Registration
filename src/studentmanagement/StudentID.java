package studentmanagement;

import java.awt.Image;
//import java.awt.TextField;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class StudentID extends javax.swing.JFrame {

    connect c = new connect();
    int t = 0, s = 0;
    DefaultTableModel tblmodel;
    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;

    public StudentID() {
        initComponents();
        showusers();
        if (s == 0) {
            stage.addItem("First  Stage ");
            stage.addItem("Second Stage");
            stage.addItem("Third  Stage");
            stage.addItem("Fourth Stage");
            stage.addItem("Fifth  Stage");
            stage.addItem("Sixth  Stage");
            s = 1;
        }
        id.setVisible(false);
        path2.setEnabled(false);
        ImageIcon imaog = new ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\صوره شخص.png");
        jLabel5.setIcon(imaog);
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
                String sgl = "select * from StudentID";
                c.rs = c.stmt.executeQuery(sgl);
                while (c.rs.next()) {
                    String id = c.rs.getString("id");
                    String usn = c.rs.getString("student");
                    String em = c.rs.getString("age");
                    String pss = c.rs.getString("addres");
                    String type = c.rs.getString("releaseDate");
                    String ag = c.rs.getString("stage");
                    String im = c.rs.getString("img");
                    String sty = c.rs.getString("sty");
                    String tbData[] = {id, usn, em, pss, type, ag, im, sty};
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
        String sgl = "select * from StudentID";
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
        jButton1 = new javax.swing.JButton();
        student = new javax.swing.JTextField();
        age = new com.toedter.calendar.JDateChooser();
        stage = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        addres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        id = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        path2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        forSerching = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        evening = new javax.swing.JRadioButton();
        morning = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\رجوع3.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 64, 60));
        getContentPane().add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 87, 166, -1));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 87, 166, -1));

        getContentPane().add(stage, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 131, 166, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("student name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("age");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("addres");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 134, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("stage");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\حفض3.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 125, 71, 56));
        getContentPane().add(addres, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 131, 158, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "student", "age", "addres", "releaseDate", "stage", "img", "study"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 303, 744, 196));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\حذف-3.jpg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 441, 80, 60));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\تعديل33.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 360, 60, 60));

        id.setText("ID");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 0, 67, 60));

        jLabel5.setBackground(new java.awt.Color(20, 240, 240));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\صوره شخص.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 189, -1, -1));

        path2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                path2ActionPerformed(evt);
            }
        });
        path2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                path2KeyReleased(evt);
            }
        });
        getContentPane().add(path2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1001, 407, 214, 28));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\عرض الصوره3.jpg")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1074, 441, 65, 62));

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\view.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 203, 60, 60));

        forSerching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forSerchingActionPerformed(evt);
            }
        });
        forSerching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                forSerchingKeyReleased(evt);
            }
        });
        getContentPane().add(forSerching, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 13, 194, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("serch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 23, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\طباعة3.png")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1206, 0, 64, 60));

        jPanel1.setBackground(new java.awt.Color(202, 134, 101));

        buttonGroup1.add(evening);
        evening.setText("evening");
        evening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eveningActionPerformed(evt);
            }
        });

        buttonGroup1.add(morning);
        morning.setText("morning");
        morning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                morningActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("study");

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\تعديل3.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(morning)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(evening)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 750, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(383, 383, 383))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(morning)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(evening)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dashbord dsh = new dashbord();
        dsh.setLocationRelativeTo(dsh);
        dsh.setTitle("AddProducts");
        dsh.setVisible(true);
        dsh.setSize(1084, 643);
        dsh.setLocation(120, 50);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (age.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Date cannot be empty");
        } else {
            String st, add, stag, imge3;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            st = student.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String timecreate = sdf.format(age.getDate());
            add = addres.getText();
            stag = stage.getSelectedItem().toString();
            imge3 = path2.getText();
            imge3 = imge3.replace("\\", "\\\\");
            String sty = "";
            if (morning.isSelected()) {
                sty = morning.getText();
            }
            if (evening.isSelected()) {
                sty = evening.getText();
            }

            if (st.isEmpty() || add.isEmpty() || stag.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entries cannot be empty");
            } else {
                try {
                    int a = c.stmt.executeUpdate("insert into StudentID values"
                            + "('" + 0 + "','" + st + "','" + timecreate + "','" + add + "','" + dtf.format(now) + "','" + stag + "','" + imge3 + "','" + sty + "')");
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, "The request has been added successfully");
                        updata();
                    } else {
                        JOptionPane.showMessageDialog(null, "There was a problem in saving");
                    }
                } catch (Exception e) {
                    System.out.println("Connection error");
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        //  int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        String id = model.getValueAt(selectedIndex, 0).toString();
        int dialogresult = JOptionPane.showConfirmDialog(null, "Really want to delete it?", "waring", JOptionPane.YES_NO_OPTION);
        if (dialogresult == JOptionPane.YES_NO_OPTION) {
            try {
                c.pd = c.con.prepareStatement("delete from  StudentID where id = ?");
                c.pd.setString(1, id);
                c.pd.executeUpdate();
                JOptionPane.showMessageDialog(this, "Deleted successfully");
                updata();

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "There is a connection error");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int i = jTable1.getSelectedRow();
        id.setText(jTable1.getModel().getValueAt(i, 0).toString());
        student.setText(jTable1.getModel().getValueAt(i, 1).toString());
        try {
            Date timecreate = new SimpleDateFormat("yyyy-MM-dd").parse((String) jTable1.getValueAt(i, 2));
            age.setDate(timecreate);
        } catch (Exception e) {
        }
        addres.setText(jTable1.getModel().getValueAt(i, 3).toString());
        String st = jTable1.getModel().getValueAt(i, 5).toString();
        switch (st) {
            case "First  Stage ":
                stage.setSelectedIndex(1);
                break;
            case "Second Stage":
                stage.setSelectedIndex(2);
                break;
            case "Third  Stage":
                stage.setSelectedIndex(3);
                break;
            case "Fourth Stage":
                stage.setSelectedIndex(4);
                break;
            case "Fifth  Stage":
                stage.setSelectedIndex(5);
                break;
            case "Sixth  Stage":
                stage.setSelectedIndex(6);
                break;
        }
        path2.setText(jTable1.getModel().getValueAt(i, 6).toString());
        String sty = jTable1.getModel().getValueAt(i, 7).toString();
        if (sty.equals("morning")) {
            morning.setSelected(true);
        } else {
            evening.setSelected(true);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            c.pd = c.con.prepareStatement("UPDATE StudentID SET id=?, student=?,age=? ,addres=? , stage=? ,img=?,sty=? WHERE id='" + id.getText() + "'");
            c.pd.setString(1, id.getText());
            c.pd.setString(2, student.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String timecreate = sdf.format(age.getDate());
            c.pd.setString(3, timecreate);
            c.pd.setString(4, addres.getText());
            String course = stage.getSelectedItem().toString();
            c.pd.setString(5, course);
            String imge3 = path2.getText();
            imge3 = imge3.replace("\\", "\\\\");
            c.pd.setString(6, imge3);
            if (morning.isSelected()) {
                c.pd.setString(7, morning.getText());
            } else {
                c.pd.setString(7, evening.getText());
            }
            c.pd.execute();
            JOptionPane.showMessageDialog(null, "Update completed successfully");
            updata();
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser Chooser = new JFileChooser();
        Chooser.showOpenDialog(null);
        File f = Chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        path2.setText(filename);
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
        jLabel5.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fix = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int number; (number = fix.read(buf)) != -1;) {
                bos.write(buf, 0, number);
            }
            person_image = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        JTextField formimg = new JTextField();
        formimg.setText(jTable1.getModel().getValueAt(i, 6).toString());
        ImageIcon imaog = new ImageIcon(formimg.getText());
        jLabel5.setIcon(imaog);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        showID g = new showID();
        int i = jTable1.getSelectedRow();
        /* jLabel6.setText(jTable1.getModel().getValueAt(i, 1).toString());
        jLabel8.setText(jTable1.getModel().getValueAt(i, 2).toString());
        jLabel9.setText(jTable1.getModel().getValueAt(i, 3).toString());
        jLabel7.setText(jTable1.getModel().getValueAt(i, 6).toString());
        ImageIcon imaog = new ImageIcon(jLabel7.getText());
        jLabel7.setIcon(imaog);*/

        g.gh = jTable1.getModel().getValueAt(i, 0).toString();
//        JOptionPane.showMessageDialog(null, g.gh);
        g.setSize(680, 559);
        g.setLocation(200, 50);
        g.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void path2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_path2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_path2KeyReleased

    private void path2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_path2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_path2ActionPerformed

    private void forSerchingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forSerchingKeyReleased
        jTable1.setModel(new DefaultTableModel(null, new String[]{"id", "student", "age", "addres", "releaseDate", "stage", "img", "study"}));
//        if (t == 0) {

        try {

            String sql = "select * from StudentID where concat(student,stage,sty) like '%" + forSerching.getText() + "%' ";
            c.rs = c.stmt.executeQuery(sql);
            while (c.rs.next()) {
                String id = c.rs.getString("id");
                String usn = c.rs.getString("student");
                String em = c.rs.getString("age");
                String pss = c.rs.getString("addres");
                String type = c.rs.getString("releaseDate");
                String ag = c.rs.getString("stage");
                String im = c.rs.getString("img");
                String sty = c.rs.getString("sty");
                String tbData[] = {id, usn, em, pss, type, ag, im, sty};
                tblmodel = (DefaultTableModel) jTable1.getModel();
                tblmodel.addRow(tbData);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error calling data");
        }

    }//GEN-LAST:event_forSerchingKeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        MessageFormat header = new MessageFormat("Employees");
        MessageFormat footer = new MessageFormat("page(1)");

        try {
            //   t2.print(t2.printMode.NORMAL,header,footer);
            jTable1.print(JTable.PrintMode.NORMAL, footer, footer);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void eveningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eveningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eveningActionPerformed

    private void forSerchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forSerchingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forSerchingActionPerformed

    private void morningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_morningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_morningActionPerformed

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
            java.util.logging.Logger.getLogger(StudentID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addres;
    private com.toedter.calendar.JDateChooser age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton evening;
    private javax.swing.JTextField forSerching;
    private javax.swing.JButton id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton morning;
    private javax.swing.JTextField path2;
    private javax.swing.JComboBox<String> stage;
    private javax.swing.JTextField student;
    // End of variables declaration//GEN-END:variables
}
