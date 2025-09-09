public class Assi3 {
    public static int getlargest(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
              
    }
    return largest;  
}
   public static int getsmallest(int num[]){
        int Smallest =Integer.MAX_VALUE;

        for(int i =0 ; i<num.length;i++){
            if(Smallest>num[i]){
                Smallest=num[i];
            }
          
    }
       return Smallest;
}
public static void main(String[] args) {
          int num []= { 5,7,3,2,8,9};
          System.out.println(" largest num is " + getlargest(num));
          System.out.println("smallest NUM IS   " + getsmallest(num));   
}
}
