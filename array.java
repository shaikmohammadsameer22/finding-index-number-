public class array{
    public static int index(int array[]){
        int target = 12;
        for(int i =0;i<array.length;i++){
            if(target == array[i]){
                return i;
            }
        }
        return -1;
        

    }
    public static void main(String args[]){
        int array[]={2,4,6,8,12,14,16};
       int idx= index(array);
       if(idx == -1){
        System.out.println("your targeted element is not found");
       }else{
        System.out.println("your targeted index is " + idx);
       }

    }
}