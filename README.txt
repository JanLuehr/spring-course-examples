Einleitung
===========

Konventionen
------------
Bitte notieren Sie sich zu Beginn f�r die �bungen die Pfade zu folgenden Verzeichnissen:�	Netzlaufwerk auf dem die Software abgelegt ist: __________________________________ [DOWNLOAD_PATH]Wenn auf dieses Verzeichnis im folgenden verwiesen wird, dann ist dies durch [DOWNLOAD_PATH] gekennzeichnet. Fragen Sie bitte den Dozenten nach dem Ordner auf dem Netzlaufwerk.�	Lokales Verzeichnis auf dem Schulungsrechner, wo die Software installiert ist:__________________________________ [INSTALL_PATH](Default: C:/schulung/software).�	Und das lokale Verzeichnis in dem sich der Eclipse Workspace befindet:__________________________________ [WORKSPACE_PATH] (Default: C:/schulung/workspace).

Vorbereitung
------------�berpr�fen Sie, ob alle ben�tigten Softwarepakete auf dem Schulungsrechner korrekt und vollst�ndig im Verzeichnis [INSTALL_PATH] installiert sind.Sollte eine Softwarekomponente fehlen, m�ssen Sie diese nachinstallieren. Bevor Sie mit der Installation der Softwarepakte beginnen, pr�fen Sie, ob Sie auf dem Schulungsrechner lokale Administrationsrechte haben.Die Installationsdateien f�r die einzelnen Softwarepakete finden Sie im Verzeichnis [DOWNLOAD_PATH]/Software.F�r die Installation von Eclipse Plugins �ber den Eclipse Update Manager ist eine Internet-Verbindung notwendig. Pr�fen Sie die Einstellungen unter den Eclipse �Preferences > General > Network Connections�.

Entwicklungsumgebung einrichten
-------------------------------Ben�tigte Software- Java SE 6.0 (JDK 6 Update 31) oder Java SE 7u31- Maven 3.0.5- Installation von Eclipse 3.8.2 (Eclipse IDE for Java EE Developers - Juno ) incl. der Plug-ins:  -	Spring IDE 2.3.0   -	m2e Plugin 1.0.1004  (optional)
- Spring Framework 3.2.5.RELEASE - Apache Tomcat 6.0.32 oder 7.0.x - GlassFish v3.0.1  (optional)- SpringSource Tool Suite (Developer Edition) 3.2.0  (optional)

�bungen
=======
Im Unterverzeichnis 
 /demo 			- sind alle Beispiel
 /lab/student	- Aufgaben f�r den Teilnehmer
 /lab/trainer	- L�sungen vom Trainer
 
 Pr�fen des Workspace:
 mvn validate
 
 Bauen der �bungsumgebung
 mvn install
  
 Erstellen der Dokumentation:
 mvn site 
 mvn site:attach-descriptor site-deploy
 
 �ffnen der Dokumentation:
 file:///Users/tf/helloWorldSpring/index.html
 