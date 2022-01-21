// To check the consistency of Static and Instance Variable.
class Test3 {
    static int x=100;
    int y=100;
    public static void main(String[] args){
        Test3 t3=new Test3();
        x=1000;
        t3.y=1000;
        x++;
        t3.y++;
        System.out.println( x+" "+t3.y);
        Test3 nt3=new Test3();
        System.out.println( nt3.x+" "+nt3.y);
    }
}
