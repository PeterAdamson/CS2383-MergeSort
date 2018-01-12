// Author Peter Adamson

public class MergeSort{

	public static void main(String[] args){
		int[] A = {3, 6, 10, 18, 8, 7, 25, 40};
		sort(A);
		show(A);	//display the sorted result A
	}

	public static void sort(int[] A){
		doMergeSort(A, 0, A.length - 1);
	}

	public static void show(int[] A){
		for(int i = 0; i < A.length; i++){
			System.out.println(A[i]);
		}
	}

	public static void doMergeSort(int[] A, int low, int high){
		if(low < high){
			int mid = low + (high - low) / 2;
			doMergeSort(A, low, mid);
			doMergeSort(A, mid + 1, high);
			merge(A, low, mid, high);
		}
	}

	public static void merge(int[] A, int low, int mid, int high){
		int[] tempArr = new int[A.length];		
		for(int i = low; i <= high; i++){
			tempArr[i] = A[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while(i <= mid && j <= high){
			if(tempArr[i] <= tempArr[j]){
				A[k] = tempArr[i];
				i++;
			}
			else{
				A[k] = tempArr[j];
				j++;
			}
			k++;
		}
		while(i <= mid){
			A[k] = tempArr[i];
			k++;
			i++;
		}
	}
}
