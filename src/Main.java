public class Main {

    public static void main(String[] args) {
        ExampleClass exampleClass=new ExampleClass();
        ExampleClass[] array = new ExampleClass[]{new ExampleClass(4), new ExampleClass(7),
                new ExampleClass(5), new ExampleClass(13),
                new ExampleClass(34), new ExampleClass(30)};
        System.out.println("Array before sorting");
        exampleClass.printArray(array);
        ArraySortUtil.quickSort(array,0,5);
        System.out.println("Array after sorting");
        exampleClass.printArray(array);
    }
}
