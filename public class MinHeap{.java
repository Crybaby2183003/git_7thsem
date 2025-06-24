public class MinHeap{
    ArrayList<Integer> data =new ArrayList<Integer>();
    public boolean isEmpty() { 
        return data.isEmpty();
    }
    public int size() {
        return data.size();
    }
    public void add(int n){
        data.add(n);
        upHeapify(data.size() - 1);
    }
    private void upHeapify(int ci) {
        int pi=(ci-1)/2;
        while(ci>=0 && data.get(ci)<data.get(pi)){
    }
}