/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
eg:
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
*/

public boolean makes10(int a, int b) {
  if(a==1 || b==10 || b==1 || a==10 || a+b==10){
    return true;
  }
  return false;
}