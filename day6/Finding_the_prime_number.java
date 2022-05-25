package day6.Assigment_day6;

public class Finding_the_prime_number {
    public boolean  prime_num(int num){

        int fac=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                fac++;
            }
        }

        if(fac==2){
            return true;
        }else{
            return false;
        }
    }
    void find_prime(int []arr){
        int []arr2 = new int[arr.length];
        int count=0;
         for(int i=0;i<arr.length;i++){
             if(prime_num(arr[i])==true){
                arr2[i]=arr[i];
                 System.out.println(arr2[i]);
                 count++;
             }
         }
         if(count==0){
             System.out.println("Prime number not found in the supplied Array");
         }
    }

    public static void main(String[] args) {
        int []arr={10,12,50,10,14,15};
//        for(int el :arr){
//            System.out.println(el);
//        }
        Finding_the_prime_number c1=new Finding_the_prime_number();
//        int num=38;
//        System.out.println(c1.prime_num(num));
        c1.find_prime(arr);
    }
}
