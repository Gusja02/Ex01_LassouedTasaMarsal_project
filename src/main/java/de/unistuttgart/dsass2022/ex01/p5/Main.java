package de.unistuttgart.dsass2022.ex01.p5;


/** 
 * Nur zum testen
 * 
 * !! Am Ende löschen !!
 */

public class Main {

	public static void main(String[] args) {
		
		SimpleList<Integer> myList = new SimpleList<>();
		
		myList.append(9);
		myList.append(6);
		myList.append(3);
		myList.append(8);
		myList.append(7);
		myList.append(6);
		myList.append(1);
		myList.append(5);
		myList.append(2);
		myList.append(0);


		// SelectionSort
/* 		for (int i = 0; i < myList.getSize() - 1; i++) {
			for (int j = i+1; j < myList.getSize(); j++) {
				if (myList.getElement(j).compareTo(myList.getElement(i)) == -1) {
					myList.swapElements(i, j);
				}
			}
		}
 */

		// BubbleSort
		for (int i = 0; i < myList.getSize(); i++) {
			for (int j = 0; j < myList.getSize() - 1; j++) {
				if (myList.getElement(j).compareTo(myList.getElement(j+1)) == 1) {
					myList.swapElements(j, j+1);
				}
			}
		}


		for (int i = 0; i < myList.getSize(); i++) {
			System.out.println(myList.getElement(i));
		}

	}

}
