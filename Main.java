import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Set<String > fruit1 = new HashSet<>();
//        fruits.add("apple");
//        fruits.add("banana");
//        fruits.add("kiwi");
        System.out.println("FRUITS");
        System.out.println("-------------");
        System.out.println("fruit :" + fruit1);
        Set<String> fruit2 = new HashSet<>();
        System.out.println("fruit :" + fruit2);
        Set<String> fruit3 = new HashSet<>();
        System.out.println("fruit :" + fruit3);

        Scanner f1 = new Scanner(System.in);
        Scanner f2 = new Scanner(System.in);
        Scanner f3 = new Scanner(System.in);
        System.out.println("ENTER FRUIT DEATILS:(type 'done' to finish");
        while(true){
            System.out.println("ENTER FRUIT DEATILS:(type 'done' to finish");
            System.out.println("enter fruit1 name");
            String f11 = f1.nextLine();
            if(f11.equalsIgnoreCase("done")){
                break;
            }
            System.out.println("enter fruit1 colour");
            String f12=f1.nextLine();

            System.out.println("enter fruit1 price");
            String f13=f1.nextLine();

            fruit1.add(f11);
            fruit1.add(f12);
            fruit1.add(f13);
            //fruit2

            System.out.println("enter fruit2 name");
            String f21 = f2.nextLine();
            if(f21.equalsIgnoreCase("done")){
                break; 
            }
            System.out.println("enter fruit2 colour");
            String f22=f2.nextLine();

            System.out.println("enter fruit2 price");
            String f23=f3.nextLine();

            fruit2.add(f21);
            fruit2.add(f22);
            fruit2.add(f23);

        }
        System.out.println("FRUITS :"+fruit1);
        System.out.println("FRUITS :"+fruit2);
        System.out.println("FRUITS :"+fruit3);


    }
}