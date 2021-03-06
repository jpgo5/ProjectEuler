package problem41thru50;

import java.util.LinkedList;
import java.util.List;

import utility.Print;

public class Problem45 {

	/*
	 * Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:
	 * 
	 * Triangle	 	Tn=n(n+1)/2	 	1, 3, 6, 10, 15, ...
	 * Pentagonal	 	Pn=n(3n−1)/2	 	1, 5, 12, 22, 35, ...
	 * Hexagonal	 	Hn=n(2n−1)	 	1, 6, 15, 28, 45, ...
	 * 
	 * It can be verified that T285 = P165 = H143 = 40755.
	 * Find the next triangle number that is also pentagonal and hexagonal.
	 */
	
	public static void main(String[] args) {
		long answer = tph();
		Print.answer(answer);
		//1533776805
	}

	private static long tph() {
		long next = -1;
		List<Long> triangle = new LinkedList<Long>();
		List<Long> pentagon = new LinkedList<Long>();
		List<Long> hexagon = new LinkedList<Long>();
		boolean done = false;
		long n = 1;
		while(!done && n < 100000L) {
			long t = n*(n+1)/2;
			long p = n*(3*n-1)/2;
			long h = n*(2*n-1);
			triangle.add(t);
			pentagon.add(p);
			hexagon.add(h);
			if (n > 285) {
				if (pentagon.contains(t) && hexagon.contains(t)) {
					next = t;
					done = true;
				}
			}
			n++;
		}
		return next;
	}

}
