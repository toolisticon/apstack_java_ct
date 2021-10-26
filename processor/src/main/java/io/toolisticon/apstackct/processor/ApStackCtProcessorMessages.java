package io.toolisticon.apstackct.processor;


import io.toolisticon.aptk.tools.corematcher.ValidationMessage;

/**
 * SpiProcessorMessages used by annotation processors of Advice annotations.
 */
public enum ApStackCtProcessorMessages implements ValidationMessage {


    ERROR_TESTERROR("TEST_ERROR_001", "ERROR HAPPENED");


    /**
     * Flag that defines if messages codes will be written as part of the message.
     */
    private static boolean printMessageCodes = false;

    /**
     * the message code.
     */
    private final String code;
    /**
     * the message text.
     */
    private final String message;

    /**
     * Constructor.
     *
     * @param code    the message code
     * @param message the message text
     */
    ApStackCtProcessorMessages(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Gets the code of the message.
     *
     * @return the message code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the message text.
     *
     * @return the message text
     */
    public String getMessage() {
        return this.message;
    }


}
