public class Example8_2 {
    public static void main(String[] args) {
        Faculty t1 = new Faculty("Mr.Ali Ahmed", "ali@dsu.edu.pk");
        Department d1 = new Department(1, "Computer Science", t1);
        System.out.println(d1);
        d1.showInfo();
    }
}

class Faculty {
    private String tname;
    private String email;
    Faculty(String tname,String email) {
        this.tname = tname;
        this.email = email;
    }
    public String getName() {
        return this.tname;
    }
    public String getEmail() {
        return this.email;
    }
}
class Department {
    private int id;
    private String name;
    private Faculty fname;
    Department(int id, String name, Faculty fname) {
        this.id = id;
        this.name = name;
        this.fname = fname;
    }
    public void showInfo() {
        System.out.println(" Department id: "+this.id);
        System.out.println(" Department Name: "+ this.name);
        System.out.println(" Faculty name: "+ this.fname.getName());
        System.out.println(" Faculty email: "+ this.fname.getEmail());
    }
}


