package de.unistuttgart.dsass2022.ex01.p5;

public class Sorter {

	/**
	 * Performs selection sort on provided list, works directly on list object,
	 * hence no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
		
		for (int i = 0; i < list.getSize() - 1; i++) {
			for (int j = i+1; j < list.getSize(); j++) {
				if (list.getElement(i).compareTo(list.getElement(j)) == -1) {
					list.swapElements(i, j);
				}
			}
		}
	}

	/**
	 * Performs insertion sort on provided list, works directly on list object,
	 * hence no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {

	}

	/**
	 * Performs bubble sort on provided list, works directly on list object, hence
	 * no return value
	 * 
	 * @param <T>  The type of list element
	 * @param list List to apply the sorting to; unsorted list at first, sorted list
	 *             in the end
	 */
	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {

		for (int i = 0; i < list.getSize(); i++) {
			for (int j = 0; j < list.getSize() - 1; j++) {
				if (list.getElement(j).compareTo(list.getElement(j+1)) == -1) {
					list.swapElements(j, j+1);
				}
			}
		}
		
	}
}
