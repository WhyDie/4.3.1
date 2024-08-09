package ua.whydie.cadet;

public class Cadet {
    int id;
    String name;
    String lastName;
    SpecialityTrends speciality;

    private Cadet(int id, String name, String lastName, SpecialityTrends speciality) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.speciality = speciality;
    }

    public static Cadet of(int id, String name, String lastName, SpecialityTrends speciality) {
        return new Cadet(id, name, lastName, speciality);
    }
}

