package uasprema;

public class person {
//    State
    private String Nama;
    private String Telepon;
    private String Alamat;
    private String Email;
//    Behaviour
    public boolean isLogin(String username){
        return false;
    }
    
    public void getData(){
        System.out.println("Data");
    }
//    Encapsulation
    public void	setNama (String nama){
        this.Nama = nama;
    }
    public void	setTelepon (String telepon){
        this.Telepon = telepon;
    }
    public void	setAlamat (String alamat){
        this.Alamat = alamat;
    }
    public void	setEmail (String email){
        this.Email = email;
    }
    public String getNama(){
        return this.Nama;
    }
    public String getTelepon(){
        return this.Telepon;
    }
    public String getAlamat(){
        return this.Alamat;
    }
    public String getEmail(){
        return this.Email;
    }

}


