package BelajarJava.com;

public class ProgramBeraksi {
    public static void main(String[] args) {

        manager anton1 = new manager("Asep Saepudin", 7000000, 4000000);

        anton1.cetakInfo();
        anton1.cetakTunjangan();

        // anton1.setNama("Rantika");
        // anton1.setgajiPokok(4000000);
        // anton1.setTunjangan(5000000);

        // anton1.cetakInfo();
        // anton1.cetakTunjangan();

        Programmer anton2 = new Programmer("Rantika wulandari", 6000000, 400000);

        anton2.cetakInfo();
        anton2.cetakBonus();

        // anton2.setNama("Asep Saepudin");
        // anton2.setgajiPokok(3000000);
        // anton2.setBonus(2000000);

        // anton2.cetakInfo();
        // anton2.cetakBonus();
    }
}
