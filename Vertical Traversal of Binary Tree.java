class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
     ArrayList <Integer> verticalOrder(Node root)
    {
       Queue<Pair> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

        q.add(new Pair(0, root));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            if(!map.containsKey(cur.hd)){
                map.put(cur.hd, new ArrayList<>());
            }
            map.get(cur.hd).add(cur.node.data);
            if(cur.node.left != null){
                q.add(new Pair(cur.hd-1, cur.node.left));
            }
            if(cur.node.right != null){
                q.add(new Pair(cur.hd+1, cur.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()){
            ans.addAll(map.get(key));
        }
        return ans;
    }
    class Pair{
        int hd;
        Node node;

        public Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
}
