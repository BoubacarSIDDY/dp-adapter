package sn.isi.computer.adapter;

import sn.isi.computer.Hdmi;
import sn.isi.computer.VGA;

public class VgaHdmiAdapter implements VGA {
    private Hdmi hdmi;
    @Override
    public void print(String message) {
        byte[] messageBytes = message.getBytes();
        System.out.println("........ Adapter........");
        hdmi.view(messageBytes);
        System.out.println("........ Adapter........");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
