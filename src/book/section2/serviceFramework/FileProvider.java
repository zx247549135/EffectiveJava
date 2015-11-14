package book.section2.serviceFramework;

/**
 * Created by zx on 15-11-10.
 */
public class FileProvider implements Provider {

    public Service newService(){
        return new FileService(0);
    }

    public Service newService(int serviceStat){
        return new FileService(serviceStat);
    }

}
