package chapter_6;

public class Sample5 {
    public void methodA() {
        final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;

        if (isMacOs && isIEBrowser && wasInitialized() && wasResized) {
            // 기능 코드
        }
    }
}
