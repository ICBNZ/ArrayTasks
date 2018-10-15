import java.util.Arrays;
public class task1 {
    public static void main(String[] args) {
        String[] grades = new String[5];
        grades[0] ="A";
        grades[1] ="B";
        grades[2] ="D";
        grades[3] ="F";
        //index
        int pos = 2;
        // new value
        String newGrade = "C";
        // print old
        System.out.println("Old Array: "+Arrays.toString(grades));

        for (int i = grades.length-1; i > pos; i--) {
            grades[i] = grades[i-1];
        }
        grades[pos] = newGrade;
        // print new
        System.out.println("New Array: "+Arrays.toString(grades));
        }

    }

