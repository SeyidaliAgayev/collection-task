package inter;

public interface CustomArrayListInter<E> {

    void increaseSize();
    E get(int index);
    void capacityChecker(int index);
    void remove(int index);
    int length();

}
