public class ThreadBubSort extends Thread {
    private String[] arrayForSort;
    private Thread thread;

    public ThreadBubSort(String[] arrayForSort, String threadName) {
        this.arrayForSort = arrayForSort;
        thread = new Thread(this, threadName);
    }

    public void Start() {
        thread.start();
    }

    public void run() {
        System.out.println("Begin sorting with bubbles method - " + thread.getName());
        int i, j;
        String str;
        for (i = 0; i < arrayForSort.length; i++) {
            for (j = arrayForSort.length - 1; j > i; j--) {
                if (arrayForSort[j - 1].compareTo(arrayForSort[j]) < 0) {
                    str = arrayForSort[j];
                    arrayForSort[j] = arrayForSort[j - 1];
                    arrayForSort[j - 1] = str;
                }
            }
        }
        System.out.println("Finish sorting with bubbles method - " + thread.getName());
    }

    public String[] getArr() {
        return arrayForSort;
    }

    public Thread getThread() {
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
