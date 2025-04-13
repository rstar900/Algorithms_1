// Concrete implementation of UF using QuickFind

public class QuickFindUF extends UF {
    // Constructor calling the constructor of the base class to initialize
    // internal array
    public QuickFindUF(int n) {
        super(n);
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        // If the components are not connected, then connect them
        // including all the connected components whose set equals
        // that of p (i.e. for id[i] == id[p])
        if (!connected(p,q)) {
            for (int i = 0; i < id.length; ++i) {
                if (id[i] == pid) {
                    id[i] = qid;
                }
            }
        }
    }

    public boolean connected(int p, int q) {
        // If they belong to the same set of connected components
        // then they are connected
        return id[p] == id[q];
    }
}
