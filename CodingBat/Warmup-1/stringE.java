/*
Return true if the given string contains between 1 and 3 'e' chars.
eg:
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/

public boolean stringE(String str) {
  /*
  //use Java8 features
  long count = str.chars().filter(ch -> ch == 'e').count();
  return (count>=1 && count<=3);
  */
  int count = 0;
  for(int i=0; i< str.length(); i++){
    if(str.charAt(i)=='e') count +=1;
  }
  return (count>=1 && count<=3);
}
