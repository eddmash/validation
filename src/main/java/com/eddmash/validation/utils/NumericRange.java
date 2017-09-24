package com.eddmash.validation.utils;
/*
* This file is part of the com.eddmash.validation package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import android.support.annotation.Nullable;

import com.google.common.collect.Range;

import java.math.BigDecimal;
import java.util.regex.Pattern;

public class NumericRange {
    private Range mRange;

    public NumericRange(Range var1) {
        this.mRange = var1;
    }

    private static boolean isNumberFormat(String var0) {
        return Pattern.compile("^-?(([1-9]\\d*(\\.\\d+)?)||(0\\.\\d+)||0)$").matcher(var0).find();
    }

    public boolean isValid(String var1) {
        if (!isNumberFormat(var1)) {
            return false;
        } else {
            BigDecimal var2;
            try {
                var2 = new BigDecimal(var1);
            } catch (Exception var5) {
                return false;
            }

            Boolean var3 = this.isInteger(var2);
            if (var3 != null) {
                return var3.booleanValue();
            } else {
                Boolean var4 = this.isDecimal(var2);
                return var4 != null ? var4.booleanValue() : false;
            }
        }
    }

    @Nullable
    private Boolean isInteger(BigDecimal var1) {
        if (var1.scale() == 0) {
            try {
                return Boolean.valueOf(this.mRange.contains(Integer.valueOf(var1.intValueExact())));
            } catch (Exception var4) {
                try {
                    return Boolean.valueOf(this.mRange.contains(Long.valueOf(var1.longValueExact())));
                } catch (Exception var3) {
                    ;
                }
            }
        }

        return null;
    }

    @Nullable
    private Boolean isDecimal(BigDecimal var1) {
        try {
            return Boolean.valueOf(this.mRange.contains(Float.valueOf(var1.floatValue())));
        } catch (Exception var4) {
            try {
                return Boolean.valueOf(this.mRange.contains(Double.valueOf(var1.doubleValue())));
            } catch (Exception var3) {
                return null;
            }
        }
    }
}
