public class ijkpro {

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		int num=word.nextInt();
		int []arr=new int[num];int count=0;
		for(int i=0;i<num;i++){
			arr[i]=word.nextInt();
		}
		for(int i=0;i<num-2;i++){
			for(int j=i+1;j<num-1;j++){
				if(arr[i]>arr[j]){
					continue;}
				for(int k=j+1;k<num;k++){
					if((arr[i] < arr[j])&&(arr[j] < arr[k])){
						count++;
					}
				}
			}				
		}
		System.out.println("Result is:"+count);
	}
}
