package com.virjar.vscrawler.core.selector.string.function.commonlang3;

import com.virjar.vscrawler.core.selector.string.function.SSFunction;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by virjar on 17/7/8.
 */
public class Uncapitalize extends SSFunction {
    @Override
    protected String handleSingleStr(String input) {
        return StringUtils.uncapitalize(input);
    }

    @Override
    public String determineFunctionName() {
        return "uncapitalize";
    }
}
