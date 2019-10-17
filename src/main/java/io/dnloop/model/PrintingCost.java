package io.dnloop.model;

public class PrintingCost {

    private Energy energy;

    private Maintenance maintenance;

    private Material material;

    private Job job;

    public PrintingCost() {
    }

    public PrintingCost(Energy energy, Maintenance maintenance, Material material, Job job) {
	super();
	this.energy = energy;
	this.maintenance = maintenance;
	this.material = material;
	this.job = job;
    }

    public Energy getEnergy() {
	return energy;
    }

    public void setEnergy(Energy energy) {
	this.energy = energy;
    }

    public Maintenance getMaintenance() {
	return maintenance;
    }

    public void setMaintenance(Maintenance maintenance) {
	this.maintenance = maintenance;
    }

    public Material getMaterial() {
	return material;
    }

    public void setMaterial(Material material) {
	this.material = material;
    }

    public Job getJob() {
	return job;
    }

    public void setJob(Job job) {
	this.job = job;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((energy == null) ? 0 : energy.hashCode());
	result = prime * result + ((job == null) ? 0 : job.hashCode());
	result = prime * result + ((maintenance == null) ? 0 : maintenance.hashCode());
	result = prime * result + ((material == null) ? 0 : material.hashCode());
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
	PrintingCost other = (PrintingCost) obj;
	if (energy == null) {
	    if (other.energy != null)
		return false;
	} else if (!energy.equals(other.energy))
	    return false;
	if (job == null) {
	    if (other.job != null)
		return false;
	} else if (!job.equals(other.job))
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
	return true;
    }

    @Override
    public String toString() {
	return "PrintingCost [energy=" + energy + ", maintenance=" + maintenance + ", material=" + material + ", job="
		+ job + "]";
    }

}
