public class zohominmaxarray {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		System.out.println("Enter the array");
         int num=word.nextInt();
         int []arr=new int[num];
         for(int i=0;i<num;i++){
        	 arr[i]=word.nextInt();
         }
         Arrays.sort(arr);
         int []a=new int[num];
         int k=0;int i,j;
         if(num%2!=0){
         for(i=num-1,j=0;i!=j;i--,j++){
        	 a[k]=arr[i];
         	 k++;
        	 a[k]=arr[j];
        	 k++;
         }a[k]=arr[num/2];}k=0;i=num-1;j=0;
         if(num%2==0){
        	 for(i=num-1,j=0;i>=(num/2)&&j<(num/2);i--,j++){
        		 a[k]=arr[i];
             	 k++;
            	 a[k]=arr[j];
            	 k++; 
        	 }
         }
        for(i=0;i<num-1;i++){
        	 System.out.print(a[i]+" ");
         }
         }
}
