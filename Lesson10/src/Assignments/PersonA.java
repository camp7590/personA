package Assignments;

public class PersonA implements Comparable{
    private String name;
    private int age;
    private String gender;
    
    public PersonA(String n, int a,String g){
        name = n;
        age = a;
        gender=g;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getGender(){
        return gender;
    }
    
    @Override
    public int compareTo(Object t) {
        String othname = ((PersonA)t).getName();
        return this.name.compareTo(othname) ;
    }
}

