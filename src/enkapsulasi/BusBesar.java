package enkapsulasi;


public class BusBesar {
    public int penumpang;
    public int maxpenumpang;
    
    public BusBesar(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang (int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp >= maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    
    public void cetak(){
        System.out.println("Penumpang Bus Sekarng "+ penumpang);
        System.out.println("Penumpang Maksimum seharusnya adalah "+ maxpenumpang);     
    }

    public int getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public int getMaxpenumpang() {
        return maxpenumpang;
    }
    
    public void setMaxpenumpang(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
    }
    
    
    
}
