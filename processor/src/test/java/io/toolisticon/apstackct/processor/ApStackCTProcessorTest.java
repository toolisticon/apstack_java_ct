package io.toolisticon.apstackct.processor;


import io.toolisticon.aptk.tools.MessagerUtils;
import io.toolisticon.cute.CompileTestBuilder;
import io.toolisticon.cute.matchers.CoreGeneratedFileObjectMatchers;
import org.junit.Before;
import org.junit.Test;

import javax.tools.StandardLocation;

/**
 * Tests of {@link ApStackCtProcessor}.
 */
public class ApStackCTProcessorTest {


    @Before
    public void init() {
        MessagerUtils.setPrintMessageCodes(true);
    }


    CompileTestBuilder.CompilationTestBuilder compileTestBuilder = CompileTestBuilder
            .compilationTest()
            .addProcessors(ApStackCtProcessor.class);

    @Test
    public void test_validUsage() {


        compileTestBuilder
                .addSources("testcase/resourceFileCreation/package-info.java")
                .compilationShouldSucceed()
                .expectThatFileObjectExists(StandardLocation.CLASS_OUTPUT, "io.toolisticon.apstackct.test", "bla.txt", CoreGeneratedFileObjectMatchers.createRegexMatcher("bla"))
                .executeTest();

    }

}

