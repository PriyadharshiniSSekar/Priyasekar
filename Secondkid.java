public class second {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		int N=word.nextInt();
		if(N>=1 && N<=100000 && N%2==0){
          System.out.println("Even");
	}
		else if(N>=1 && N<=100000 && N%2!=0){
			System.out.println("Odd");
		}
		else{
			System.out.println("Invalid");
		}
	}
}
