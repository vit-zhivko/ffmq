package net.timewalker.ffmq3.test.local;

import net.timewalker.ffmq3.test.BaseCommTest;

/**
 * LocalQueueMultiConnReceiverTest
 */
public class LocalQueueMultiConnReceiverTest extends BaseCommTest
{    
    protected boolean isRemote()               { return false; }
    protected boolean useMultipleConnections() { return true;  }
    protected boolean isTopicTest()            { return false; }
    protected boolean isListenerTest()         { return false; }
}