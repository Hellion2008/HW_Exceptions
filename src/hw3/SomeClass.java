package hw3;

import java.io.*;
// 1. Задание 4 из презентации
public class SomeClass {
    public static void main(String[] args) {
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
    }

    public static void test() throws IOException{
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        //test();
    }
}
