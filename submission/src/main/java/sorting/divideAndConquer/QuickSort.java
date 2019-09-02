package sorting.divideAndConquer;

import java.util.Arrays;

import sorting.AbstractSorting;
import util.Util;

/**
 * Quicksort is based on the divide-and-conquer paradigm. The algorithm chooses
 * a pivot element and rearranges the elements of the interval in such a way
 * that all elements lesser than the pivot go to the left part of the array and
 * all elements greater than the pivot, go to the right part of the array. Then
 * it recursively sorts the left and the right parts. Notice that if the list
 * has length == 1, it is already sorted.
 */
public class QuickSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (leftIndex < rightIndex) {

			int meio = divide(array, leftIndex, rightIndex);

			sort(array, leftIndex, meio - 1);
			sort(array, meio + 1, rightIndex);
		}
		System.out.println(Arrays.toString(array));
	}

	public int divide(T[] array, int l, int r) {

		T pivot = array[l];
		int i = l;

		for (int j = l + 1; j < r; j++) {

			if (array[j].compareTo(pivot) <= 0) {
				Util.swap(array, i, j);
				i++;

			}

		}

		Util.swap(array, i, r);
		
		return i;

	}
}
