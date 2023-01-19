package lesson11;

public abstract class Substring implements Sequence{

    String seq;

    public void substr(String string, int start, int end){
        this.seq = string.substring(start,end);
    }

    public String printedSeq(){
        return seq;
    }

}
