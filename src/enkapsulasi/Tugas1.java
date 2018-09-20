package enkapsulasi;


public class Tugas1 {
    public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangBaru;
    public double average;
    public double password;
    public double cetakPenumpang;

    public double getPenumpang() {
        return penumpang;
    }
   

    public double getMaxpenumpang() {
        return maxpenumpang;
    }

    public double getCounter() {
        return counter;
    }

    public double getPenumpangBaru() {
        return penumpangBaru;
    }

    public double getAverage() {
        return average;
    }

    public double getPassword() {
        return password;
    }

    public double getCetakPenumpang() {
        return cetakPenumpang;
    }

    public void setPenumpang(double penumpang) {
        this.penumpang = penumpang;
    }

    public void setMaxpenumpang(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
    }

    public void setCounter(double counter) {
        this.counter = counter;
    }

    public void setPenumpangBaru(double penumpangBaru) {
        this.penumpangBaru = penumpangBaru;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    public void setCetakPenumpang(double cetakPenumpang) {
        this.cetakPenumpang = cetakPenumpang;
    }
    
    
    public Tugas1 (double maxPenumpang){
        this.maxpenumpang = maxPenumpang;
        penumpang = 0;
    }
        
    public void addpenumpang(double penumpang){
       double temp;
       temp = this.penumpang + penumpang;
       if (temp > maxpenumpang){
           System.out.println("Penumpang melebihi kuota");
       }else{
           this.penumpang = temp;}
           
       }
       
       
    public void getpenumpang(int password){
        if(password == 23){
            System.out.println("penumpang melebihi kuota");
        }else{
            System.out.println("Password salah");
        }
        
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang bus : "+penumpang);
        System.out.println("Penumpang bus sekarang "+penumpangBaru);
        System.out.println("Maksimum penumpang yang seharusnya :"+ maxpenumpang);
    }

    
    }
    
   
    

    
    
    

    
    
    
    

