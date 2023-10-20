package ClassPractice;

public class abd {

    public static void main(String[] args) {
        int number = 0;
        int max = 0;
        for (int i = 0; i <= 10; i++) {
            number = (int)(Math.random() * 100);
            if (number >= max) {
                max = number;
            }
        }

    }
}
