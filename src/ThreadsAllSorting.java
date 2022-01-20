public class ThreadsAllSorting {
    public static void main(String[] args) {
        String[] arrayForSort1 = {"glf", "sag", "thv", "dgf", "vbn", "mnc", "ldn"};
        String[] arrayForSort2 = {"glf", "sag", "thv", "dgf", "vbn", "mnc", "ldn"};
        String[] arrayForSort3 = {"glf", "sag", "thv", "dgf", "vbn", "mnc", "ldn"};

        ThreadSelectSort thread1 = new ThreadSelectSort(arrayForSort1, "thread1:SelectionSort");
        ThreadInsertSort thread2 = new ThreadInsertSort(arrayForSort2, "thread2:InsertionSort");
        ThreadBubSort thread3 = new ThreadBubSort(arrayForSort3, "thread3:BubbleSort");

        thread1.Start();
        thread2.Start();
        thread3.Start();
        try{
            thread1.getThread().join();
            thread2.getThread().join();
            thread3.getThread().join();
        }catch (InterruptedException e){
            System.out.println("Error: " + e.getMessage());
            return;
        }
        thread1.Print();
        thread2.Print();
        thread3.Print();
        }
    }
