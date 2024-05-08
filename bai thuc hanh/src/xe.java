// public abstract class xe {
//     abstract void run();
// }
//     class honda extends xe{
//         void run(){
//             System.out.println("xe chay");
//         }
//         public static void main(String[] args) {
//             xe obj = new honda();
//             obj.run();
//         }
//     } 
    /**
     * xe
     */
    public interface xe {
       public void xe();
    }
    class future implements xe{
       public void print(){
        System.out.println("xe chay vu vu ");
       }
       public static void main(String[] args) {
        future xehonda = new future();
        xehonda.print();
       }
    @Override
    public void xe() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'xe'");
    }
    }
    