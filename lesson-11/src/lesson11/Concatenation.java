package lesson11;

public abstract class Concatenation implements Sequence{
    String seq;
    public void concat(String str1, String str2){
        this.seq = str1.concat(str2);
    }

    public String printedSeq(){
        return seq;
    }
}
