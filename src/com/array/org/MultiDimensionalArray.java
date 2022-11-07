package com.array.org;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		int k[][]= {{12,23,21,32,24},{34,35,36,37,38},{56,57,58,59,60},{61,62,63,64,65},{90,91,92,93,94,95}};
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
			System.out.print(k[i][j]+ " " );
			
		}
		System.out.println( );
	}

}
}