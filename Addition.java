 
 class Addition
 {
	public static int sum (int number1, int number2)
	{
	    System.out.println("sum method started!!!");
	    int result = 0;
	    result=number1+number2;

	    System.out.println("sum method ended");
		return result;
	   
	}
	   public static void main(String[] args)
	 {
		System.out.println("main method started!!!");
		int res =sum(50,60);
	    System.out.println("Sum is "+res);
		System.out.println("main method ended!!!");
		
	 }
 }