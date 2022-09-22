//M0521023_Gentur Sahadewa
public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        /* PERULANGAN FOR-LOOP
        for (int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
        }*/
        // PERULANGAN DO WHILE
        int i = 0;
        do {
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
            i++; 
        } while(i < 5);
    }
}
