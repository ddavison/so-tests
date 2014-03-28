package com.company.seleniumframework.functional;

import com.company.seleniumframework.AutomationTest;
import com.company.seleniumframework.Browser;
import com.company.seleniumframework.Config;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

/**
 * Created by ddavison on 28/03/2014.
 */
@Config(url="https://rawgithub.com/ddavison/so-tests/master/22711441.html", browser= Browser.CHROME)
public class _22711441 extends AutomationTest {
    @Test
    public void test() {
        ((JavascriptExecutor) driver).executeScript(
        "var inputs = document.getElementsByTagName('input');for(var i = 0; i < inputs.length; i++){inputs[i].removeAttribute('readonly','readonly');}"
        );

        setText(By.id("1"), "something")
        .validateText(By.id("1"), "something");
    }
}
