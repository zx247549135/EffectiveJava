package book.section2.serviceFramework;

/**
 * Created by zx on 15-11-10.
 */
public class FileService implements Service {

    int serverState;

    public FileService(int serverState){
        this.serverState = serverState;
    }

    public int getServerState(){
        return serverState;
    }
}
