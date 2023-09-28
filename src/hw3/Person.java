package hw3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Person {
    private static final int COUNT_DATA = 6;

    private String lastname;
    private String firstName;
    private String patronymic;
    private LocalDate birthday;
    private int telephoneNumber;
    private String gender;

    public void createPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data of person: ");
        String line = scanner.nextLine();
        if (isRightData(line)){
            String[] data = line.split(" ");
            this.lastname = data[0];
            this.firstName = data[1];
            this.patronymic = data[2];
            if (isDate(data[3])){
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                this.birthday = LocalDate.parse(data[3], dtf);
            }
            this.telephoneNumber = Integer.parseInt(data[4]);
            if (isGender(data[5]))
                this.gender = data[5];
        }
        System.out.println("Creation was successful!");
    }

    private static boolean isDate(String str){
        if (str.matches("(0[1-9]|[12][0-9]|3[01])\\.(0[0-9]|1[0-2])\\.[12][09][0-9][0-9]")){
            return true;
        }
        return false;
    }

    private static boolean isGender(String str){
        if (str.matches("[FfMm]")){
            return true;
        }
        return false;
    }

    private static boolean setGender(String str){
        if (str.equalsIgnoreCase("f"))
            return true;
        return false;
    }

    private static boolean isRightData(String line){
        String[] data = line.split(" ");
        if (data.length > COUNT_DATA){
            System.out.println("You entered more than needed");
            return false;
        } else if (data.length < COUNT_DATA){
            System.out.println("You entered less than needed");
            return false;
        }
        return true;
    }

    @Override
    //<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
    public String toString() {
        return
                "<" + lastname + ">" +
                "<" + firstName + ">" +
                "<" + patronymic + ">" +
                "<" + birthday.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ">" +
                "<" + telephoneNumber + ">" +
                "<" + gender + ">\n";
    }
}
