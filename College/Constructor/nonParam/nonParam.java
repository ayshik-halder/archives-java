
class student {
    int id;
    String name;
    student(){
        System.out.println("Non-Parameterised Contructor Called!");
    }

    
}
public class nonParam {
        public static void main(String[] args) {
            student s1= new student();
            System.out.println("ID: "+s1.id);
            System.out.println("Name: "+s1.name);
        }
    
}

