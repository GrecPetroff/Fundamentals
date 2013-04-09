package MultiThreading;

class Runner extends Thread {
	int id;

	public Runner(int n) {
		id = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("My id: " + this.id + " my number: " + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Runner runner1 = new Runner(1);
		runner1.start();

		Runner runner2 = new Runner(2);
		runner2.start();
	}

}