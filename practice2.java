import java.util.*;
class practice2{
    public static void main(String[]args){
        int[] num={2,3,1,4,2,5,56,752,2};
        int min=num[0];
        
        for(int i=1;i<num.length;i++){
            if(min<num[i]){
                min=num[i];
                
            }
        }
        System.out.println(min);
    }
}