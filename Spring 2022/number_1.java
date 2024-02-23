 class Marks {
    String id ;
    double quizMark;
    double midMark;
    double finalMark;

    public Marks(String id, double quizMark, double midMark, double finalMark) {
        this.id = id;
        this.quizMark = quizMark;
        this.midMark = midMark;
        this.finalMark = finalMark;
    }

    public void passedOrNot()
    {
        double total = quizMark + midMark + finalMark;
        if (total >= 55)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }

}
class Run{
    public static void main(String[] args) {
        Marks m1 = new Marks("1", 5, 10, 30);
        m1.passedOrNot();
        Marks m2 = new Marks("2", 15, 20, 30);
        m2.passedOrNot();
    }
}