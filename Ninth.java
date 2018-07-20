public class Ninthkid {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		int N=word.nextInt();
		int K=word.nextInt();int sum=0;
		int []arr=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=word.nextInt();
		}
       for(int j=0;j<K;j++){
    	   sum=sum+arr[j];
       }
       System.out.println(sum);
	}
}
