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
public class ToRussian implements Callable<String> {
    private String msg;

    private String getmsg(String msg) {
        Translations translations = new Translations(new BaiduTranslator());
        String ruMsg = translations.traslate("简体中文", "俄语", msg);
        System.out.println("ruMsg:" + ruMsg);
        return ruMsg;
    }

    public String getMsg() {
        return msg;
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
