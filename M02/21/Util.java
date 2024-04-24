public class Util {
    public void cleanScreen() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

    }

    public void sleepTimer(int sleepTimer) {
        System.out.print("Waitting...");

        for (int i = 0; i < 10; i++) {
            try {
                System.out.print(".");
                Thread.sleep(sleepTimer);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
        System.out.println();

    }
}
