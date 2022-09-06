import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        char[][] type = new char[][]{{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<survey.length; i++) {
            String str = survey[i];
            int num = choices[i];
            
            int score = 0;
            char charType;
            if(num <= 3) {
                score = 4 - num;
                charType = str.charAt(0);
                map.put(charType, map.getOrDefault(charType, 0) + score);
            } else if(num > 4) {
                score = num - 4;
                charType = str.charAt(1);
                map.put(charType, map.getOrDefault(charType, 0) + score);
            }
        
        }
        
        for(char[] charArr : type) {
            char char1 = charArr[0];
            char char2 = charArr[1];
            
            int score1 = map.getOrDefault(char1, 0);
            int score2 = map.getOrDefault(char2, 0);
            
            if(score1 > score2) {
                sb.append(char1);
            } else if(score2 > score1) {
                sb.append(char2);
            } else {
                sb.append((char)Math.min(char1, char2));
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}