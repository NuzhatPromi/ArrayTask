package io.naztech.ArrayTask;

import lombok.extern.slf4j.*;


@Slf4j
public class FindMax {

	public static void main(String[] args) {
		int[] intArray = new int[] { 8, 11, 7, 9, 6, 10 };
		int[] anotherArray = new int[intArray.length - 1];
		int max1 = 0, max2=0;
		int index = 0;
		for (int i = 0; i < intArray.length; i++) {
			log.info("Index {} Array Value {}", i, intArray[i]);
			if (intArray[i] > max1) {
				max1 = intArray[i];
				index = i;
			}
		}
		log.info("{}", max1);
		
		for (int i = 0, j = 0; i < intArray.length; i++) {
			if (i == index)
				continue;
			anotherArray[j++] = intArray[i];
		}
		for (int i = 0; i < anotherArray.length; i++) {
			log.info("Index {} Array Value {}", i, anotherArray[i]);
			if (anotherArray[i] > max2) {
				max2 = anotherArray[i];
			}
		}
		log.info("{}", max2);
		log.info("Multiplication of two max value is: {}", max1*max2);
	}
	
}
