package enkapsulasi;


public class Tugas2Bola {
    public double jarijari;
    
    public Tugas2Bola(double jarijari){
        this.jarijari = jarijari;
    }
    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    
    public void showDiameter(){
        System.out.println("Diameter Bola : " + 2* jarijari);
    }
    public void showLuasPermukaan(){
        System.out.println("uas permukaan bola : " + (4* Math.PI* (jarijari*jarijari)));
    }
    public void showVolume(){
        System.out.println("Volume Bola : " +(4/3 *Math.PI* (jarijari*jarijari*jarijari)));
    }
    
}
