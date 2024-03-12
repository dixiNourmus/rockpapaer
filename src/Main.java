import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB ="";
        String finish = "";
        boolean done = false;
        do {
            //asks if you want to play again
            playerA = playerMove(in,"what is player A move");
        playerB = playerMove(in,"what is player B mover");
        //all the ifs check for the win lose and what to say

            if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("s")) {
                System.out.println("player a wins, rock beats scissors");
                System.out.println("do you want to play again");
                if (in.hasNextLine()){
                    finish = in.nextLine();
                    if (finish.equalsIgnoreCase("n")){
                        done = true;
                    }else{
                        System.out.println("play again");
                    }
                }

            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("r")) {
                System.out.println("player a wins, paper covers rock");
                System.out.println("do you want to play again");
                if (in.hasNextLine()){
                    finish = in.nextLine();
                    if (finish.equalsIgnoreCase("n")){
                        done = true;
                    }else{
                        System.out.println("play again");
                    }
                }
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("p")) {
                System.out.println("player a wins, scissors cuts paper");
                System.out.println("do you want to play again");
                if (in.hasNextLine()){
                    finish = in.nextLine();
                    if (finish.equalsIgnoreCase("n")){
                        done = true;
                    }else{
                        System.out.println("play again");
                    }
                }
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("s")) {
                System.out.println("its a tie");
                System.out.println("do you want to play again");
                if (in.hasNextLine()){
                    finish = in.nextLine();
                    if (finish.equalsIgnoreCase("n")){
                        done = true;
                    }else{
                        System.out.println("play again");
                    }
                }
            } else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("r")) {
                System.out.println("its a tie");
                System.out.println("do you want to play again");
                if (in.hasNextLine()){
                    finish = in.nextLine();
                    if (finish.equalsIgnoreCase("n")){
                        done = true;
                    }else{
                        System.out.println("play again");
                    }
                }
            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("p")) {
                System.out.println("its a tie");
                System.out.println("do you want to play again");
                if (in.hasNextLine()){
                    finish = in.nextLine();
                    if (finish.equalsIgnoreCase("n")){
                        done = true;
                    }else{
                        System.out.println("play again");
                    }
                }
            } else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("s")) {
                System.out.println("player b wins, scissors cuts paper");
                System.out.println("do you want to play again");
                if (in.hasNextLine()){
                    finish = in.nextLine();
                    if (finish.equalsIgnoreCase("n")){
                        done = true;
                    }else{
                        System.out.println("play again");
                    }
                }
            } else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("p")) {
                System.out.println("player b wins, paper covers rock");
                System.out.println("do you want to play again");
                if (in.hasNextLine()){
                    finish = in.nextLine();
                    if (finish.equalsIgnoreCase("n")){
                        done = true;
                    }else{
                        System.out.println("play again");
                    }
                }
            } else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("r")) {
                System.out.println("player b wins,rock breaks scissors ");
                System.out.println("do you want to play again");
                if (in.hasNextLine()){
                    finish = in.nextLine();
                    if (finish.equalsIgnoreCase("n")){
                        done = true;
                    }else{
                        System.out.println("play again");
                    }
                }
            }
        }while(!done);




    }
    //player move
    private static String playerMove(Scanner pipe, String message){
        String move = "";
        while(true) {
            System.out.println(message);
            move = pipe.nextLine();
            if(move.equalsIgnoreCase("r") || move.equalsIgnoreCase("p") || move.equalsIgnoreCase("s")){
                break;
            }
            else{
                System.out.println("incorect try again");
            }



        }
        return move;
    }
}