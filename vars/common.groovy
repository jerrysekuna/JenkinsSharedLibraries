def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       //sh "mvn clean package"
       sh "${mavenHome}/bin/mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     {
       sh "mvn clean deploy"
     }
}
