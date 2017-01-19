// Binary Search
// Ashley Lesperance

public class BinarySearchIter{

    public static int binarySearch(int a[], int x){
        int low = 0;
        int high = a.length - 1;
        int mid; 

        while ( low <= high ){
            mid = (high + low) / 2;
            System.out.println("Low: " + low);
            System.out.println("Mid: " + mid);           
            System.out.println("High: " + high);           
            if ( x < a[mid] ){
                high = mid - 1;
            }
            else if ( x > a[mid] ){
                low = mid + 1;
            }
            else { 
                return mid;
            }
        }

        return -1;
    }

    public  static void main(String args[]){
        int[] intArray1 = new int[]{1,4,6,7,9,15,20,25};
        int[] intArray2 = new int[]{1,4,6,7,9,15,20,25,29,45,71,92,95,99};
        
        System.out.println("Binary Search");

        int intIndex = binarySearch(intArray1, 9);

        System.out.print("The answer should be 4: ");
        System.out.println(intIndex);

        intIndex = binarySearch(intArray2, 99);

        System.out.print("The answer should be 13: ");
        System.out.println(intIndex);
    }


}
