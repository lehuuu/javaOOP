import java.util.LinkedList;

public class slide38_chuong4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
               list.add("java");
               list.add("C++");
               list.add("PHP");
               list.add("java");
               System.out.println("vi du : ");
               System.out.println("------------------------");
               LinkedList<String> listA = new LinkedList<>();
               listA.addAll(list);
               System.out.println("listA :");
               showList(listA);
               System.out.println("vi du la :");
               System.out.println("------------------------");
               LinkedList<String> listB = new LinkedList<>();
               listB.add("java");
               listA.retainAll(listB);
               System.out.println("listA:");
               showList(listA);
               System.out.println("vi du la :");
               System.out.println("-------------------------");
               list.removeAll(listB);
               System.out.println("list");
               showList(list);
    }
    public static void showList(LinkedList<String>list){
        for(String obj : list ){
            System.out.println(""+obj+"");
        }
        System.out.println();
    }

        
    }
               



