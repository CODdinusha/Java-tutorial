public class MainClass {
    MainClass(){
        System.out.println("MainClass Constructor ");
    }
    {
        System.out.println("block 1"); //instant block
    }
    {
        System.out.println("block 2"); //instant block
    }
    static {
        System.out.println("static block 1"); //static block 1
    }
    static  {
        System.out.println("static block 2"); //static block 2
    }
}
