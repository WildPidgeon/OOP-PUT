public class Keyboard {
    private int width;
    private int length;
    private int price;
    private String brand;
    private String type;
    private String color;

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
