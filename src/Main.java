public class Main {
    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        Observer o3 = new ObserverImpl1();

        observable.subscribe(o1);
        observable.setState(55);
        observable.subscribe(o2);
        observable.setState(22);
        observable.unsubscribe(o1);
        observable.subscribe(observable1 -> System.out.println("observateur anonyme"));
        observable.setState(-24);
    }
}