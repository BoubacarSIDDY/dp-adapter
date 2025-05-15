package sn.isi.computer;

public class TV implements Hdmi{
    @Override
    public void view(byte[] data) {
        String message = new String(data);
        System.out.println("######## TV #########");
        System.out.println(message);
        System.out.println("######## TV #########");
    }
}
