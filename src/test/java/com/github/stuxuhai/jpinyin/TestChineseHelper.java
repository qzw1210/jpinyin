package com.github.stuxuhai.jpinyin;

import org.junit.Assert;
import org.junit.Test;

public class TestChineseHelper {

    @Test
    public void testConvertToSimplifiedChinese1() {
        Assert.assertEquals(ChineseHelper.convertToSimplifiedChinese('東'), '东');
        Assert.assertEquals(ChineseHelper.convertToSimplifiedChinese('義'), '义');
    }

    @Test
    public void testConvertToTraditionalChinese1() {
        Assert.assertEquals(ChineseHelper.convertToTraditionalChinese('东'), '東');
        Assert.assertEquals(ChineseHelper.convertToTraditionalChinese('义'), '義');
    }

    @Test
    public void testConvertToSimplifiedChinese2() {
        Assert.assertEquals(ChineseHelper.convertToSimplifiedChinese("東義"), "东义");
    }

    @Test
    public void testConvertToTraditionalChinese2() {
        Assert.assertEquals(ChineseHelper.convertToTraditionalChinese("东义"), "東義");
    }

    @Test
    public void testIsTraditionalChinese() {
        Assert.assertTrue(ChineseHelper.isTraditionalChinese('東'));
        Assert.assertTrue(!ChineseHelper.isTraditionalChinese('东'));
    }

    @Test
    public void testIsChinese() {
        Assert.assertTrue(ChineseHelper.isChinese('東'));
        Assert.assertTrue(ChineseHelper.isChinese('东'));
        Assert.assertTrue(!ChineseHelper.isChinese('A'));
    }

    @Test
    public void testContainsChinese() {
        Assert.assertTrue(!ChineseHelper.containsChinese("abc"));
        Assert.assertTrue(ChineseHelper.containsChinese("abc你好"));
        Assert.assertTrue(!ChineseHelper.containsChinese("abc123"));
        Assert.assertTrue(ChineseHelper.containsChinese("〇"));
    }

}
