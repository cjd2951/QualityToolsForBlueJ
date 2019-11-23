# AcceptanceTest for QualityToolsExtension.jar

Due to the difficulty of JUnit tests developers created the following acceptance test to verify the start up functionality of the BlueJ application. 


# Steps 

1) Gradle build the project with JDK version 11
---
2) Copy the QualityToolsExtension.jar into the BlueJ applications extensions directory.
---
3) Open the BlueJ application
---
4) In the BlueJ application select **Help -> Installed Extensions**
	
          -Verify that the Quality Tools Extension displays in the window (see picture below)
<img width="498" alt="Screen Shot 2019-11-22 at 9 33 28 PM" src="https://user-images.githubusercontent.com/10522689/69473441-b78a9680-0d71-11ea-9b22-e54c952c2a1e.png">

---
5) In the BlueJ application select **BlueJ -> Preferences “Extensions Tab”**

          -Verify that the Quality Tools Extension displays in the window (see picture below)
<img width="798" alt="Screen Shot 2019-11-21 at 7 41 11 AM" src="https://user-images.githubusercontent.com/10522689/69473447-cec98400-0d71-11ea-9e82-2b14c9bbf872.png">
