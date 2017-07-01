
public class MainClass {

	public static void printLn(String data){
		System.out.println(data);
	}
	public static void main(String args[]){
		int a[] = new int[] {1,2,3,5,6};
		int b[]  = new int[] {4,2,1,7,3,6,7,5,5,4,4,6,6,6};
		int res[] = new int[a.length+b.length];
		int disp = 0;
		String tmp ="";
		for(int i=0;i<(b.length+a.length);i++){
			if(i < a.length){
				if(tmp.indexOf(""+a[i])==-1){
					res[i-disp] = a[i];
					tmp = tmp+a[i];
				}else{
					disp++;
				}
			}else{
				if(tmp.indexOf(""+b[i-a.length]) == -1){
					tmp = tmp + b[i-a.length];
					res[i-disp] = b[i-a.length];
				}else{
					disp++;
				}
			}
		}
		for(int i=0;i<res.length-disp;i++)
			printLn(""+res[i]);
	}
}
