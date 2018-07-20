public class Player {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		String str=word.next();
		String s=new StringBuffer(str).reverse().toString();
	   System.out.println(s);
	}
}
