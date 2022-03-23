import java.util.*;

public class QueueTodo<E> {
    private Queue<E> toDoList; 
 
    public QueueTodo() { 
        toDoList = new LinkedList<E>(); 
    } 
 
    // menambah objek pada antrian(queue)
    public void addTodo(E object) { 
        toDoList.add(object); 
    } 
 
    // menghapus objek pada antrian(queue)
    public E delTodo() throws NoSuchElementException {
        return toDoList.remove();
    } 
 
    // memastikan jika queue is empty 
    public boolean isEmpty() { 
        return toDoList.isEmpty(); 
    } 
 
    /*mencetak queue menggunakan Iterator(agar tidak bisa melakukan
    perubahan pada isi queue), menggunakan hasNext karena sesuai dengan
    konsep queue yaitu FIFO atau bisa disebut (maju)
    */
    public void printTodo() {
        if (isEmpty()) {
            System.out.println("\nbelum ada kegiatan nih!");
            return;
        }

        Iterator<E> iterator = toDoList.iterator(); 
        while (iterator.hasNext()) { 
            Object value = iterator.next(); 
            System.out.print("\n" + value); 
        } 
    }
}
