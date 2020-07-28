package JavaStart15.zajecia.sortowanieListyNapisow;

import java.util.Objects;

public class List implements Comparable{

    int a;

    public List(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof List)) return false;
        List list = (List) o;
        return a == list.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
