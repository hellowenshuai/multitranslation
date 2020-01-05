package guojihua;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author chenshuai
 * @version 1.0
 * @description
 * @date 2020/1/5 14:50
 */
public class TranslationTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        toJob();
    }

    public static void toJob() throws InterruptedException, ExecutionException {
        ToEnglish toEnglish = new ToEnglish();
        toEnglish.setMsg("你好");
        FutureTask<String> tasktoEnglish = new FutureTask<>(toEnglish);
        Thread ttoEnglish = new Thread(tasktoEnglish);
        ttoEnglish.start();
        String English = tasktoEnglish.get();
        System.out.println("英语线程执行结果为" + English);
        Thread.sleep(2000);

        ToFrench toFrench = new ToFrench();
        toFrench.setMsg("你好1");
        FutureTask<String> tasktoFrench = new FutureTask<>(toFrench);
        Thread ttoFrench = new Thread(tasktoFrench);
        ttoFrench.start();
        String French = tasktoFrench.get();
        System.out.println("法语线程执行结果为" + French);
        Thread.sleep(2000);

        ToArabic toArabic = new ToArabic();
        toArabic.setMsg("你好2");
        FutureTask<String> tasktoArabic = new FutureTask<>(toArabic);
        Thread ttoArabic = new Thread(tasktoArabic);
        ttoArabic.start();
        String Arabic = tasktoArabic.get();
        System.out.println("阿拉伯语线程执行结果为" + Arabic);
        Thread.sleep(2000);

        ToRussian toRussian = new ToRussian();
        toRussian.setMsg("你好3");
        FutureTask<String> tasktoRussian = new FutureTask<>(toRussian);
        Thread ttoRussian = new Thread(tasktoRussian);
        ttoRussian.start();
        String Russian = tasktoRussian.get();
        System.out.println("俄语线程执行结果为" + Russian);
        Thread.sleep(2000);

        ToSpanish toSpanish = new ToSpanish();
        toSpanish.setMsg("你好4");
        FutureTask<String> taskSpanish = new FutureTask<>(toSpanish);
        Thread ttoSpanish= new Thread(taskSpanish);
        ttoSpanish.start();
        String Spanish = taskSpanish.get();
        System.out.println("西班牙线程执行结果为" + Spanish);
    }
}
