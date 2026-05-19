package P11;

public class SLLMain19 {
    public static void main(String[] args) {

        SingleLinkedList19 sll = new SingleLinkedList19();

        // Data mahasiswa
        Mahasiswa19 mhs1 = new Mahasiswa19("22212202", "Cintia", "3C", 3.5);
        Mahasiswa19 mhs2 = new Mahasiswa19("22212205", "Alvaro", "1A", 4.0);  // dummy, diganti insertAt
        Mahasiswa19 mhs3 = new Mahasiswa19("23212201", "Bimon",  "2B", 3.8);
        Mahasiswa19 mhs4 = new Mahasiswa19("21212203", "Dirga",  "4D", 3.6);

        System.out.println("=== PRAKTIKUM 2.1 ===");

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs2);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs1);
        sll.print();

        // TambahDariKeyboard (Pertanyaan 2.1.2 no.3)
        sll.addFromKeyboard();
        sll.print();

    
    }
}
