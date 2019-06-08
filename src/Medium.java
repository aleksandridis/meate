import java.util.List;

public interface Medium {
    void write(String user, long dataId, String data) throws GeneralException;
    String read(String user, long dataId) throws GeneralException;
    List<String> read(String user) throws GeneralException;
}