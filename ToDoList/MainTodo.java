import java.util.*;

public class MainTodo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QueueTodo<String> toDolist = new QueueTodo<>();
        String pilih;
        String conf;
        boolean loopOut = true;

        while (loopOut) {
            System.out.print("====== TO DO LIST ======");   
            toDolist.printTodo();
            System.out.println("\nPilih menu:\n1. Tambah kegiatan \n2. Eksekusi kegiatan");
            pilih = in.nextLine();

            if (pilih.equalsIgnoreCase("1")) {
                System.out.print("Masukan kegiatan: ");
                toDolist.addTodo(in.nextLine());        
            }
            else if(pilih.equalsIgnoreCase("2")){
                toDolist.delTodo();
            } 
            else{
                System.out.println("Pilihan tidak tepat!\n");
            }
            System.out.print("====== TO DO LIST ======");   
            toDolist.printTodo();

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
