//Define a class Song, which holds the following information about songs: Type List, Name, and Time.
//On the first line, you will receive the number of songs - N.
//On the next N-lines, you will be receiving data in the following format: "{typeList}_{name}_{time}".
//On the last line, you will receive "Type List" / "all". Print only the names of the songs which are from that Type List / All songs.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {

    private String typeListt;
    private String name;
    private String time;

    public songs(String typeListt, String name, String time) {
        this.typeListt = typeListt;
        this.name = name;
        this.time = time;
    }

    public void setTypeListt(String typeListt) {
        this.typeListt = typeListt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeListt() {
        return typeListt;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<songs> arrayList = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String input = scanner.nextLine();
            String[] array = input.split("_");
            songs newOne = new songs(array[0],array[1],array[2]);
            arrayList.add(newOne);
        }

        String nextInput = scanner.nextLine();

        if (!nextInput.equals("all")) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (nextInput.equals(arrayList.get(i).getTypeListt())) {
                    System.out.println(arrayList.get(i).getName());
                }
            }
        }else{
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i).getName());
            }
        }


    }
}

