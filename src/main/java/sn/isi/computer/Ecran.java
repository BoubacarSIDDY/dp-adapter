package sn.isi.computer;

public class Ecran implements VGA{
    @Override
    public void print(String message) {
        System.out.println("----- Ecran ------");
        System.out.println(message);
        System.out.println("----- Ecran ------");
    }
}
