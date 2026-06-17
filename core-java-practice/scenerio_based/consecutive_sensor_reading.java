import java.util.Scanner;
public class consecutive_sensor_reading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(inc(arr, 0));
    }
    private static boolean inc(int[]arr,int idx){
        //base condition
       if(idx>=arr.length-1){
        return true;
       }
        if(arr[idx+1]-arr[idx]!=1){
            return false;
        }
        
       return inc(arr,idx+1);
    }
}
