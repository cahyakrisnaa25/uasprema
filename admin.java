package uasprema;

public class admin 
extends person{
    private String NIP_Admin;
    private String Penempatan;
    
    public void getLingkupKerja(){
        System.out.println("Admin");
    }
    public void setNIP_Admin(String nip_admin){
        this.NIP_Admin = nip_admin;
    }
    
    public void setPenempatan(String penempatan){
        this.Penempatan = penempatan;
    }
    public String getNIP_Admin(){
        return this.NIP_Admin;
    }
    public String getPenempatan(){
        return this.Penempatan;
    }
    @Override
    public boolean isLogin(String nip_admin){
        return true;
    }
    @Override
    public void getData(){
        System.out.println("NIP: " + getNIP_Admin());
        System.out.println("Nama: " + getNama());
        System.out.println("No Telepon: " + getTelepon());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Email: " + getEmail());
        System.out.println("Penempatan: " + getPenempatan());
    }
}
