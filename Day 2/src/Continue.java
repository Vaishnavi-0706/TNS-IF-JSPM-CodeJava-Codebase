
public class Continue {

	public static void main(String[] args) {
for (int k = 0; k < 10; k++) {
    if (k % 2 != 0)
        continue; // skips printing odd numbers
    System.out.println(k + " ");
}
	}
}
