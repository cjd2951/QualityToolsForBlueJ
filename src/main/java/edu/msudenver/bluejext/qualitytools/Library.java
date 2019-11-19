package edu.msudenver.bluejext.qualitytools;

import bluej.extensions.*;
import bluej.extensions.event.*;

import java.net.URL;

/**
 * This is the starting point of the BlueJ Extension
 *
 * @see bluej.extensions.event.PackageListener
 * @see bluej.extensions.Extension
 */
public class Library extends Extension implements PackageListener {

    /**
     * @param bluej instance of BlueJ this extension should register with
     */
    @Override
    public void startup(BlueJ bluej) {}

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
        //TODO make this version a project property
        return ("0.0.01");
    }

    /**
     * @return The user-visible name of this extension
     */
    @Override
    public String getName() {
        //TODO make this name a project property
        return ("Quality Tools");
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
        //TODO make this description a project property
        return ("BlueJ extension that integrates quality assessment tools");
    }

    /**
     * @return A URL where you can find info on this extension.
     */
    @Override
    public URL getURL() {
        try {
            //TODO make this URL a project property
            return new URL("https://github.com/MetroCS/QualityToolsForBlueJ");
        } catch (Exception e) {
            // The link is either dead or otherwise unreachable
            System.out.println("Quality Tools: getURL: Exception=" + e.getMessage());
            return null;
        }
    }
}
