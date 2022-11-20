import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public Students(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public static void main(String[] args) {

        //Define a class Student, which holds the following information about students: first name, last name, age, and hometown.
        //Read the list of students until you receive the "end" command.
        //After that, you will receive a city name.
        //Print only students which are from the given city, in the following format: "{firstName} {lastName} is {age} years old".

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Students> StudentList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] array = input.split(" ");
            Students newStudent = new Students(array[0], array[1], Integer.parseInt(array[2]), array[3]);
            StudentList.add(newStudent);
            input = scanner.nextLine();
        }

        String readTown = scanner.nextLine();

        for (int i = 0; i < StudentList.size(); i++) {
            if (StudentList.get(i).getHometown().equals(readTown)) {
                System.out.println(StudentList.get(i).getFirstName() + " "
                        + StudentList.get(i).getLastName() + " is "
                        + StudentList.get(i).getAge() + " years old");
            }
        }

    }
}
