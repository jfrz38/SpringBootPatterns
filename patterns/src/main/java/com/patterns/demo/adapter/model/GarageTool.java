package com.patterns.demo.adapter.model;

import com.patterns.demo.adapter.Garage;

public class GarageTool implements Garage {

	@Override
	public String addTool(String tool) {
		return new StringBuilder()
				.append(tool)
				.append(" added to garage")
				.toString();
	}

}
