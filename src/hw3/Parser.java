package hw3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class Parser {
    public void saveToTxt (Person person){
        String fileName = "src/hw3/" + person.getLastname() + ".txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("<" + person.getLastname() + ">");
            writer.write("<" + person.getFirstName() + ">");
            writer.write("<" + person.getPatronymic() + ">");
            writer.write("<" + person.getBirthday().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ">");
            writer.write("<" + person.getTelephoneNumber() + ">");
            writer.write("<" + person.getGender() + ">\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
