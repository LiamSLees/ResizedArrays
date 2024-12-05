public class Main {
    private static final int original = 10;
    private int[] a;
    private int size;

    public Main() {
        a = new int[original];
        size = 0;
    }

    public void add(int element) {
        if (size == a.length) {
            resize(2 * a.length);
        }
        a[size++] = element;
    }

    private void resize(int capacity) {
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = a[i];
        }
        a = newArray;
    }

    public void subtract() {
        if (size <= a.length / 2 && a.length > original) {
            resize(a.length / 2); // Halve the array size if less than half full
        }
    }

    public int arraySize() {
        return a.length;
    }

    public void print() {
        System.out.print("Bag: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main bag = new Main();

        // Adding 10 elements to the Bag
        for (int i = 1; i <= 10; i++) {
            bag.add(i);
            bag.print();
            System.out.println("Array size: " + bag.arraySize());
        }
    }
}

