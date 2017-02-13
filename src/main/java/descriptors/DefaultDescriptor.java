package descriptors;

import java.util.ArrayList;
import java.util.List;

public class DefaultDescriptor extends AbstractDescriptor {

    protected DefaultDescriptor(String string, Class class1, Class type) {
        super();
    }

    protected List createAttributeDescriptors() {
        List result = new ArrayList();
        result.add(AbstractDescriptor.forInteger("remoteId", getClass()));
        result.add(AbstractDescriptor.forString("remoteId", getClass()));
        result.add(AbstractDescriptor.forDate("remoteId", getClass()));
        return result;
    }
}
