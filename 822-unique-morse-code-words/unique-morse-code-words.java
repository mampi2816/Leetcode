class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> ts = new HashSet<>();

        for(String word: words){
            StringBuilder t = new StringBuilder();
            for(char c: word.toLowerCase().toCharArray()){
                t.append(morse[c-'a']);
            }
            ts.add(t.toString());
        }
        return ts.size();
    }
}