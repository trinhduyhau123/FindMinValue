import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập giá trị: ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min + " là giá trị nhỏ nhất");

    }
}
