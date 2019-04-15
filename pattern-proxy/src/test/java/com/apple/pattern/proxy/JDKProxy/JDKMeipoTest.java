package com.apple.pattern.proxy.JDKProxy;

import com.apple.pattern.proxy.NSPerson;
import org.junit.Test;

public class JDKMeipoTest {

    @Test
    public void invoke() {
        NSPerson person = (NSPerson) new JDKMeipo().getInstance(new NSGirl());
        person.findLove();
    }
}
