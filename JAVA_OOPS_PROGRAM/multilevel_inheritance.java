class student{
    public void info(String name,int id){
        System.out.println("Student Name:-"+name);
        System.out.println("Id:-"+id);
    }
}
class mark extends student{
    public void marks(int eng,int math,int hindi,int comp){
        System.out.println("Marks in Exam..");
        System.out.println("English="+eng+"\nMath="+math+"\nHindi="+hindi+"\nComputer="+comp);
    }
}
class sport extends mark{
    public void score(int sc){
        System.out.println("Score:-"+sc+"/100");
        System.out.println("Thankyou........");
    }
}
class multilevel_inheritance{
    public static void main(String[] args){
        System.out.println("......MULTILEVEL INHERITANCE.....");
        sport s1=new sport();
        s1.info("kamini", 100);
        s1.marks(90, 99, 100,98);
        s1.score(99);
    }
}