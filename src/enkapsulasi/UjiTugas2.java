package enkapsulasi;

public class UjiTugas2 {
     public static void main(String[] args) {
         double jarijari = 12;
         Tugas2Bola Bola = new Tugas2Bola(13);
         Bola.showDiameter();
         Bola.showLuasPermukaan();
         Bola.showVolume();
         System.out.println("\n\n");
         Bola.setJarijari(jarijari);
     }
}
