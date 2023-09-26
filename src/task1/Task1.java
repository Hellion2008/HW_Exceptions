package task1;

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = {1,2,3,4};
        System.out.println(arr[4]);
        // �������� ���� ������� ����

    }

    public static void divisionByZero() {
        int a = 1 / 0;
        // �������� ���� ������� ����

    }

    public static void numberFormatException() {
        Integer.parseInt("Hello");
        // �������� ���� ������� ����

    }
}

public class Task1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("����� �� ������� �������");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("������� �� ����");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("������ �������������� ������ � �����");
        }
    }
}