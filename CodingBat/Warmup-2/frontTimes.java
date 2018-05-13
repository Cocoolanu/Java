/*

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
eg:
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
*/

public String frontTimes(String str, int n) {
  /*
  String front;
  String result = "";
  
  if(str.length()<3){
    for(int i=0; i<n; i++){
      result += str;
    }
  }else{
    front = str.substring(0,3);
    for(int i=0; i<n; i++){
      result += front; 
    }
  }
  return result; 
  */
  
  int frontLen = 3;
  String front;
  String result = ""; 
  
  if (frontLen > str.length()){
    frontLen = str.length();
  }
  
  front = str.substring(0, frontLen);
  
  for(int i =0; i<n; i++){
    result += front; 
  }
  return result; 
}
