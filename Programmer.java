package BelajarJava.com;

public class Programmer extends Pegawai{
    private double bonus;

    public Programmer(String nama, double GajiPokok, double bonus){
        super(nama, GajiPokok);
        this.bonus = bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return this.bonus;
    }

    @Override
    public void cetakInfo(){
        System.out.println("======= Programmer ======");
        super.cetakInfo();
        
    }
    

    public void cetakBonus(){
        
        System.out.println("Bonus           : " + getBonus());
    }
}