package com.testinium.test;

import com.testinium.driver.MainTest;
import org.junit.Test;

public class OwerallTest extends MainTest {

    @Test
    public void owerallTest() {

        LoginTest lt = new LoginTest();
        lt.loginTest();
        SearchTest st = new SearchTest();
        st.searchTest();
        FawTest ft = new FawTest();
        ft.fawTest();



    }
}
