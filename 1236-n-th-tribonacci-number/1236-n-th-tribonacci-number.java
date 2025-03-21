class Solution {
    public int tribonacci(int n) {
        if (n==0){
            return 0;
        }
        else if (n==1 || n==2){
            return 1;
        }

        int FirstTerm = 0;
        int SecondTerm = 1;
        int ThirdTerm = 1;

        for(int i=0; i<n; i++){

            int FourthTerm = FirstTerm + SecondTerm + ThirdTerm ;

            FirstTerm = SecondTerm;
            SecondTerm = ThirdTerm;
            ThirdTerm = FourthTerm;

        }
         return FirstTerm ;
        
    }
}