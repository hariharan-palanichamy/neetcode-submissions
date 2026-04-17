class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> groupStrs = new HashMap<>();
        List<List<String>> anagrams = new ArrayList<>();
        for(String element : strs){
            
            // create cannonical form
            char[] chars=element.toCharArray();
            Arrays.sort(chars);
            String canonicalForm = new String(chars);

            // add the value and canonical form to hash map
            if(!groupStrs.containsKey(canonicalForm)){
                List<String> strList = new ArrayList<>();
                strList.add(element);
                groupStrs.put(canonicalForm,strList);
            }
            else{
                List<String> strList = groupStrs.get(canonicalForm);
                strList.add(element);
            }

            

        }

        // extract the value array alone
        for(String key:groupStrs.keySet()){
            anagrams.add(groupStrs.get(key));
        }  

        return anagrams;
    }
}
