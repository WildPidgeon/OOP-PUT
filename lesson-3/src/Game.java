public class Game {
    private String name;
    private Dev developer;

    private Dev director;
    private String platform;
    private boolean multiplayer;

    public Game(String name, Dev developer, Dev director, String platform, boolean multiplayer){
        this.name = name;
        this.developer = developer;
        this.director = director;
        this.platform = platform;
        this.multiplayer = multiplayer;
    }

    public String name(){
        return name;
    }

    public Dev developer(){
        return developer;
    }

    public Dev director(){
        return director;
    }

    public String platform(){
        return platform;
    }

    public boolean multiplayer(){
        return multiplayer;
    }

    public void changeName(String newName){
        name = newName;
    }
    public void changePlatform(String newPlatform){
        platform = newPlatform;
    }
    public void changeDeveloper(Dev newDeveloper){
        developer = newDeveloper;
    }
    public void changeDirector(Dev newDirector){
        director = newDirector;
    }
    public void isMultiplayer(boolean newMultiplayer){
        multiplayer = newMultiplayer;
    }

}
