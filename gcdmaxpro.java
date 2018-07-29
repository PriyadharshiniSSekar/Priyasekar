public class gcdpro {

	public static void main(String[] args) {
       Scanner word=new Scanner(System.in);
       int num=word.nextInt();
       int q=word.nextInt();
       int []arr=new int[num];
       int []a=new int[q];
       int []b=new int[q];
       for(int i=0;i<num;i++){
    	   arr[i]=word.nextInt();
       }
       for(int i=0;i<q;i++){
    	   a[i]=word.nextInt();
    	   b[i]=word.nextInt();
       }
       for(int i=0;i<q;i++){
    	   for(int j=1;j<=a[i]&&j<=b[i];j++)
    	   if(a[i]%j==0 && b[i]%j==0)
    		   System.out.println(j);
       }
	}
}
