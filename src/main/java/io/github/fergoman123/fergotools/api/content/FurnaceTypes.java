package io.github.fergoman123.fergotools.api.content;

public enum FurnaceTypes {
	
	quartz("quartzFurnaceIdle", "quartzFurnaceActive", "quartzFurnace"),
	obsidian("obsidianFurnaceIdle", "obsidianFurnaceActive", "obsidianFurnace"),
	emerald("emeraldFurnaceIdle", "obsidianFurnaceActive", "emeraldFurnace");
	private String idleName;
	private String activeName;
	private String guiTexture;
	
	private FurnaceTypes(String idleName, String activeName, String guiTexture) {
		this.idleName = idleName;
		this.activeName = activeName;
		this.guiTexture = guiTexture;
	}

	public String getIdleName() {
		return idleName;
	}

	public String getActiveName() {
		return activeName;
	}

	public String getGuiTexture() {
		return guiTexture;
	}
	
		
}
