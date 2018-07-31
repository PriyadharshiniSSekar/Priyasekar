public class arithmeticprogression {

	public static void main(String[] args) {
       Scanner word=new Scanner(System.in);
       System.out.println("Enter the N");
       int N=word.nextInt();
       System.out.println("Enter the a");
       int a=word.nextInt();
       System.out.println("Enter the d");
       int d=word.nextInt();int add=0;
       for(int i=0;i<N;i++){
    	   add+=(a+(i*d));
       }System.out.println("output="+add);
	}
}
