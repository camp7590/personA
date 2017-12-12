import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorExample {

    static ArrayList<String> al = new ArrayList();
    static ListIterator li;
    static int pos=0;
    
    public static void main(String[] args) {
        al.add("a");
        al.add("b");
        al.add("c");
        li = al.listIterator();
        showList();
        //move 1
        System.out.println("1 - Move over item " + li.next());
        pos++;
        //move 2
        System.out.println("2 - Move over item " + li.next());
        pos++;
        showList();
        //move 3
        System.out.println("3 - Removing last item travelled over: ");
        li.remove();
        pos--;
        showList();
        //move 4
        System.out.println("4 - Adding back to left of indactor");
        li.add("b");
        pos++;
        showList();
        //move 5
        System.out.println("5 - Move over item " + li.next());
        pos--;
        showList();
        //move 6
        System.out.println("6 - Move back over item " + li.previous());
        pos--;
        showList();
        //move 7
        System.out.println("Deleting last item travelled over");
        li.remove();
        showList();
        //move 8
        System.out.println("8 - Move back over item " + li.previous());
        pos--;
        showList();
        //move 9
        System.out.println("Set the last item travelled over to e");
        li.set("e");
        showList();
        //move 10 and 11
        System.out.println("Adding c and b back into the left of the Iterator");
        li.add("b");
        pos++;
        li.add("c");
        pos++;
        showList();
        //move 12
        System.out.println("12 - Trying to remove, but will cause error");
        System.out.println("Must do a previous or nect first");
        try{
            li.remove();
        }catch(Exception e){
            System.out.println("the following error occured");
            System.out.println(e);
        }
        showList();
        
        //move 13
        System.out.println("Moving next past " + li.next());
        pos++;
        showList();
        
        //move 14
        System.out.println("Trying to move past the end of the list");
        try{
            li.next();
        }catch(Exception e){
            System.out.println(e.toString());
        }
        showList();
        
        //move 15 bouns
        System.out.println("Travelling to the front of the list");
        while(li.hasPrevious()){
            System.out.println(li.previous());
            pos--;
            
        }
        showList();
        
        //move 16 bonus
        System.out.println("Removing last this ir saw");
        li.remove();
        System.out.println("");
        
        
        
    }
    
    public static void showList(){
        for (int i = 0; i < al.size(); i++) {
            if(i == pos)
                System.out.println("*");
            System.out.println(al.get(i));
        }
        if(pos==al.size()) System.out.println("*");
        System.out.println("");
    }
    
}
