package nsbmenrolmentsystem;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author User
 */
public class addDetails extends javax.swing.JFrame {
   javadbconnection jdb=new javadbconnection(); 
   String url="jdbc:mysql://localhost:3306/nsbmenrolsystem"; //access database
   String username="root";
   String password="";
   Connection conn=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   int x,y;
    public addDetails() {
        initComponents();
        updateUstudentinfo();
        updatePstudentinfo();
    }
    void clearfield(){
       try{
            tname.setText(null);
            tnic.setText(null);
            cfaculty.setSelectedItem("School Of Computing");
            tdob.setText(null);
            tpno.setText(null);
            temail.setText(null);
            ryear.setText(null);
            rmonth.setSelectedItem("February");
            csub1res.setSelectedItem("A");
            csub2res.setSelectedItem("A");
            csub3res.setSelectedItem("A");
            taddress.setText(null);
            tsub1.setText(null);
            tsub2.setText(null);
            tsub3.setText(null);
            tisland.setText(null);
            tzscore.setText(null);
            rm.setSelected(false);
            rf.setSelected(false);

        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,e);
        } 
    }
    void clearfieldP(){
        try{
            Tname.setText(null);
            Tnic.setText(null);
            Tfaculty.setSelectedItem("School Of Computing");
            Tdob.setText(null);
            Tpno.setText(null);
            Temail.setText(null);
            Tryear.setText(null);
            Trmonth.setSelectedItem("February");
            Taddress.setText(null);
            Tqualification.setText(null);
            rmale.setSelected(false);
            rfemale.setSelected(false);

        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }
    private void updateUstudentinfo(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); //load and register jdbc driver
            conn=(Connection)DriverManager.getConnection(url,username,password);
            String query="select regno,sname,nic from undergraduate";
            pst=conn.prepareStatement(query);
            rs=pst.executeQuery();
            jtable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    private void updatePstudentinfo(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); //load and register jdbc driver
            conn=(Connection)DriverManager.getConnection(url,username,password);
            String query1="Select regno,name,nic from postgraduate";
            pst=conn.prepareStatement(query1);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    private void gUData(){
        try{
           tname.setText(rs.getString("sname"));
           tnic.setText(rs.getString("nic"));
           cfaculty.setSelectedItem(rs.getString("faculty"));
           tdob.setText(rs.getString("dob"));
           tpno.setText(rs.getString("pno"));
           temail.setText(rs.getString("email"));
           ryear.setText(rs.getString("regYear"));
           rmonth.setSelectedItem(rs.getString("regMonth"));
           csub1res.setSelectedItem(rs.getString("Subject1Result"));
           csub2res.setSelectedItem(rs.getString("Subject2Result"));
           csub3res.setSelectedItem(rs.getString("Subject3Result"));
           taddress.setText(rs.getString("address"));
           tsub1.setText(rs.getString("subject1"));
           tsub2.setText(rs.getString("subject2"));
           tsub3.setText(rs.getString("subject3"));
           tisland.setText(rs.getString("islandRank"));
           tzscore.setText(rs.getString("zScore"));
           String gen=rs.getString("gender");
           if (gen.equals("Female")){
               rm.setSelected(false);
               rf.setSelected(true);

           }else{
               rf.setSelected(false);
               rm.setSelected(true);
           }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }
    private void gPData(){
        try{
            Tname.setText(rs.getString("name"));
            Tnic.setText(rs.getString("nic"));
            Tfaculty.setSelectedItem(rs.getString("faculty"));
            Tdob.setText(rs.getString("dob"));
            Tpno.setText(rs.getString("pno"));
            Temail.setText(rs.getString("email"));
            Tryear.setText(rs.getString("ryear"));
            Trmonth.setSelectedItem(rs.getString("rmonth"));
            Taddress.setText(rs.getString("address"));
            Tqualification.setText(rs.getString("qualification"));
            String gen=rs.getString("gender");
            if (gen.equals("Female")){
                rmale.setSelected(false);
                rfemale.setSelected(true);
            }else{
                rfemale.setSelected(false);
                rmale.setSelected(true);
            }  
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,e);
         }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Tsearch = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Taddress = new javax.swing.JTextArea();
        Tpno = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tqualification = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Tdob = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Tryear = new javax.swing.JTextField();
        Tname = new javax.swing.JTextField();
        Temail = new javax.swing.JTextField();
        Tnic = new javax.swing.JTextField();
        Tfaculty = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Trmonth = new javax.swing.JComboBox();
        rmale = new javax.swing.JRadioButton();
        rfemale = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        updateP = new javax.swing.JButton();
        tsearch = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taddress = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tsub1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tpno = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tnic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        csub2res = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tsub2 = new javax.swing.JTextField();
        csub3res = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        ryear = new javax.swing.JTextField();
        tname = new javax.swing.JTextField();
        tzscore = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tisland = new javax.swing.JTextField();
        cfaculty = new javax.swing.JComboBox();
        tdob = new javax.swing.JTextField();
        rf = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        tsub3 = new javax.swing.JTextField();
        csub1res = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        rm = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rmonth = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        updateU = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tclear = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        tSearch = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Student Details");

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbmenrolmentsystem/image/unnamed.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(481, 481, 481)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 495, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setHorizontalScrollBar(null);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RegNo", "Name", "NIC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable1);

        Tsearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tsearch.setText("SEARCH...........");
        Tsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TsearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TsearchKeyTyped(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Postgraduate Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        Taddress.setColumns(20);
        Taddress.setRows(5);
        jScrollPane2.setViewportView(Taddress);

        Tpno.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        Tpno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpnoActionPerformed(evt);
            }
        });

        Tqualification.setColumns(20);
        Tqualification.setRows(5);
        jScrollPane3.setViewportView(Tqualification);

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("Year: ");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel25.setText("DOB");

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel32.setText("RegDate");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel26.setText("E mail");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel30.setText("Qualification");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel24.setText("Gender");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel23.setText("Faculty");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel21.setText("Name");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setText("Month:");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel27.setText("Address");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel28.setText("Phone No");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel22.setText("NIC");

        Tryear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TryearActionPerformed(evt);
            }
        });

        Tname.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        Temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemailActionPerformed(evt);
            }
        });

        Tnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnicActionPerformed(evt);
            }
        });

        Tfaculty.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        Tfaculty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "School Of Computing", "School Of Engineeribg", "School Of Business" }));

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel35.setText("Date Format : yyyy-mm-dd");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel34.setText("Enter Qualification Type, Institute and Completion Year");

        Trmonth.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Trmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "February", "July" }));

        rmale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rmale.setText("Male");

        rfemale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rfemale.setText("Female");

        jButton10.setBackground(new java.awt.Color(204, 204, 255));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbmenrolmentsystem/image/delete.png"))); // NOI18N
        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbmenrolmentsystem/image/add-user-male.png"))); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        updateP.setBackground(new java.awt.Color(204, 204, 255));
        updateP.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        updateP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbmenrolmentsystem/image/edit-user-male.png"))); // NOI18N
        updateP.setText("Update");
        updateP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePActionPerformed(evt);
            }
        });

        tsearch.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        tsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbmenrolmentsystem/image/img_357397.png"))); // NOI18N
        tsearch.setText("    Clear");
        tsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Temail, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(rmale, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tfaculty, javax.swing.GroupLayout.Alignment.TRAILING, 0, 225, Short.MAX_VALUE)
                            .addComponent(Tdob, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tpno)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tryear)
                                    .addComponent(Trmonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(Tnic, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rmale)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tnic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tfaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Tdob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Tpno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Temail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tryear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(195, 195, 195)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Trmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(updateP, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(504, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Postgraduate", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("1");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Undergraduate Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Subject :");

        taddress.setColumns(20);
        taddress.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        taddress.setRows(5);
        jScrollPane1.setViewportView(taddress);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel16.setText("Z-Score");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Name");

        tsub1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Gender");

        tpno.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        temail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("NIC");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Faculty");

        tnic.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setText("Address");

        csub2res.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        csub2res.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "S", "F" }));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("3");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setText("RegDate");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setText("A/L Result");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Result :");

        tsub2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        csub3res.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        csub3res.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "S", "F" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("DOB");

        ryear.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        tname.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        tzscore.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("E mail");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setText("Phone No");

        tisland.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        cfaculty.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        cfaculty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "School Of Computing", "School Of Engineering", "School Of Business" }));

        tdob.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdobActionPerformed(evt);
            }
        });

        buttonGroup1.add(rf);
        rf.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        rf.setText("Female");
        rf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel15.setText("Island rank");

        tsub3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        csub1res.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        csub1res.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "S", "F" }));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("1");

        buttonGroup1.add(rm);
        rm.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        rm.setText("Male");
        rm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setText("Month :");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("2");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setText("Year :");

        rmonth.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "February", "July" }));
        rmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmonthActionPerformed(evt);
            }
        });

        jLabel36.setText("Date format: yyyy-mm-dd");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbmenrolmentsystem/image/delete.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        updateU.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        updateU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbmenrolmentsystem/image/edit-user-male.png"))); // NOI18N
        updateU.setText("Update");
        updateU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbmenrolmentsystem/image/add-user-male.png"))); // NOI18N
        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tclear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbmenrolmentsystem/image/img_357397.png"))); // NOI18N
        tclear.setText("Clear");
        tclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tname)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tsub3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tsub1)
                                                .addComponent(tsub2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(70, 70, 70)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(csub3res, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(csub1res, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(csub2res, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(rm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(rf))
                                .addComponent(temail)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tisland, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tzscore, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateU, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rmonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ryear)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cfaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tpno, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .addComponent(tdob)))
                        .addComponent(tnic, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tnic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cfaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tdob, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tpno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ryear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateU, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tclear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rm)
                            .addComponent(rf)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tsub1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(csub1res, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tsub2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(csub2res, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tsub3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(csub3res, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tisland, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tzscore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        jtable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RegNo", "Name", "NIC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMouseClicked(evt);
            }
        });
        jtable.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jtableVetoableChange(evt);
            }
        });
        jScrollPane7.setViewportView(jtable);

        tSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tSearch.setText("SEARCH...........");
        tSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSearchActionPerformed(evt);
            }
        });
        tSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1483, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(449, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(805, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(215, 215, 215)))
        );

        jTabbedPane1.addTab("Undergraduate", jPanel2);

        jScrollPane5.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(464, 464, 464))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tSearchKeyReleased
        try{
            Class.forName("com.mysql.jdbc.Driver"); //load and register jdbc driver
            conn=(Connection)DriverManager.getConnection(url,username,password); //create connection with database
            String q="Select * from undergraduate Where sname=?";
            pst=conn.prepareStatement(q);
            pst.setString(1,tSearch.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                gUData();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_tSearchKeyReleased

    private void tSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSearchActionPerformed

    private void jtableVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jtableVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jtableVetoableChange

    private void jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableMouseClicked

        try{
            Class.forName("com.mysql.jdbc.Driver"); //load and register jdbc driver
            conn=(Connection)DriverManager.getConnection(url,username,password);
            DefaultTableModel dtm=(DefaultTableModel)jtable.getModel();
            int row=jtable.getSelectedRow();
            String tclick=(dtm.getValueAt(row,0).toString());
            x=Integer.parseInt(tclick);
            String q="Select * from undergraduate Where regno='"+x+"'";
            pst=conn.prepareStatement(q);
            rs=pst.executeQuery();
            if(rs.next()){
                gUData();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jtableMouseClicked

    private void tclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclearActionPerformed
        try{
            tname.setText(null);
            tnic.setText(null);
            cfaculty.setSelectedItem("School Of Computing");
            tdob.setText(null);
            tpno.setText(null);
            temail.setText(null);
            ryear.setText(null);
            rmonth.setSelectedItem("February");
            csub1res.setSelectedItem("A");
            csub2res.setSelectedItem("A");
            csub3res.setSelectedItem("A");
            taddress.setText(null);
            tsub1.setText(null);
            tsub2.setText(null);
            tsub3.setText(null);
            tisland.setText(null);
            tzscore.setText(null);
            rm.setSelected(false);
            rf.setSelected(false);

        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_tclearActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        studentDetails std=new studentDetails();

        std.setRegNo(0);
        generateid("select count(regno)+1 from undergraduate");
        String id="U"+getValue;
        std.setUsername(id);
        std.setName(tname.getText());
        std.setFaculty(cfaculty.getSelectedItem().toString());
        std.setNic(tnic.getText());
        std.setDob(tdob.getText());
        if(rm.isSelected()){
            std.setGender("Male");
        }else if(rf.isSelected()){
            std.setGender("Female");
        }else{
            std.setGender("");
        }
        std.setpNo(Integer.parseInt(tpno.getText().toString()));
        std.setRegMonth(rmonth.getSelectedItem().toString());
        std.setRegYear(Integer.parseInt(ryear.getText().toString()));
        std.setAddress(taddress.getText());
        std.setSubject1(tsub1.getText());
        std.setSubject1Res(csub1res.getSelectedItem().toString());
        std.setSubject2(tsub2.getText());
        std.setSubject2Res(csub2res.getSelectedItem().toString());
        std.setSubject3(tsub3.getText());
        std.setSubject3Res(csub3res.getSelectedItem().toString());
        std.setIslandRank(Integer.parseInt(tisland.getText().toString()));
        std.setzScore(Float.parseFloat(tzscore.getText().toString()));
        std.seteMail(temail.getText());

        boolean x=jdb.addUndergraduateStudent(std);
        if(x=true){
            JOptionPane.showMessageDialog(this,"Insertion is correct!!!");
            clearfield();
        }else{
            JOptionPane.showMessageDialog(this,"Invalid Insertion\nTRY AGAIN");
            clearfield();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int msg=JOptionPane.showConfirmDialog(rootPane,"Do you want to delete record?","Delete",JOptionPane.YES_NO_OPTION);
        if(msg==0){
            String q="delete from undergraduate where sname=?";
            try{
                pst=conn.prepareStatement(q);
                pst.setString(1, tname.getText());
                pst.execute();
                JOptionPane.showMessageDialog(rootPane,"Record Deleted");
                clearfield();
            }catch(Exception e){
                System.out.println(e);
            }
            updateUstudentinfo();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rmonthActionPerformed

    private void rmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rmActionPerformed

    private void rfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfActionPerformed

    private void tdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdobActionPerformed

    private void temailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temailActionPerformed

    private void tsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchActionPerformed
        try{
            Tname.setText(null);
            Tnic.setText(null);
            Tfaculty.setSelectedItem("School Of Computing");
            Tdob.setText(null);
            Tpno.setText(null);
            Temail.setText(null);
            Tryear.setText(null);
            Trmonth.setSelectedItem("February");
            Taddress.setText(null);
            Tqualification.setText(null);
            rmale.setSelected(false);
            rfemale.setSelected(false);

        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_tsearchActionPerformed

    private void updatePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePActionPerformed
       try{
           Class.forName("com.mysql.jdbc.Driver"); //load and register jdbc driver
           conn=(Connection)DriverManager.getConnection(url,username,password);
           int row=jTable1.getSelectedRow();
           int uregno=(int) jTable1.getModel().getValueAt(row,0);
           String gen="";
           if(rmale.isSelected()){
                gen="Male";
           }else if(rfemale.isSelected()){
                gen="Female";
           }
           String q="Update postgraduate set name='"+Tname.getText()+"', faculty='"+Tfaculty.getSelectedItem().toString()+"', gender='"+gen+"', dob='"+Tdob.getText()+"', pno='"+Integer.parseInt(Tpno.getText().toString())+"', email='"+Temail.getText()+"', ryear='"+Integer.parseInt(Tryear.getText().toString())+"', rmonth='"+Trmonth.getSelectedItem().toString()+"', address='"+Taddress.getText()+"', qualification='"+Tqualification.getText()+"', nic='"+Tnic.getText()+"' where regno="+uregno;
           pst=conn.prepareStatement(q);
           int i=pst.executeUpdate();
           if(i>=0){
               JOptionPane.showMessageDialog(null, "Updated  Successfully");
               clearfieldP();
           }else{
               JOptionPane.showMessageDialog(null, "Try Again");
               clearfieldP();
           }
       }catch(Exception e){
           
       }   
    }//GEN-LAST:event_updatePActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        pstudentDetails pstd=new pstudentDetails();

        pstd.setRegNo(0);
        pstd.setUsername("Ppp");
        pstd.setName(Tname.getText());
        pstd.setFaculty(Tfaculty.getSelectedItem().toString());
        pstd.setNic(Tnic.getText());
        pstd.setDob(Tdob.getText());
        if(rmale.isSelected()){
            pstd.setGender("Male");
        }else if(rfemale.isSelected()){
            pstd.setGender("Female");
        }else{
            pstd.setGender("");
        }
        pstd.setpNo(Integer.parseInt(Tpno.getText().toString()));
        pstd.setRegMonth(Trmonth.getSelectedItem().toString());
        pstd.setRegYear(Integer.parseInt(Tryear.getText().toString()));
        pstd.setAddress(Taddress.getText());
        pstd.seteMail(Temail.getText());
        pstd.setQualification(Tqualification.getText());

        boolean x=jdb.addPostgraduateStudent(pstd);
        if(x=true){
            JOptionPane.showMessageDialog(this,"Insertion is correct!!!");
            clearfieldP();
        }else{
            JOptionPane.showMessageDialog(this,"Invalid Insertion\nTRY AGAIN");
            clearfieldP();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int msg=JOptionPane.showConfirmDialog(rootPane,"Do you want to delete record?","Delete",JOptionPane.YES_NO_OPTION);
        if(msg==0){
            String q="delete from postgraduate where nic=?";
            try{
                pst=conn.prepareStatement(q);
                pst.setString(1, Tnic.getText());
                pst.execute();
                JOptionPane.showMessageDialog(rootPane,"Record Deleted");
                clearfieldP();
            }catch(Exception e){
                System.out.println(e);
            }
            updatePstudentinfo();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void TnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnicActionPerformed

    private void TemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemailActionPerformed

    private void TryearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TryearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TryearActionPerformed

    private void TpnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TpnoActionPerformed

    private void TsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TsearchKeyReleased
        try{
            Class.forName("com.mysql.jdbc.Driver"); //load and register jdbc driver
            conn=(Connection)DriverManager.getConnection(url,username,password); //create connection with database
            String q="Select * from postgraduate Where name=?";
            pst=conn.prepareStatement(q);
            pst.setString(1,Tsearch.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                gPData();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_TsearchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        try{
            Class.forName("com.mysql.jdbc.Driver"); //load and register jdbc driver
            conn=(Connection)DriverManager.getConnection(url,username,password);
            DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
            int row=jTable1.getSelectedRow();
            String tclick=(dtm.getValueAt(row,0).toString());
            y=Integer.parseInt(tclick);
            String q="Select * from postgraduate Where regno='"+y+"'";
            pst=conn.prepareStatement(q);
            rs=pst.executeQuery();
            if(rs.next()){
                gPData();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mainpage m=new mainpage();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TsearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TsearchKeyTyped

    private void updateUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUActionPerformed
        try{
           Class.forName("com.mysql.jdbc.Driver"); //load and register jdbc driver
           conn=(Connection)DriverManager.getConnection(url,username,password);
           int row=jtable.getSelectedRow();
           int uregno=(int) jtable.getModel().getValueAt(row,0);
           String gend="";
           if(rm.isSelected()){
                gend="Male";
            }else if(rf.isSelected()){
                gend="Female";
            }
           String q="Update undergraduate set  sname='"+tname.getText()+"',faculty='"+cfaculty.getSelectedItem().toString()+"',nic='"+tnic.getText()+"',dob='"+tdob.getText()+"', gender='"+gend+"', pno='"+Integer.parseInt(tpno.getText().toString())+"',address='"+taddress.getText()+"', regYear='"+Integer.parseInt(ryear.getText().toString())+"', regMonth='"+rmonth.getSelectedItem().toString()+"',subject1='"+tsub1.getText()+"', subject1Result='"+csub1res.getSelectedItem().toString()+"', subject2='"+tsub2.getText()+"', subject2Result='"+csub2res.getSelectedItem().toString()+"',subject3='"+tsub3.getText()+"', subject3Result='"+csub3res.getSelectedItem().toString()+"', islandRank='"+tisland.getText()+"',zScore='"+tzscore.getText()+"',email='"+temail.getText()+"' where regno="+uregno;
           pst=conn.prepareStatement(q);
           int i=pst.executeUpdate();
           if(i>=0){
               JOptionPane.showMessageDialog(null, "Updated  Successfully");
               clearfield();
           }else{
               JOptionPane.showMessageDialog(null, "Try Again");
               clearfield();
           } 
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_updateUActionPerformed
    int i=0;    int getValue;
    public void generateid(String query){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection)DriverManager.getConnection(url,username,password);
            pst=conn.prepareStatement(query);
            ResultSet res=pst.executeQuery(query);
            if(res.next()){
                getValue=res.getInt(2);
                System.out.println(getValue);
            }
        }catch(Exception e){
            
        } 
    }
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
            java.util.logging.Logger.getLogger(addDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Taddress;
    private javax.swing.JTextField Tdob;
    private javax.swing.JTextField Temail;
    private javax.swing.JComboBox Tfaculty;
    private javax.swing.JTextField Tname;
    private javax.swing.JTextField Tnic;
    private javax.swing.JTextField Tpno;
    private javax.swing.JTextArea Tqualification;
    private javax.swing.JComboBox Trmonth;
    private javax.swing.JTextField Tryear;
    private javax.swing.JTextField Tsearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cfaculty;
    private javax.swing.JComboBox csub1res;
    private javax.swing.JComboBox csub2res;
    private javax.swing.JComboBox csub3res;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtable;
    private javax.swing.JRadioButton rf;
    private javax.swing.JRadioButton rfemale;
    private javax.swing.JRadioButton rm;
    private javax.swing.JRadioButton rmale;
    private javax.swing.JComboBox rmonth;
    private javax.swing.JTextField ryear;
    private javax.swing.JTextField tSearch;
    private javax.swing.JTextArea taddress;
    private javax.swing.JButton tclear;
    private javax.swing.JTextField tdob;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tisland;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tnic;
    private javax.swing.JTextField tpno;
    private javax.swing.JToggleButton tsearch;
    private javax.swing.JTextField tsub1;
    private javax.swing.JTextField tsub2;
    private javax.swing.JTextField tsub3;
    private javax.swing.JTextField tzscore;
    private javax.swing.JButton updateP;
    private javax.swing.JButton updateU;
    // End of variables declaration//GEN-END:variables
}
