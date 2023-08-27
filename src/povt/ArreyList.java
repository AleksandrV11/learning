package povt;

import java.util.Arrays;

public class ArreyList<T> implements List<T> {

    Object[] arr = new Object[0];
    int size = 0;

    public void prov() {
        if (arr.length == 0) {
            arr = new Object[1];
        }
        if (arr.length == size) {
            Object[] nawArr = new Object[arr.length * 2];
            System.arraycopy(arr, 0, nawArr, 0, arr.length);
            arr = nawArr;
        }
    }

    @Override
    public void add(Object o) {
        prov();

        Object[] newArr = new Object[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < size) {
                newArr[i] = arr[i];
            }
            if (i == size) {
                newArr[i] = o;
            }
        }
        arr = newArr;

        size++;
    }

    @Override
    public void add(int ind, Object o) {
        prov();
        Object[] newArr = new Object[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            if (i < ind) {
                newArr[i] = arr[i];
            }
            if (i == ind) {
                newArr[i] = o;
            }
            if (i > ind) {
                newArr[i] = arr[i - 1];
            }
        }
        arr = newArr;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        Object[] newArr = new Object[0];
        arr = newArr;
        size = 0;
    }

    @Override
    public T get(int ind) {
        T a;
        for (int i = 0; i < arr.length; i++) {
            if (i == ind) {
                a = (T) arr[i];
                return (T) a;
            }
        }
        return null;
    }

    @Override
    public void remove(int ind) {
        if (arr.length == 0) {
            System.out.println("arr.lenght = 0");
        } else {
            Object[] newArr = new Object[arr.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < ind) {
                    newArr[i] = arr[i];
                }
                if (i >= ind) {
                    newArr[i] = arr[i + 1];
                }
            }
            arr = newArr;
            size--;
        }

    }

    @Override
    public void removed(T t) {
        if (arr.length == 0) {
            System.out.println("arr.lenght = 0");
        } else {
//            int n = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == t) {
//                    n++;
//                }
//            }
            int k = 0;
            Object[] newArr = new Object[arr.length];
            for (int i = 0; i < size; i++) {
                if (arr[i] == t) {
                    k++;
                    continue;

                } else {
                    newArr[i - k] = arr[i];
                }
            }
            arr = newArr;
            size = size - k;
        }


    }


    @Override
    public String toString() {
        return "ArreyList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
