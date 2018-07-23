public class EqualString {

	public static void main(String[] args) {
		System.out.println("Enter the No");
		Scanner word=new Scanner(System.in);
		int num=word.nextInt();
		String s[]=new String[num];String e="";
		int g[]=new int[num];
		for(int i=0;i<num;i++){
			s[i]=word.next();
		}
		for(int l=0;l<num;l++){
			g[l]=s[l].length();
		}
		int d=g[0];
		for(int m=0;m<num;m++){
			if(g[m] < d)
				d=g[m];
		}System.out.println(d);
		for(int j=0;j<num-1;j++){
			 e="";
			char b[]=s[j].toCharArray();
			char c[]=s[j+1].toCharArray();
			for(int k=0;k<d;k++){
				if(b[k]==c[k])
			   e+=b[k];
				else
					break;
			}
			d=e.length();
		}
        System.out.println(e);
	}
}
