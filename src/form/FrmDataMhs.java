
package form;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import config.Koneksi;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmDataMhs extends javax.swing.JFrame {
    private DefaultTableModel model = new DefaultTableModel();
    private String sql;
    private ResultSet rs = null;
    FrmEditMhs edit = new FrmEditMhs();
    
    public FrmDataMhs() throws Exception {
        initComponents();
        setBackground(new Color(0,0,0,0));
        tblDataMhs.fixTable(jScrollPane1);
        //setAlignment Columns & cells
        for(int i = 0; i < tblDataMhs.getColumnCount();i++){
            tblDataMhs.setColumnAlignment(i, JLabel.CENTER);
            tblDataMhs.setCellAlignment(i, JLabel.CENTER);
        }
        //setSize columns
        tblDataMhs.setColumnWidth(0, 80);
        tblDataMhs.setColumnWidth(7, 70);
        
        //calling method to show data from db
        showData();
    }

    //method to show data from db to jtable
    public void showData() throws Exception{
        for(int i = 0; i < tblDataMhs.getColumnCount();i++){
            model.addColumn(tblDataMhs.getColumnName(i));
        }
        tblDataMhs.setModel(model);
        Connection conn = Koneksi.getConnection();
        
        try {
            Statement stmt = conn.createStatement();
            sql = "SELECT nim, nmMhs, CONCAT(tmptLahir,\", \",tglLahir) AS tmptTglLahir,"
                  + "jnsKelamin,almt,noHp,semester,jenjang,thnAkademik FROM mahasiswa;";
            ResultSet rslt = stmt.executeQuery(sql);
            while (rslt.next()) {
            model.addRow(new Object[]{
                rslt.getString("nim"),
                rslt.getString("nmMhs"),
                rslt.getString("tmptTglLahir"),
                rslt.getString("jnsKelamin"),
                rslt.getString("almt"),
                rslt.getString("noHp"),
                rslt.getString("semester"),
                rslt.getString("jenjang"),
                rslt.getString("thnAkademik")
            });
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        panelRound1 = new components.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataMhs = new components.Table();
        panelRound2 = new components.PanelRound();
        pnlSearch = new components.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        pnlEditMhs = new components.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlTambahMhs = new components.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        txtNamaMhs = new javax.swing.JTextField();
        txtSemAkd = new javax.swing.JTextField();

        jLabel6.setText("jLabel6");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(229, 238, 210));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        tblDataMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Tmpt/Tgl Lahir", "Jenis Kelamin", "Alamat", "No. Hp", "Semester", "Jenjang", "Thn Akd."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDataMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataMhs);

        panelRound2.setBackground(new java.awt.Color(28, 49, 68));
        panelRound2.setRoundBottomLeft(15);
        panelRound2.setRoundBottomRight(15);
        panelRound2.setRoundTopLeft(15);
        panelRound2.setRoundTopRight(15);

        pnlSearch.setBackground(new java.awt.Color(195, 216, 152));
        pnlSearch.setRoundBottomLeft(3);
        pnlSearch.setRoundBottomRight(3);
        pnlSearch.setRoundTopLeft(3);
        pnlSearch.setRoundTopRight(3);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Search.png"))); // NOI18N

        txtSearch.setBackground(new java.awt.Color(195, 216, 152));
        txtSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(28, 49, 68));
        txtSearch.setText("Search");
        txtSearch.setBorder(null);
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlEditMhs.setBackground(new java.awt.Color(195, 216, 152));
        pnlEditMhs.setRoundBottomLeft(3);
        pnlEditMhs.setRoundBottomRight(3);
        pnlEditMhs.setRoundTopLeft(3);
        pnlEditMhs.setRoundTopRight(3);
        pnlEditMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEditMhsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlEditMhsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlEditMhsMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editLogo.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Edit");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("  Mahasiswa");

        javax.swing.GroupLayout pnlEditMhsLayout = new javax.swing.GroupLayout(pnlEditMhs);
        pnlEditMhs.setLayout(pnlEditMhsLayout);
        pnlEditMhsLayout.setHorizontalGroup(
            pnlEditMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditMhsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(1, 1, 1)
                .addGroup(pnlEditMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditMhsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEditMhsLayout.setVerticalGroup(
            pnlEditMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditMhsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlEditMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditMhsLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12))
                    .addComponent(jLabel8))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pnlTambahMhs.setBackground(new java.awt.Color(195, 216, 152));
        pnlTambahMhs.setRoundBottomLeft(3);
        pnlTambahMhs.setRoundBottomRight(3);
        pnlTambahMhs.setRoundTopLeft(3);
        pnlTambahMhs.setRoundTopRight(3);
        pnlTambahMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTambahMhsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlTambahMhsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTambahMhsMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tambah");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("  Mahasiswa");

        javax.swing.GroupLayout pnlTambahMhsLayout = new javax.swing.GroupLayout(pnlTambahMhs);
        pnlTambahMhs.setLayout(pnlTambahMhsLayout);
        pnlTambahMhsLayout.setHorizontalGroup(
            pnlTambahMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTambahMhsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTambahMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTambahMhsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTambahMhsLayout.setVerticalGroup(
            pnlTambahMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTambahMhsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlTambahMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTambahMhsLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10))
                    .addComponent(jLabel7))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        txtNim.setEditable(false);
        txtNim.setBackground(new java.awt.Color(28, 49, 68));
        txtNim.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txtNim.setForeground(new java.awt.Color(255, 255, 255));
        txtNim.setBorder(null);

        txtNamaMhs.setEditable(false);
        txtNamaMhs.setBackground(new java.awt.Color(28, 49, 68));
        txtNamaMhs.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txtNamaMhs.setForeground(new java.awt.Color(255, 255, 255));
        txtNamaMhs.setBorder(null);
        txtNamaMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaMhsActionPerformed(evt);
            }
        });

        txtSemAkd.setEditable(false);
        txtSemAkd.setBackground(new java.awt.Color(28, 49, 68));
        txtSemAkd.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtSemAkd.setForeground(new java.awt.Color(237, 91, 91));
        txtSemAkd.setBorder(null);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemAkd, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(pnlTambahMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlEditMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNamaMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlTambahMhs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlEditMhs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                        .addComponent(txtSemAkd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     private void handCursor(String event){
        if(event.toLowerCase().equals("entered")){
            Cursor cursor = Cursor.getDefaultCursor();
            cursor = cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
            setCursor(cursor);
        }else if(event.toLowerCase().equals("exited")){
            setCursor(0);
        }
        
    }
     
    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
    if(txtSearch.getText().equals("Search")){
           txtSearch.setText("");
       }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void pnlTambahMhsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTambahMhsMouseEntered
        pnlTambahMhs.setBackground(new Color(229,238,210));
        handCursor("entered");
    }//GEN-LAST:event_pnlTambahMhsMouseEntered

    private void pnlTambahMhsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTambahMhsMouseExited
        pnlTambahMhs.setBackground(new Color(195,216,152));        
        handCursor("exited");
    }//GEN-LAST:event_pnlTambahMhsMouseExited

    private void pnlTambahMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTambahMhsMouseClicked
        this.dispose();
        JFrame frmTambahMhs = new FrmTambahMhs();
        frmTambahMhs.setLocation(470,70);
        frmTambahMhs.setVisible(true);
    }//GEN-LAST:event_pnlTambahMhsMouseClicked

    private void tblDataMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMhsMouseClicked
        int baris = tblDataMhs.getSelectedRow();
        //set nama
        txtNamaMhs.setText(model.getValueAt(baris, 1).toString());
        //set nim
        txtNim.setText(model.getValueAt(baris, 0).toString());
        //set semester dan tahun akademik
        String sem = model.getValueAt(baris, 6).toString();
        String akd = model.getValueAt(baris, 8).toString();
        txtSemAkd.setText("Semester " + sem + ", Tahun Akademik " + akd);
        
        
        //set form edit

        edit.txtNim.setText(model.getValueAt(baris, 0).toString());
        edit.txtNmMhs.setText(model.getValueAt(baris, 1).toString());
        edit.txtTmptTgl.setText(model.getValueAt(baris, 2).toString());
        edit.cmbJnsKelamin.setSelectedItem(model.getValueAt(baris, 3).toString());
        edit.txtAlmt.setText(model.getValueAt(baris, 4).toString());
        edit.txtNoHp.setText(model.getValueAt(baris, 5).toString());
        edit.txtSemester.setText(model.getValueAt(baris, 6).toString());
        edit.cmbJenjang.setSelectedItem(model.getValueAt(baris, 7).toString());
        edit.txtThnAkd.setText(model.getValueAt(baris, 8).toString());
        
    }//GEN-LAST:event_tblDataMhsMouseClicked

    private void pnlEditMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditMhsMouseClicked
    
                this.dispose();
        edit.setLocation(470,70);
        edit.setVisible(true);
    }//GEN-LAST:event_pnlEditMhsMouseClicked

    private void pnlEditMhsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditMhsMouseEntered
        pnlEditMhs.setBackground(new Color(229,238,210));
        handCursor("entered");
    }//GEN-LAST:event_pnlEditMhsMouseEntered

    private void pnlEditMhsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditMhsMouseExited
        pnlEditMhs.setBackground(new Color(195,216,152));  
        handCursor("exited");
    }//GEN-LAST:event_pnlEditMhsMouseExited

    private void txtNamaMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaMhsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaMhsActionPerformed

    private void search(String key){
       try {
        Connection conn = Koneksi.getConnection(); 
        Statement st = conn.createStatement();
        model.getDataVector().removeAllElements();
            sql = "SELECT nim, nmMhs, CONCAT(tmptLahir,\", \",tglLahir) AS tmptTglLahir,jnsKelamin,"
                  + "almt,noHp,semester,jenjang,thnAkademik FROM mahasiswa \n" +
                  "WHERE nmMhs LIKE '%"+key+"%' OR nim LIKE '%"+key+"%'";
            System.out.println(sql);
        rs = st.executeQuery(sql);
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("nim"),
                rs.getString("nmMhs"),
                rs.getString("tmptTglLahir"),
                rs.getString("jnsKelamin"),
                rs.getString("almt"),
                rs.getString("noHp"),
                rs.getString("semester"),
                rs.getString("jenjang"),
                rs.getString("thnAkademik")
            });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        String key = txtSearch.getText();
        if(key != ""){
            search(key);
        }else{
            try {
                showData();
            } catch (Exception ex) {
                Logger.getLogger(FrmDataMhs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        String key = txtSearch.getText();
        if(key != ""){
            search(key);
        }else{
            try {
                showData();
            } catch (Exception ex) {
                Logger.getLogger(FrmDataMhs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        txtSearch.setText("Search");
    }//GEN-LAST:event_txtSearchFocusLost

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
            java.util.logging.Logger.getLogger(FrmDataMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDataMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDataMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDataMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmDataMhs().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FrmDataMhs.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private components.PanelRound panelRound1;
    private components.PanelRound panelRound2;
    private components.PanelRound pnlEditMhs;
    private components.PanelRound pnlSearch;
    private components.PanelRound pnlTambahMhs;
    private components.Table tblDataMhs;
    private javax.swing.JTextField txtNamaMhs;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSemAkd;
    // End of variables declaration//GEN-END:variables
}
