package arrays2d;

public class MaxWealth {
	public static void main(String[] args) {
		System.out.println(maximumWealth(new int[][] { { 1, 5 }, { 3, 2, 1 } }));
	}

	public static int maximumWealth(int[][] accounts) {

		int max = 0;

		for (int[] customer : accounts) {

			int sum = 0; // for every col we need to set our sum to 0 to calculate the sum of that
							// particular row
			for (int wealth : customer) {
				sum += wealth;

				if (sum > max) {
					max = sum;
				}
			}

		}

		return max;
	}

}
