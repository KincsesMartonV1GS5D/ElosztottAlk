package elosztottalkgit;

public class Tantargy {

    private int Azonosito;
    private String TargyNev;

    public Tantargy(String nev) {
        this.TargyNev = nev;
    }

    public String getTargyNev() {
        return this.TargyNev;
    }

    @Override
    public String toString() {
        return "";
    }

}