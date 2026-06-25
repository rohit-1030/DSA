class Solution {
    public int totalFruit(int[] fruits) {
       int low = 0 , maxLen=0;
        Map<Integer , Integer> map = new HashMap<>();
         
        
        for(int high = 0  ; high < fruits.length ; high++){
            map.put(fruits[high], map.getOrDefault(fruits[high],0)+1);
            
            while(map.size() > 2){
                int leftFr = fruits[low];
                map.put(leftFr, map.get(leftFr)-1);
                
                if (map.get(leftFr) == 0)
                    map.remove(leftFr);
                low++;
            }
            
            if(map.size() <= 2)
                maxLen = Math.max(maxLen , high-low+1);
        }
        
        return maxLen; 
    }
}