class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

        for(int s:stones)
            maxHeap.add(s);

        while(maxHeap.size()>1)
        {
            int y=maxHeap.poll();
            int x=maxHeap.poll();

            if(y!=x)
                maxHeap.add(y-x);
        }
        if(maxHeap.isEmpty())
            return 0;
        
        return maxHeap.peek();
    }
}
