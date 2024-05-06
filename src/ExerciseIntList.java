interface IntList {
    void add(int number);
    int get(int id);
}

class IntArrayList implements IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length + array.length / 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + size);
        }
        return array[id];
    }
}

class IntVector implements IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 20;

    public IntVector() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + size);
        }
        return array[id];
    }
}

public class ExerciseIntList {
    public static void main(String[] args) {
        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();


        for (int i = 0; i < 15; i++) {
            list1.add(i);
        }
        for (int i = 0; i < 30; i++) {
            list2.add(i);
        }

        System.out.println("Elements in IntArrayList:");
        for (int i = 0; i < 15; i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();


        System.out.println("Elements in IntVector:");
        for (int i = 0; i < 30; i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
    }
}