package gk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tools {
	public static String inputString(String tb) throws IOException {
		InputStreamReader nd = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(nd);
		System.out.print(tb);
		String kq = buff.readLine();
		return kq;
		}
		public static Double inputDouble(String tb) throws IOException {
			String s = inputString(tb);
			Double kq = Double.parseDouble(s);
			return kq;
		}
		public static int inputInt(String tb) throws IOException {
			String s = inputString(tb);
			int kq = Integer.parseInt(s);
			return kq;
		}
}
