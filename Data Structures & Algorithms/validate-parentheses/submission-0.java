class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='(' || ch =='[' || ch =='{'){
                sb.append(ch);
            }
            else{
                if( sb.length() == 0){
                    return false;
                }
                char last = sb.charAt(sb.length() -1);
                if((ch==')' && last =='(')||
                (ch==']' && last =='[')||
                (ch=='}' && last =='{')){
                    sb.deleteCharAt(sb.length()-1);
                }
                else{
                    return false;
                }
            }
        }
        return sb.length() == 0;
        
    }
}
