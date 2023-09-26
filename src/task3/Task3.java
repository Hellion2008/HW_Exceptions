package task3;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        int[] c;
        if (a.length != b.length){
            c = new int[] {0};
            return c;
        }
        c = new int[a.length];
        for (int i = 0; i < c.length; i++){
            if (b[i] == 0){
                throw new RuntimeException("Деление на ноль!");
            }
            c[i] = a[i] / b[i];
        }
        return c;
        // Введите свое решение ниже


    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 0};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
