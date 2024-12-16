//Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. Put a method: public String toString () { } in every class where you describe about the class and from main create object of each class and print each object.

class Emp{
    int id;
    String name;
    Emp(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "Person name : "+name+"\nPerson ID : "+id;
    }
}

class Scientist extends Emp{
    int no_of_publication;
    double experience;
    Scientist(int id,String name,int no_of_publication, double experience){
        super(id, name);
        this.no_of_publication =no_of_publication;
        this.experience = experience;
    }
    public String toString(){
        //return "Scientist name : "+name+"\nScientist ID : "+id+"\nScientist no of publications : "+no_of_publication+"\nScientist experience : "+experience;

        return super.toString() + "\nPerson no of publications : "+no_of_publication+"\nPerson experience :"+experience;
    }
}
class Dscientist extends Scientist{
    int award;
    Dscientist(int id,String name, int no_of_publication, double experience, int award){
        super(id, name, no_of_publication, experience);
        this.award = award;
    }
    
    public String toString(){
        //return "Dscientist name : "+name+"\nDscientist ID : "+id+"\nDscientist no of publications : "+no_of_publication+"\nDscientist experience : "+experience+"Dscientist awards : "+award;
        return super.toString()+"\nPerson awards : "+award;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Emp e = new Emp(101,"AAA");
        System.out.println(e.toString());

        Scientist s = new Scientist(102, "BBB",20,5.5);
        System.out.println(s.toString());

        Dscientist d = new Dscientist(103, "CCC", 10, 10.5, 99);
        System.out.println(d.toString());

        Emp sc = new Scientist(201, "DDD", 12, 4);
        System.out.println(sc.toString());

        Emp dsc = new Dscientist(202, "EEE", 20, 10, 23);
        System.out.println(dsc.toString());
    }
}
