class SeatManager {
    private PriorityQueue<Integer>pq;
    public SeatManager(int n) {
      pq=new PriorityQueue<>();
        for (int i=1;i<=n;i++) {
            pq.add(i);
        }  
    }
    public int reserve() {
      int seat=pq.poll();
        return seat;  
    } 
    public void unreserve(int seatNumber) {
       pq.add(seatNumber); 
    }
}

