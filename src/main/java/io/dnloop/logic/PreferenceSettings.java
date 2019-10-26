package io.dnloop.logic;

import java.io.IOException;
import java.util.prefs.Preferences;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.dnloop.model.Printer;

public class PreferenceSettings {

    private Preferences preferences;

    private ObjectMapper objectMapper;

    private String result;

    public PreferenceSettings() {
	result = null;
	objectMapper = new ObjectMapper();
	preferences = Preferences.userNodeForPackage(Preferences.class);
    }

    public Printer getPrinter(Printer printer) {
	try {
	    result = preferences.get("PRINTER", objectMapper.writeValueAsString(printer));
	} catch (JsonProcessingException e) {
	    e.printStackTrace();
	}

	try {
	    return objectMapper.readValue(result, Printer.class);
	} catch (IOException e) {
	    e.printStackTrace();
	}

	return null;
    }

    public void setPrinter(Printer printer) {
	try {
	    preferences.put("PRINTER", objectMapper.writeValueAsString(printer));
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
