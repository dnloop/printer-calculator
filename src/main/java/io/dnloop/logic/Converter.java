package io.dnloop.logic;

public class Converter {

    public static int toWatt(int kW) {
	return kW * 1000;
    }

    public static int toKWatt(int w) {
	return w / 1000;
    }
}
