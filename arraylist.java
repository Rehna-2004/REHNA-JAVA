import java.util.*;
public class arraylist{
    public static void main(String[]args){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("vibgior");
        arrayList.add("indigo");
         arrayList.add("vilote");
         arrayList.add("green");
         System.out.println("first element is"+arrayList.get(0));
         System.out.println("the element of the arraylist is-"+arrayList);
         Collections.sort(arrayList);
         System.out.println("\nThe ArrayList sortted:"+arrayList);
         Collections.addAll(arrayList,"red","blue","orenge","yellow");
         System.out.println("\nAdding new items in the  ArrayList is:"+arrayList);
          Collections.sort(arrayList,Collections.reverseOrder());
          System.out.println("\nThe  reverse order of the ArrayList:"+arrayList);
          System.out.println("\nThe  maximum element of the ArrayList:"+Collections.max(arrayList));
          for(String word:arrayList)
          {
            System.out.println(word);
          }

          arrayList.set(0,"white");
          System.out.println("the element of the arraylist is"+arrayList);
          arrayList.remove(3);
           System.out.println("the element of the arraylist is"+arrayList);

    }
}