import java.util.*;
public class Guessing_Game {
    public static int randomNumber() {
        Random randomNum = new Random();
        int no = randomNum. nextInt(100);
        return no;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t\t ==================================================");
        System.out.println("\t\t\t ****************** GUESSING GAME *****************");
        System.out.println("\t\t\t ==================================================\n");

        int cpuNO,UserNo,count = 0,score = 100;
        cpuNO = randomNumber();
        do {
            count++;
            System.out.print("\t\t\t ENTER YOUR GUESS : ");
            UserNo = sc.nextInt();

            if(UserNo == cpuNO) {
                System.out.println("\n\t\t\t ==================================================");
                System.out.println("\t\t\t CONGRATULATIONS!... YOUR GUESS IS CORRECT");
                System.out.println("\t\t\t\t Total Attempts : " + count);
                System.out.println("\t\t\t\t Total Score : " + (score-count));
                System.out.println("\t\t\t ==================================================\n");
                break;
            }
            else if(UserNo > cpuNO) {
                System.out.println("\t\t\t Oops!.. Guess is High.");
            }
            else if(UserNo < cpuNO) {
                System.out.println("\t\t\t Oops!.. Guess is low.");
            }
            else if(UserNo > cpuNO) {
                System.out.println("\t\t\t Oops!.. Guess is between 1-100.");
            }

            System.out.println("\t\t\t --------------------------------------------------\n");
        }while(UserNo != cpuNO);
    }
}
