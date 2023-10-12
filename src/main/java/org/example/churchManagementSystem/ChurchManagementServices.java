package org.example.churchManagementSystem;

import org.example.churchManagementSystem.entities.Education;
import org.example.churchManagementSystem.entities.Finance;
import org.example.churchManagementSystem.entities.Sermon;

public interface ChurchManagementServices {
    Sermon preaching();
    Finance finance();
    void charity();
    Education training();
}
