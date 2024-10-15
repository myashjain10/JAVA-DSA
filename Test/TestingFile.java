package JavaDSA.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TestingFile {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        ArrayList<Long> result = new ArrayList<>();

        //process first window i.e. K elements
        for(int i = 0; i < K; i++){

            if(A[i] < 0) dq.add(i);
        
        }

        if(!dq.isEmpty()){
            result.add(A[dq.getFirst()]);
        }else{
            result.add(0l);
        }

        //process the rest of the elements

        for(int i = K; i < N; i++){
            if(!dq.isEmpty() && i-dq.getFirst() >= K){
                dq.removeFirst();
            }

            if(A[i] < 0) dq.add(i);

            if(!dq.isEmpty()){
                result.add(A[dq.getFirst()]);
            }else{
                result.add(0l);
            }
        }
        long[] ans = new long[result.size()];
        for(int i=0; i< result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
