package io.dnloop.model;

public class Settings {

    private Parts parts;

    private Maintenance maintenance;

    private Energy energy;

    private Material material;

    public Settings() {
    }

    public Settings(Parts parts, Maintenance maintenance, Energy energy, Material material) {
	super();
	this.parts = parts;
	this.maintenance = maintenance;
	this.energy = energy;
	this.material = material;
    }

    public Maintenance getMaintenance() {
	return maintenance;
    }

    public void setMaintenance(Maintenance maintenance) {
	this.maintenance = maintenance;
    }

    public Energy getEnergy() {
	return energy;
    }

    public void setEnergy(Energy energy) {
	this.energy = energy;
    }

    public Material getMaterial() {
	return material;
    }

    public void setMaterial(Material material) {
	this.material = material;
    }

    public Parts getParts() {
	return parts;
    }

    public void setParts(Parts parts) {
	this.parts = parts;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((energy == null) ? 0 : energy.hashCode());
	result = prime * result + ((maintenance == null) ? 0 : maintenance.hashCode());
	result = prime * result + ((material == null) ? 0 : material.hashCode());
	result = prime * result + ((parts == null) ? 0 : parts.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Settings other = (Settings) obj;
	if (energy == null) {
	    if (other.energy != null)
		return false;
	} else if (!energy.equals(other.energy))
	    return false;
	if (maintenance == null) {
	    if (other.maintenance != null)
		return false;
	} else if (!maintenance.equals(other.maintenance))
	    return false;
	if (material == null) {
	    if (other.material != null)
		return false;
	} else if (!material.equals(other.material))
	    return false;
	if (parts == null) {
	    if (other.parts != null)
		return false;
	} else if (!parts.equals(other.parts))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Settings [parts=" + parts + ", maintenance=" + maintenance + ", energy=" + energy + ", material="
		+ material + "]";
    }

}
