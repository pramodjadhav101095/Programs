package java_package;

public class ThisKeyword {

	ThisKeyword(){
		
		System.out.println(" hello World");
		
	}
	
	ThisKeyword(int x){
		this();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		ThisKeyword ts = new ThisKeyword(10);

	}

}
