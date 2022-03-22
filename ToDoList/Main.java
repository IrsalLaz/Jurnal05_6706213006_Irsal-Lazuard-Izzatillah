import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QueueTodo<String> toDolist = new QueueTodo<>();
        int pilih;
        String conf;
        boolean loopOut = true;

        while (loopOut) {
            System.out.print("====== TO DO LIST ======");   
            toDolist.printQueue();
            System.out.println("\nPilih menu:\n1. Tambah kegiatan \n2. Eksekusi kegiatan");
            pilih = in.nextInt();
            in.nextLine();

            if (pilih == 1) {
                System.out.print("Masukan kegiatan: ");
                toDolist.enqueue(in.nextLine());        
            }
            else if(pilih == 2){
                toDolist.dequeue();
            } 
            else{
                System.out.println("Pilihan tidak tepat!\n");
            }
            System.out.print("====== TO DO LIST ======");   
            toDolist.printQueue();

            System.out.println("\nMau lanjut?\n(y/n)");
            conf = in.nextLine();
            if (conf.equals("y")) {
                loopOut = true;
            }
            else if(conf.equals("n")){
                loopOut = false;
            }
            else{
                System.out.println("Pilihan tidak tepat");
                loopOut = true;
            }
        }  
        in.close();
    }   
}
