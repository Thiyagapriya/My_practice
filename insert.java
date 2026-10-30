class Main {
   public static void main(String []args){
       int []arr={5,8,9,0,3,4,2,1,6};
       for(int i=0;i<arr.length;i++){
          int key=arr[i];
           int j=i-1;
           while(j>=0&&arr[j]>key){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=key;
           System.out.println("sorted Array:");
           for(int k=0;k<arr.length;k++){
               System.out.print(arr[k]+" ");
           }
           System.out.println();
       }
   }
}