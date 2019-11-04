package com.dooboolab.RNIap;

import com.facebook.react.bridge.ReactApplicationContext;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;

public class RNIapModuleUnitTest {
    RNIapModule rnIapModule;

    @Mock
    ReactApplicationContext reactApplicationContext;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        rnIapModule = new RNIapModule(reactApplicationContext);
    }

    @Test
    public void testModuleName()  {
        assertEquals(rnIapModule.getName(), "RNIapModule");
    }
}
