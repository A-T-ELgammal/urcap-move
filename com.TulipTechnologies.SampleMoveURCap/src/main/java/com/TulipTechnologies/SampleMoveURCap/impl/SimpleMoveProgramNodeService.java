package com.TulipTechnologies.SampleMoveURCap.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

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
       String htmlContent = "<html>" +
                             "<head>" +
                             "<title>Pick and Place Move!</title>" +
                             "</head>" +
                             "<body>" +
                             "<h1>implement the urscript in URcap </h1>" +
                             "<p>This is a default HTML content for the URCap.</p>" +
                             "</body>" +
                             "</html>";
        InputStream htmlStream = new ByteArrayInputStream(htmlContent.getBytes(StandardCharsets.UTF_8));
        return  htmlStream;

    }

    @Override
    public ProgramNodeContribution createNode(URCapAPI api, DataModel model) {
        return new SimpelMoveProgramNodeContribution(api, model);
    }

    
}
