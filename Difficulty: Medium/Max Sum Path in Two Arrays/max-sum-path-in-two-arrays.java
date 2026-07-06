class Solution {
	public int maxPathSum(int[] a, int[] b) {
		// code here
		
		int i=0, j = 0;
		int n = a.length;
		int m = b.length;
		int sum1 = 0, sum2 = 0;
		
		while(i<n && j<m){
		    if(a[i]==b[j]){
		        int max = Math.max(sum1,sum2);
		        sum1 = sum2 = max + a[i];
		        i++;
		        j++;
		    }
		    else if(a[i]<b[j]){
		        sum1 += a[i];
		        i++;
		    }
		    else {
		        sum2 += b[j];
		        j++;
		    }
		}
		
		while(i<n){
		    sum1 += a[i];
		    i++;
		}
		
		while(j<m){
		    sum2 += b[j];
		    j++;
		}
		
		return Math.max(sum1,sum2);
	}
}
