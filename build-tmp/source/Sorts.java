import java.util.*;
import java.util.Arrays;

public class Sorts{

  public void selectionSort(int[] list){

    int index=0;
    for(int i = 0; i<list.length-1; i++){
      for(int a = i+1; a<list.length; a++){
        if(list[a]<list[index]){
          index = a;
        }
      }
      int temp = list[index];
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
        temp=list[a-1];
        list[a-1]=list[a];
        list[a]=temp;
      }
    }
    //System.out.println(Arrays.toString(list));
  }

  private void merge(int[] a, int first, int mid, int last){
    int[] temp = new int[last-first+1];
    int index=0;
    int f = first;//first index
    int m = mid;//first index of 2nd half
    while(f<mid || m<=last){//while temp array isn't yet filled
      if((f<mid) && (m>last || a[f] < a[m])){//if first is less or second array gone
        temp[index]=a[f];
        f++;
      } else { //if first gone or second less
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

  public void quickSort(int[] a, int low, int high){
    int start = low;
    int finish = high;
    int comparator = a[(high+low)/2];
    int temp;
    while(start<=finish){
      while(a[start]<comparator){
        start++;
      }
      while(a[finish]>comparator){
        finish--;
      }
      //System.out.println(start+ " " + finish);
      if(start<=finish){
        temp=a[start];
        a[start]=a[finish];
        a[finish]=temp;
        start++;
        finish--;
      }
    }
    //System.out.println(Arrays.toString(a));
    if(low<finish){
      quickSort(a,low,finish);
    }
    if(high>start){
      quickSort(a,start,high);
    }
  }

  public void shellSort(int[] a){
    int jump = (a.length/2);
    int temp;
    while(jump>0){
      if(jump>2){
        for(int i = 0; i<a.length-jump; i++){
          if(a[i]>a[i+jump]){
            temp=a[i];
            a[i]=a[i+jump];
            a[i+jump]=temp;
          }
        }
      } else {
        for(int i = 1; i<a.length; i++){
          for(int b=i; b>0; b--){
            if(a[b-1]<a[b])
              break;
            temp=a[b-1];
            a[b-1]=a[b];
            a[b]=temp;
          }
        } 
      }

      if(jump>2){
        jump=jump/2;
      }else{
        jump--;
      }
    }
  }
}
