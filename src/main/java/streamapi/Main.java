package streamapi;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Stream;

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
        System.out.println(streamRandom());

        // Task IV+V: Resources

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
        Random r = new Random();

        // TODO
        List<Integer> randomIntegers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomIntegers.add(r.nextInt(10));
        }

        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (randomIntegers.get(i) % 2 == 0) {
                returnList.add(randomIntegers.get(i) * randomIntegers.get(i));
            }
        }

        return returnList;
    }

    public static List<Integer> streamRandom() {
        Random r = new Random();
        List<Integer> randomIntegers = new ArrayList<>();

        Stream<Integer> intStream = Stream.generate(() -> r.nextInt(10));
        intStream.limit(10).forEach(randomIntegers::add);

        List<Integer> returnList = new ArrayList<>();

        randomIntegers.stream().filter(x -> (x % 2) == 0).forEach(returnList::add);

        return returnList;

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
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }
}
