package com.patterns.demo.adapter.model;

import com.patterns.demo.adapter.Basement;
import com.patterns.demo.adapter.Garage;

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
