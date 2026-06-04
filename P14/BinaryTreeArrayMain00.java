package P14;

public class BinaryTreeArrayMain00 {
    public static void main(String[] args) {
        BinaryTreeArray00 bta = new BinaryTreeArray00();

        // Kita tambah data satu per satu pakai method add() tugas kita!
        bta.add(new Mahasiswa19("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa19("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa19("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa19("244160220", "Dewi", "B", 3.35));

        System.out.println("\n=== Inorder Traversal Setelah Add ===");
        bta.traverseInOrder(0);

        System.out.println("\n=== PreOrder Traversal Tugas 4b ===");
        bta.traversePreOrder(0);
    }
}