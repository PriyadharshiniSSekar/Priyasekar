public class Palindrome {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		int N=word.nextInt();
		if(N<=1000){
		String str=Integer.toString(N);
		String s=new StringBuffer(str).reverse().toString();
        if(str.equals(s)){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
	    }
    }
}
