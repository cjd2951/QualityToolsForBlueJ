package edu.msudenver.bluejext.qualitytools;

import bluej.extensions.*;
import bluej.extensions.event.*;

import java.net.URL;
import javax.swing.*;
import java.awt.event.*;

/**
 * This is the starting point of the BlueJ Extension
 *
 * @see bluej.extensions.event.PackageListener
 * @see bluej.extensions.Extension
 */
public class QualityToolsExtension extends Extension implements PackageListener {

    private final String PROJECT_NAME = "Quality Tools";
    private final String PROJECT_DESCRIPTION = "BlueJ extension that integrates quality assessment tools";
    private final String PROJECT_URL = "https://metrocs.github.io/QualityToolsForBlueJ";
    private final String PROJECT_VERSION = "0.0.01";

    /**
     * @param bluej instance of BlueJ this extension should register with
     */
    @Override
    public void startup(BlueJ bluej) {

        // Register a "preferences" panel generator
        Preferences myPreferences = new Preferences(bluej);
        bluej.setPreferenceGenerator(myPreferences);

    }

    /**
     * @param ev package event containing BlueJ event information
     */
    @Override
    public void packageOpened(PackageEvent ev) {}

    /**
     * @param ev package event containing project information
     */
    @Override
    public void packageClosing(PackageEvent ev) {}

    /**
     * @return If this Extension is compatible with the current release of the BlueJ Extensions API
     */
    @Override
    public boolean isCompatible() {
        //TODO implement proper compatibility logic
        return true;
    }

    /**
     * @return The version number of this extension
     */
    @Override
    public String getVersion() {
        return PROJECT_VERSION;
    }

    /**
     * @return The user-visible name of this extension
     */
    @Override
    public String getName() {
        return PROJECT_NAME;
    }

    /**
     * Terminates the extension
     */
    @Override
    public void terminate() {
        //TODO implement terminate
    }

    /**
     * @return The description of the extension
     */
    @Override
    public String getDescription() {
        return PROJECT_DESCRIPTION;
    }

    /**
     * @return A URL where you can find info on this extension.
     */
    @Override
    public URL getURL() {
        try {
            return new URL(PROJECT_URL);
        } catch (Exception e) {
            // The link is either dead or otherwise unreachable
            System.out.println(PROJECT_NAME + ": getURL: Exception=" + e.getMessage());
            return null;
        }
    }
}

/**
 * Create a Preference Panel located in the BlueJ application
 * BlueJ -> Preferences -> Extensions Tab
 */
class Preferences implements PreferenceGenerator
{
    private JPanel myPanel;
    private JTextField color;
    private BlueJ bluej;
    public static final String PROFILE_LABEL="Quality-Analysis-Tools";

    // Construct the panel, and initialise it from any stored values
    public Preferences(BlueJ bluej)
    {
        this.bluej = bluej;
        myPanel = new JPanel();
        myPanel.add (new JLabel ("Quality Analysis Tools"));
        color = new JTextField (40);
        myPanel.add (color);
        // Load the default value
        loadValues();
    }

    public JPanel getPanel () { return myPanel; }

    public void saveValues ()
    {
        // Save the preference value in the BlueJ properties file
        bluej.setExtensionPropertyString(PROFILE_LABEL, color.getText());
    }

    public void loadValues ()
    {
        // Load the property value from the BlueJ proerties file,
        // default to an empty string
        color.setText(bluej.getExtensionPropertyString(PROFILE_LABEL,""));
    }
}