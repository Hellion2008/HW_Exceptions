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

    public void createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data of person: ");
        String line = scanner.nextLine();
        String[] data = line.split(" ");
        if (isRightData(getRightDataCode(data))){
            this.lastname = data[0];
            this.firstName = data[1];
            this.patronymic = data[2];
            try{
                if (isDate(data[3])){
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                    this.birthday = LocalDate.parse(data[3], dtf);
                }
                try{
                    this.telephoneNumber = Integer.parseInt(data[4]);
                } catch (NumberFormatException e){
                    throw new PersonDataException("Impossible to parse telephone number");
                }
                if (isGender(data[5]))
                    this.gender = data[5];
                System.out.println("Creation was successful!");
            } catch (PersonDataException e){
                lastname = null;
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean isRightData(int code) {
        if (code > 0){
            System.out.printf("Error code: %d. You entered more than needed\n", code);
            return false;
        } else if (code < 0){
            System.out.printf("Error code: %d. You entered less than needed\n", code);
            return false;
        }
        return true;
    }

    private static int getRightDataCode(String[] line){
        int code = line.length - COUNT_DATA;
        return code;
    }

    private static boolean isDate(String str){
        if (str.matches("(0[1-9]|[12][0-9]|3[01])\\.(0[0-9]|1[0-2])\\.[12][09][0-9][0-9]")){
            return true;
        }
        throw new PersonDataException("Impossible to parse birthday");
    }

    private static boolean isGender(String str){
        if (str.matches("[FfMm]")){
            return true;
        }
        throw new PersonDataException("Impossible to parse gender");
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getGender() {
        return gender;
    }

    @Override
    //<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
    public String toString() {
        if (this.getLastname() == null){
            return "Person doesn't exist.";
        } else
            return
                "<" + lastname + ">" +
                "<" + firstName + ">" +
                "<" + patronymic + ">" +
                "<" + birthday.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + ">" +
                "<" + telephoneNumber + ">" +
                "<" + gender + ">\n";
    }
}
