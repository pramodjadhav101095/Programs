package java_package;

public class ThisKeyword2 {
	
	ThisKeyword2(){
		this(5);
		System.out.println("Hello Word");
		
	}
	ThisKeyword2(int x){
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		
		ThisKeyword2 ts = new ThisKeyword2();
	}

}
