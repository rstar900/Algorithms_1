// This is an abstract class which all the concrete implementations
// of UnionFind will have to inherit and implement
// Did not choose an interface, as that does not let us declare a constructor

public abstract class UF {
    // Internal array for storing node info
    // Although unlike C++, this is accessible to inheritors,
    // but also to others within the same package
    protected int[] id;

    // API

    public UF(int n) {
        // Initialize the internal array with id[i] = i
        id = new int[n];

        for (int i = 0; i < n; ++i) {
            id[i] = i;
        }
    }

    public abstract void union(int p, int q);

    public abstract boolean connected(int p, int q);

}
