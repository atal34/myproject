package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class StudentId {
    private String idNo;
    private String schoolName;
    
    public StudentId () {}
    
    public StudentId(String idNo, String schoolName) {
        this.idNo = idNo;
        this.schoolName = schoolName;
    }
    
    public String getIdNo() {
        return idNo;
    }
    
    public String getSchoolName() {
        return schoolName;
    }
    
    public String toString() {
          StringBuilder result = new StringBuilder();     
          result.append("\nID No: " + idNo);
          result.append("\nSchool Name: " + schoolName);
          return result.toString();
    }
    
    //@Override
    public boolean equals(Object obj)
    {
        if(this == obj) {
            return true;
        }
        if((obj == null) || !(obj instanceof StudentId)) {
            return false;
        }

        StudentId studId = (StudentId)obj;
        
        boolean result = false;
        
        if (idNo != null && schoolName != null) {
            if (idNo.equals(studId.getIdNo()) && schoolName.equals(studId.getSchoolName())) {
                result = true;
            }
        }
        
        return result;                
    }

    //@Override
    public int hashCode() {
        int hash = (idNo == null) ? 0 : idNo.hashCode();;
        hash += (schoolName == null) ? 0 : schoolName.hashCode();;
        return hash;
    }

}
class Student {

    private String name;
    private int age;
    private int totalMarks;
        
    public Student(){}

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.totalMarks = marks;
    }

    public String toString() {
          StringBuilder result = new StringBuilder();     
          result.append("\nName: " + name);
          result.append("\nAge: " + age);
          result.append("\nTotal Marks: " + totalMarks);
          return result.toString();
    }
    
}




public class HashMapWithObjectKey {
    
    public static void main(String args[]) {
        HashMap hMap = new HashMap();
        
        /*creating two objects student ID and Student and adding it to hashmap with studentID as key and student as value  
         *  */
        
        StudentId id1 = new StudentId("2012LGA60-01", "ILP Ahmedbad");
        Student s1 = new Student("X", 21, 50);
        
        hMap.put(id1, s1);
        hMap.put(new StudentId("2012LGA60-02", "ILP Ahmedbad"), new Student("Y", 22, 60));
        hMap.put(new StudentId("2012LGA60-03", "ILP Ahmedbad"), new Student("Z", 23, 70));
        
        // Get a set of the entries 
        Set set = hMap.entrySet(); 
        // Get an iterator 
        Iterator i = hMap.entrySet().iterator(); 
        // Display elements 
        while(i.hasNext()) { 
            Map.Entry me = (Map.Entry)i.next(); 
            StudentId id = (StudentId)me.getKey();
            System.out.print("\n Key:" + id.toString());
            Student s = (Student)me.getValue();
            System.out.println("\n Value:" + s.toString()); 
        }
        
        //Get the Student with ID1
       
        Student ss = (Student)hMap.get(id1);
        
        System.out.println("\n\n Student Information:\n" + ss.toString());
       
    }

}
