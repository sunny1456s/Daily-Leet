// Last updated: 7/3/2026, 11:28:21 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] l=new char[words.length];
        int k=0;
        for(String word:words){
            int weight=0;
            for(int i=0;i<word.length();i++){
               weight+= weights[word.charAt(i) -'a'];
            }
            l[k++]=(char) ('z' -weight%26);
        }
        return new String(l);
    }
}