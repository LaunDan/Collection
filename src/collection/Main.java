package collection;

import java.util.Iterator;

public class Main<Type> implements Iterable <Type> {

    private Type[] arrayList;
    private int currentSize;

    public Main(Type[] newArray) {
        this.arrayList=newArray;
        this.currentSize=arrayList.length;
    }

    @Override
    public Iterator<Type> iterator() {
        Iterator <Type> it = new Iterator<Type>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && arrayList[currentIndex] != null;
            }

            @Override
            public Type next() {
                return arrayList[currentIndex++];
            }
        };
        return it;
    }
}
