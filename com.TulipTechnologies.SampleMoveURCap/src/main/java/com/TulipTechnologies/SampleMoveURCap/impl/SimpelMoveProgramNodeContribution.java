package com.TulipTechnologies.SampleMoveURCap.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.ur.urcap.api.contribution.ProgramNodeContribution;
import com.ur.urcap.api.domain.URCapAPI;
import com.ur.urcap.api.domain.data.DataModel;
import com.ur.urcap.api.domain.script.ScriptWriter;

public class SimpelMoveProgramNodeContribution implements ProgramNodeContribution{

    private final URCapAPI api;
    private final DataModel model;

    public SimpelMoveProgramNodeContribution(URCapAPI api, DataModel model)
    {
        this.api = api;
        this.model = model;
    }

    @Override
    public void openView() {
        
    }

    @Override
    public void closeView() {
        
    }

    @Override
    public String getTitle() {
        return "Pick and Place Node!";
    }

    @Override
    public boolean isDefined() {
        return true;
    }

    @Override
    public void generateScript(ScriptWriter writer) 
    {

        try
        {
            InputStream inputStream = getClass().getResourceAsStream("/pickandplace.urscript");
            if (inputStream != null)
            {
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while((line = br.readLine()) != null)
                {
                    writer.appendLine(line);
                }
                br.close();
            }
            else
            {
                writer.appendLine("textmsg(\"Error: .urscript file not found\")");
            }

        }
        catch(IOException e)
        {
            writer.appendLine("textmsg(\"Error reading .urscript file: " + e.getMessage() + "\")");
        }


    }
}
