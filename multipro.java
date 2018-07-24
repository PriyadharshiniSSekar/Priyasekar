public class multipro {

	public static void main(String[] args) {
       Scanner word=new Scanner(System.in);
       int a1=word.nextInt();
       int a2=word.nextInt();
       int a3=word.nextInt();
       if(a1%2==0){
    	   int c=a2+a3;
    	   if(a1%c==0){
    		   System.out.println("Yes");}
    	   else{
    		   System.out.println("No");}
       }
       else
    	   System.out.println("No");
	}

}
