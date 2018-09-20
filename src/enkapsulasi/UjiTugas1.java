package enkapsulasi;


public class UjiTugas1 {
    public static void main(String[] args) {
        Tugas1 Coba = new Tugas1(10);
        Coba.getpenumpang(13);
        Coba.getpenumpang(23);
        Coba.cetakpenumpang();
        
        Coba.addpenumpang(3);
        Coba.cetakpenumpang();
        
        Coba.addpenumpang(7);
        Coba.cetakpenumpang();
        
        Coba.addpenumpang(4);
        Coba.cetakpenumpang();
    }
    
}
