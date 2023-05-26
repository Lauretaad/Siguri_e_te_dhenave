import java.math.BigInteger;

public class RSACrack {
    public static void main(String[] args) {
        BigInteger n=new BigInteger("797306344204135429053419");
        BigInteger e=new BigInteger("920419823");
        BigInteger a=n.sqrt();
        BigInteger one=new BigInteger("1");
        a=a.add(one);
        BigInteger a2=a.multiply(a);
        BigInteger r=a2.subtract(n);
        BigInteger x=r.sqrt();
        BigInteger p=a.subtract(x);
        BigInteger q=a.add(x);
        System.out.print("p="+p+"   q="+q);
        BigInteger phi=(p.subtract(one)).multiply(q.subtract(one));
        BigInteger d=e.modInverse(phi);
        System.out.println("     d="+ d);
    }
        

}