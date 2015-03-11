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
    if(last-first>2){
      //System.out.println(first + " " + last);
      mergeSort(a,first,last/2-1);
      mergeSort(a,last/2,last);
    }
    System.out.println(first + " " + last);
    merge(a,first,(last-first)/2,last);
    /*
    while(length < last-first){
      for(int i = 0; i < a.length-length-1; i+=length)
        merge(a,i,i+length/2,i+length-1);
      length*=2;

    }
     for(int i = 0; i < a.length-1; i+=2)
       merge(a,i,i+1,i+1);
     for(int i = 0; i < a.length-3; i+=4)
       merge(a,i,i+2,i+3);
    */
    

  }
}

