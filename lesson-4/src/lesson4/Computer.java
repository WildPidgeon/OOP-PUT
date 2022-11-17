package lesson4;
import java.util.Objects;

public class Computer implements Parts {
    public String CPU;
    public String GPU;
    public String RAM;

    public Computer(String CPU, String GPU, String RAM){
        this.CPU = CPU;
        this.RAM = RAM;
        this.GPU = GPU;
    }

    public Computer changePart(String partCategory, String partName){
        if(Objects.equals(partCategory, "CPU")){
            return(new Computer(partName, this.GPU, this.RAM));
        } else if (Objects.equals(partCategory, "GPU")) {
            return(new Computer(this.CPU, partName, this.RAM));
        } else if(Objects.equals(partCategory, "RAM")){
            return(new Computer(this.CPU, this.GPU, partName));
        }
        return null;
    }

    public static void main(String[] args){
        Computer computer = new Computer("Intel i7", "NVIDIA RTX 3090", "16");
        Computer laptop = computer.changePart("GPU", "NVIDIA RTX 3060");

        System.out.println(laptop.CPU);
        System.out.println(laptop.GPU);
        System.out.println(laptop.RAM);
    }
}


