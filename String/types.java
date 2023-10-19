package String;

public class types {
    public static void main(String[] args) {
        // non changeable
        String sp = "GB";
        System.out.println(sp);
        sp.concat("TB");
        System.out.println(sp);

        // changeable
        StringBuilder sp1 = new StringBuilder("GB1");
        System.err.println(sp1);
        sp1.append("TB1");
        System.err.println(sp1);






    }
}
