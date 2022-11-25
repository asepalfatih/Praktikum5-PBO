package BelajarJava.com;

public class manager extends Pegawai {

    private double tunjangan ;

    public manager(String nama, double GajiPokok, double tunjangan){
        super(nama, GajiPokok);
        this.tunjangan = tunjangan;

    }

    public void setTunjangan(double tunjangan){ 
        this.tunjangan = tunjangan;
    }

    public double getTunjangan(){
        return this.tunjangan;
    }

    @Override
    public void cetakInfo(){
        System.out.println("======= Manager ======");
        super.cetakInfo();
        
    }

    public void cetakTunjangan(){
        System.out.println("Tunjangan       : " + getTunjangan());
    }
}
