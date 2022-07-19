package rdc.aeroporto;

public abstract class Item {
 public int id;
 private static int count;
 
 
 public Item() 
 {
   count++;
 }
 public static int getTotalNumberOfItems()
 {
   return (count);
 }
 public int getID() 
 {
   return (count-1);
 }
}
