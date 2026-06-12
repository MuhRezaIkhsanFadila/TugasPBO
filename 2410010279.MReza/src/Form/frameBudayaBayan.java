package Form;
import javax.swing.table.DefaultTableModel;
import khs.BudayaBayan;

public class frameBudayaBayan extends javax.swing.JFrame {
    BudayaBayan obj;

    public frameBudayaBayan() {
        initComponents();
        obj = new BudayaBayan();
        this.setLocationRelativeTo(null);
        
        obj.inputKodeTradisi("B001");
        obj.inputNamaTradisi("Maulid Adat Bayan");
        obj.inputKategoriTradisi("Tradisi Tahunan");
        
        obj.inputKodeTradisi("B002");
        obj.inputNamaTradisi("Ritual Gawe Hurip");
        obj.inputKategoriTradisi("Ritual Sakral");
        
        tampilDataBudaya();
    }
    
    private void tampilDataBudaya(){
        DefaultTableModel modelKolom = new DefaultTableModel();
        modelKolom.addColumn("Kode Budaya");
        modelKolom.addColumn("Nama Tradisi Adat");
        modelKolom.addColumn("Kategori Informasi");
        
        for (int i = 0; i < obj.listDataKode().size(); i++) {
            Object[] barisData = {
                obj.listDataKode().get(i),
                obj.listDataNama().get(i), 
                obj.listKategori().get(i)       
            };  
            modelKolom.addRow(barisData);
        }
        tabelBudaya.setModel(modelKolom);
    }

    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBudaya = new javax.swing.JTable();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKategori = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Kebudayaan Adat Bayan");

        tabelBudaya.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Kode Budaya", "Nama Tradisi Adat", "Kategori Informasi"}
        ));
        jScrollPane1.setViewportView(tabelBudaya);

        btnTambah.setText("Tambah Data");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obj.inputKodeTradisi(txtKode.getText());
                obj.inputNamaTradisi(txtNama.getText());
                obj.inputKategoriTradisi(txtKategori.getText());
                tampilDataBudaya();
                txtKode.setText("");
                txtNama.setText("");
                txtKategori.setText("");
            }
        });

        jLabel1.setText("Kode Budaya:");
        jLabel2.setText("Nama Tradisi:");
        jLabel3.setText("Kategori:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKode, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtNama)
                            .addComponent(txtKategori))
                        .addGap(18, 18, 18)
                        .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBudaya;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
}
