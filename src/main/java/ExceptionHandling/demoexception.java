package ExceptionHandling;

class NavinException extends Exception{
    public NavinException(String string){
        super(string);
    }
}
public class demoexception {
   public static void main(String[] args) {
    int i =6;
    int j= 0;
    int k =0;
    // String str= null;
    try{
        
        if(j==0)
            throw new NavinException("denominator cant be zero");
    }
    // System.out.println(str.length());
    catch(NavinException e){
        System.out.println("unfortunately"+e);
    }
    System.out.println(k);
    System.out.println("bye");
   }
}
