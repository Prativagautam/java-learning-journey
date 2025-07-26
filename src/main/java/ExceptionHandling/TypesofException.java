package ExceptionHandling;

public class TypesofException {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    String strs = null;
    try{
        System.out.println(arr[5]);
        System.out.println(strs.length());
    }
   catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Oops!" + e  );
   }
   catch(NullPointerException e)
   {
    System.out.println(e);
   }
  }
}
