package Arrays;

public class Array2D {

	public static void main(String[] args) {

     int[][] array2D = new int[2][3];
     array2D[0][0]=10;
     array2D[0][1]=20;
     array2D[0][2]=30;
     array2D[1][0]=40;
     array2D[1][1]=50;
     array2D[1][3]=60;
//     System.out.println(array2D.length);
//     System.out.println(array2D[1].length);
//     System.out.println(array2D[1][2]);
//     
     
     for(int i=0;i<array2D.length;i++) {
    	 for(int j=0;j<array2D[i].length;j++) {
    		 System.out.print(array2D[i][j]+" ");
    	 }
     }

	}

}
