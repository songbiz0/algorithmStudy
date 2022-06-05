package concept;

 // 에라토스테네스의 체
 // "k=2부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다."

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    public static void makePrime(int number) {

        // true : 합성수, false : 소수
        boolean[] check = new boolean[number + 1];
        check[0] = check[1] = true;

        for(int i=2; i<=Math.sqrt(number); i++) {
            // 이미 체크된 배열이면(소수가 아닐 경우) skip
            if(check[i]) {
                continue;
            }

            // i의 배수들을 걸러주는 부분
            for(int j=i*i; j<check.length; j+=i) {
                check[j] = true;
            }
        }

        // 소수(false)인 경우 list에 추가
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< check.length; i++) {
            if(!check[i]) {
                list.add(i);
            }
        }
    }
}
