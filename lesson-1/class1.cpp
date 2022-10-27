class Dog{
    public:
    std::string name;
    std::string breed;
    int age;
    std::string ownedToy;

    void takeToy(toy){
        self.ownedToy = toy
    }
}
class Cat{
    public:
    std::string name;
    std::string breed;
    int age;

}
class Toy{
    public:
    std::string size;
    std::string shape;
    std::string color;
}

int main(){
    Dog dog;
    dog.name = "Leo";
    dog.breed = "Husky";
    dog.age = 7;
    dog.ownedToy = "None";
    Cat cat;
    cat.name = "Simon";
    cat.breed = "Maine Coon";
    cat.age = 5;
    Toy ball;
    ball.size = "medium";
    ball.shape = 'ball';
    ball.color = "blue";
    Toy mouse;
    mouse.size = "small";
    mouse.shape = "mouse";
    mouse.color = "grey";

    dog.takeToy(ball);

    return 0;
}
