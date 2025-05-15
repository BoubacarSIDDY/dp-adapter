package sn.isi.computer;

public class SuperVideoProjecteur implements VGA,Hdmi{
    @Override
    public void view(byte[] data) {
        String message = new String(data);
        System.out.println("** SVP Hdmi **");
        System.out.println(message);
        System.out.println("** SVP Hdmi **");
    }

    @Override
    public void print(String message) {
        System.out.println("** SVP VGA **");
        System.out.println(message);
        System.out.println("** SVP VGA**");
    }
}
