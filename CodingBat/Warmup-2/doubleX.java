/*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
eg:
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/

boolean doubleX(String str) {
  if (!str.contains("x")) return false;
  
  int firstX = str.indexOf("x");
  if(firstX < str.length()-1){
    return str.substring(firstX, firstX+2).equals("xx"); 
  }else{
    return false; 
  }
}
