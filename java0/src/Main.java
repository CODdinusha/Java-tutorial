import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MainClass object1 = new MainClass();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name=input.next();

        System.out.println("Enter Address : ");
        String adress=input.next();

            int[] marks=new int[5];
        for(int i=0;i<5;i++) {

            System.out.println(" Enter Subject "+(i+1)+"Marks :");
            marks[i]=input.nextInt();
        }


        System.out.println("A. Show Student Details : ");
        System.out.println("B. Show All Marks : ");
        System.out.println("C. Show Total Marks : ");
        System.out.println("D. Show Average : ");

        System.out.println(" Please Select One option : ");
        String text=input.next();
        switch (text) {
            case "A":
                object1.showDetails(name,adress);

                break;
            case "B":
                object1.showAllMarks(marks);
                break;
            case "C":
                object1.showTotalMarks(marks);
                break;
            case "D":
                object1.showAverageMarks(object1.showTotalMarks(marks));
                break;
            default:
                System.out.println("Invalid ");
                break;
        }
    }
}