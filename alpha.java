public class Fourthkid {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		char ch=word.next().charAt(0);
		if((ch >='a' && ch<='z')||(ch >='A && ch <='Z')){
			System.out.println("Alphabet");
		}
		else{
			System.out.println("Not");
		}
	}

}
