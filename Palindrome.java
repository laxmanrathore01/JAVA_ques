class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
<<<<<<< HEAD
  int n=454; 
  
  temp=n;    
  while(n>0){    
   r=n%10;  
=======
  int n=454;
  
  temp=n;    
  while(n>0){    
   r=n%10;   
>>>>>>> 05c8527 (save this)
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  