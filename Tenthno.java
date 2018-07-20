public class Tenthkid {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		int num=word.nextInt();String s;
		s=Integer.toString(num);
		if(num>0){
			System.out.println(s.length());
		}
		else{
			System.out.println(s.length()-1);
		}
		}
}
