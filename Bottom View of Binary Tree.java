class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(0, root));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        while(!q.isEmpty()){
            Pair cur = q.poll();
            
                map.put(cur.hd, cur.node.data);

            if(cur.node.left != null){
                q.add(new Pair(cur.hd - 1, cur.node.left));
            }
            if(cur.node.right != null){
                q.add(new Pair(cur.hd + 1, cur.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()){
            int val = map.get(key);
            ans.add(val);
        }
        return ans;
    }
    static class Pair{
        int hd;
        Node node;
        
        public Pair(int hd, Node node){
            this.node = node;
            this.hd = hd;
        }
    }
}
