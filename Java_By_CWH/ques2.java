//  ROCK PAPER PENCIL CESIER GAME


package Java_By_CWH;
import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Enter 1 for ROCK !");
        System.out.println("Enter 2 for PAPER !");
        System.out.println("Enter 3 for PENCIL !");
        System.out.println("Enter 4 for CEISER !");
        Random rand=new Random();
        System.out.println("Here You Have 5 matches with Computer Let See Who Will Win !!!! ");
        int YouCount=0,ComCount=0;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Your choice ");
            choice=sc.nextInt();
            int randInt=rand.nextInt(1, 4);
            if(((choice==1)&&(randInt==3))||((choice==1)&&randInt==4))
            {
                YouCount++;
                System.out.println(" You won the "+(i+1)+" match ");
                System.out.println("Your Score : "+YouCount+" Computer Score : "+ComCount+"\n");
            }
            else if((choice==2)&&(randInt==1))
            {
                YouCount++;
                System.out.println(" You won the "+(i+1)+" match ");
                System.out.println("Your Score : "+YouCount+" Computer Score : "+ComCount+"\n");
            }
            else if((choice==3)&&(randInt==1))
            {
                YouCount++;
                System.out.println(" You won the "+(i+1)+" match ");
                System.out.println("Your Score : "+YouCount+" Computer Score : "+ComCount+"\n");
            }
            else if(((choice==4)&&(randInt==2))||((choice==4)&&(randInt==3)))
            {
                YouCount++;
                System.out.println(" You won the "+(i+1)+" match ");
                System.out.println("Your Score : "+YouCount+" Computer Score : "+ComCount+"\n");
            }
            else
            {
                ComCount++;
                System.out.println(" You lost the "+(i+1)+" match ");
                System.out.println("Your Score : "+YouCount+" Computer Score : "+ComCount+"\n");
            }
        }
        if(YouCount>ComCount)
        {
            System.out.println("\t!!!!!!!!! HURAAAH !!!!!!! ");
            System.out.println("\t\tYOU WON FROM THE COMPUTER ");
            System.out.println("Scores");
            System.out.println("YOUR : "+YouCount+" Computer : "+ComCount);
        }
        else
        {
            System.out.println("\t !!!!!!!! OOOPS !!!!!!");
            System.out.println("YOU LOSE !!!!!");
            System.out.println("Scores");
            System.out.println("YOUR : "+YouCount+" Computer : "+ComCount);
        }
        sc.close();
    }
}
