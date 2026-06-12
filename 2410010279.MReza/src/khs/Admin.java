package khs;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Admin {
    private String username,namaAdmin;
    private ArrayList<String> dataUsername=new ArrayList<>();
    private ArrayList<String> dataNama=new ArrayList<>();

    public void inputUsername(String u){dataUsername.add(u);}
    public void inputNamaAdmin(String n){dataNama.add(n);}
    public ArrayList<String> listDataUsername(){return dataUsername;}
    public ArrayList<String> listDataNama(){return dataNama;}

    public int getIndexData(String username){
        int i=dataUsername.indexOf(username);
        if(i<0) JOptionPane.showMessageDialog(null,"Data Tidak Ditemukan");
        return i;
    }

    public void cariDataAdmin(String username){
        int i=getIndexData(username);
        if(i>=0) JOptionPane.showMessageDialog(null,"Username: "+dataUsername.get(i)+"\nNama: "+dataNama.get(i));
    }
}