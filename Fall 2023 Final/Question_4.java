import java.util.ArrayList;
import java.util.Comparator;

class Address{
    String building_number,area,city;
    int zip_code;
    Address(String building_number,String area,String city,int zip_code){
        this.building_number=building_number;
        this.area=area;
        this.city=city;
        this.zip_code=zip_code;
    }

    public int getZip_code() {
        return zip_code;
    }
}

class AddressComparator implements Comparator<Address>{
    public int compare(Address a1,Address a2){
        return a1.getZip_code()-a2.getZip_code();
    }
}

class Test4{
    public static void main(String[] args) {
        ArrayList<Address> addresses = new ArrayList<>();

        addresses.add(new Address("19/A","Tejgaon","Dhaka",1200));
        addresses.add(new Address("20/B","Mohakhali","Dhaka",1212));
        addresses.add(new Address("21/C","Banani","Dhaka",1213));

        addresses.add(1,new Address("22/D","Gulshan","Dhaka",1214));
        addresses.set(2,new Address("23/E","Uttara","Dhaka",1215));

        addresses.sort(new AddressComparator());

        addresses.remove(2);

        for(Address a:addresses){
            System.out.println(a.building_number+" "+a.area+" "+a.city+" "+a.zip_code);
        }

    }
}