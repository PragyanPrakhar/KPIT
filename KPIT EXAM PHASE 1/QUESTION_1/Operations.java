package QUESTION_1;

class Operations {
    private int number;
    private String inputString;

    public Operations(int number) {
        this.number = number;
    }

    public Operations(String inputString) {
        this.inputString = inputString;
    }

    public void findFactorial(int number) {
        if (number < 1 && number > 15) {
            System.out.println("-1");
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public void findFirstNFibonacciNumber(int N) {
        if (N < 1) {
            System.out.println("#");
            return;
        }
        int a = 1, b = 1;
        for (int i = 0; i < N; i++) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public void findVowelCharacters(String input) {
        boolean isVowelPresent = false;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                isVowelPresent = true;
                System.out.println(ch);
            }
        }
        if (!isVowelPresent) {
            System.out.println("#");
            return;
        }
    }

}