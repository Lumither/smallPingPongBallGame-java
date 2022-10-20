package swing;

public class Gm2 extends Gm1 {
    AutoRacketController autoRacketController = new AutoRacketController(lR, ballController);

    public Gm2(String name) {
        super(name);
        mainWindow.remove(lcontroller);
        mainWindow.add(autoRacketController);
    }

    public void run() {
        while(true){
            try {
                Thread.currentThread().sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            rcontroller.refresh();
            autoRacketController.refresh();

            ballController.refresh(lR, rR);
            mainWindow.repaint();
        }
    }
}
