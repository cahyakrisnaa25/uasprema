package uasprema;

public class staff extends person{
    private String NIP_Staff;
    private String Bagian;
    
    public void getTransaksi(){
        System.out.println("Rental");
    }
    public void setNIP_Staff(String nip_staff){
        this.NIP_Staff = nip_staff;
    }
    
    public void setBagian(String bagian){
        this.Bagian = bagian;
    }
    public String getNIP_Staff(){
        return this.NIP_Staff;
    }
    public String getBagian(){
        return this.Bagian;
    }
    @Override
    public boolean isLogin(String nip_staff){
        return true;
    }
    @Override
    public void getData(){
        System.out.println("NIP: " + getNIP_Staff());
        System.out.println("Nama: " + getNama());
        System.out.println("No Telepon: " + getTelepon());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Email: " + getEmail());
        System.out.println("Bagian: " + getBagian());
    }
}

