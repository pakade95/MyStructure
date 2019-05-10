package ModelOsoba;

public class Student extends Osoba{

    private int grupa;

    public Student(String nazwisko, int wiek, int grupa) {
        super(nazwisko, wiek);
        this.grupa=grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }

    public int getGrupa() {
        return grupa;
    }

    @Override
    public String toString() {
        return "[Nazwisko: "+this.nazwisko+" wiek: "+this.wiek+" Grupa: "+this.grupa+"]";
    }

    @Override
    public int compareTo(Osoba o) {
        if(super.compareTo(o)==0)
        return this.grupa-((Student)o).grupa;
        else
            return super.compareTo(o);
    }
}
