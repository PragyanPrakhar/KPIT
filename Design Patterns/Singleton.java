class Samosa {
    private static Samosa samosa;

    // constructor should be private
    private Samosa() {

    }

    // Lazy way of Creating Singleton Object.
    public static Samosa getSamosa() {
        if (samosa == null) {
            synchronized (Samosa.class) { // For making Thread Safe
                if (samosa == null)
                    samosa = new Samosa();
            }
        }

        return samosa;
    }
}

class Jalebi {
    // Eager way of Creating Singleton Object.
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi() {
        return jalebi;
    }
}

public class Singleton {
    public static void main(String[] args) {
        // new Samosa();
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());
        Samosa s2 = Samosa.getSamosa();
        System.out.println(s2.hashCode());
        Jalebi j1 = Jalebi.getJalebi();
        System.out.println(j1.hashCode());
        Jalebi j2 = Jalebi.getJalebi();
        System.out.println(j2.hashCode());
    }
}
