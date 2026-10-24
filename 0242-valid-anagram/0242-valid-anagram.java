class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();//O(n)
        Arrays.sort(s1);//O(n log n)
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);//O(n)
        //total TC = O(n log n)
    }
}