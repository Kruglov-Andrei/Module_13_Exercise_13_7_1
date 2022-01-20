public class ThreadInsertSort extends Thread{
    private String[] arrayForSort;
    private Thread thread;

    public ThreadInsertSort(String[] arrayForSort, String threadName){
        this.arrayForSort = arrayForSort;
        thread = new Thread(this, threadName);
    }

    public void Start() {
        thread.start();
    }
    public void run() {
        System.out.println("Begin sorting with insertion method - " + thread.getName());
        int i, j;
        String str;
        for (i = 0; i < arrayForSort.length; i++) {
            str = arrayForSort[i];
            for (j = i - 1; j >= 0 && arrayForSort[j].compareTo(str) < 0; j--) {
                arrayForSort[j + 1] = arrayForSort[j];
            }
            arrayForSort[j + 1] = str;
        }
        System.out.println("Finish sorting with insertion method - " + thread.getName());
    }
    public String[] getArr(){
        return arrayForSort;
    }
    public Thread getThread(){
        return thread;
    }
    public void Print(){
        System.out.print(thread.getName() + " = [ ");
        for (String str : arrayForSort){
            System.out.print(str + " ");
        }
        System.out.print(" ]");
        System.out.println(" ");
    }
}
