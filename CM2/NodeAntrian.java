package CM2;

public class NodeAntrian {
    int noAntrian;
    Pembeli pembeli;
    NodeAntrian prev;
    NodeAntrian next;

    public NodeAntrian(int noAntrian, Pembeli pembeli) {
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
    }
}