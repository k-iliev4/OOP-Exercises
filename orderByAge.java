//You will receive an unknown number of lines. On each line, you will receive an array with 3 elements. The first element will be a string and represents the name of the person. The second element will be a string and will represent the ID of the person. The last element will be an integer which represents the age of the person.
//When you receive the command "End", stop taking input and print all the people, ordered by age.


import java.util.*;

public class orderByAge {
    private String name;
    private String ID;
    private int age;

    public orderByAge(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<orderByAge> people = new ArrayList<>();
        while (!input.equals("End")) {
            String[] toArray = input.split(" ");
            orderByAge person = new orderByAge(toArray[0],toArray[1],Integer.parseInt(toArray[2]));
            people.add(person);
            input = scanner.nextLine();
        }
        boolean isSmallest = false;
        while(people.size() > 0){
            for (int i = 0; i < people.size(); i++) {
                for (int j = 0; j < people.size(); j++) {
                    if (people.get(i).getAge() <= people.get(j).getAge()){
                        isSmallest = true;
                    }else{
                        isSmallest = false;
                        break;
                    }
                }
                if (isSmallest){
                    System.out.println(people.get(i).getName()
                            + " with ID: " + people.get(i).getID()
                            + " is "+people.get(i).getAge()
                            + " years old.");
                    people.remove(i);
                }
            }
        }
    }
}
