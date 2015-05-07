package try_github;

public class Main {

	public static void main(String[] args) {
		
		Add add=new Add();
		Sub sub=new Sub();
		
		System.out.println(add.add(199, 123));
		
		System.out.println(Sub.sub(199,123));
	}

}
