import java.util.*;

public class CountEven{
    // Using an array
    public static int countEven( int aList[] ){
        int counter = 0;

        for ( int i = 0; i<aList.length; i++ ){
            if( aList[i] % 2 == 0 ) counter++;
        }
        return counter;
    }

    // Using an ArrayList
    public static int countEven( ArrayList<Integer> aList){
        int counter = 0;

        for ( int n : aList ){
            if( n % 2 == 0 ) counter++;
        }
        return counter;
    }

    // Test harness
    public static void main( String args[] ){
        // Create a test array
        int[] testArray1 = new int[]{1,2,3,4,5,6,7,8,9,10}; // Five
        int[] testArray2 = new int[]{1,3,5,7,9,11}; // Zero
        int[] testArray3 = new int[]{2,4,6,8,10}; // Five
        int[] testArray4 = new int[]{55,65,70}; // One

        System.out.println(countEven(testArray1));
        System.out.println(countEven(testArray2));
        System.out.println(countEven(testArray3));
        System.out.println(countEven(testArray4));

        // Create test ArrayList
        ArrayList<Integer> testList1 = new ArrayList<Integer>();
        testList1.add(1);
        testList1.add(2);
        testList1.add(3);
        testList1.add(4);
        System.out.println(countEven(testList1)); // Two
        ArrayList<Integer> testList2 = new ArrayList<Integer>();
        testList2.add(2);
        System.out.println(countEven(testList2)); // One

    }
}
