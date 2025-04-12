// This is an abstract class which all the concrete implementations
// of UnionFind will have to inherit and implement
// Did not choose an interface, as that does not let us declare a constructor
public abstract class UF {
    // Size for the internal array for storing the nodes
    private final int size;

    // API

    public UF(int n) {
        this.size = n;
    }

    public abstract void union(int p, int q);

    public abstract boolean connected(int p, int q);

}
