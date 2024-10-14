import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {

        int[] numeros = {33,22,94,78,5};
        System.out.println(Arrays.toString(numeros));
        bubbleSort(numeros);
        System.out.println(Arrays.toString(numeros));



    }
static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swaped;

        for (int i=0; i < n-1; i++){
            swaped = false;
            for (int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
}

}
