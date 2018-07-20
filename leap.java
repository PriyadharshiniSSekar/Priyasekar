public class Sixthkid {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
        int num=word.nextInt();
        if(((num%4==0)&&(num%100 !=0))||((num%100==0)&&(num%400==0))){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
	}
}
