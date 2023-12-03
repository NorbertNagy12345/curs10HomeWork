import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ;
        ClassRoom classRoom = new ClassRoom(reader());
        System.out.println(classRoom.getAverageGrade("Mathematics"));
        System.out.println(classRoom.getGradesForDiscipline("Mathematics"));
        System.out.println(classRoom.getGradesForStudent("Ealhstan Saira"));


    }

    private static List<Student> reader() throws FileNotFoundException {
         List<Student> students = new ArrayList<>();
        try {
        Scanner scanner = new Scanner(new File("files","grades.txt"));
        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            String[] obj = input.split("\\|");
            String name = obj[0];
            String discipline = obj[1];
            int grade = Integer.parseInt(obj[2]);
            students.add(new Student(name, discipline, grade));
        }
        scanner.close();
    }
        catch (FileNotFoundException ignored) {
        }
        return students;
    }


}
