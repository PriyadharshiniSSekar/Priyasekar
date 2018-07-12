public class first {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		int N=word.nextInt();
		if(N>0){
			System.out.println("Positive");
		}
		else if(N==0){
			System.out.println("Zero");
		}
		else{
			System.out.println("Negative");
		}
	}

}
