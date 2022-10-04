package form;

import config.Koneksi;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import main.Dashboard_Admin;

public class FrmDataMatkulProdi extends javax.swing.JFrame {

    public static String cmbKodeProdi, cmbNip;
    private DefaultTableModel model = new DefaultTableModel();
    private String sql;
    private ResultSet rs = null;
    FrmEditMatkul edit = new FrmEditMatkul();
    public FrmDataMatkulProdi() throws Exception{
        initComponents();
        tblDataMatkul.fixTable(jScrollPane1);
        setBackground(new Color(0,0,0,0));
        showData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new components.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataMatkul = new components.Table();
        panelRound2 = new components.PanelRound();
        pnlSearch = new components.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        pnlEditMatkul = new components.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlTambahMatkul = new components.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtKodeMatkul = new javax.swing.JTextField();
        txtNmMatkul = new javax.swing.JTextField();
        txtSks = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKodeProdi = new javax.swing.JTextField();
        pnlTambahMatkul1 = new components.PanelRound();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(229, 238, 210));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        tblDataMatkul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Kode Matkul", "Nama Maktul", "SKS", "Semester", "status", "prasyarat", "Kode Prodi", "NIP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDataMatkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMatkulMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataMatkul);

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
        pnlSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnlSearchKeyTyped(evt);
            }
        });

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

        pnlEditMatkul.setBackground(new java.awt.Color(195, 216, 152));
        pnlEditMatkul.setRoundBottomLeft(3);
        pnlEditMatkul.setRoundBottomRight(3);
        pnlEditMatkul.setRoundTopLeft(3);
        pnlEditMatkul.setRoundTopRight(3);
        pnlEditMatkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEditMatkulMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlEditMatkulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlEditMatkulMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editLogo.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Edit");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("   Matkul");

        javax.swing.GroupLayout pnlEditMatkulLayout = new javax.swing.GroupLayout(pnlEditMatkul);
        pnlEditMatkul.setLayout(pnlEditMatkulLayout);
        pnlEditMatkulLayout.setHorizontalGroup(
            pnlEditMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditMatkulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(pnlEditMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditMatkulLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlEditMatkulLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        pnlEditMatkulLayout.setVerticalGroup(
            pnlEditMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditMatkulLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlEditMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEditMatkulLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12))
                    .addComponent(jLabel8))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pnlTambahMatkul.setBackground(new java.awt.Color(195, 216, 152));
        pnlTambahMatkul.setRoundBottomLeft(3);
        pnlTambahMatkul.setRoundBottomRight(3);
        pnlTambahMatkul.setRoundTopLeft(3);
        pnlTambahMatkul.setRoundTopRight(3);
        pnlTambahMatkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTambahMatkulMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlTambahMatkulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTambahMatkulMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tambah");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("       Matkul");

        javax.swing.GroupLayout pnlTambahMatkulLayout = new javax.swing.GroupLayout(pnlTambahMatkul);
        pnlTambahMatkul.setLayout(pnlTambahMatkulLayout);
        pnlTambahMatkulLayout.setHorizontalGroup(
            pnlTambahMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTambahMatkulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTambahMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTambahMatkulLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTambahMatkulLayout.setVerticalGroup(
            pnlTambahMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTambahMatkulLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlTambahMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTambahMatkulLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10))
                    .addComponent(jLabel7))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        txtKodeMatkul.setEditable(false);
        txtKodeMatkul.setBackground(new java.awt.Color(28, 49, 68));
        txtKodeMatkul.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txtKodeMatkul.setForeground(new java.awt.Color(255, 255, 255));
        txtKodeMatkul.setText("-");
        txtKodeMatkul.setBorder(null);
        txtKodeMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeMatkulActionPerformed(evt);
            }
        });

        txtNmMatkul.setEditable(false);
        txtNmMatkul.setBackground(new java.awt.Color(28, 49, 68));
        txtNmMatkul.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        txtNmMatkul.setForeground(new java.awt.Color(255, 255, 255));
        txtNmMatkul.setText("-");
        txtNmMatkul.setBorder(null);
        txtNmMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNmMatkulActionPerformed(evt);
            }
        });

        txtSks.setEditable(false);
        txtSks.setBackground(new java.awt.Color(28, 49, 68));
        txtSks.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtSks.setForeground(new java.awt.Color(237, 91, 91));
        txtSks.setText("-");
        txtSks.setBorder(null);
        txtSks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSksActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 91, 91));
        jLabel1.setText("Jumlah Sks");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 91, 91));
        jLabel2.setText("Kode Prodi ");

        txtKodeProdi.setEditable(false);
        txtKodeProdi.setBackground(new java.awt.Color(28, 49, 68));
        txtKodeProdi.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtKodeProdi.setForeground(new java.awt.Color(237, 91, 91));
        txtKodeProdi.setText("-");
        txtKodeProdi.setBorder(null);
        txtKodeProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeProdiActionPerformed(evt);
            }
        });

        pnlTambahMatkul1.setBackground(new java.awt.Color(195, 216, 152));
        pnlTambahMatkul1.setRoundBottomLeft(3);
        pnlTambahMatkul1.setRoundBottomRight(3);
        pnlTambahMatkul1.setRoundTopLeft(3);
        pnlTambahMatkul1.setRoundTopRight(3);
        pnlTambahMatkul1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTambahMatkul1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlTambahMatkul1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTambahMatkul1MouseExited(evt);
            }
        });
        pnlTambahMatkul1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit-sm.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSks, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(pnlTambahMatkul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtKodeMatkul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                                .addComponent(txtNmMatkul, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtKodeProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                        .addComponent(pnlTambahMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlEditMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNmMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(txtKodeMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtKodeProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3)))
                    .addComponent(pnlTambahMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEditMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTambahMatkul1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtSks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
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
                .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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

    public void showData() throws Exception{
        for(int i = 0; i < tblDataMatkul.getColumnCount();i++){
            model.addColumn(tblDataMatkul.getColumnName(i));
        }
        tblDataMatkul.setModel(model);
        Connection conn = Koneksi.getConnection();
        
        try {
            Statement stmt = conn.createStatement();
            sql = "SELECT * FROM matkul;";
            ResultSet rslt = stmt.executeQuery(sql);
            while (rslt.next()) {
            model.addRow(new Object[]{
                rslt.getString("kodeMatkul"),
                rslt.getString("nmMatkul"),
                rslt.getString("sks"),
                rslt.getString("semester"),
                rslt.getString("status"),
                rslt.getString("prasyarat"),
                rslt.getString("kodeProdi"),
                rslt.getString("nip")
            });
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void handCursor(String event){
        if(event.toLowerCase().equals("entered")){
            Cursor cursor = Cursor.getDefaultCursor();
            cursor = cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
            setCursor(cursor);
        }else if(event.toLowerCase().equals("exited")){
            setCursor(0);
        }
        
    }
       
    private void search(String key){
        try {
        Connection conn = Koneksi.getConnection(); 
        Statement st = conn.createStatement();
        model.getDataVector().removeAllElements();
            sql = "SELECT * FROM matkul where nmMatkul LIKE '%" +key+"%' OR kodeMatkul LIKE'%" 
                    +key+"';";
            System.out.println(sql);
        rs = st.executeQuery(sql);
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("kodeMatkul"),
                rs.getString("nmMatkul"),
                rs.getString("sks"),
                rs.getString("semester"),
                rs.getString("status"),
                rs.getString("prasyarat"),
                rs.getString("kodeProdi"),
                rs.getString("nip")
            });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void tblDataMatkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMatkulMouseClicked
        int baris = tblDataMatkul.getSelectedRow();
        txtNmMatkul.setText(model.getValueAt(baris, 1).toString());
        txtKodeMatkul.setText(model.getValueAt(baris, 0).toString());
        txtSks.setText(model.getValueAt(baris,2).toString());
        txtKodeProdi.setText(model.getValueAt(baris,6).toString());

        //set form edit

        edit.txtKodeMatkul.setText(model.getValueAt(baris, 0).toString());
        edit.txtNmMatkul.setText(model.getValueAt(baris, 1).toString());
        edit.txtSks.setText(model.getValueAt(baris, 2).toString());
        edit.txtSem.setText(model.getValueAt(baris, 3).toString());
        edit.txtStatus.setText(model.getValueAt(baris, 4).toString());
        edit.txtPrasyarat.setText(model.getValueAt(baris, 5) == null? "" : model.getValueAt(baris, 5).toString());
        cmbKodeProdi = model.getValueAt(baris,6).toString();
        cmbNip = model.getValueAt(baris, 7) == null? "" : model.getValueAt(baris, 7).toString();
    }//GEN-LAST:event_tblDataMatkulMouseClicked

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        txtSearch.setText("Search");
    }//GEN-LAST:event_txtSearchFocusLost

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

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if(txtSearch.getText().equals("Search")){
            txtSearch.setText("");
        }
    }//GEN-LAST:event_txtSearchKeyPressed

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

    private void pnlEditMatkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditMatkulMouseClicked

        this.dispose();
        edit.setLocation(470,70);
        edit.setVisible(true);
    }//GEN-LAST:event_pnlEditMatkulMouseClicked

    private void pnlEditMatkulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditMatkulMouseEntered
        pnlEditMatkul.setBackground(new Color(229,238,210));
        handCursor("entered");
    }//GEN-LAST:event_pnlEditMatkulMouseEntered

    private void pnlEditMatkulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditMatkulMouseExited
        pnlEditMatkul.setBackground(new Color(195,216,152));
        handCursor("exited");
    }//GEN-LAST:event_pnlEditMatkulMouseExited

    private void pnlTambahMatkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTambahMatkulMouseClicked
        this.dispose();
        FrmTambahMatkul tambahMatkul = new FrmTambahMatkul();
        tambahMatkul.setLocation(470,70);
        tambahMatkul.setVisible(true);
    }//GEN-LAST:event_pnlTambahMatkulMouseClicked

    private void pnlTambahMatkulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTambahMatkulMouseEntered
        pnlTambahMatkul.setBackground(new Color(229,238,210));
        handCursor("entered");
    }//GEN-LAST:event_pnlTambahMatkulMouseEntered

    private void pnlTambahMatkulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTambahMatkulMouseExited
        pnlTambahMatkul.setBackground(new Color(195,216,152));
        handCursor("exited");
    }//GEN-LAST:event_pnlTambahMatkulMouseExited

    private void txtNmMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNmMatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNmMatkulActionPerformed

    private void txtKodeMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeMatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeMatkulActionPerformed

    private void txtSksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSksActionPerformed

    private void txtKodeProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeProdiActionPerformed

    private void pnlTambahMatkul1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTambahMatkul1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTambahMatkul1MouseClicked

    private void pnlTambahMatkul1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTambahMatkul1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTambahMatkul1MouseEntered

    private void pnlTambahMatkul1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTambahMatkul1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTambahMatkul1MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try { 
            this.dispose();
            Dashboard_Admin.openFrame(Dashboard_Admin.dataProdi);
        } catch (Exception ex) {
            Logger.getLogger(FrmDataMatkulProdi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void pnlSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlSearchKeyTyped

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
            java.util.logging.Logger.getLogger(FrmDataMatkulProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDataMatkulProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDataMatkulProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDataMatkulProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmDataMatkulProdi().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FrmDataMatkulProdi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private components.PanelRound panelRound1;
    private components.PanelRound panelRound2;
    private components.PanelRound pnlEditMatkul;
    private components.PanelRound pnlSearch;
    private components.PanelRound pnlTambahMatkul;
    private components.PanelRound pnlTambahMatkul1;
    private components.Table tblDataMatkul;
    private javax.swing.JTextField txtKodeMatkul;
    private javax.swing.JTextField txtKodeProdi;
    private javax.swing.JTextField txtNmMatkul;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSks;
    // End of variables declaration//GEN-END:variables
}
