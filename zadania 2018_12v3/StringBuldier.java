public class StringBuldier{
	public static void main(String[] args) {
		String s = "a";
		long start = System.nanoTime();
		
		
		// for(int i=0; i<1000 ; i++) {
			// s = s+"a";
			// //s = new StringBuilder(s).append("a").toString();
		// }
		
		
		StringBuilder sB = new StringBuilder(s);

		for(int i=0; i<10000; i++) {
			sB.append("a");
		}

		s = sB.toString();
		
		
		System.out.println("Time1: "+(System.nanoTime()-start));
	}
}