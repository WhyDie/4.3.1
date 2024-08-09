package ua.whydie;

import ua.whydie.cadet.Cadet;
import ua.whydie.cadet.CadetUtil;
import ua.whydie.cadet.SpecialityTrends;

public class Main {
    public static void main(String[] args) {
        Cadet[] cadets = new Cadet[32]; // DAT with 32 possible cadets

        Cadet c1 = Cadet.of(0, "John", "Doe", SpecialityTrends.Analytics);
        Cadet c2 = Cadet.of(1, "Jane", "Smith", SpecialityTrends.Cybersecurity);

        CadetUtil.insert(cadets, c1);
        CadetUtil.insert(cadets, c2);

        CadetUtil.printInfo(cadets, 0);
        CadetUtil.printInfo(cadets, 1);

        CadetUtil.delete(cadets, 1);
        CadetUtil.printAll(cadets);
    }
}