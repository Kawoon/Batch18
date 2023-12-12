package Class1;

public class Printer {
    void printhello() {
        System.out.println("Hello Kawoon");
    }

    void printWord(String word) {
        System.out.println(word);
    }

    void printManyTimes(String word, int k) {
        for (int g = 0; g < k; g++) {
            System.out.println(word);
        }

    }

    void printlarger(int input1, int input2) {
        if (input1 > input2 || input2 > input1) {
            System.out.println(input1);
        }
    }
}

