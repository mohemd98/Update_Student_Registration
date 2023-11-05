package studentmanagement;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AddStudent extends javax.swing.JFrame {

    connect c = new connect();
    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;

    public AddStudent() {
        initComponents();
        coll();
        tt();

        ImageIcon imaog = new ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\صوره شخص.png");
        jLabel10.setIcon(imaog);

        jButton3.setVisible(false);
        forid.setVisible(false);
    }

    public void tt() {

        ImageIcon imaog = new ImageIcon(path.getText());
        jLabel10.setIcon(imaog);

    }

    public void coll() {
        University.addItem("Choose the universities");
        University.addItem("جامعة بغداد");
        University.addItem("الجامعة المستنصرية");
        University.addItem("جامعة البصرة");
        University.addItem("جامعة الموصل");
        University.addItem("الجامعة التكنولوجية");
        University.addItem("جامعة الكوفة");
        University.addItem("جامعة تكريت");
        University.addItem("جامعة القادسية");
        University.addItem("الجامعة العراقية");
        University.addItem("جامعة بابل");
        University.addItem("جامعة النهرين");
        University.addItem("جامعة ديالى");
        University.addItem("جامعة كربلاء");
        University.addItem("جامعة ذي قار");
        University.addItem("جامعة كركوك");
        University.addItem("جامعة واسط");
        University.addItem("جامعة ميسان");
        University.addItem("جامعة سامراء");
        University.addItem("جامعة الفرات االوسط التقنية");
        University.addItem("الجامعة التقنية الوسطى");
        University.addItem("الجامعة التقنية الجنوبية");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        University = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        documentNum = new javax.swing.JTextField();
        birthday = new com.toedter.calendar.JDateChooser();
        Governorate = new javax.swing.JTextField();
        division = new javax.swing.JTextField();
        collage = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        forid = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        gender = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        morning = new javax.swing.JRadioButton();
        evening = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NationalityNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        examNo = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FullName");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("emial");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("college");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("division");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("documentNum");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Governorate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 30));

        University.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        University.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UniversityActionPerformed(evt);
            }
        });
        getContentPane().add(University, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 220, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\حفض.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 471, 60, 60));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\تعديل.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 461, 70, 70));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("University");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("exam no");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("rate");

        documentNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        documentNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentNumActionPerformed(evt);
            }
        });
        documentNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                documentNumKeyPressed(evt);
            }
        });

        Governorate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        division.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("birthday");

        forid.setText("id");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\رجوع.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        female.setBackground(new java.awt.Color(255, 102, 0));
        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        female.setText("female");

        male.setBackground(new java.awt.Color(0, 204, 0));
        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        male.setText("male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gender.setText("gander");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gender)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(female, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(male)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(female))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        morning.setBackground(new java.awt.Color(0, 204, 0));
        buttonGroup2.add(morning);
        morning.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        morning.setText("morning");
        morning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                morningActionPerformed(evt);
            }
        });

        evening.setBackground(new java.awt.Color(255, 102, 51));
        buttonGroup2.add(evening);
        evening.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        evening.setText("evening");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("study");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(morning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(evening, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(morning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(evening)
                .addGap(20, 20, 20))
        );

        path.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        path.setMaximumSize(new java.awt.Dimension(212, 34));
        path.setMinimumSize(new java.awt.Dimension(212, 34));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NatNum");

        NationalityNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NationalityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalityNumberActionPerformed(evt);
            }
        });
        NationalityNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NationalityNumberKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("phone");

        phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneKeyPressed(evt);
            }
        });

        examNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                examNoKeyPressed(evt);
            }
        });

        rate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rateKeyPressed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(51, 51, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\صوره شخص.png")); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\بعد التعديل\\عرض الصوره.jpg")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collage, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documentNum, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(184, 184, 184)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NationalityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examNo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Governorate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(313, 313, 313))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(243, 243, 243))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(forid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(forid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NationalityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(0, 13, Short.MAX_VALUE))
                                    .addComponent(examNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)))))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(collage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                        .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Governorate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(documentNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dashbord DASH = new dashbord();
        DASH.setLocationRelativeTo(DASH);
        DASH.setTitle("AddProducts");
        DASH.setVisible(true);
        DASH.setSize(1084, 643);
        DASH.setLocation(120, 50);

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (birthday.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Date cannot be empty");
        } else {
            if (collage.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Choose collage");
            } else {
                String us, em, unv, div, doc, gov, gen, datere, natnumb, phonenumber, imge3, collg, exm, re, sty;

                us = username.getText();
                em = email.getText();
                unv = University.getSelectedItem().toString();
                collg = collage.getSelectedItem().toString();
                div = division.getText();
                doc = documentNum.getText();
                gov = Governorate.getText();
                gen = "";
                if (female.isSelected()) {
                    gen = female.getText();
                }
                if (male.isSelected()) {
                    gen = male.getText();
                }

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String timecreate = sdf.format(birthday.getDate());

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();

                natnumb = NationalityNumber.getText();
                phonenumber = phone.getText();

                imge3 = path.getText();
                imge3 = imge3.replace("\\", "\\\\");

                exm = examNo.getText();
                re = rate.getText();

                sty = "";
                if (morning.isSelected()) {
                    sty = morning.getText();
                }
                if (evening.isSelected()) {
                    sty = evening.getText();
                }

                if (sty.isEmpty() || re.isEmpty() || exm.isEmpty() || us.isEmpty() || em.isEmpty() || div.isEmpty()
                        || doc.isEmpty() || gov.isEmpty() || gen.isEmpty() || natnumb.isEmpty() || phonenumber.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entries cannot be empty");
                } else {
                    if (unv == "Choose the universities") {
                        JOptionPane.showMessageDialog(null, "Choose universities");
                    } else {

                        if (imge3.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Choose image");
                        } else {
                            try {
                                int a = c.stmt.executeUpdate("INSERT INTO student VALUES"
                                        + "('" + 0 + "','" + us + "','" + em + "','" + unv + "','" + collg + "','" + div + "'"
                                        + ",'" + doc + "','" + gov + "','" + gen + "','" + timecreate + "','" + dtf.format(now) + "','"
                                        + natnumb + "','" + phonenumber + "','" + imge3 + "','"
                                        + exm + "','" + re + "','" + sty + "')");
                                if (a == 1) {
//                    NameMaterial.setText("");                         
                                    JOptionPane.showMessageDialog(null, "The request has been added successfully");

//                    Company.setText("");
//                    CyrilNumber.setText("");
//                    NumberMaterial.setText("");
//                    SinglePriceInDinars.setText("");
//                    TotalPriceInDinars.setText("");
//                    PurchaseSource.setText("");
//                    VoucherNumber.setText("");
//                    BuyerPersonName.setText("");
                                } else {
                                    JOptionPane.showMessageDialog(null, "There was a problem in saving");
                                }
                            } catch (Exception e) {
                                JOptionPane.showConfirmDialog(null, "There is a connection error");
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Show SH = new Show();
        try {
            c.pd = c.con.prepareStatement("UPDATE student SET id=?, username=?, email=?, college=?, unver=?, division=?, documentNum=?, Governorate=?, gender=?, birthday=?, NationalityNumber=?, phone=?, img=? ,examno=? ,rate=? ,study=?  WHERE id='" + forid.getText() + "'");
            c.pd.setString(1, forid.getText());
            c.pd.setString(2, username.getText());
            c.pd.setString(3, email.getText());
            String course;
            course = University.getSelectedItem().toString();
            c.pd.setString(4, course);
            String coll;
            coll = collage.getSelectedItem().toString();
            c.pd.setString(5, coll);

            c.pd.setString(6, division.getText());
            c.pd.setString(7, documentNum.getText());
            c.pd.setString(8, Governorate.getText());
            if (female.isSelected()) {
                c.pd.setString(9, female.getText());
            } else {
                c.pd.setString(9, male.getText());
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String timecreate = sdf.format(birthday.getDate());
            c.pd.setString(10, timecreate);
            c.pd.setString(11, NationalityNumber.getText());
            c.pd.setString(12, phone.getText());

            String imge3 = path.getText();
            imge3 = imge3.replace("\\", "\\\\");
            c.pd.setString(13, imge3);
            c.pd.setString(14, examNo.getText());
            c.pd.setString(15, rate.getText());
            if (morning.isSelected()) {
                c.pd.setString(16, morning.getText());
            } else {
                c.pd.setString(16, evening.getText());
            }

            c.pd.execute();
            JOptionPane.showMessageDialog(null, "Update completed successfully");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "There is a connection error");
        } finally {
            try {
                c.pd.close();
                c.rs.close();
            } catch (Exception e) {
            }
        }
        SH.updata();
        SH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser Chooser = new JFileChooser();
        Chooser.showOpenDialog(null);
        File f = Chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        path.setText(filename);
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT));
        jLabel10.setIcon(imageIcon);

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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyPressed
        String numberOfCyrilNumber = phone.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                phone.setEditable(true);
            } else {
                phone.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                phone.setEditable(true);
            } else {
                phone.setEditable(false);
            }

        }
    }//GEN-LAST:event_phoneKeyPressed

    private void documentNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentNumKeyPressed
        String numberOfCyrilNumber = documentNum.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                documentNum.setEditable(true);
            } else {
                documentNum.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                documentNum.setEditable(true);
            } else {
                documentNum.setEditable(false);
            }

        }
    }//GEN-LAST:event_documentNumKeyPressed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void NationalityNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NationalityNumberKeyPressed
        String numberOfCyrilNumber = NationalityNumber.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                NationalityNumber.setEditable(true);
            } else {
                NationalityNumber.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                NationalityNumber.setEditable(true);
            } else {
                NationalityNumber.setEditable(false);
            }

        }
    }//GEN-LAST:event_NationalityNumberKeyPressed

    private void NationalityNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalityNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalityNumberActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void UniversityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UniversityActionPerformed
        if (University.getSelectedItem().equals("جامعة بغداد")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الكندي");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية الاداب");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية العلوم السياسية");
            collage.addItem("كلية العلوم للبنات");
            collage.addItem("كلية القانون");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("علوم الهندسة الزراعية");
            collage.addItem("كلية اللغات");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية الاعلام");
            collage.addItem("كلية الفنون الجميلة");
            collage.addItem("كلية الصيدلة");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("الجامعة المستنصرية")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية الاداب");
            collage.addItem("كلية العلوم السياسية");
            collage.addItem("كلية القانون");
            collage.addItem("كلية التربيه");
            collage.addItem("كلية العلوم للبنات");
            collage.addItem("كلية العلوم السياحيه");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة البصرة")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية طب الزهراء");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية القانون");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية الزراعة");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية التربيه");
            collage.addItem("كلية الاداب");
            collage.addItem("كلية علوم البحار");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة الموصل")) {
            collage.removeAllItems();
            collage.addItem("كلية طب موصل");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية الحقوق");
            collage.addItem("كلية العلوم السياسية");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية التربيه");
            collage.addItem("كلية الاداب");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية العلوم السياحيه");
            collage.addItem("كلية اثار");
            collage.addItem("كلية العلوم الاسلاميه");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("الجامعة التكنولوجية")) {
            collage.removeAllItems();
            collage.addItem("الهندسة الكهربائية");
            collage.addItem("هندسة السيطرة والنظم");
            collage.addItem("هندسة الحاسوب");
            collage.addItem("هندسة الميكانيكية");
            collage.addItem("هندسة الكيميائية");
            collage.addItem("هندسة الليزر وااللكترونيات البصرية");
            collage.addItem("هندسة المواد");
            collage.addItem("هندسة االنتاج والمعادن");
            collage.addItem("هندسة اتصالاات");
            collage.addItem("هندسة تكنولوجيا النفط");
            collage.addItem("هندسة المدنية");
            collage.addItem("هندسة الكهروميكانيك");
            collage.addItem("هندسة الطب الحياتي");
            collage.addItem("العلوم التطبيقية");
            collage.addItem("علوم الحاسوب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة الكوفة")) {
            collage.removeAllItems();
            collage.addItem("كلية اثار");
            collage.addItem("كلية الفقه");
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية القانون");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية الزراعة");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية التربيه");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة تكريت")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية حقوق");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية الزراعة");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية التربيه");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة القادسية")) {
            collage.removeAllItems();
            collage.addItem("كلية اثار");
            collage.addItem("كلية التقنيات الاحيائيه");
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية القانون");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية الزراعة");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية التربيه");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("الجامعة العراقية")) {
            collage.removeAllItems();
            collage.addItem("كلية التقنيات الاحيائيه");
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية القانون");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية التربيه");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة بابل")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية القانون");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية الزراعة");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية التربيه");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة النهرين")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية حقوق");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية الزراعة");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية التربيه");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة ديالى")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية قانون و العلوم السياسيه");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية الزراعة");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية التربيه المقداد");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة كربلاء")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية قانون و العلوم السياسيه");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية الزراعة");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة ذي قار")) {
            collage.removeAllItems();
            collage.addItem("كلية اثار");
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية قانون و العلوم السياسيه");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية اعلام");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة كركوك")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية قانون و العلوم السياسيه");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية زراعه");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة واسط")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية قانون و العلوم السياسيه");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية زراعه");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة ميسان")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية قانون و العلوم السياسيه");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية زراعه");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية الاداب");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة سامراء")) {
            collage.removeAllItems();
            collage.addItem("كلية الطب");
            collage.addItem("كلية طب الاسنان");
            collage.addItem("كلية الصيدلة");
            collage.addItem("كلية الطب البيطري");
            collage.addItem("كلية الهندسة");
            collage.addItem("كلية العلوم");
            collage.addItem("كلية قانون و العلوم السياسيه");
            collage.addItem("كلية التمريض");
            collage.addItem("كلية زراعه");
            collage.addItem("كلية اداره و الاقتصاد");
            collage.addItem("كلية قانون");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("جامعة الفرات االوسط التقنية")) {
            collage.removeAllItems();
            collage.addItem("الكليه التقنيه الهندسيه");
            collage.addItem("الكليه التقنيه اقسام الزراعيه");
            collage.addItem("الكليه التقنيه الاداريه");
            collage.addItem("الكليه التقني الطبي");
            collage.addItem("الكليه التقني التكنولجي");
            collage.addItem("الكليه التقنيه الزراعيه");
            collage.addItem("الكليه التقنيه فنون");
            collage.setSelectedItem(null);
        }
        if (University.getSelectedItem().equals("الجامعة التقنية الوسطى")) {
            collage.removeAllItems();
            collage.addItem("الكلية التقنيات الصحيه و الطبيه");
            collage.addItem("الكليه التقنيه الهندسيه الكهربائيه");
            collage.addItem("الكليه الاداريه الاقتصاديه");
            collage.addItem("الكليه الفنون التطبيقيه");
            collage.addItem("المعهد الطبي");
            collage.addItem("المعهد التقني الطبي");
            collage.addItem("المعهد التقني التكنلوجي");
            collage.addItem("المعهد التقني الزراعي");
            collage.addItem("معهد الاداره");
            collage.addItem("معهد اعداد المدربين التقنين");

            collage.setSelectedItem(null);
        }

        if (University.getSelectedItem().equals("الجامعة التقنية الجنوبية")) {
            collage.removeAllItems();
            collage.addItem("الكليه التقنيه الصحيه والطبيه");
            collage.addItem("الكليه التقنيه الشطره");
            collage.addItem("الكليه التقنيه الهندسيه");
            collage.addItem("الكليه التقنيه الاداريه");
            collage.addItem("الكليه التقني الطبي");
            collage.addItem("المعهد التقني الطبي ");
            collage.addItem("المعهد التقني التكنلوجي");
            collage.addItem("المعهد التقني الزراعي");
            collage.addItem("المعهد التقني الفنون");
            collage.addItem("بيب");
            collage.addItem("بيب");
            collage.addItem("بيب");
            collage.addItem("بيب");
            collage.addItem("بيب");
            collage.addItem("بيب");
            collage.addItem("بيب");
            collage.setSelectedItem(null);
        }
    }//GEN-LAST:event_UniversityActionPerformed

    private void documentNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentNumActionPerformed

    private void examNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_examNoKeyPressed
        String numberOfCyrilNumber = examNo.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                examNo.setEditable(true);
            } else {
                examNo.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                examNo.setEditable(true);
            } else {
                examNo.setEditable(false);
            }

        }
    }//GEN-LAST:event_examNoKeyPressed

    private void rateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateKeyPressed
        String numberOfCyrilNumber = rate.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                rate.setEditable(true);
            } else {
                rate.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                rate.setEditable(true);
            } else {
                rate.setEditable(false);
            }

        }
    }//GEN-LAST:event_rateKeyPressed

    private void morningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_morningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_morningActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Governorate;
    public javax.swing.JTextField NationalityNumber;
    public javax.swing.JComboBox<String> University;
    public com.toedter.calendar.JDateChooser birthday;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JComboBox<String> collage;
    public javax.swing.JTextField division;
    public javax.swing.JTextField documentNum;
    public javax.swing.JTextField email;
    public javax.swing.JRadioButton evening;
    public javax.swing.JTextField examNo;
    public javax.swing.JRadioButton female;
    public javax.swing.JButton forid;
    private javax.swing.JLabel gender;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JRadioButton male;
    public javax.swing.JRadioButton morning;
    public javax.swing.JTextField path;
    public javax.swing.JTextField phone;
    public javax.swing.JTextField rate;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
