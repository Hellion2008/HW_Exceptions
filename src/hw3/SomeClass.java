package hw3;

import java.io.*;
import java.util.Scanner;

// 1. Задание 4 из презентации
public class SomeClass {
    public static void main(String[] args) throws Exception {
        InputStream inputStream;
        try{
            String[] strings = {"asdf", "asdf"};
            int len = 2;
            String strings1;
            if (len < strings.length)
                strings1 = strings[len];
            test();
            int d1 = 1, d2 = 0, a;
            if (d2 != 0)
                a = d1 / d2;
            File file = new File("sdafgdsaf");
            if (file.exists())
                inputStream = new FileInputStream(file);
        } catch (StackOverflowError error){
            System.out.println("sdafgdsafddasda");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Я всё равно выполнился!");
        }
        System.out.println("Я жив!");

        task2();

        task3();

        task4();
    }

    public static void test() throws IOException{
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        //test();
    }

    // 2. Если необходимо, исправьте данный код
    // (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public static void task2(){
            int[] intArray = new int[10];

            int d = 0, len = 8;
            double catchedRes1 = 0;
            if (d != 0 && len < intArray.length)
                catchedRes1= intArray[len] / d;
            System.out.println("catchedRes1 = " + catchedRes1);

    }

    // 3. Дан следующий код, исправьте его там, где требуется
    // (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public static void task3(){
        int a = 90;
        int b = 3;
        if (b != 0)
            System.out.println(a / b);
        printSum(23, 234);
        int[] abc = {1, 2};
        int c = 3;
        if (c < abc.length)
            abc[c] = 9;
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void task4() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some words:");
        String line = reader.readLine();
        if (line.isEmpty()){
            throw new RuntimeException("Line can't be empty!");
        }
        System.out.println("Your line is : " + line);
    }

}
