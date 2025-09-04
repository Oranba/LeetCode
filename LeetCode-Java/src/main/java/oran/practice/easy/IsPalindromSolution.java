package oran.practice.easy;

public class IsPalindromSolution {
    public boolean isPalindrom(int x){
        //brute force solution
        //x= 101
        if(x<0 || (x!=0 && x%10==0)){
            return false;
        }
        int rev=0;
        while(x>rev){
            rev = rev*10 + x%10;
            x = x /10;
        }
        return (x==rev || x == rev/10);
    }
    public static void main(String[] args) {
        IsPalindromSolution isPalindromSolution = new IsPalindromSolution();
        int x =110011;
        System.out.printf("Is %s a palindrome: %s%n",x,isPalindromSolution.isPalindrom(x));
    }
}
