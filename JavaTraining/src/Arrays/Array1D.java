package Arrays;

public class Array1D {

	public static void main(String[] args) {
		int[] NumSet = {10,20,30,40,50};
		int[] array = new int[5];
		array[0]=5;
		array[1]=10;
		array[2]=15;
		
		System.out.println(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
		}
		
		for(int i=0;i<array.length;i++) {
			array[i]=i*5;
			
		}
		
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
			
		}
		
		
//		System.out.println(NumSet[0]);
//		System.out.println(NumSet[1]);
//		System.out.println(NumSet[2]);
//		System.out.println(NumSet[3]);
//		System.out.println(NumSet[4]);
//		
//		String[] fruits = {"Apple","Orange","Banana"};
//		
//		for(int i=0;i<5;i++) {
//			System.out.println(NumSet[i]);
//			
//		}
//
//		
//		for(int i=0;i<fruits.length;i++) {
//			System.out.println(fruits[i]);
//		}
//		
		

	}

}
