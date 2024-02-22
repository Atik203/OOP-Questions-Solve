 class Electronics {
    void printInfo(){
        System.out.println("A typical electronic device");
    }
}

class Mobile extends Electronics {
    void printInfo(){
        System.out.println("A mobile is a portable telephone.");
    }
}

class Laptop extends Electronics {
    void printInfo(){
        System.out.println("A laptop is a small, portable personal computer.");
    }
}

class SmartWatch extends Electronics {
    void printInfo(){
        System.out.println("A smartwatch is a wearable computer in the form of a watch.");
    }
}


class Test{
    public static void main(String[] args) {
        Electronics elc;
        elc = new Electronics();
        elc.printInfo();
        elc = new Mobile();
        elc.printInfo();
        elc = new Laptop();
        elc.printInfo();
        elc = new SmartWatch();
        elc.printInfo();
    }
}