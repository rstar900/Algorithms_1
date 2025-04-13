import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickFindUFTest {
  @Test
    void testQuickFindUFCreated() {
      // Create an object with 10 nodes
      // and verify the contents of the internal array
      QuickFindUF uf = new QuickFindUF(10);
      assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, uf.id);
  }
  @Test
  void testQuickFindUFOps() throws FileNotFoundException {
    // Read the number of nodes from the file
    // and create the object with n number of nodes
    File inputFile = new File("inputs/input_quick_find.txt");
    Scanner in = new Scanner(inputFile);
    int n = in.nextInt();
    QuickFindUF uf = new QuickFindUF(n);
    // Depending on the further input (p, q) keep doing union(p,q)
    while (in.hasNext()) {
      int p = in.nextInt();
      int q = in.nextInt();
      uf.union(p,q);
    }
    // Check the internal array after the union operations
    assertArrayEquals(new int[]{1,1,1,8,8,1,1,1,8,8}, uf.id);
  }

}
