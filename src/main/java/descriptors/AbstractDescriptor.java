package descriptors;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class AbstractDescriptor {

    protected AbstractDescriptor() {

    }

    public static AbstractDescriptor forInteger(String id, Class class1) {
        return new DefaultDescriptor(id, class1, Integer.TYPE);
    }

    public static AbstractDescriptor forDate(String id, Class class1) {
        return new DefaultDescriptor(id, class1, Date.class);
    }

    public static AbstractDescriptor forString(String id, Class class1) {
        return new DefaultDescriptor(id, class1, String.class);
    }
}
