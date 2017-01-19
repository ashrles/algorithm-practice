// Binary Search Recursive
// Ashley Lesperance

public class BinarySearchRec{

    public static int binarySearch( int a[], int x, int high, int low ){
        if ( high < low ) return -1; 

        int mid = (high + low) / 2;

        if ( x < a[mid] ) {
            return binarySearch( a, x, mid - 1, low);
        }
        else if ( x > a[mid] ) {
            return binarySearch( a, x, high, mid + 1);
        }
        else {
            return mid;
        }

    }

    public static int search( int a[], int x ){
        if ( a.length < 1 ) return -1; 

        return binarySearch( a, x, a.length - 1, 0);
    }

    public static void main(String args[]){
        
        int[] intArray1 = new int[]{1,4,6,7,9,15,20,25};
        int[] intArray2 = new int[]{1,4,6,7,9,15,20,25,29,45,71,92,95,99};
        
        System.out.println("Binary Search");

        int intIndex = search(intArray1, 9);

        System.out.print("The answer should be 4: ");
        System.out.println(intIndex);

        intIndex = search(intArray2, 99);

        System.out.print("The answer should be 13: ");
        System.out.println(intIndex);

    }

}
