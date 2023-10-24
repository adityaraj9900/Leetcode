class Solution {
    public List<Integer> largestValues(TreeNode root) { //use bfs queue use hoga    
        List<Integer> result=new ArrayList<>();  //reuslt heighest in a row ko store karega
        if(root==null){
            return result;
        }
        Queue<TreeNode>q=new LinkedList<>();  //create a queue
        q.offer(root);   //add first root  
        while(!q.isEmpty()){ //when my queue is not empty then go to next step
            int size=q.size(); //intialize the size of queue
            int max=Integer.MIN_VALUE;  //intialize max
            for(int i=0;i<size;i++){   //traverse the loop
                TreeNode node=q.poll();  
                max=Math.max(max,node.val);  //find the max 
                if(node.left!=null){  //left child
                    q.offer(node.left);
                }
                if(node.right!=null){   //right child
                    q.offer(node.right);
                }
            }
            result.add(max); //add the max value in the result arraylist
        }
        return result; 
    }
}