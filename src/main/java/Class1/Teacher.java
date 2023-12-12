package Class1;


    public class Teacher {
        private   String name;
        private String address;
        public Teacher(String name, String address){
            this.name=name;
            this.address=address;

        }

        public void printInfo(){

            System.out.println(name+" "+address);
        }
        public static void main(String[] args) {
            Teacher bestTeacher=new Teacher("Asghar","Pakistan");
            bestTeacher.printInfo();
        }
    }






