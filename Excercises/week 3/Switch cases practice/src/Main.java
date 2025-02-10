import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        demonstrateSwtichCase();

    }

    private static void demonstrateSwtichCase() {
        String[] fruits = {"apple", "banana", "Orange", " Pear", "Pineapple"};
        Scanner input = new Scanner(System.in);
        String choice;
        choice = input.nextLine();

        switch (choice) {
            case "apple":
                System.out.println("Apple");
                break;
            case "banana":
                System.out.println("Banana");
                break;
            case "Orange":
                System.out.println("Orange");
                break;
            case " Pear":
                System.out.println("Pear");
                break;
            case "Pineapple":
                System.out.println("Pineapple");
                break;
            default:
                System.out.println("Fruit not recognized.");
                break;
        }
    }
}