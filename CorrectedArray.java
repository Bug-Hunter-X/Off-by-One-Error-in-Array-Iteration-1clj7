public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; //Corrected loop condition
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}