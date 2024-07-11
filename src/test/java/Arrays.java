public class Arrays {

    public static void main(String[] args) {
        int[] arr={12,35,21,87};

        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if( arr[i] <min){
                min=arr[i];

            }

            if(arr[i] >max){
                max=arr[i];
            }
        }

        System.out.println("The smallest is :"+min);
        System.out.println("The largest is:"+max);


        String ss[]=new String[3];
        ss[0]="one";
        ss[1]="two";
        ss[2]="three";
        System.out.println(ss[1]);

        for(String S:ss){
            System.out.println(S);
        }



    }
}
