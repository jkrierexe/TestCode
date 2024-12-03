import java.util.LinkedList;


public class HashTableThree{
    public static void main(String[] args){
        LinkedList[] hashTable = new LinkedList[11];
        for(int i=0; i<hashTable.length; i++){
            hashTable[i] = new LinkedList();
        }

        Integer num = 42;
        hashTable[num.hashCode()%11].add(num);
         
        num = 24;
        hashTable[num.hashCode()%11].add(num);

        num = 17;
        hashTable[num.hashCode()%11].add(num);

        num = 2;
        hashTable[num.hashCode()%11].add(num);

        num = 99;
        hashTable[num.hashCode()%11].add(num);

        num = 12;
        hashTable[num.hashCode()%11].add(num);

        num = 32;
        hashTable[num.hashCode()%11].add(num);

        num = 52;
        hashTable[num.hashCode()%11].add(num);

        num = 92;
        hashTable[num.hashCode()%11].add(num);

        String s = "WOW!";
        hashTable[s.hashCode()%11].add(s);

        Double d = 65.0;
        hashTable[d.hashCode()%11].add(d);


        for(LinkedList list : hashTable){
            for(Object thing: list){
                System.out.print(thing + " -> ");
            }
            System.out.println();
        }
    }
}