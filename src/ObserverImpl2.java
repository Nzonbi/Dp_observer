public class ObserverImpl2 implements Observer {
    private int counter;
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl)observable).getState();
        if (state%2==0) ++counter;
        System.out.println("*****ObserverImpl2**************");
        System.out.println("Nouvelle mise a jour" +state);
        System.out.println("Resultat de calcul :" + ((state%2)==0?"pair":"impaire"));
        System.out.println("le compteur est:" +counter);
        System.out.println("**********************");
    }
}
