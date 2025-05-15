package sn.isi;

import sn.isi.computer.*;
import sn.isi.computer.adapter.VgaHdmiAdapter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
        Ecran ecran = new Ecran();
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(ecran);
        uniteCentrale.print("Welcome to our monitor");
        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.print("Welcome to the VP");
        System.out.println("-><<<< >>>><-");
        VgaHdmiAdapter vgaHdmiAdapter = new VgaHdmiAdapter();
        vgaHdmiAdapter.setHdmi(new TV());
        uniteCentrale.setVga(vgaHdmiAdapter);
        uniteCentrale.print("Welcome to the TV");

        uniteCentrale.setVga(new SuperVideoProjecteur());
        uniteCentrale.print("Welcome to the SVP VGA");
        vgaHdmiAdapter.setHdmi(new SuperVideoProjecteur());
        uniteCentrale.print("Welcome to the SVP Hdmi");
    }
}