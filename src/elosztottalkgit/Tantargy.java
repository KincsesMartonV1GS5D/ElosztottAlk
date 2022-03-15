package elosztottalkgit;

public class Tantargy {
    private int Azonosito;
    private String TargyNev;

    

    public Tantargy(String nev) {
        TargyNev = nev;
    }

    @Override
    public String toString() {
        return "";
    }
    public String getTargyNev() {
        return TargyNev;
    }
}