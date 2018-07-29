public class same2npro {

	public static void main(String[] args) {
       Scanner word=new Scanner(System.in);
       int num=word.nextInt();
       int com=2*num;int count=0;
       for(int i=0;i<com;i=i+2){
    	   count++;
       }
       System.out.println("count is="+count);
	}
}
