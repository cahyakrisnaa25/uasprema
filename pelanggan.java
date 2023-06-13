package uasprema;

public class pelanggan extends person{
    private String ID_Pelanggan;
    private String Buku;
    
    public void getAksesPinjam(){
        System.out.println("Meminjam");
    }
    public void setID_Pelanggan(String id_pelanggan){
        this.ID_Pelanggan = id_pelanggan;
    }
    
    public void setBuku(String buku){
        this.Buku = buku;
    }
    public String getID_Pelanggan(){
        return this.ID_Pelanggan;
    }
    public String getBuku(){
        return this.Buku;
    }
    @Override
    public boolean isLogin(String id_pelanggan){
        return true;
    }
    @Override
    public void getData(){
        System.out.println("NIP: " + getID_Pelanggan());
        System.out.println("Nama: " + getNama());
        System.out.println("No Telepon: " + getTelepon());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Email: " + getEmail());
        System.out.println("Buku: " + getBuku());
    }
}
