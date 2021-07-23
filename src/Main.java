import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        List<ExampleClass> list = new ArrayList<>();
        list.add(new ExampleClass(4));
        list.add(new ExampleClass(7));
        list.add(new ExampleClass(34));
        list.add(new ExampleClass(25));
        list.add(new ExampleClass(41));
        list.add(new ExampleClass(19));

        System.out.println("List before sorting");
        exampleClass.printArray(list);
        // ArraySortUtil.insertionSort(list);
        ArraySortUtil.quickSort(list, 0, list.size()-1);
        System.out.println("List after sorting");
        exampleClass.printArray(list);
    }
}
