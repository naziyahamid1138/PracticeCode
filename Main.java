public class Main {
    public static void main(String[] args) {

        int arr [] = {12, 45, 28, 60, 15, 33};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 30) {
                count++;
            }
        }

        System.out.println("Numbers less than 30 = " + count);
    }
}