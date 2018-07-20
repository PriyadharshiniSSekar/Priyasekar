public class fifthkid {

	public static void main(String[] args) {
     Scanner word=new Scanner(System.in);
     int a[]=new int[3];
     for(int i=0;i<3;i++){
    	 a[i]=word.nextInt();
     }
     int max=a[0];
      for(int j=0;j<3;j++){
    	  if(a[j]>max){
    		  max=a[j];
    	  }
      }
     System.out.println(max); 
	}
}
