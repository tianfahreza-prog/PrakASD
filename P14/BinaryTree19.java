package P14;

public class BinaryTree19 {
    
    Node19 root;

    public BinaryTree19() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa19 mahasiswa) {
        Node19 newNode = new Node19(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        }else{
            Node19 current = root;
            while (true) {
                Node19 parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node19 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            }else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node19 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node19 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node19 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    public Node19 getSuccessor(Node19 del) {
        Node19 successor = del.right;
        Node19 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        
        Node19 parent = root;
        Node19 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // Kasus 1: Node adalah leaf (tidak punya anak)
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            }

            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }

            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }

            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }
        }
    }
    // Metode rekursif untuk menambahkan data mahasiswa ke dalam binary tree
    public void addRekursif(Mahasiswa19 mahasiswa) {
        root = addRekursifHelper(root, mahasiswa);
    }   

    private Node19 addRekursifHelper(Node19 current, Mahasiswa19 mahasiswa) {
        // 1. Jika menemukan ruang kosong, langsung buat node baru di sini
        if (current == null) {
            return new Node19(mahasiswa);
        }

        // 2. Jika IPK lebih kecil, belok ke kiri
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifHelper(current.left, mahasiswa);
        } 
        // 3. Jika IPK lebih besar atau sama, belok ke kanan
        else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursifHelper(current.right, mahasiswa);
        }

        return current;
    }
    // Metode untuk mencari mahasiswa dengan IPK terkecil
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }
        Node19 current = root;
        // Jalan ke kiri terus sampai habis
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("=== Mahasiswa IPK Terkecil ===");
        current.mahasiswa.tampilInformasi();
    }

    // Metode untuk mencari mahasiswa dengan IPK terbesar
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }
        Node19 current = root;
        // Jalan ke kanan terus sampai habis
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("=== Mahasiswa IPK Terbesar ===");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("=== Mahasiswa dengan IPK di atas " + ipkBatas + " ===");
        tampilIPKdiAtasHelper(root, ipkBatas);
    }

    private void tampilIPKdiAtasHelper(Node19 node, double ipkBatas) {
        if (node != null) {
            tampilIPKdiAtasHelper(node.left, ipkBatas); // Cek anak kiri
            
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            
            tampilIPKdiAtasHelper(node.right, ipkBatas); // Cek anak kanan
        }
    }
}
