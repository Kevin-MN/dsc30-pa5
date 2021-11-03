import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortsTester {
    Sorts sorter;
    ArrayList<Integer> numbers;
    ArrayList<Integer> sorted;
    ArrayList<Integer> zero_through_four;

    @Before
    public void setup(){
        sorter = new Sorts();
        numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);

        sorted = new ArrayList<Integer>();
        sorted.add(1);
        sorted.add(2);
        sorted.add(3);
        sorted.add(5);
        sorted.add(7);
        sorted.add(9);
        sorted.add(10);

        zero_through_four = new ArrayList<Integer>();

        zero_through_four.add(1);
        zero_through_four.add(3);
        zero_through_four.add(5);
        zero_through_four.add(7);
        zero_through_four.add(10);
        zero_through_four.add(2);
        zero_through_four.add(9);

    }

    @Test
    public void InsertionSort_test1(){
        sorter.InsertionSort(numbers,0, numbers.size() - 1);
        assertEquals(sorted, numbers);
    }

    @Test
    public void InsertionSort_test2(){
        assertEquals(7, numbers.size());
        sorter.InsertionSort(numbers,0, numbers.size() - 1);
        assertEquals(7, numbers.size());
    }

    @Test
    public void InsertionSort_test3(){
        sorter.InsertionSort(numbers,0, 4);
        assertEquals(zero_through_four, numbers);
    }

    @Test
    public void QuickSort_test1(){
        sorter.QuickSort(numbers,0, numbers.size() - 1);
        assertEquals(sorted, numbers);
    }

    @Test
    public void QuickSort_test2(){
        assertEquals(7, numbers.size());
        sorter.QuickSort(numbers,0, numbers.size() - 1);
        assertEquals(7, numbers.size());
    }

    @Test
    public void QuickSort_test3(){
        sorter.QuickSort(numbers,0, 4);
        assertEquals(zero_through_four, numbers);
    }

    @Test
    public void MergeSort_test1(){
        sorter.MergeSort(numbers,0, numbers.size() - 1);
        assertEquals(sorted, numbers);
    }

    @Test
    public void MergeSort_test2(){
        assertEquals(7, numbers.size());
        sorter.MergeSort(numbers,0, numbers.size() - 1);
        assertEquals(7, numbers.size());
    }

    @Test
    public void MergeSort_test3(){
        sorter.MergeSort(numbers,0, 4);
        assertEquals(zero_through_four, numbers);
    }

    @Test
    public void ModifiedQuickSort_test1(){
        sorter.Modified_QuickSort(numbers,0, numbers.size() - 1, 2);
        assertEquals(sorted, numbers);
    }

    @Test
    public void ModifiedQuickSort_test2(){
        assertEquals(7, numbers.size());
        sorter.Modified_QuickSort(numbers,0, numbers.size() - 1, 2);
        assertEquals(7, numbers.size());
    }

    @Test
    public void ModifiedQuickSort_test3(){
        sorter.Modified_QuickSort(numbers,0, 4, 2);
        assertEquals(zero_through_four, numbers);
    }

    @Test
    public void CocktailSort_test1(){
        sorter.cocktailSort(numbers,0, numbers.size() - 1);
        assertEquals(sorted, numbers);
    }

    @Test
    public void CocktailSort_test2(){
        assertEquals(7, numbers.size());
        sorter.cocktailSort(numbers,0, numbers.size() - 1);
        assertEquals(7, numbers.size());
    }

    @Test
    public void CocktailSort_test3(){
        sorter.cocktailSort(numbers,0, 4);
        assertEquals(zero_through_four, numbers);
    }

}
