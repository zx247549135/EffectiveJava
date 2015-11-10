package book.examples.serviceFramework;

public interface Provider {
    Service newService();
    Service newService(int serviceStat);
}
