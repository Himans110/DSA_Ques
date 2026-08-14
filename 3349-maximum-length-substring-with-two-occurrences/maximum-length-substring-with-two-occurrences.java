import java.util.*;
class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String ans = s.substring(i, j);
                if(check(ans)){
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }
    public boolean check(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(int count : map.values()){
            if(count > 2)
                return false;
        }
        return true;
    }
}