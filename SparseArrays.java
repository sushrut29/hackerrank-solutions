static ArrayList<Integer> matchingStrings(String[] strings, String[] queries) {
        
        Map<String, Integer> map = new HashMap<>();
        for(String str: strings){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        for(String str: queries){
            if(map.containsKey(str)){
            al.add(map.get(str));
            }
            else{
                al.add(0);
            }
        }
        
   return al;

    }
