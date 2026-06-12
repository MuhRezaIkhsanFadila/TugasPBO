package khs;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BudayaBayan extends NilaiKuesioner {
    private String kodeBudaya, namaTradisi, kategori;
    private ArrayList<String> dataTradisi;
    private ArrayList<String> kodeTradisi;
    private ArrayList<String> kategoriTradisi;
    
    public BudayaBayan(){
        this.dataTradisi = new ArrayList<>();
        this.kodeTradisi = new ArrayList<>();
        this.kategoriTradisi = new ArrayList<>();
    }
    
    public BudayaBayan(String kode, String nama, String kat) {
        this.kodeBudaya = kode;
        this.namaTradisi = nama;
        this.kategori = kat;
        this.dataTradisi = new ArrayList<>();
        this.kodeTradisi = new ArrayList<>();
        this.kategoriTradisi = new ArrayList<>();
    }
    
    public int getIndexData(String kodeTr){
        int index = this.kodeTradisi.indexOf(kodeTr);
        if (index < 0){
            JOptionPane.showMessageDialog(null, "Data Budaya Tidak Ditemukan");
        }
        return index;
    }
    
    public void cariDataBudaya(String kode){
        int index = getIndexData(kode);
        if (index >= 0){
            String nama = this.dataTradisi.get(index);
            String kat = this.kategoriTradisi.get(index);
            String pesan = "Kode Budaya: " + kode + "\n" + "Nama Tradisi: " + nama + "\n" + "Kategori: " + kat;
            JOptionPane.showMessageDialog(null, pesan);
        } else {
            JOptionPane.showMessageDialog(null, "Data Budaya Kosong");
        }
    }
    
    public void inputKodeTradisi(String kode){ this.kodeTradisi.add(kode); }
    public void inputNamaTradisi(String nama){ this.dataTradisi.add(nama); }
    public void inputKategoriTradisi(String kat){ this.kategoriTradisi.add(kat); }
    
    public ArrayList<String> listDataKode(){ return this.kodeTradisi; }
    public ArrayList<String> listDataNama(){ return this.dataTradisi; }
    public ArrayList<String> listKategori(){ return this.kategoriTradisi; }
}
