package sorting.divideAndConquer;

import java.util.ArrayList;
import java.util.List;

import sorting.AbstractSorting;

/**
 * Merge sort is based on the divide-and-conquer paradigm. The algorithm
 * consists of recursively dividing the unsorted list in the middle, sorting
 * each sublist, and then merging them into one single sorted list. Notice that
 * if the list has length == 1, it is already sorted.
 */
public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {

   @Override
   public void sort(T[] array, int leftIndex, int rightIndex) {

      if (leftIndex < rightIndex) {
         int meio = (rightIndex + leftIndex) / 2;

         sort(array, leftIndex, meio);
         sort(array, meio + 1, rightIndex);

         merge(array, rightIndex, leftIndex);
      }

      // System.out.println(Arrays.toString(array));

   }

   public List<T> merge(T[] array, int l, int r) {

      List<T> resultado = new ArrayList<>();

      for (T x = array[l]; l == r; l++) {

         return resultado;
      }
      return resultado;
   }

   public T[] divide(T[] array) {

      return array;

   }

}
