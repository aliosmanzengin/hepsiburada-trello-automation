package com.aliosman.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static com.aliosman.utilities.Driver.js;


public class JSUtils {
        /**
         * When you pass the element, JS will click on that element
         *
         * @param element
         */
        public static void clickElementByJS(WebElement element) {
            JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
            jsexecutor.executeScript("arguments[0].click();", element);
        }



        /**
         * Scroll into view
         *
         * @param element
         */
        public static void scrollIntoViewJS(WebElement element) {
            js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", element);
        }


        /**
         * Returns a border for desired element and adds wait
         *
         * @param element
         * @param waitsecond
         * @return
         */
        public static WebElement highlightElement(WebElement element, int waitsecond) {
            js.executeScript("arguments[0].style.border='3px solid orange'", element);
            ReusableMethods.waitFor(waitsecond);
            return element;
        }

        /**
         * Returns a border for desired element
         *
         * @param element
         * @return WebElement
         */
        public static WebElement highlightElement(WebElement element) {
            js.executeScript("arguments[0].style.border='3px solid orange'", element);
            return element;
        }
}
