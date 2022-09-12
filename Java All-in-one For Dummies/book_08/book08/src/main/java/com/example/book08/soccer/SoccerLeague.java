package com.example.book08.soccer;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SoccerLeague {
    static HashMap<String, Integer> scoreBoard = new HashMap<>();
    public static void main(String[] args) {
        BufferedReader in = getReader("Soccer.txt");                                                             // gets soccer.txt file
        String succes = checkGames(in, scoreBoard);                                                                     // Declare succes string and instantiate it with what the checkGames method returns
        while (succes != null) succes = checkGames(in, scoreBoard);                                                     // Runs checkGames until it returns null
        System.out.println("\nThats the end of the league");                                                            // Prints to the console
        scoreBoard.entrySet().stream()                                                                                  // Convert scoreboard to a stream to sort scoreboard by scores descending and print the whole scoreboard
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .forEach(e -> System.out.println(e + " " + scoreBoard.get(e)));
    }

    private static BufferedReader getReader(String name)                                                                // Method to get the txt file specified and prepare it for reading and returns a bufferedreader in
    {
        BufferedReader in = null;
        try {
            File file = new File(name);
            in = new BufferedReader(
                    new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println(
                    "The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }

    private static String checkGames(BufferedReader in, HashMap<String, Integer> scoreBoard) {                          // Method that takes in a bufferredreader(txt file) and a hashmap(scoreboard)
        String line, team1, team2;                                                                                      // line = one line in txt file      team1 = name of team 1      team2 = name of team 2
        String[] game, team1score1, team2score2;                                                                        // Buildingblock arrays to split to team1 score1 team2 score2
        int score1, score2;                                                                                             // score1 = score of team 1      score2 = score of team 2

        try {
            line = in.readLine();                                                                                       // Reads one line of txt file argument
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (line == null || line.equals("")) return null;                                                               // returns null when reached end of txt file or empty line is read
        else {
            game = line.split(",");
            team1score1 = game[0].split(" ");
            team2score2 = game[1].trim().split(" ");
            team1 = team1score1[0];
            score1 = Integer.parseInt(team1score1[1]);
            team2 = team2score2[0];
            score2 = Integer.parseInt(team2score2[1]);

            if (score1 > score2) {                                                                                      // team 1 wins
                System.out.println(team1 + " beats " + team2 + " " + score1 + ":" + score2);                            // Prints who won
               addToLeague(team1, team2);                                                                               // Calls addToLeague method
            } else if (score1 < score2) {                                                                               // team 2 wins
                System.out.println(team2 + " beats " + team1 + " " + score2 + ":" + score1);                            // Prints who won
                addToLeague(team2, team2);                                                                              // Calls addToLeague method
            } else {                                                                                                    // draw
                System.out.println("It's a draw between " + team1 + " and " + team2 + " " + score1 + ":" + score2);     // Prints who drew
                if (scoreBoard.containsKey(team1)) scoreBoard.put(team1, scoreBoard.get(team1) + 1);                    // If team1 is already on the scoreboard just add 1 point to their points
                 else scoreBoard.put(team1, 1);                                                                         // Else add them to the scoreboard and instantiate them with 1 point
                if (scoreBoard.containsKey(team2)) scoreBoard.put(team2, scoreBoard.get(team2) + 1);                    // If team2 is already on the scoreboard just add 1 point to their points
                 else scoreBoard.put(team2, 1);                                                                         // Else add them to the scoreboard and instantiate them with 1 point
            }
            return "Succesfull ReadLine";                                                                               // Returns succesfull readline to line 13
        }
    }
    static public void addToLeague(String team1, String team2){                                                         // Method that takes in 2 team names where team1 wins the match
        if (scoreBoard.containsKey(team1)) scoreBoard.put(team1, scoreBoard.get(team1) + 3);                            // Checks to see if team1 is already on scoreboard if they just add 3 points to their score
         else scoreBoard.put(team1, 3);                                                                                 // Else instantiate them on the scoreboard with 3 points
        if (!scoreBoard.containsKey(team2)) scoreBoard.put(team2, 0);                                                   // Checks if team2(The losing team) is on the scoreboard        if they are on the scoreboard then do nothing     if they are not then instantiate them with 0 points
    }
}