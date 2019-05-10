
public class ArrayBox<T> {

    private T tablicaElementow[];

    public ArrayBox(int pojemnosc) {
        this.tablicaElementow = (T[]) new Object[pojemnosc];
    }

    public boolean add(T element) {

        boolean warunek = false;

        for (int i = 0; i < tablicaElementow.length; i++) {
            if (tablicaElementow[i] != null && ((Comparable) element).compareTo(tablicaElementow[i]) == 0) {
                return false;
            }
        }

        for (int k = 0; k < tablicaElementow.length; k++) {
            if (warunek != true && tablicaElementow[k] == null) {
                tablicaElementow[k] = element;
                warunek = true;
            }
        }

        if (!warunek) {
            T tablicaDoKopiowania[] = this.tablicaElementow;
            this.tablicaElementow = (T[]) new Object[tablicaDoKopiowania.length + 1];

            for (int j = 0; j < tablicaDoKopiowania.length; j++) {
                this.tablicaElementow[j] = tablicaDoKopiowania[j];
            }
            this.tablicaElementow[tablicaElementow.length - 1] = element;
        }

        int k = 0;

        for (int i = 0; i < tablicaElementow.length; i++) {
            if (tablicaElementow[i] == null) {
                swap(i, tablicaElementow.length - 1 - k);
                k++;
            }
        }

        int zmiana;
        do {
            zmiana = 0;
            for (int i = 0; i < (tablicaElementow.length - (1 + k)); i++) {
                if (((Comparable) tablicaElementow[i]).compareTo(tablicaElementow[i + 1]) < 0) {
                    swap(i, i + 1);
                    zmiana = 1;
                }
            }

        } while (zmiana == 1);

        return true;
    }

    public boolean addAll(T[] tab) {
        int start = this.tablicaElementow.length;
        int koniec = 0;
        for (int i = 0; i < tab.length; i++) {
            add(tab[i]);
        }

        koniec = this.tablicaElementow.length;

        if (start - koniec == 0)
            return false;
        else
            return true;
    }

    public int search(T element) {
        int p = -1;
        for (int i = 0; i < this.tablicaElementow.length; i++) {
            if (((Comparable) element).compareTo(tablicaElementow[i]) == 0)
                p = i;
        }
        return p;
    }

    public boolean delete(T element) {
        int indeks = search(element);
        if (indeks != -1) {
            swap(indeks, this.tablicaElementow.length - 1);
            T tablicaDoKopiowania[] = this.tablicaElementow;
            this.tablicaElementow = (T[]) new Object[tablicaDoKopiowania.length - 1];
            for (int i = 0; i < tablicaElementow.length; i++) {
                this.tablicaElementow[i] = tablicaDoKopiowania[i];
            }
        }
        return false;
    }

    public boolean swap(int a, int b) {
        if (this.tablicaElementow.length < a || this.tablicaElementow.length < b) {
            System.out.println("Niepoprawnie podane parametry!");
            return false;
        }
        T tmp = this.tablicaElementow[a];
        this.tablicaElementow[a] = this.tablicaElementow[b];
        this.tablicaElementow[b] = tmp;
        return true;
    }

    public T max() {
        T maximum = this.tablicaElementow[0];
        for (int i = 0; i < this.tablicaElementow.length; i++) {
            if (((Comparable) maximum).compareTo(this.tablicaElementow[i]) < 0) {
                maximum = this.tablicaElementow[i];
            }
        }
        return maximum;
    }

    public T min() {
        T minimum = this.tablicaElementow[0];
        for (int i = 0; i < this.tablicaElementow.length; i++) {
            if (((Comparable) minimum).compareTo(this.tablicaElementow[i]) > 0) {
                minimum = this.tablicaElementow[i];
            }
        }
        return minimum;
    }

    public void print() {
        for (T element : this.tablicaElementow) {
            if (element == null) {
                System.out.println("Wolny slot!");
            } else
                System.out.println(element);
        }
    }
}
