public class Fact {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		int N=word.nextInt();
		if(N<=20){int fact=1;
		for(int i=1;i<=N;i++){
			fact=fact*i;
		}
     System.out.println(fact);
		}
	}
}
