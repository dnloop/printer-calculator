package io.dnloop.logic;

import java.util.prefs.Preferences;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.dnloop.model.Maintenance;
import io.dnloop.model.Material;

public class PreferenceSettings {

    private Preferences preferences;

    private ObjectMapper objectMapper;

    private String result;

    public PreferenceSettings() {
	result = null;
	objectMapper = new ObjectMapper();
	preferences = Preferences.userNodeForPackage(Preferences.class);
    }

    public String getMaterial(Material material) {
	try {
	    result = preferences.get("MATERIAL", objectMapper.writeValueAsString(material));
	} catch (JsonProcessingException e) {
	    e.printStackTrace();
	}

	return result;
    }

    public void setMaterial(Material material) {
	try {
	    preferences.get("MATERIAL", objectMapper.writeValueAsString(material));
	} catch (JsonProcessingException e) {
	    e.printStackTrace();
	}
    }

    public String getMaintenance(Maintenance maintenance) {
	try {
	    result = preferences.get("MAINTENANCE", objectMapper.writeValueAsString(maintenance));
	} catch (JsonProcessingException e) {
	    e.printStackTrace();
	}

	return result;
    }

    public void setMaintenance(Maintenance maintenance) {
	try {
	    preferences.get("MAINTENANCE", objectMapper.writeValueAsString(maintenance));
	} catch (JsonProcessingException e) {
	    e.printStackTrace();
	}
    }

    public String getPrinterConsumption(Integer printerConsumption) {
	try {
	    result = preferences.get("PRINTERCONSUMPTION", objectMapper.writeValueAsString(printerConsumption));
	} catch (JsonProcessingException e) {
	    e.printStackTrace();
	}

	return result;
    }

    public void setPrinterConsumption(Integer printerConsumption) {
	try {
	    preferences.get("PRINTERCONSUMPTION", objectMapper.writeValueAsString(printerConsumption));
	} catch (JsonProcessingException e) {
	    e.printStackTrace();
	}
    }

    public Preferences getPreferences() {
	return preferences;
    }

    public void setPreferences(Preferences preferences) {
	this.preferences = preferences;
    }
}
