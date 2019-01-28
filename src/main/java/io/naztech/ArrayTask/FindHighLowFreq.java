package io.naztech.ArrayTask;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FindHighLowFreq {
	public static void main(String[] args) {
		int[] intArray = new int[] { 1, 1, 2, 5, 3, 2, 3, 1 };
		int max, min, countMaxF = 0, countMinF = 100, var, maxIndex=0, minIndex=0;
		for (int i = 0; i < intArray.length; i++) {
			var = intArray[i];
			max=0;
			min=0;
			for (int j = 0; j < intArray.length; j++) {
				if (intArray[j] == var) {
					max++;
					min++;
				}
			}
			if (max > countMaxF) {
				countMaxF = max;
				maxIndex=i;
			}
			if (min<countMinF) {
				countMinF=min;
				minIndex=i;
			}
		}
		log.info("Max frequency: {} of number {}, Min frequency: {} of number {}", countMaxF, intArray[maxIndex], countMinF, intArray[minIndex]);
	}
}
