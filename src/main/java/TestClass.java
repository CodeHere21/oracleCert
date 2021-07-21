public class TestClass {
    public static void main (String[] args) {
       // System.out.println("Hello World");
//        int x=0;
//        while ( ++x < 5 )
//        {
//            x+=1;
//        }
//        String message = x > 5 ? "Greater than" : "Less Than";
//        System.out.println(message+","+x);

  //      System.out.println(1+2+"3"+4+5);
//        java.util.List<String> values = new java.util.ArrayList<String>();
//        values.add("Lisa");
//        values.add("Kevin");
//        values.add("Roger");
//        for(String value : values) {
//            System.out.print(value + ", ");
//        }
//        java.util.List<String> names = new java.util.ArrayList<String>();
//        names.add("Lisa");
//        names.add("Kevin");
//        names.add("Roger");
//        for(int i=0; i<names.size(); i++) {
//            String name = names.get(i);
//            if(i>0) {
//                System.out.print(", ");
//            }
//            System.out.print(name);
//        }
        int x=20;
        while(x>0){
            do{
                x-=2;
            } while (x>5);
            x--;
            System.out.print(x+"\t");
        }
    }
}
