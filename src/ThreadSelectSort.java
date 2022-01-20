public class ThreadSelectSort extends Thread{
    private String[] arrayForSort;
    private Thread thread;

    public ThreadSelectSort(String[] arrayForSort, String threadName){
        this.arrayForSort = arrayForSort;
        thread = new Thread(this, threadName);
    }

    public void Start() {
        thread.start();
    }
    public void run(){
        System.out.println("Begin sorting with selection method - " + thread.getName());
        int i, j, k;
        String str;
        for (i = 0; i < arrayForSort.length; i++){
            k = i;
            str = arrayForSort[i];
            for (j = i + 1; j < arrayForSort.length; j++){
                if (arrayForSort[j].compareTo(str) > 0){
                    k = j;
                    str = arrayForSort[j];
                }
            }
            arrayForSort[k] = arrayForSort[i];
            arrayForSort[i] = str;
        }
        System.out.println("Finish sorting with selection method - " + thread.getName());
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
