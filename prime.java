public class Thirtinprymbeg {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		int N=word.nextInt();
		if(N<=1000){
			int count=0;
		for(int i=2;i<=N;i++){
			if(N%i==0){
				count++;
			}
		}
     if(count==1){
    	 System.out.println("Yes");
     }
     else{
    	 System.out.println("No");
     } 
	}
	}
}
