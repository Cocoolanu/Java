/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
eg:
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/

public String stringX(String str) {
  int len = str.length();
  if (len < 3) return str; 
  return str.substring(0,1) + str.substring(1,len-1).replace("x","") + str.substring(len-1);
}
