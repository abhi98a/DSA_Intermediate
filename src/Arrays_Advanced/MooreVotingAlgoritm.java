package Arrays_Advanced;

public class MooreVotingAlgoritm {

    public static void main(String[] args) {
        int[] arr = {4,6,5,3,4,5,6,4,4,4};

        int N = arr.length;
        int  element = arr[0];
        int freq =1;
        int count =0;

        for(int i=0;i<N;i++){
            if(freq ==0){
                element = arr[i];
                freq =1;
            }

            if(element ==arr[i]){
                freq++;
            }else{
                freq--;
            }
        }
        //Count frequency of the element

        for(int i=0;i<N;i++){
            if(arr[i] == element){
                count++;
            }
        }
        if(count > (N/2)){
            System.out.println("Majority Element is : " + element);
        }else{
            System.out.println("There is No Majority element");
        }


    }
}
