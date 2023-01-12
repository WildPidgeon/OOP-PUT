package lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Shiritori {
    ArrayList<String> words = new ArrayList<String>();
    boolean game_over = false;

    ArrayList play(String word){
        if(words.isEmpty()){
            words.add(word);
        }else{
            String string = words.get(words.size()-1);
            String letter = string.substring(string.length()-1);
            System.out.println(letter);
            if(word.substring(0,1).toLowerCase() == letter.toLowerCase()){
                if(words.contains(word)){
                    System.out.println("Game over. Word already used.");
                    game_over = true;
                    return null;
                }else{
                    words.add(word);
                }
            }else{
                System.out.println("Game over. Wrong first letter.");
                game_over = true;
                return null;
            }
        }
        return words;
    }
    String restart(){
        words.clear();
        game_over = false;
        return "Game restarted";
    }

    ArrayList printWords(){
        return words;
    }
    static public void main(String[] args){
        Shiritori game = new Shiritori();

        boolean gameOn = true;
        while(gameOn){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 'p' to play, press 'x' to exit. At any point during the game press 'r' to restart or type 'pw' to print list of words");
            switch(scanner.nextLine()){
                case "p":
                    while(true){
                        Scanner input = new Scanner(System.in);
                        String word = input.nextLine();
                        switch(word){
                            case "x":
                                gameOn = false;
                                break;
                            case "r":
                                System.out.println(game.restart());
                                break;
                            case "pw":
                                System.out.println(game.printWords());
                            default:
                                game.play(word);
                        }
                    }
                case "x":
                    gameOn = false;
                default:
                    System.out.println("Wrong input. Try again");
            }
        }
    }
}


