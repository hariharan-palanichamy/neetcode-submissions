class Solution {
    public String longestCommonPrefix(String[] strs) {

        // get the minimum string count
        int minLength= Integer.MAX_VALUE;
        for(String element: strs){
            minLength= Math.min(minLength, element.length());
        }


        // iterate thorugh all the element to get prefix
        StringBuilder prefix= new StringBuilder("");
        for(int i=0;i<minLength;i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if (c!=strs[j].charAt(i)){
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }

        return prefix.toString();
        
    }
}