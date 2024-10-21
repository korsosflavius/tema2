package ex2;

public class Vers {
    private String vers;
    public Vers(String vers) {
        this.vers = vers;
    }
    public int nr_cuv(){
        if(vers.trim().isEmpty())
            return 0;
        return vers.trim().split("\\s+").length;
    }
    public int nr_voc(){
        int k=0;
        for(char c:vers.toCharArray())
            if("AEIOUaeiou".indexOf(c)!=-1)
                k++;
        return k;
    }
    public String getVers(){
        return vers;
    }
}
