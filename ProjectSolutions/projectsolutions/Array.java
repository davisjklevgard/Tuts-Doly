package projectsolutions;

public class Array {
    public static void main(String[] args) {
        int[] newArray = new int[256];
        newArray[1] = 1;
        newArray[1]++;
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);

        }
        System.out.println();
        System.out.println();
        System.out.println('A');
        System.out.println('A' + 1);
        System.out.println();
        System.out.println();
    }
}
