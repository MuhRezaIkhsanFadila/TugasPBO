package khs;
public class NilaiKuesioner {
    private double tampilan,informasi,fungsional;
    public void inputNilaiTampilan(double n){tampilan=n;}
    public void inputNilaiInformasi(double n){informasi=n;}
    public void inputNilaiFungsional(double n){fungsional=n;}
    public double getNilaiTampilan(){return tampilan;}
    public double getNilaiInformasi(){return informasi;}
    public double getNilaiFungsional(){return fungsional;}

    public String konversiSkorKeKeterangan(double n){
        if(n<=1) return "STS"; else if(n<=2) return "TS"; else if(n<=3) return "CS"; else if(n<=4) return "S"; return "SS";
    }
    public double konversiBobot(String k){
        if(k.equals("SS")) return 4;
        if(k.equals("S")) return 3;
        if(k.equals("CS")) return 2;
        if(k.equals("TS")) return 1;
        return 0;
    }
    public double nilaiAkhir(){
        return (konversiBobot(konversiSkorKeKeterangan(tampilan))+konversiBobot(konversiSkorKeKeterangan(informasi))+konversiBobot(konversiSkorKeKeterangan(fungsional)))/3;
    }
    public String statusKelayakan(){
        double n=nilaiAkhir();
        if(n<2) return "Tidak Layak";
        if(n<3) return "Cukup Layak";
        return "Sangat Layak";
    }
}