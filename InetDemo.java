//Exp : 6
import java.net.Inet4Address;
import java.util.Arrays;
import java.net.InetAddress;
public class InetDemo
{
    public static void main(String[] args) throws Exception
    {
        InetAddress ip = Inet4Address.getByName("www.javatpoint.com");
        InetAddress ip1[] = InetAddress.getAllByName("www.javatpoint.com");
        byte addr[] = {72,3,2,12};
        System.out.println("ip : "+ip);
        System.out.println("ip1 : "+ip1);
        InetAddress ip2 = InetAddress.getByAddress(addr);
        System.out.println("ip2 : "+ip2);
        System.out.println("Address : "+Arrays.toString(ip.getAddress()));
        System.out.println("Host Address : "+ip.getHostAddress());
        System.out.println("isAnyLocalAddress : "+ip.isAnyLocalAddress());
        System.out.println("isLinkLocalAddress : "+ip.isLinkLocalAddress());
        System.out.println("isLoopbackAddress : "+ip.isLoopbackAddress());
        System.out.println("isMCGlobal : "+ip.isMCGlobal());
        System.out.println("isMCLinkLocal : "+ip.isMCLinkLocal());
        System.out.println("isMCNodeLocal : "+ip.isMCNodeLocal());
        System.out.println("isMCOrgLocal : "+ip.isMCOrgLocal());
        System.out.println("isMCSiteLocal : "+ip.isMCSiteLocal());
        System.out.println("isMulticastAddress : "+ip.isMulticastAddress());
        System.out.println("isSiteLocalAddress : "+ip.isSiteLocalAddress());
        System.out.println("hashcode : "+ip.hashCode());
        System.out.println("Is ip1 == ip2 : "+ip.equals(ip2));
    }
}