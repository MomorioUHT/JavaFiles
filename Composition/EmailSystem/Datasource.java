//6610450951 ต้นตะวัน จันทร์ไทย
public interface Datasource<T> {
    T readData();
    void writeData(T data);
}
