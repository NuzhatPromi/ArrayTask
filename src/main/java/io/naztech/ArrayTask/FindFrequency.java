package io.naztech.ArrayTask;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FindFrequency {
	public static void main(String[] args) {
		int[] intArray = new int[] { 1, 1, 2, 5, 3, 2, 3, 1 };
		int countMaxF=0, countMinF=0;
		int max = 0, min=100;
		for (int i = 0; i < intArray.length; i++) {
			log.info("Index {} Array Value {}", i, intArray[i]);
			if (intArray[i] > max) {
				max = intArray[i];
			}
			if (min>intArray[i]) {
				min=intArray[i];
			}
		}
		log.info("{} {}", max, min);
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i]==max) {
				countMaxF++;
			}
			if (intArray[i]==min) {
				countMinF++;
			}
		}
		log.info("Max number {} frequency: {}, Min number {} frequency: {}", max, countMaxF, min, countMinF);
	}
}
