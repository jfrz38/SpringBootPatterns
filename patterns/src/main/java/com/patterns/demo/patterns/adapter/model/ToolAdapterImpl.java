package com.patterns.demo.patterns.adapter.model;

import com.patterns.demo.patterns.adapter.Basement;
import com.patterns.demo.patterns.adapter.Garage;

public class ToolAdapterImpl implements Garage {

	Basement tool;
	public ToolAdapterImpl(Basement tool) {
		this.tool = tool;
	}

	@Override
	public String addTool(String tool) {
		return this.tool.newThing(tool);
	}

}
