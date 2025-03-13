# MyAndroidTestLibrary
MyAndroidTestLibrary

Step 1. Add the JitPack repository to your build file
...build.gradle file in project level gradle:

	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }   // add in the buildScript { repositories {} section
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.ShraddhaKudale:MyAndroidTestLibrary:Tag'  // Tag is your library version like 1.0.0
	}
