package duckccg.core;

import java.util.Random;

public class RNGEngine {
	static Random RNG = new Random();
	public static int rollD4() {
		return RNG.nextInt(4) + 1;
	}
	public static int rollD6() {
		return RNG.nextInt(6) + 1;
	}
	public static int rollD10() {
		return RNG.nextInt(10) + 1;
	}
	public static int rollD20() {
		return RNG.nextInt(20) + 1;
	}
	public static int rollCustom(int maxBound) {
		return RNG.nextInt(maxBound) + 1;
	}
}
