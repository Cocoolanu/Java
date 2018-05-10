/*
Given three int values, a b c, return the largest.
eg:
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
*/

public int intMax(int a, int b, int c) {
  int max; 
  if(a>b){
    max = a;
  }else{
    max = b;
  }
  
  if(max<c){
    max = c;
  }
  
  return max; 
  
}
