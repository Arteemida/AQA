package Old;

public class Lesson_3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, -5, 77, 8, 9, -4, 16, 100, 27, 22, 64, 0, 3, 95, 2, 18, 45, 76, -38, 51};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5 && array[i] < 45) {
                sum = sum + array[i];
//                System.out.println(array[i]);
            }
        }
        System.out.println("SUM = " + sum);

        for (int numbers : array) {
            if (numbers > 0 && numbers % 2 == 0) {
                System.out.println(numbers);
            }
        }
    }
}