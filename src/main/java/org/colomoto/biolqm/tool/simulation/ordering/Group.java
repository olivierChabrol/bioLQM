package org.colomoto.biolqm.tool.simulation.ordering;

import java.util.ArrayList;

public class Group extends ArrayList<GroupMember> {

    private final Grouping grouping;

    protected Group(Grouping grouping) {
        this.grouping = grouping;
    }

}
