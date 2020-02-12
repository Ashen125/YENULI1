package multidimarray;

public class multidimarraydemo1 {

	public static void main(String[] args) {
		
	

		
	
		int a[][]={{100,200},{300,400},{500,600}};
		
		System.out.println("Number of Rows"+a.length);
		System.out.println("Number of colums" +a[0].length);
		
		
			for(int i=0; i<a.length;i++)//// 0123456
			
			{
		       for(int j=0;j<a[i].length;j++)///01
		    	   
		{
			System.out.println(a[i][j]);////100200300400500600
		
		}
		
			}
	}
}

			
			

