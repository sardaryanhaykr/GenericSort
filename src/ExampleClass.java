import java.util.List;

/**
 * Created by Hayk on 23.07.2021.
 */
public class ExampleClass implements Comparable<ExampleClass> {
    private int value;

    public ExampleClass(int value) {
        this.value = value;
    }

    public ExampleClass() {
    }

    public void printArray(List<ExampleClass> list) {
        for (ExampleClass obj : list) {
            System.out.println("Value: " + obj.value);
        }
    }

    @Override
    public int compareTo(ExampleClass o) {
        return value > o.value ? 1 : value == o.value ? 0 : -1;
    }
}
