public class PrimitiveVsReference {

	public static void main(String[] args) {
		int i = 10;
		incrementI(i);
		System.out.println(i);

		int[] iArray = new int[100];
		iArray[0] = 10;
		incrementFirstElement(iArray);
		System.out.println(iArray[0]);

	}

	private static void incrementFirstElement(int[] xArray) {
		xArray[0]++;

	}

	private static void incrementI(int x) {
		x = x + 1;

	}

}
