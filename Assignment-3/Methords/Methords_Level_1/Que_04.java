import java.util.Scanner;

public class Que_04 {

    public static int calculateHandshakes(int nStudents) {
        return (nStudents * (nStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int nStudents = sc.nextInt();

        int handshakes = calculateHandshakes(nStudents);

        System.out.println("The maximum number of handshakes among " + nStudents +
                " students is: " + handshakes);

        sc.close();
    }
}
