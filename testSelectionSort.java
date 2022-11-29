
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays:

public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}

    SelectionSort sort = new SelectionSort();

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,Sortedarr));
    }

    public void testNegative(){

        /** Test data contains negative values only **/
    }

    public void testMixed(){

        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){

        /** Test data contains duplicates **/
    }
}
