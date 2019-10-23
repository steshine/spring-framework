package cn.steshine.readnote;

import org.springframework.beans.factory.FactoryBean;

public class ToolFactory implements FactoryBean<Tool> {
	private int id;
	private int factoryId;



	@Override
	public Tool getObject() throws Exception {
		return new Tool(id);
	}

	@Override
	public Class<?> getObjectType() {
		return Tool.class;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(int factoryId) {
		this.factoryId = factoryId;
	}
}
