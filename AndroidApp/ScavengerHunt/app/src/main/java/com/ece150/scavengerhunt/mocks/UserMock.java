package com.ece150.scavengerhunt.mocks;

import com.ece150.scavengerhunt.IObjective;
import com.ece150.scavengerhunt.IUser;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class UserMock implements IUser {

    private LinkedList<IObjective> _objectives;

    public UserMock() {
        _objectives = new LinkedList<IObjective>();

        for(int i=0; i<10; i++) {
            ObjectiveMock objective = new ObjectiveMock();
            _objectives.push(objective);
        }
    }

    @Override
    public int getScore() {
        return 999;
    }

    @Override
    public List<IObjective> getLocationObjectives() {

        return _objectives;
    }

    @Override
    public List<IObjective> getVisualObjectives() {
        return _objectives;
    }

    public String toString() {
        String ret = "";

        boolean first = true;
        for(IObjective objective : _objectives) {
            if(first) {
                first = false;
            } else {
                ret += "; ";
            }

            ret += objective.toString();
        }

        return ret;
    }
}
