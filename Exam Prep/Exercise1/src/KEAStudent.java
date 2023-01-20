public class KEAStudent extends Student {
    public int age = 2;
    public KEAStudent() {
        System.out.println("KEA Student created");
    }

    public int getAgeFromSuper(){
       return super.age;
    }
}