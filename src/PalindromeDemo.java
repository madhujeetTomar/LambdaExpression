public class PalindromeDemo {

    public static void main(String[] args) {

        findPalindrome("MAADAM",  0,5);
    }

    private static void findPalindrome(String str, int i, int i1) {

while (i!=str.length()-1 && i1!=0)
{
    if(str.charAt(i) == str.charAt(i1))
    {
i++;
i1--;

    }
    else
    {
        for (int j = 0; j <str.length() ; j++) {

        }
        System.out.println(str.charAt(i));
        break;
    }
}

    }


}
