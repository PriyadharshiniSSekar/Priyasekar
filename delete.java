public class deletepro {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		int num1=word.nextInt();
		int num2=word.nextInt();
		String num3=Integer.toString(num1);
		int len=num3.length();
		char ch[]=num3.toCharArray();String a="";
		for(int i=num2;i<len;i++){
			a+=num3.substring(i, i+1);
		}
System.out.print(a);
	}

}
