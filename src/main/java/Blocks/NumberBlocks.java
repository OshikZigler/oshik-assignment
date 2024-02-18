package Blocks;

import java.util.Random;

import Utils.CommonOps;

public class NumberBlocks extends CommonOps {

	private static int generateRandomInt(int length) {

		if (length <= 0) {
			throw new IllegalArgumentException("Length must be greater than 0");
		}

		int min = (int) Math.pow(10, length - 1);
		int max = (int) Math.pow(10, length) - 1;

		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	public static int generateRandomZipCode() {
		return generateRandomInt(5);
	}

	public static int generateRandomSSN() {
		return generateRandomInt(9);
	}
}
