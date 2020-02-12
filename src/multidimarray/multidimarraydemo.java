package multidimarray;

public class multidimarraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int [4][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		a[3][0]=700;
		a[3][1]=800;
		
		
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
				
		
		


