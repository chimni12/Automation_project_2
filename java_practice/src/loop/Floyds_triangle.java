package loop;

public class Floyds_triangle {

	public static void main(String[] args) {
		
		int count=1;
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
