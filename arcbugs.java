public class arcbug {

	public static void main(String[] args) {
       System.out.println("Enter the word");
       Scanner word=new Scanner(System.in);
       String str=word.nextLine();
       String s[]=str.split(" ");
       int sum=0;int sum1[]=new int[s.length];int k=0;
       for(int i=0;i<s.length;i++){
    	   char ch[]=s[i].toCharArray();sum=0;
    	   for(int j=0;j<ch.length;j++){
    		    sum+=(int)ch[j];
    		    sum=sum-96;
    	   }
    	  sum1[k]=sum;
    	  k++;
       }
       int res=sum1[0];
       for(int i=1;i<s.length;i++){
    	   res-=sum1[i];
       }
       if(res<0){
    	   res=-res;
       }	   
     System.out.println(res);
	}
}
