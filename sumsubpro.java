public class addsub {

	public static void main(String[] args) {
       Scanner word=new Scanner(System.in);
       int num=word.nextInt();
       int []arr=new int[num];int sub,sum=0;;
       for(int i=0;i<num;i++){
    	   arr[i]=word.nextInt();
       }
       for(int i=0;i<num;i++){
    	   for(int j=i;j<num;j++){
    		   sub=arr[j]-arr[i];
    		   sum+=sub;
    	   }
       }
       System.out.println("sum="+sum);
	}

}
