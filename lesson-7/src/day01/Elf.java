package day01;

public class Elf {
    public int calories = 0;
    public int elfNumber;

    public void countCalories(int newItem){
        this.calories = this.calories + newItem;
    }
    public Elf(int elfNumber){
        this.elfNumber = elfNumber;
    }
}
