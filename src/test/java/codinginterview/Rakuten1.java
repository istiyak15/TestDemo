package codinginterview;

public class Rakuten1 {
	static void candies(int n, int k)
	{
		int count = 0;
		int ind = 1;
		int []arr=new int[k];
		for(int i=0;i<k;i++)
			arr[i]=0;
		while (n>0) {
			int f1 = (ind - 1) * k;
			int f2 = ind * k;
			int sum1 = (f1 * (f1 + 1)) / 2;
			int sum2 = (f2 * (f2 + 1)) / 2;
			int res = sum2 - sum1;
			if (res <= n) {
				count++;
				n -= res;
				ind++;
			}
			else 
			{
				int i = 0;
				int term = ((ind - 1) * k) + 1;
				while (n > 0) {
					if (term <= n) {
						arr[i++] = term;
						n -= term;
						term++;
					}
					else 
					{
						arr[i++] = n;
						n = 0;
					}
				}
			}
		}

		for (int i = 0; i < k; i++)
			arr[i] += (count * (i + 1))
			+ (k * (count * (count - 1)) / 2);
		for (int i = 0; i < k; i++)
			System.out.print( arr[i] + " ");
	}
	public static void main(String []args)
	{
		int n = 10, k = 3;
		candies(n, k);

}
}
