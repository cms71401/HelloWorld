package Ch7Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomHat {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        userinput(input);
    }

    public static void userinput(Scanner input){
        System.out.println("How many teams? ");         //Asks for user input on amount of teams
        int teamNum=input.nextInt();
        if(teamNum%2!=0){
            System.out.println("How many teams? (Even Number)"); // requests even number
            teamNum=input.nextInt();
        }
        arrayStart(teamNum);
        }

        public static void arrayStart(int teamNum){  //creates array of teams based of user input
            int[]teams = new int[teamNum];
            for (int i=1; i<=teams.length; i++){
                teams[i-1]=i;
            }
            chooseRandom(teams);
    }
        public static void chooseRandom(int []teams){   //begins to randomize the games between teams, without repetition
            int randomid;
            for(int i=0; i<teams.length; i++) {
                randomid = (int) (Math.random() * ((teams.length - 1) +1));
                while (teams[randomid] == 0) {

                    randomid = (int) (Math.random() * ((teams.length - 1) +1));
                }
                if((i+1)%2==0){
                    System.out.println("Team "+teams[randomid]);                //prints team matchups
                }
                else {
                    System.out.print("Team " + teams[randomid] + ", ");
                }
                teams[randomid] = 0;
            }
        }
}



