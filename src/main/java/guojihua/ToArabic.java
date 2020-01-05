package guojihua;

import com.github.freetsinghua.Translations;
import com.github.freetsinghua.core.impl.BaiduTranslator;

import java.util.concurrent.Callable;

/**
 * @author chenshuai
 * @version 1.0
 * @description
 * @date 2020/1/5 15:31
 */
public class ToArabic implements Callable<String> {
    private String msg;

    private String getmsg(String msg) {
        Translations translations = new Translations(new BaiduTranslator());
        String arMsg = translations.traslate("简体中文", "阿拉伯语", msg);
        System.out.println("arMsg:" + arMsg);
        return arMsg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @Override
    public String call() throws Exception {
        String getmsg = getmsg(msg);
        return getmsg;
    }
}
