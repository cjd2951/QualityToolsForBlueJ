package edu.msudenver.bluejext.qualitytools;

import bluej.extensions.*;
import bluej.extensions.event.*;

import java.net.URL;
import javax.swing.*;

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
 * Register an instance of PreferenceGenerator with the BlueJ proxy object
 *
 * @version 0.1 12 Dec 2019
 *
 * @author Derek Holsapple  
 * @author Eric Armstrong
 * @author Ahmed Samay
 * @author Ren White
 * @author Shae Cloud
 * @author Nate Prudhomme
 * 
 * @see bluej.extensions.PreferenceGenerator
 */
class Preferences implements PreferenceGenerator
    {
        /** The Jpanel comprising this Preference */
        private JPanel myPanel;
        /** Invokes BlueJ proxy object for this Preference */
        private BlueJ bluej;

        /**
         * Instantiate an object of the Preferences class and then register
         * it with the BlueJ proxy object.
         *
         * @param bluej  BlueJ proxy object
         */
        public Preferences(BlueJ bluej)
        {
            this.bluej = bluej;
            myPanel = new JPanel();
            myPanel.add (new JLabel ("Quality Analysis Tools"));
            // Load the JPanel preference data
            loadValues();
        }
        /**
         * Bluej will call this method to get the panel where preferences 
         * for this extension are         
         *
         * @return JPanel to contain preference data
         */
        public JPanel getPanel () {
            return myPanel;
        }
        /**   
         * Method to save values from the preference panel into its 
         * internal state
         */
        public void saveValues () {
        }
        /**
         * Method to load its current values into its preference panel
         */
        public void loadValues () {
            //TODO implement JPanel options
        }
    }
