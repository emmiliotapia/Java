import java.util.Scanner;

public class Solution {

        static boolean isAnagram(String a, String b) {
            // Avoid Case sensitive and convert in chars arrays
            char[] arr1 = a.toLowerCase().toCharArray();
            char[] arr2 = b.toLowerCase().toCharArray();

            // Compare length if not, can't be an anagram
            if (arr1.length != arr2.length) {
                return false;
            }

            // Sort arrays
            bubbleSort(arr1);
            bubbleSort(arr2);

            // Compare arrays
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }

        public static void bubbleSort(char[] arr) {
            int n = arr.length;
            boolean swapped;

            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Change
                        char temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break;
                }
            }
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }

