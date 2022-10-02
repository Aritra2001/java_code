import java.util.*;
public class BinaryStrings {
    int A[];
    public BinaryStrings(int n) {
        A = new int[n];
    }
    public void Binary(int n) {
        if(n <= 0) {
            System.out.println(Arrays.toString(A));
        }
        else {
            A[n - 1] = 0;
            Binary(n - 1);
            A[n - 1] = 1;
            Binary(n- 1);
        }
    }
        public static void main(String[] args) throws java.lang.Exception {
            int n = 4;
            BinaryStrings obj = new BinaryStrings(n);
            obj.Binary(n);
        }

        
    }

