import java.util.*;
public class StudentMarks {

    public static void addMarks(List<Integer> marks, int mark) {
        // Write your code
        marks.add(marks);
    }

    public static double calculateAverage(List<Integer> marks) {
        // Write your code
        double sum =0.0;
        for(int i:marks)
        {
            sum =sum +i;
        }
        return sum/marks.size();
        return 0;
    }

    public static int findHighest(List<Integer> marks) {
        // Write your code
        return 0;
    }

    public static void displayMarks(List<Integer> marks) {
        // Write your code
    }

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        addMarks(marks, 78);
        addMarks(marks, 85);
        addMarks(marks, 92);
        addMarks(marks, 67);
        addMarks(marks, 88);

        displayMarks(marks);

        System.out.println("Average: " + calculateAverage(marks));
        System.out.println("Highest: " + findHighest(marks));
    }
}
public static void main(string[] args) {
    List<Integer>marks = new ArrayList<>();
}