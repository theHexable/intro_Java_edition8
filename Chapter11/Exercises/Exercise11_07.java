package Chapter11.Exercises;

/**
 *
 * @author Shady Bajary
 * @Exercise 11.7
 * @Title Implementing ArrayList
 */
public class Exercise11_07 {

    public static void main(String[] args) {

    }
}

class ArrayList {

    Object[] array;
    int numOfElements;

    public ArrayList() {
        this.array = new Object[10];
        this.numOfElements = 0;
    }

    public void Add(Object E) {
        if (this.numOfElements == this.array.length) {
            Object[] newArray = new Object[this.array.length * 2];
            System.arraycopy(this.array, 0, newArray, 0, this.array.length);
            this.array = newArray;
        }
        this.array[numOfElements++] = E;
    }

    public void add(int index, Object E) {
        if (this.numOfElements == this.array.length) {
            Object[] newArray = new Object[this.array.length * 2];
            System.arraycopy(this.array, 0, newArray, 0, this.array.length);
            this.array = newArray;
        }
        for (int i = this.numOfElements + 1; i > index; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[index] = E;
        this.numOfElements++;
    }

    public void clear() {
        for (int i = 0; i < this.numOfElements; i++) {
            this.array[i] = null;
        }
        this.numOfElements = 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < numOfElements; i++) {
            if (this.array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public Object get(int index) {
        return this.array[index];
    }

    public boolean isEmpty() {
        return this.numOfElements == 0;
    }

    public int lastIndexOf(Object o) {
        int last = -1;
        for (int i = 0; i < numOfElements; i++) {
            if (this.array[i].equals(o)) {
                last = i;
            }
        }
        return last;
    }

    public boolean remove(Object o) {
        int match = -1;
        for (int i = 0; i < numOfElements; i++) {
            if (this.array[i].equals(o)) {
                match = i;
                break;
            }
        }
        if (match != -1) {
            return false;
        }
        for (; match < numOfElements; match++) {
            this.array[match] = this.array[match + 1];
        }
        this.array[numOfElements] = null;
        this.numOfElements--;
        return true;
    }

    public int size() {
        return numOfElements;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= numOfElements) {
            return false;
        }
        for (int i = index; i < numOfElements; i++) {
            this.array[i] = this.array[i + 1];
        }
        return true;
    }

    public Object set(int index, Object E) {
        Object o = this.array[index];
        this.array[index] = E;
        return o;
    }
}
