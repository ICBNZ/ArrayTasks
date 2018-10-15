import java.util.Arrays;
public class task1 {
    public static void main(String[] args) {
        //Task 1
        String[] grades = new String[5];
        grades[0] = "A";
        grades[1] = "B";
        grades[2] = "D";
        grades[3] = "F";
        //index
        int pos = 2;
        // new value
        String newGrade = "C";
        // print old
        System.out.println("Old Grades Array: " + Arrays.toString(grades));

        for (int i = grades.length - 1; i > pos; i--) {
            grades[i] = grades[i - 1];
        }
        grades[pos] = newGrade;
        // print new
        System.out.println("New Grades Array: " + Arrays.toString(grades));

        //Task 2
        String[] subjects = {"HTML", "CSS", "Java"};

        // print second
        System.out.println("2nd Subject: " + (subjects[1]));

        // new subjects
        String new1 = "Javascript";
        String new2 = "Python";

        String[] newA = Arrays.copyOf(subjects, 5);
        newA[3] = new1;
        newA[4] = new2;

        // print all
        System.out.println("All Subjects: " + Arrays.toString(newA));

        // Multidimensional Arrays
        int boardSize = 5;
        char[][] board = new char[boardSize][boardSize];
        boolean white = false;
        for (int y = 0; y < board.length; y++)
        {

            for (int x = 0; x < board[y].length; x++)
            {
                if (white) board[y][x] = 'W';
                if (!white) board[y][x] = 'B';
                white = !white;
            }

        }
        for (int i = 0; i < board.length; i++) {

            System.out.println(Arrays.toString(board[i]));

        }
    }
}

