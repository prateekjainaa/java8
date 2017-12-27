package ex7;

import java.util.Date;
import java.util.Random;
import java.util.stream.DoubleStream;

public class Streams3 {

	public static void main(String[] args) {
		double[] rand = new Random().doubles(1000).toArray();
		System.out.println(rand.length);
		long t1 = new Date().getTime();
		double sum = DoubleStream.of(rand).map(Math::sqrt).sum();
		long t2 = new Date().getTime();
		System.out.println(sum + " in ms " + (t2 - t1));
		
		//---------
		long t3 = new Date().getTime();
		double sum2 = DoubleStream.of(rand).parallel().map(Math::sqrt).sum();
		long t4 = new Date().getTime();
		System.out.println(sum2 + " in ms " + (t4 - t3));

	}

}
