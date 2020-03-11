

public class Student2 {
    private String Name,Height,Weight,Gender,Birthday,StudentID;
    public Student2() {
    }
    public void Student() {
        System.out.println("Student object has created");
    }
    public void setName(String newName) {
        this.Name = newName;
    }
    public String getName() {
        return this.Name;
    }
    public void setHeight(String newHeight) {
        this.Height= newHeight;
    }
    public Object getHeight() {
        return this.Height;
    }
    public void setWeight(String newWeight) {
        this.Weight = newWeight;
    }
    public String getWeight() {
        return this.Weight;
    }
    public void setGender(String newGender) {
        this.Gender = newGender;
    }
    public String getGender() {
        return this.Gender;
    }
    public void setBirthday(String newBirthday) {
        this.Birthday = newBirthday;
    }
    public String getBirthday() {
        return  this.Birthday;
    }
    public void setStudentID(String newStudentID) {
        this.StudentID = newStudentID;
    }
    public String getStudentID() {
        return  this.StudentID;
    }
    public void Eat(){
    }
    public void Drink(){
    }
    public void Sleep(){
    }
    public void showInfo(){
        System.out.println("Student Name:"+this.Name+","+"Height : "+this.Height+","+"Weight:"+this.Weight+","+"Birthday:"+this.Birthday+","+"Gender:"+this.Gender+","+"StudentID:"+this.StudentID );
    }
}