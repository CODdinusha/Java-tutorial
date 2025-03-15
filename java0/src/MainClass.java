public class MainClass {
    public void showDetails(String name,String address){
        System.out.println(name);
        System.out.println(address);
    }
    public void showAllMarks(int[] marks){
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }

    }
    public int showTotalMarks(int[] marks){
        int total=0;
        for(int i=0;i<5;i++){
            total=total+marks[i];
        }
        System.out.println(total);
        return total;
    }
    public void showAverageMarks(int total){
        for(int i=0;i<5;i++){
            double Average= total/5;
            System.out.println(" Total :"+total);
        }
    }
}
