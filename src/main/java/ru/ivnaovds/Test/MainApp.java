package ru.ivnaovds.Test;

import ru.ivnaovds.Test.model.Car;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        MainApp mainApp = new MainApp();
        mainApp.studyThreadEx2();
    }

    public void showCollections() {
        HashSet<String> res = new HashSet<>();
        res.add("name");
        res.add("test");

        res.forEach(it -> System.out.print(it + " "));
        System.out.println();

        HashSet<Car> cars = new HashSet<>();
        cars.add(new Car("Lada", 12));
        cars.add(new Car("Hyundai", 6));

        cars.forEach(it -> System.out.print(it + " "));
        System.out.println();

        TreeSet<Car> treeSet = new TreeSet<>();
        treeSet.add(new Car("Ferrari",12));
        treeSet.add(new Car("Mercedes",2));
        treeSet.add(new Car("Lamborghini", 3));

        treeSet.forEach(it -> System.out.print(it + " "));
        System.out.println();

        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);

        lst.forEach(it -> System.out.print(it + " "));
        System.out.println();
    }

    public void studyThreadEx1() throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger();
        List<Integer> lstArray = Stream.of(1,2,3,4,5)
                .toList();

//        List<Integer> target = new ArrayList<>();
        List<Integer> target =
                Collections.synchronizedList(new ArrayList<>());

        Runnable runnable = () -> target.addAll(lstArray);
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();

        System.out.println(target);
    }

    public void studyThreadEx2() throws InterruptedException {
        ArrayList<Integer> lstArray1 = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            lstArray1.add(i);
        }

        List<Integer> lstArray = Collections.synchronizedList(lstArray1);
        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = lstArray.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        };
        Runnable runnable2 = () ->
                lstArray.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(lstArray);
    }
}
