package com.virjar.vscrawler.core.selector.string.function.commonlang3;

import com.virjar.vscrawler.core.selector.string.function.BSFunction;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by virjar on 17/7/8.
 */
public class IsAlphanumericSpace extends BSFunction {
    @Override
    protected  boolean handle(CharSequence str) {
        return StringUtils.isAlphanumericSpace(str);
    }

    @Override
    public String determineFunctionName() {
        return "isAlphanumericSpace";
    }
}
