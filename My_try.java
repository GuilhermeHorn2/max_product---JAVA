package misc;

public class main_misc {

	public static void main(String[] args) {
		//
	int[] v = {0,-1,10,7,5};
	int r = max_product(v);
	System.out.println(r);
	

}
	public static int max_product(int[]v) {
		//i dont have to find all the configurations,i just have to find the 3 biggest integers
		int x = 0;
		int y = 0;
		int z = 0;
		for(int i = 0;i < v.length;i++) {
			//
			if(v[i] > x) {
				int a = x;
				x = v[i];
				int b = y;
				y = a;
				z = b;
			}
			else if(v[i] > y){
				int c = y;
				y = v[i];
				z = c;			
			}
			else if(v[i] > z){
				z = v[i];
			}	
		}
		return x*y*z;
	}
}
