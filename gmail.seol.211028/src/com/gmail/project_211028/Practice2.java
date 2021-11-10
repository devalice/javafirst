package com.gmail.project_211028;

public class Practice2 {

	public static void main(String[] args) {
		//                     첫번째별  두번째별
		//    *     5 5   i=0  5-i     5+i
        //   * *    4 6   i=1  
		//  *   *   3 7   i=2  
		// *     *  2 8   i=3  
		//********* 1 9   i=4  
		for(int i=0; i<5; i++) {
			for(int j=0; j<9; j++) {
				if(j == (5-i)-1 || j == (5+i)-1 || i == 4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}

			System.out.println("");			
			//                      첫번째별  두번째별
			//     *      6 6   i=0  5-i     5+i
			//    * *     5 7   i=1  
			//   *   *    4 8   i=2  
			//  *     *   3 9   i=3  
			// *       *  2 10
			//*********** 1 11  i=4  
		}
	}

}
