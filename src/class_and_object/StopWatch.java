package class_and_object;

import java.util.Date;

public class StopWatch {
	long startTime;
	long endTime;

	public StopWatch() {
	}

	public long getStartTime() {
		return startTime;
	}

	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	public long getEndTime() {
		return endTime;
	}

	public void stop() {
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return (endTime - startTime);
	}

	public void swap(long a, long b) {
		long temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		long[] array = new long[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (long) Math.floor(Math.random() * 100000);
		}
		System.out.println("Bắt đầu sắp xếp chọn ");
		long min = array[0];
		int ind = 0;
		sw.start();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					ind = j;
					min = array[j];
				}
			}
			sw.swap(array[i], array[ind]);

		}
		sw.stop();
		System.out.println("Thời gian tính toán : " +sw.getElapsedTime() + " mls");
		

	}

}
