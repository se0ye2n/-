import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        if (i >= 90 && i <= 100) {
            System.out.println(" A ");
        } else if (i < 90 && i >= 80) {
            System.out.println(" B ");
        } else {
            System.out.println(" C ");

        }
    }
}
