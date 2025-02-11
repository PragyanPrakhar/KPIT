public class Main {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Hello from another thread !!");
        Thread thread = new Thread(task);
        thread.start();

        String[] names = { "John", "Terry", "Jane", "Smith" };
        Function<String, String> function = name -> name.toUpperCase();
        System.out.println(function.apply(names[0]));
    }
}
