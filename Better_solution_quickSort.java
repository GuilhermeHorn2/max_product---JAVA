package misc;

public class main_misc {

	public static void main(String[] args) {
		//
     int [] v = {-5,-1,-2,0,1,1,5};
     System.out.print(max_product(v));


}
	//first sort the array using quick sort algorithm
	private static void swap(int[]v,int i,int j) {
		int t = v[i];
		v[i] = v[j];
		v[j] = t;			
	}
	private static void quickSort(int []v,int strt,int end) {
		//
		if(strt >= end) {
			return;
		}
		int p = v[end];
		int l = strt;
		int r = end;
		
		while(l < r) {
			while(v[l] <= p && l < r) {
				l++;
			}
			while(v[r] >= p && r>l) {
				r--;
			}
			swap(v,l,r);
		}
		if(v[l] > v[end]) {
			swap(v,l,end);
		}
		else {
			l = end;
		}
		
		quickSort(v,strt,l-1);
		quickSort(v,l+1,end);
	}

	private static int max_product(int[] v) {
		//
		quickSort(v,0,v.length-1);
		int a = v[0] * v[1];
		if(a > v[v.length-1]*v[v.length-2] || a > v[v.length-1] * v[v.length-3] || a > v[v.length-2]*v[v.length-3]) {
			return a*v[v.length-1];
		}
		return v[v.length-1]*v[v.length-2]*v[v.length-3];
		
	
	}
}
