public class Keyboard {
    int width;
    int length;
    int price;
    String brand;
    String type;
    String color;

    Keyboard(){
        this("Unknown", "Unknown");
    }
    Keyboard(int width, int length) {
        this.width = width;
        this.length = length;
    }
    Keyboard(int price){
        this.price = price;
    }
    Keyboard(String brand, String type){
        this.brand = brand;
        this.type = type;
    }
    Keyboard(String color){
        this.color = color;
    }

}
