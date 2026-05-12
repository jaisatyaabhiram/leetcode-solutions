class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map = new HashMap<>();

    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,k->new TreeMap()).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> treemap = map.get(key);
        if(treemap==null){
            return "";
        }
        Map.Entry<Integer,String> entry = treemap.floorEntry(timestamp);
        return entry==null?"":entry.getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */