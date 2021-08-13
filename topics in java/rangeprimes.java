package tryouts;

import java.util.*;

public class rangeprimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end  = sc.nextInt();
		System.out.print("[");
		for(int i=start;i<=end;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(count==2) {
				System.out.print(" "+i);
			}
		}
		System.out.print(" ]");
	}

}
