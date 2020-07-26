package JavaStart15.homework.wynikiZawodow;

import java.util.*;

public class Player implements Comparable<Player>, List<Player> {
    private String firstName;
    private String lastName;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Player> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Player player) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Player> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Player> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return getScore() == player.getScore() &&
                getFirstName().equals(player.getFirstName()) &&
                getLastName().equals(player.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getScore());
    }

    @Override
    public Player get(int index) {
        return null;
    }

    @Override
    public Player set(int index, Player element) {
        return null;
    }

    @Override
    public void add(int index, Player element) {

    }

    @Override
    public Player remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Player> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Player> listIterator(int index) {
        return null;
    }

    @Override
    public List<Player> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        return  "Playerinfo: " + "\n" +
                "FirstName= " + firstName + '\n' +
                "LastName= " + lastName + '\n' +
                "score= " + score + "\n";
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(this.score, o.score);
    }
}
