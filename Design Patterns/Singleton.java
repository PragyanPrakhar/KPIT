import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.io.*;

class Samosa implements Serializable {
    private static Samosa samosa;

    // constructor should be private
    private Samosa() {
        // Solution for breaking the singleton pattern
        /* if (samosa != null) {
            throw new RuntimeException("Cannot create, please use getSamosa() method");
        } */
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
        try {
            // new Samosa();
            Samosa s1 = Samosa.getSamosa();
            System.out.println(s1.hashCode());
            Samosa s2 = Samosa.getSamosa();
            System.out.println(s2.hashCode());
            Jalebi j1 = Jalebi.getJalebi();
            System.out.println(j1.hashCode());
            Jalebi j2 = Jalebi.getJalebi();
            System.out.println(j2.hashCode());

            // Breaking the Singleton Pattern
            Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Samosa s3 = constructor.newInstance();
            System.out.println(s3.hashCode());

            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ser"));
            oos.writeObject(s2);

            System.out.println("Serialization Done");
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ser"));
            Samosa s4=(Samosa)ois.readObject();
            System.out.println(s4.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
