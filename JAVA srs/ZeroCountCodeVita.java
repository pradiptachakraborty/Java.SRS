import java.util.Scanner;
class ZeroCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int K = scanner.nextInt();
        int result = minimizeConsecutiveZeros(l, K);
        System.out.println(result);
        scanner.close();
    }
    private static int minimizeConsecutiveZeros(int l, int K) {
        int length =l;
        char[] binaryArray = B.toCharArray();
        int kthOnePosition = 0;
        for (int i = length - 1; i >= 0; i--){
            if (binaryArray[i] == '1'){
                K--;
                if (K == 0){
                    kthOnePosition = i;
                    break;
                }
            }
        }
        int leftZeros = 0;
        int rightZeros = 0;
        for (int i = kthOnePosition - 1; i >= 0 && binaryArray[i] == '0'; i--) {
            leftZeros++;
        }
        for (int i = kthOnePosition + 1; i < length && binaryArray[i] == '0'; i++) {
            rightZeros++;
        }
        int result = leftZeros + rightZeros + 1;
        return result;
    }
}