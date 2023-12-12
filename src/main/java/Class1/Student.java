package Class1;

public class Student {
    char getGrades(int point) {
        if (point > 90) {
            return 'A';
        } else if (point > 80) {
            return 'B';
        } else if (point > 70) {
            return 'C';
        } else if (point > 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
}