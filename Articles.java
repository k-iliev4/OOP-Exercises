//Create an article class with the following properties:
//• Title – a string
//• Content – a string
//• Author – a string
//The class should have a constructor and the following methods:
//• Edit (new content) – change the old content with the new one
//• ChangeAuthor (new author) – change the author
//• Rename (new title) – change the title of the article
//"{title} - {content}: {author}"
//Write a program that reads an article in the following format
// "{title}, {content}, {author}".
// On the next line, you will get a number n.
// On the next n lines, you will get one of the following commands:
// "Edit: {new content}"; "ChangeAuthor: {new author}"; "Rename: {new title}". At the end, print the final article.


import java.util.Scanner;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void Edit(String newContent) {
        this.content = newContent;
    }

    public void ChangeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void Rename(String newName) {
        this.title = newName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialParameters = scanner.nextLine();
        String[] toArray = initialParameters.split(", ");
        Articles newOne = new Articles(toArray[0], toArray[1], toArray[2]);

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            String parameters = scanner.nextLine();
            String[] parametersToArray = parameters.split(" ");
            if (parametersToArray[0].equals("Edit:")) {
                String newContents = parametersToArray[1] + " " + parametersToArray[2];
                newOne.Edit(newContents);
            } else if (parametersToArray[0].equals("ChangeAuthor:")) {
                String newAuthor = parametersToArray[1] + " " + parametersToArray[2];
                newOne.ChangeAuthor(newAuthor);
            } else if (parametersToArray[0].equals("Rename:")) {
                String newTitle = parametersToArray[1] + " " + parametersToArray[2];
                newOne.Rename(newTitle);
            }

        }
        System.out.println(newOne.getTitle() + " - " + newOne.getContent() + ": " + newOne.getAuthor());
    }

}
