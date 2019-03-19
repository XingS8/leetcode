/**
 * 
 */
package problem;

/**
 * @author Administrator
 *
 */
public class problem3 {

	/**
	 * @param args
	 */
    public static int lengthOfLongestSubstring(String s) {
    	int count = 0;
    	if(s.length() == 1) {
    		return 1;
    	}else {
    		for(int i = 0 ; i < s.length();i++) {
        		for(int n = i+1; n <= s.length();n++) {
        			if(n==s.length()) {
            			if(count<s.substring(i,n).length()) {
                			count = s.substring(i,n).length();
            			}
        			}else {
        				String t = s.substring(i, n);
                		String ne = s.substring(n,n+1);
                		if(t.contains(ne) == true) {
                			if(count<t.length()) {
                    			count = t.length();
                			}
                			break;
                		}else {
                			if(count<t.length()) {
                    			count = t.length();
                			}
                		}	
        			}
        		}
        	}
            return count;
    	}
    }
    
    public static void main(String[] args) {
    	int r =lengthOfLongestSubstring(" ");
        System.out.println(r);
    }
}

