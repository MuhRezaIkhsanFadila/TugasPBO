package khs;
import Form.frameUtama;

public class KHS {
    public static void main(String[] args) {
        BudayaBayan obj = new BudayaBayan();
        obj.inputNamaTradisi("Maulid Adat Bayan");
        obj.inputNamaTradisi("Ritual Gawe Hurip");
        obj.inputNamaTradisi("Lebaran Adat Bayan");
        
        obj.inputKodeTradisi("B001");
        obj.inputKodeTradisi("B002");
        obj.inputKodeTradisi("B003");
        
        obj.inputKategoriTradisi("Tradisi Tahunan");
        obj.inputKategoriTradisi("Ritual Sakral");
        obj.inputKategoriTradisi("Perayaan Adat");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameUtama().setVisible(true);
            }
        });
        
        NilaiKuesioner hasilTest = new NilaiKuesioner();
        hasilTest.inputNilaiTampilan(4.5); 
        hasilTest.inputNilaiInformasi(4.2); 
        hasilTest.inputNilaiFungsional(4.0); 
        
        System.out.println("Nilai Akhir: " + hasilTest.nilaiAkhir());
        System.out.println("Status Kelayakan: " + hasilTest.statusKelayakan());
    }
}
