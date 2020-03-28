import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.management.timer.TimerNotification;
//TimerNotification
//�ֹ������̳߳�
//ʹ��ʵ�ֽӿ�Runnable;ʹ��execute()����
//������̳߳�û�д����µ��̣߳�
class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+","+i);
		}
	}
}
public class TestThreadPool {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		ExecutorService  executorService = new ThreadPoolExecutor(3, 5, 2000,TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>());
//public ThreadPoolExecutor(int corePoolSize,�������̳߳ش�С��
//        int maximumPoolSize, ���̳߳ص����������
//        long keepAliveTime,  ���̱߳��ֻʱ�䣩
//        TimeUnit unit,  	���߳��ӳ�ʱ�䣩
//        BlockingQueue<Runnable> workQueue)��������У�����ȴ�ִ��������������С�
		for(int i = 0;i<5;i++) {
			executorService.execute(mythread);
		}
	//�ر��̳߳�
	executorService.isShutdown();
	}
}
