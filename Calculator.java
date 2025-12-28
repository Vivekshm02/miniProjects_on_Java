import java.util.Scanner;

public  class Calculator {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true){
        System.out.println("\n === Calculator ===");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.println("Choose option: ");
        int choice  = scanner.nextInt();
        if (choice == 5){
            System.out.println("Goodbye!");
            break;
        }
        System.out.println("Enter the first Number:");
        double num1  = scanner.nextDouble();
        System.out.println("Enter the second Number:");
        double num2  = scanner.nextDouble();


        switch (choice){
            case 1 -> System.out.println("Result: "+(num1+num2));
            case 2 -> System.out.println("Result: "+(num1-num2));
            case 3 -> System.out.println("Result: "+(num1*num2));
            case 4 -> {
                if (num2 != 0){
                    System.out.println("Result: "+(num1/num2));

                }
                else {
                    System.out.println("Cannot be divided by 0");
                }

            }
            default -> System.out.println("Invalid Choice!");
        }
    }


scanner.close();
}}
