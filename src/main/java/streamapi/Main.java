package streamapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/** Starter for the stream api task. */
public class Main {
    /**
     * And go.
     *
     * @param args command line parameters, not used
     */
    public static void main(String... args) {

        // Task I: Students

        // Task II: Set of ECTS of all IFM students

        // Task III: Random

        // Task IV+V: Resources
        System.out.println(resources("file.txt"));
    }

    /**
     * Task I: Students.
     *
     * <p>Calculate the total credits earned by all students.
     *
     * @param studentList List of students
     * @return Sum of credit points of all students
     */
    public static Integer students(List<Student> studentList) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Task II: Set of ECTS of all IFM students.
     *
     * <p>Identify the different credit points of all IFM students.
     *
     * @param studentList List of students
     * @return Set of credit points of all IFM students
     */
    public static Set<Integer> ifmCps(List<Student> studentList) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Task III: Random.
     *
     * <p>Calculate ten random integers between 0 and 10.
     *
     * @return List of ten random integers (between 0 and 10)
     */
    public static List<Integer> random() {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Task IV: Open resources.
     *
     * <p>Open the file specified by the {@code path} parameter. This file is located in the
     * resources folder of the project.
     *
     * @param path Name of the file to be accessed within the resource folder.
     * @return An open {@link InputStream} for the resource file
     */
    private static InputStream getResourceAsStream(String path) {
        // TODO
        InputStream stream = Main.class.getResourceAsStream(path);
        return stream;
    }

    /**
     * Task V: Read resources.
     *
     * <p>Read all lines from the resource file (specified by the {@code path} parameter). Merge all
     * lines that start with the letter "a" and are at least two characters long. The lines are to
     * be separated in the resulting string by a line-end character {@code "\n"}.
     *
     * @param path Name of the file to be accessed within the resource folder
     * @return String of all matching lines, separated by {@code "\n"}
     */
    public static String resources(String path) {
        // TODO
        StringBuilder result = new StringBuilder();

        try (InputStream stream = getResourceAsStream(path)) {
            BufferedReader r = new BufferedReader(new InputStreamReader(stream));

            List<String> allLines = new ArrayList<>();

            String newLine = r.readLine();
            while (newLine != null) {
                allLines.add(newLine);
                newLine = r.readLine();
            }

            /*for (int i = 1; i < allLines.size(); i++) {
                String s = allLines.get(i);
                if (s.startsWith("a") && !(s.length() < 2)) {
                    result.append(allLines.get(i) + "\n");
                }
            }*/

            allLines.stream().filter(s -> s.startsWith("a") && !(s.length() < 2)).forEach(s -> result.append(s + "\n"));




        } catch (IOException e) {
            System.err.println("Ouch, that didn't work: \n" + e.getMessage());
        }

        return result.toString();
    }
}
