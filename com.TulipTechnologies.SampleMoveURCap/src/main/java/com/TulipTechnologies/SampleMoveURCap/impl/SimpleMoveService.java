package com.TulipTechnologies.SampleMoveURCap.impl;

import com.ur.urcap.api.contribution.InstallationNodeContribution;
import com.ur.urcap.api.domain.script.ScriptWriter;

public class SimpleMoveService implements InstallationNodeContribution{

    @Override
    public void openView() {
        // TODO Auto-generated method stub
        
    }
    

    @Override
    public void closeView() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void generateScript(ScriptWriter writer) {
        writer.appendLine("movej([0.1, -0.5, 1.2, -1.0, 0.5, 0.3], a=1.2, v=0.25)\n");
        writer.appendLine("movej([0.0, -1.57, 1.57, -1.57, 1.57, 0.0], a=1.2, v=0.25)\n");

    }
    
}
