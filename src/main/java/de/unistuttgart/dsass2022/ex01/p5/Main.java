package de.unistuttgart.dsass2022.ex01.p5;

import java.util.List;

/** 
 * Nur zum testen
 * 
 * !! Am Ende löschen !!
 */

public class Main {

	public static void main(String[] args) {
		
		SimpleList<Integer> list = new SimpleList<>();
		
		list.append(0);
		list.append(4);
		list.append(3);
		list.append(8);
		list.append(7);
		list.append(6);
		list.append(1);
		list.append(5);
		list.append(2);
		list.append(9);


		// SelectionSort
/* 		for (int i = 0; i < list.getSize() - 1; i++) {
			for (int j = i+1; j < list.getSize(); j++) {
				if (list.getElement(i).compareTo(list.getElement(j)) == -1) {
					list.swapElements(i, j);
				}
			}
		} */


		// BubbleSort
		for (int i = 0; i < list.getSize(); i++) {
			for (int j = 0; j < list.getSize() - 1; j++) {
				if (list.getElement(j).compareTo(list.getElement(j+1)) == -1) {
					list.swapElements(j, j+1);
				}
			}
		}

		// InsertionSort


		/**
		 * list output
		 */
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.getElement(i));
		}

	}

}
