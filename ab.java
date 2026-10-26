class ab{
public static void main(String []args){
int arr[]={7,8,9,15,67};
int min=arr[0];
for(int i=0;i<arr.length;i++){
min=Math.min(min,arr[i]);
}
System.out.println(min);
}
}