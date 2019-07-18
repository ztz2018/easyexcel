package com.alibaba.excel.analysis.v07;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.analysis.v07.handlers.CountRowCellHandler;
import com.alibaba.excel.analysis.v07.handlers.DefaultCellHandler;
import com.alibaba.excel.analysis.v07.handlers.ProcessResultCellHandler;
import com.alibaba.excel.context.AnalysisContext;

/**
 * Build handler
 * 
 * @author Dan Zheng
 */
public class XlsxHandlerFactory {
    public static List<XlsxCellHandler> buildCellHandlers(AnalysisContext analysisContext) {
        List<XlsxCellHandler> result = new ArrayList<XlsxCellHandler>();
        result.add(new CountRowCellHandler(analysisContext));
        DefaultCellHandler defaultCellHandler = new DefaultCellHandler(analysisContext);
        result.add(defaultCellHandler);
        result.add(new ProcessResultCellHandler(analysisContext, defaultCellHandler));
        return result;
    }
}
