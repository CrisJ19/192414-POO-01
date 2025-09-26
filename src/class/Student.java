import java.util.ArrayList;
import java.util.List;
public class Student {

    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id){
        this.name= name;
        this.age= age;
        this.id= id;
    }
    public Student getName(){
        return name;
    }
    public Student getAge(){
        return age;
    }    
    public Student getId(){
        return id;
    }
    void setName(String name){
        this.name= name;
    }
    void setAge(int age){
        this.age= age ;
    }
    void setId(String id){
        this.id= id;
    }        
}
