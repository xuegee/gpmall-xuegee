package com.gpmall.order.biz.handler;/**
 * Created by mic on 2019/8/2.
 */

import com.gpmall.order.biz.HandlerItem;
import com.gpmall.order.biz.callback.TransCallback;
import lombok.Data;

import java.util.Map;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2019/8/2-下午10:01
 */
@Data
public abstract class AbstractTransHandler implements TransHandler {

    public static final String DEFAULT = "default";

    private Map<String,HandlerItem> handlerMap = null;

    public Map<String, HandlerItem> getHandlerMap() {
        return handlerMap;
    }

    public void setHandlerMap(Map<String, HandlerItem> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public HandlerItem getDefaultHanderItem() {
        return getHandlerMap().get(DEFAULT);
    }

    public TransCallback callback;//需要注入回调的值

    /**
     * 可以无回调
     */
    public TransCallback setPostCallback(){return null;}

    public void setCallback(TransCallback callback) {
        this.callback = setPostCallback();
    }
}