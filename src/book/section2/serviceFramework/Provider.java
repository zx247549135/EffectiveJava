package book.section2.serviceFramework;

public interface Provider {
    Service newService();
    Service newService(int serviceStat);
}
