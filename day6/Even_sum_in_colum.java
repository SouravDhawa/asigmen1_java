package day6.Assigment_day6;

public class Even_sum_in_colum {
    public void sum(int[][] arr){
        int N=arr.length;
        int M=arr[0].length;
    for(int i=0;i<N;i++){
        int sum=0;
        for(int j=0;j<M;j++){
//            System.out.println(arr[j][i]);
        if(arr[j][i]%2==0){
                sum+=arr[j][i];
                }
            }
        System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Even_sum_in_colum d1=new Even_sum_in_colum();

        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        d1.sum(arr);
    }
}

