package org.visitor.interfaces.item;

import org.visitor.implementation.visitor.CleaningVisitor;
import org.visitor.implementation.visitor.PayingVisitor;

/**
 * Created by blisss05 on 3/2/2016.
 */
public interface VisitableItem {

    public int accept(CleaningVisitor visitor);

    public int accept(PayingVisitor visitor);

}
