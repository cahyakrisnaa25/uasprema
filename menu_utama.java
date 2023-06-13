package uasprema;

public class menu_utama {
    public static void main(String args[]){
        inisialisasi.init();
        for(admin adm: inisialisasi.listAdmin){
            adm.getData();
            System.out.println("\n");
        }
        for(staff staff: inisialisasi.listStaff){
            staff.getData();
            System.out.println("\n");
        }
        for(pelanggan cust: inisialisasi.listPelanggan){
            cust.getData();
            System.out.println("\n");
        }
    }

    @Override
    public String toString() {
        return "menu_utama []";
    }
}
