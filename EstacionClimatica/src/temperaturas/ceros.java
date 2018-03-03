package temperaturas;

public class ceros {

	
	
		public static void main(String[]jaja) {
			
			
			int array[][]=new int [4][4];
			
			
			for (int i=0;i<array.length;i++) {
				
				for (int j=0;j<array.length;j++) {
					
					if(i==0 && j==0 || i==0 && j==array.length-1 || i==array.length-1 && j==0 || i==array.length-1 && j==array.length-1) {
						
						array[i][j]=1;
					}
					else if(i==1 && j==1 || i==1 && j==2 || i==2 && j==1 || i==2 && j==2) {
					
						array[i][j]=1;
			
				}
				
				
			}
			
			}
			for (int i=0;i<array.length;i++) {
				
				for(int j=0;j<array.length;j++) {
					
					
					System.out.print(array[i][j]);
					
					if(j==array.length-1) {
						
						System.out.println("");
						
					}
					
				}
				
			}
			
		}
}