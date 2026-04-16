class Solution {
    public boolean isAnagram(String s, String t) {
        
        // convert string s to hashmap
        Map<Character,Integer> sCharMap = new HashMap<>();
        for(Character c:s.toCharArray()){
            if(sCharMap.containsKey(c)){
                sCharMap.put(c,sCharMap.get(c)+1);
            }
            else{sCharMap.put(c,1);}
        }

        // convert t to hash map
        Map<Character,Integer> tCharMap = new HashMap<>();
        for(Character c:t.toCharArray()){
            if(tCharMap.containsKey(c)){
                tCharMap.put(c,tCharMap.get(c)+1);
            }
            else{tCharMap.put(c,1);}
        }


        // compare if two hash map are same
        if(!sCharMap.keySet().equals(tCharMap.keySet())) return false;
        
        for(Character c: sCharMap.keySet()){
            if(!sCharMap.get(c).equals(tCharMap.get(c))){ return false;}
        }

        return true;
    }
}
