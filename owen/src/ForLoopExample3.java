public class ForLoopExample3 {
    public static void main(String args[]){
        int arr[]={2,11,45,9};
        String arr1[]={"hi","hello","bye"};
        //i startd with 0 as array index starts with 0 too
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int num:arr){
            System.out.println(num);
        }
        for (String str:arr1){
            System.out.println(str);
        }
    }
}
