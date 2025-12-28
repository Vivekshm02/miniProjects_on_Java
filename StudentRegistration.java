import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentRegistration {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Registration ===");
        System.out.println("Enter Your Full name");

        String fullName = scanner.nextLine();
        System.out.println("Enter Your age");
        int age  = scanner.nextInt();
        if (age<16 || age >100){
            System.out.println("Invalid age! must between 16 and 50 ");
            return;
        }
        System.out.println("Enter Course (1.English 2.Math 3.Science 4.Computer)");
        int courseCode = scanner.nextInt();
        String course = "";
        switch (courseCode){
            case 1: course = "English and Grammar"; break;
            case 2: course = "Mathematics"; break;
            case 3: course = "Science For Kids"; break;
            case 4: course = "Computer and logic design"; break;
            default: course = "current affairs";
        }
        System.out.println("Enter Phone Number");
        String phone = scanner.next();
        System.out.println("Enter email");
        String email = scanner.next();
        if (!email.contains("@")){
            System.out.println("Invalid Email Address! ");
return;
        }

        System.out.println("\n=== Registration Successfull! ===");
        System.out.println("Name: "+fullName);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
        System.out.println("Phone no.: "+phone);
        System.out.println("Email: "+email);
        System.out.println("Registration ID: STU" +System.currentTimeMillis());
        scanner.close();
        }
    }
