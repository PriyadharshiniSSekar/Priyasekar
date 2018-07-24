public class proballoon {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		String s1=word.next();
	    String s2=word.next();
	    int len1=s1.length();
	    int len2=s2.length();int min,max;int count=0;
	    if(len1<len2){
	    	min=len1;max=len2;}
	    else{
		  min=len2;max=len1;}
	    char ch[]=s1.toCharArray();
	    char ch1[]=s2.toCharArray();
	    for(int i=0;i<min;i++){
	    		if(ch[i]==ch1[i]){
	                count++;
	    		}
	    }
	    int d=max-count;
	    System.out.println(d);
	}
}
