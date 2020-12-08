package string;

public class stringPermutation {
    private void permute(String str, int left, int right) {
        if (left == right)
            System.out.println(str);
        else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        stringPermutation permutation = new stringPermutation();
        permutation.permute(str, 0, str.length() - 1);
    }
}


//  str = swap(str, left, i);
//  permute(str, left + 1, right);
//  str = swap(str, left, i);

//level 1
//permute(ABC ,0 , 2);
//i = 0;
//swap(A ,A); left position is also A , i th position os also A
//permute(ABC,1,2) MEANS we have fixed A in first position now we want permute method to permute
// string that begins at 1 and ends at 2
//swap(A,A) so that original condition is restored.


//permute(ABC ,0 , 2);
//i = 1;
//swap(A ,B); left position is also A , i th position os B
//permute(BAC,1,2) MEANS we have fixed B in first position now we want permute method to permute
// string that begins at 1 and ends at 2
//swap(B,A) so that original condition is restored.


//permute(ABC ,0 , 2);
//i = 2;
//swap(A ,C); left position is also A , i th position os C
//permute(CAB,1,2) MEANS we have fixed C in first position now we want permute method to permute
// string that begins at 1 and ends at 2
//swap(C,A) so that original condition is restored.

//level 2

