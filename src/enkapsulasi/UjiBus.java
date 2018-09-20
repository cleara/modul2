package enkapsulasi;

public class UjiBus {
     public static void main(String[] args) {
     
         //membuat objek busMini dari kelas Bus
         Bus busMini = new Bus();
         //masukan nilai jumlah penumpang dan penumpang maksimal ke
         //dalam objek busMini
         busMini.penumpang = 5;
         busMini.maxpenumpang = 15;
         //memanggil method cetak pada kelas Bus
         busMini.cetak();
         
         //menambahkan penumpang pada busMini
         busMini.penumpang =  busMini.penumpang + 5;
         //memanggil method cetak pada kelas Bus
         busMini.cetak();
         
         //menambahkan penumpang pada busMini
         busMini.penumpang =  busMini.penumpang - 2;
         //memanggil method cetak pada kelas Bus
         busMini.cetak();
         
         //menambahkan penumpang pada busMini
         busMini.penumpang =  busMini.penumpang + 8;
         //memanggil method cetak pada kelas Bus
         busMini.cetak();
         
         
        
     }
    
}
