/**
 * Vincent Verboven
 * 26/10/2022
 */
public class List {
    private int[] numbers;
    private int size;

    public List(int capacity) {
        this.numbers = new int[capacity];
    }

    public boolean add(int number) {
        // het getal wordt op het einde in de array gestockeerd en size wordt verhoogd
        if (this.numbers.length > size) {
            this.numbers[size] = number;
            this.size++;
            return true;
        } else {
            return false;
        }

        //  als de maximum capaciteit overschreden werd, wordt false teruggegeven
        // ...
    }

    public int size() {
        // geeft het aantal elementen in de lijst terug
        return this.size;
        // ...
    }

    public int get(int i) {
        // geeft het i-de element terug of -1 als het niet bestaat.
        if (i < this.size) {
            return numbers[i];
        } else {
            return -1;
        }
        // ...
    }

    // Gevorderd: kan je deze methode aanvullen?
    public boolean remove(int index) {
        // deze methode verwijdert het element op de gegeven plaats
        // alle elementen hierna moeten dus 1 plaats opgeschoven worden
        // de return value geeft weer of het element bestond en succesvol verwijderd is
        int oldsize = this.size;
        while (index < this.size) {
            this.numbers[index] = this.numbers[index + 1];
            index++;
            size--;
        }
        return size < oldsize;
    }
}
