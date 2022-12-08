package day01;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("lesson-7/src/day01/Day01.txt");
        BufferedReader reader = new BufferedReader(file);
        int newItem;
        String line;
        int elfNumber = 1;
        Elf elf0 = new Elf(elfNumber);
        Elf maxElf = elf0;

            while ((line = reader.readLine()) != null) {

                if (line.isEmpty()) {
                    elfNumber += 1;
                    if (elf0.calories > maxElf.calories) {
                        maxElf = elf0;
                    }
                    elf0 = new Elf(elfNumber);
                } else {
                    newItem = Integer.parseInt(line);
                    elf0.countCalories(newItem);
                }
            }
            System.out.println("Elf " + maxElf.elfNumber);
            System.out.println(maxElf.calories);
        }




    }
