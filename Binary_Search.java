import java.util.*;
public class Binary_Search
{
    public static int binary_search(Vector<Integer> v,int l,int r,int k){
    int mid=(l+r)/2;
    if(k==v.get(mid)){
        return mid;
    }
    else{
    if(k>v.get(mid)){
        return binary_search(v,mid+1,r,k);
    }
    else{
        return binary_search(v,l,mid-1,k);
    }
    }
}
	public static void main(String[] args) {
	    Vector<Integer> v=new Vector();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        int a=sc.nextInt();
	        v.add(a);
	    }
	Collections.sort(v);
	System.out.print(v);
	System.out.println("Enter the Element to be Searched");
	int k=sc.nextInt();
	int t=n-1;
	int q=binary_search(v,0,t,k);
	System.out.println("Position is"+" "+q);
	}
}
