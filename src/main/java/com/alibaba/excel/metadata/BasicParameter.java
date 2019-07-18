package com.alibaba.excel.metadata;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.write.handler.WriteHandler;

/**
 * Basic parameter
 *
 * @author zhuangjiaju
 **/
public class BasicParameter {
    /**
     * Count the number of added heads when read sheet.
     *
     * <li>0 - This Sheet has no head ,since the first row are the data
     * <li>1 - This Sheet has one row head , this is the default
     * <li>2 - This Sheet has two row head ,since the third row is the data
     */
    private Integer readHeadRowNumber;
    /**
     * Writes the head relative to the existing contents of the sheet. Indexes are zero-based.
     */
    private Integer writeRelativeHeadRowIndex;
    /**
     * You can only choose one of the {@link BasicParameter#head} and {@link BasicParameter#clazz}
     */
    private List<List<String>> head;
    /**
     * You can only choose one of the {@link BasicParameter#head} and {@link BasicParameter#clazz}
     */
    private Class clazz;
    /**
     * Need Head
     */
    private Boolean needHead;
    /**
     * Custom type conversions override the default
     */
    private List<Converter> customConverterList = new ArrayList<Converter>();
    /**
     * Custom type handler override the default
     */
    private List<WriteHandler> customWriteHandlerList = new ArrayList<WriteHandler>();
    /**
     * Custom type listener run after default
     */
    private List<ReadListener> customReadListenerList = new ArrayList<ReadListener>();
    /**
     * Automatic trim includes sheet name and content
     */
    private Boolean autoTrim;

    public Integer getReadHeadRowNumber() {
        return readHeadRowNumber;
    }

    public void setReadHeadRowNumber(Integer readHeadRowNumber) {
        this.readHeadRowNumber = readHeadRowNumber;
    }

    public Integer getWriteRelativeHeadRowIndex() {
        return writeRelativeHeadRowIndex;
    }

    public void setWriteRelativeHeadRowIndex(Integer writeRelativeHeadRowIndex) {
        this.writeRelativeHeadRowIndex = writeRelativeHeadRowIndex;
    }

    public List<List<String>> getHead() {
        return head;
    }

    public void setHead(List<List<String>> head) {
        this.head = head;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Boolean getNeedHead() {
        return needHead;
    }

    public void setNeedHead(Boolean needHead) {
        this.needHead = needHead;
    }

    public List<Converter> getCustomConverterList() {
        return customConverterList;
    }

    public void setCustomConverterList(List<Converter> customConverterList) {
        this.customConverterList = customConverterList;
    }

    public List<WriteHandler> getCustomWriteHandlerList() {
        return customWriteHandlerList;
    }

    public void setCustomWriteHandlerList(List<WriteHandler> customWriteHandlerList) {
        this.customWriteHandlerList = customWriteHandlerList;
    }

    public List<ReadListener> getCustomReadListenerList() {
        return customReadListenerList;
    }

    public void setCustomReadListenerList(List<ReadListener> customReadListenerList) {
        this.customReadListenerList = customReadListenerList;
    }

    public Boolean getAutoTrim() {
        return autoTrim;
    }

    public void setAutoTrim(Boolean autoTrim) {
        this.autoTrim = autoTrim;
    }
}
