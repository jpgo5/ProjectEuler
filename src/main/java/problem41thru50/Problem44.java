package problem41thru50;

import java.util.LinkedList;
import java.util.List;

import utility.Print;

public class Problem44 {

	/*
	 * Pentagonal numbers are generated by the formula, Pn=n(3n−1)/2. The first ten pentagonal numbers are:
	 * 
	 * 1, 5, 12, 22, 35, 51, 70, 92, 117, 145, ...
	 * 
	 * It can be seen that P4 + P7 = 22 + 70 = 92 = P8. However, their difference, 70 − 22 = 48, is not pentagonal.
	 * 
	 * Find the pair of pentagonal numbers, Pj and Pk, for which their sum and difference are pentagonal and D = |Pk − Pj| is minimised; what is the value of D?
	 */
	
	public static void main(String[] args) {
		long d = pentagonNumbers();
		Print.answer(d);
		//5482660
	}

	static long pentagonNumbers() {
		long d = -1;
		List<Long> numbers = new LinkedList<Long>();
		for (long n = 1; n < 10000; n++) {
			long p = n * (3*n-1) / 2;
			numbers.add(p);
		}
		
		System.out.println("Problem44>> -------------------------- ");
		for (long pj : numbers) {
			for (long pk : numbers) {
				long diff = Math.abs(pk - pj);
				long sum = pk + pj;
				if (numbers.contains(diff) && numbers.contains(sum)) {
					System.out.println("Problem44>> diff is " + diff);
					if (diff < d || d == -1) {
						System.out.println("Problem44>> new d is " + d);
						d = diff;
					}
				}
			}
		}
		return d;
	}

}