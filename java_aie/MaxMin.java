public class MaxMin{
	public static void main(String[] args){
		int[] arr = new int[] {10,65,32,20,19,112,99,3,7};
		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			else if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
	}
}
