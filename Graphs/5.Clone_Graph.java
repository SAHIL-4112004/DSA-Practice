/**
 * Problem: Clone Graph (leetcode 133)
 * Link: https://leetcode.com/problems/clone-graph/submissions/1763746154/?envType=problem-list-v2&envId=graph
 * Approach : Graph
 */

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;

        Map<Node, Node> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<>();

        Node clone = new Node(node.val, new ArrayList<>());
        visited.put(node, clone);
        q.add(node);

        while(!q.isEmpty()){
            Node curr = q.remove();

            for(Node nei : curr.neighbors){
                if(!visited.containsKey(nei)){
                    visited.put(nei, new Node(nei.val, new ArrayList<>()));
                    q.add(nei);
                }
                visited.get(curr).neighbors.add(visited.get(nei));
            }
        }

        return clone;

    }
}