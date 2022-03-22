import java.util.*;

public class QueueTodo<E> {
    private Queue<E> queueList; 
 
    //constructor 
    public QueueTodo() { 
        queueList = new LinkedList<E>(); 
    } 
 
    // menambah objek pada antrian(queue)
    public void enqueue(E object) { 
        queueList.add(object); 
    } 
 
    // menghapus objek pada antrian(queue)
    public E dequeue() throws NoSuchElementException {
        return queueList.remove();
    } 
 
    // memastikan jika queue is empty 
    public boolean isEmpty() { 
        return queueList.isEmpty(); 
    } 
 
    /*mencetak queue menggunakan Iterator(agar tidak bisa melakukan
    perubahan pada isi queue), menggunakan hasNext karena sesuai dengan
    konsep queue yaitu FIFO atau bisa disebut (maju)
    */
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("\nbelum ada kegiatan nih!");
            return;
        }

        Iterator<E> iterator = queueList.iterator(); 
        while (iterator.hasNext()) { 
            Object value = iterator.next(); 
            System.out.print("\n" + value); 
        } 
    }
}
