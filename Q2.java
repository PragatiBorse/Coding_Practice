package com.practice;

/*Create a function which simulates the game "rock, paper, scissors". The function takes the input of both
 players (rock, paper or scissors), first parameter from first player, second from second player.
 The function returns the result as such:
"Player 1 wins"
"Player 2 wins"
"TIE" (if both inputs are the same)*/

public class Q2 {
        public static String rps(String player1, String player2) {
            if (player1.equals(player2)) {
                return "TIE";
            } else if ((player1.equals("rock") && player2.equals("scissors")) ||
                    (player1.equals("paper") && player2.equals("rock")) ||
                    (player1.equals("scissors") && player2.equals("paper"))) {
                return "Player 1 wins";
            } else {
                return "Player 2 wins";
            }
        }

        public static void main(String[] args) {
            String p1 = "rock";
            String p2 = "scissors";

            String result = rps(p1, p2);
            System.out.println(result);
        }
}


