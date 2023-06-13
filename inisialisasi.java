package uasprema;
import java.util.ArrayList;

public class inisialisasi {
     public static ArrayList<admin> listAdmin = new ArrayList<>();
     public static ArrayList<staff> listStaff = new ArrayList<>();
     public static ArrayList<pelanggan> listPelanggan = new ArrayList<>();
     public static void init(){
        admin admin1 = new admin();
        admin1.setNIP_Admin("21001");
        admin1.setNama("Prema");
        admin1.setAlamat("Jl. Cekomaria");
        admin1.setTelepon("0821777888555");
        admin1.setEmail("Prema@test.com");
        admin1.setPenempatan("HRD");
        listAdmin.add(admin1);
        
        staff staff1 = new staff();
        staff1.setNIP_Staff("99001");
        staff1.setNama("Prema");
        staff1.setAlamat("Jl. Cekomaria");
        staff1.setTelepon("0821777888555");
        staff1.setEmail("Prema@test.com");
        staff1.setBagian("Packing");
        listStaff.add(staff1);
        
        pelanggan cust1 = new pelanggan();
        cust1.setID_Pelanggan("001");
        cust1.setNama("Prema");
        cust1.setAlamat("Jl. Cekomaria");
        cust1.setTelepon("0821777888555");
        cust1.setEmail("Prema@test.com");
        cust1.setBuku("Tendangan maut");
        listPelanggan.add(cust1);
}
}
