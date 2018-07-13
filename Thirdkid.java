public class Thirdkid {

	public static void main(String[] args) {
      Scanner word=new Scanner(System.in);
      char ch=word.next().charAt(0);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    	  System.out.println("Vowels");
      }
      else if((ch>='b'&& ch<='z')&&(!(ch=='e'||ch=='i'||ch=='o'||ch=='u'))){
    	  System.out.println("Consonants");
      }
      else{
    	  System.out.println("Invalid");
      }
	}

}
