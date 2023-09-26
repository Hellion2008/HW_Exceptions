package task2;

import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b){
        int[] c;
        if (a.length != b.length){
            c = new int[] {0};
            return c;
        }
        c = new int[a.length];
        for (int i = 0; i < c.length; i++){
            c[i] = a[i] - b[i];
        }
        return c;
        // ������� ���� ������� ����


    }
}

// �� �������� ���� ����� - �� ����� ��� ������ ����������� �� ����� � ��������
public class Task2{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // ��� �������� ���� �� ����������, �� ������ ����������� ��� ���������
            a = new int[]{4, 5};
            b = new int[]{1, 2, 3};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}
