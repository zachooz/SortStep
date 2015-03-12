import java.util.*;
import java.util.Arrays;

public class Sorts{

  public void selectionSort(int[] list){
    int temp;
    int index;
    for(int i = 0; i<list.length; i++){
      temp = list[i];
      index = i;
      for(int a = i; a<list.length; a++){
        if(list[a]<temp){
          index = a;
          temp = list[a];
        }
      }
      list[index] = list[i];
      list[i] = temp;
    }
    //System.out.println(Arrays.toString(list));
  }
  public void bubbleSort(int[] list){
    for(int outer=list.length-1; outer>0;outer--){
      for(int inner=0; inner<outer; inner++){
        if(list[inner]>list[inner+1]){
          int temp = list[inner];
          list[inner]=list[inner+1];
          list[inner+1]=temp;
        }
      }
    }
    //System.out.println(Arrays.toString(list));
  }
  public void insertionSort(int[] list){
    int temp;
    if(list.length<=1)
      return;
    for(int i = 1; i<list.length; i++){
      for(int a=i; a>0; a--){
        if(list[a-1]<list[a])
          break;
        temp=list[a];
        list[a-1]=list[a];
        list[a]=list[a-1];
      }

    }
    //System.out.println(Arrays.toString(list));
  }

private void merge(int[] a, int first, int mid, int last){
  int[] temp = new int[last-first+1];
  int index=0;
  int f = first;
  int m = mid;
  int l = last;
  while(temp[temp.length-1]==0){
      if((f<mid) && (m>last || a[f] < a[m])){
      temp[index]=a[f];
      f++;
      } else {
      temp[index]=a[m];
      m++;
    }
        index++;
  }
  for(int i = 0; i<temp.length; i++){
    a[first+i]=temp[i];
  }
   //System.out.println(Arrays.toString(temp));
}

  public void mergeSort(int[] a, int first, int last){
    if (first < last) {
      // Get the index of the element which is in the middle
      int middle = first + (last - first) / 2;
      // Sort the left side of the array
      mergeSort(a,first, middle);
      // Sort the right side of the array
      mergeSort(a, middle + 1, last);
      // Combine them both
      merge(a, first, middle+1, last);
    }
  }
}

