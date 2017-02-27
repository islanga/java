class ArrayDemo {
	private String defaults;

	public ArrayDemo() {
		this.defaults = "Edwood";
	}
	
	public void display() {
		System.out.println( this.defaults );
		System.out.println( "\n" );		
	}

	public static void main(String[] args) {
		int[] anArray = new int[1];
		ArrayDemo a = new ArrayDemo();

		anArray[0] = 100;

		int x = 0;

		a.display();

		while (x < anArray.length) {
			System.out.println( anArray[x] );
			x++;
		}
	}
}