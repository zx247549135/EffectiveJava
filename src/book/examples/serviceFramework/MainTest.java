package book.examples.serviceFramework;

/**
 * Created by zx on 15-11-9.
 */
public class MainTest {

    public static void main(String[] args) {

        FileProvider fileProvider_default = new FileProvider();
        ServiceFramework.registerDefaultProvider(fileProvider_default);
        Service service_default = ServiceFramework.newInstance();
        System.out.println("Default: " + service_default.getServerState());

        FileProvider fileProvider_1 = new FileProvider();
        ServiceFramework.registerProvider("provider_1",fileProvider_1);
        Service service_1 = ServiceFramework.newInstance("provider_1");
        System.out.println("Pointer: " + service_1.getServerState());

    }

}
