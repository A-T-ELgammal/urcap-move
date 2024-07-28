package com.TulipTechnologies.SampleMoveURCap.impl;

import java.io.InputStream;

import com.ur.urcap.api.contribution.ProgramNodeContribution;
import com.ur.urcap.api.contribution.ProgramNodeService;
import com.ur.urcap.api.domain.URCapAPI;
import com.ur.urcap.api.domain.data.DataModel;

public class SimpleMoveProgramNodeService implements ProgramNodeService{

    @Override
    public String getId() 
    {
        return "Simple Move Program!";    
    }

    @Override
    public boolean isDeprecated() {
        return false;
    }

    @Override
    public boolean isChildrenAllowed() {
        return false;
    }

    @Override
    public String getTitle() 
    {
        return "Simpele Move Program!";    
    }

    @Override
    public InputStream getHTML() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHTML'");
    }

    @Override
    public ProgramNodeContribution createNode(URCapAPI api, DataModel model) {
        return new SimpelMoveProgramNodeContribution(api, model);
    }

    
}
