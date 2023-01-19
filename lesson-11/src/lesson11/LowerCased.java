package lesson11;

public abstract class LowerCased implements Sequence{
    String seq;

    public void lowerCase(String string){
        this.seq = string.toUpperCase();
    }

    public String printedSeq(){
        return seq;
    }
}
