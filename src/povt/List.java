package povt;

public interface List<T> {
    int size();

    void add(T t);

    void add(int ind, T t);

    void clear();

    T get(int ind);

    void remove(int ind);

    void removed(T t);


}
