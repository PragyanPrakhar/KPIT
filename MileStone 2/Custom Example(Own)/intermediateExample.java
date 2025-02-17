@FunctionalInterface
interface StringModifier {
    String modify(String s);
}

class ProcessString {
    public static void proceessingStrings(String s, StringModifier modifier) {
        System.out.println(modifier.modify(s));
    }
}

public class intermediateExample {
    public static void main(String[] args) {
        StringModifier toUpperCase = str -> str.toUpperCase();
        StringModifier toLowerCase = str -> str.toLowerCase();
        StringModifier replaceSpaces = str -> str.replace(" ", "-");
        StringModifier reverse = str -> new StringBuilder(str).reverse().toString();
        String input = "Hello Functional Prograaming In Java";
        String input2 = "Hello Functional Prograaming In Java ! I am Learning Now";
        System.out.println(toUpperCase.modify(input));
        System.out.println(toLowerCase.modify(input));
        System.out.println(replaceSpaces.modify(input));
        System.out.println(reverse.modify(input));
        ProcessString.proceessingStrings(input2, toUpperCase);
        ProcessString.proceessingStrings(input2, toLowerCase);
        ProcessString.proceessingStrings(input2, replaceSpaces);
        ProcessString.proceessingStrings(input2, reverse);
    }
}
