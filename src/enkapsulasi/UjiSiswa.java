package enkapsulasi;

public class UjiSiswa {
     public static void main(String[] args) {
         EncapSiswa siswa = new EncapSiswa();
         siswa.setName("Cleara");
         siswa.setAbsen(13);
         siswa.setAddress("Tulungagung");
         
         System.out.print("Nama  :  "+ siswa.getName()+ " Absen : "+ siswa.getAbsen() + " Address : "+siswa.getAddress());
     }
}
