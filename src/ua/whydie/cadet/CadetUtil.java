package ua.whydie.cadet;

public class CadetUtil {
    public static void insert(Cadet[] cadets, Cadet cadet) {
        if (cadet.id >= 0 && cadet.id < cadets.length) {
            cadets[cadet.id] = cadet;
        } else {
            System.out.println("Invalid ID: " + cadet.id);
        }
    }

    public static Cadet search(Cadet[] cadets, int id) {
        if (id >= 0 && id < cadets.length) {
            return cadets[id];
        } else {
            System.out.println("Invalid ID: " + id);
            return null;
        }
    }

    public static void delete(Cadet[] cadets, int id) {
        if (id >= 0 && id < cadets.length) {
            cadets[id] = null;
        } else {
            System.out.println("Invalid ID: " + id);
        }
    }

    public static void printInfo(Cadet[] cadets, int id) {
        if (id >= 0 && id < cadets.length && cadets[id] != null) {
            Cadet cadet = cadets[id];
            System.out.println("ID: " + cadet.id + ", Name: " + cadet.name + ", Last Name: " + cadet.lastName +
                    ", Speciality: " + cadet.speciality);
        } else {
            System.out.println("Invalid ID or Cadet does not exist: " + id);
        }
    }

    public static void printAll(Cadet[] cadets) {
        for (Cadet cadet : cadets) {
            if (cadet != null) {
                printInfo(cadets, cadet.id);
            }
        }
    }
}
