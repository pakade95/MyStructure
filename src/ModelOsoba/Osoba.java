package ModelOsoba;

public class Osoba implements Comparable<Osoba> {

    protected String nazwisko;
    protected int wiek;

    public Osoba(String nazwisko, int wiek) {
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "[Nazwisko: " + this.nazwisko + " Wiek: " + this.wiek + "]";
    }

    @Override
    public int compareTo(Osoba o) {
        if (this.nazwisko.compareTo(o.nazwisko) == 0)
            return this.wiek - o.wiek;
        else
            return this.nazwisko.compareTo(o.nazwisko);
    }
}

