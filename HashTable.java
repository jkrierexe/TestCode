public class HashTable{
    public static void main(String[] args){
        Object[] hashTable = new Object[10];

        Character c = new Character('1');
        hashTable[c.hashCode()%10] = c;

        Integer num =113;
        hashTable[num.hashCode()%10] = num;

        String s = "e";
        hashTable[s.hashCode()%10] = s;

        String j = "Jayden is a POO";
        hashTable[j.hashCode()%10] = j;




        for(Object thing : hashTable){
            System.out.println(thing);
        }
        String l = "Jackson";
        System.out.println(l.hashCode());
        
    }
}