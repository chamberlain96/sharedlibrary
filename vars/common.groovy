def call  (String  stageName){
    if ("${stageName}" == "Build"){
        sh "mvn clean package"
    }
    else if("${stageName}" == "sonarqube analysis"){
        sh "mvn sonar:sonar"
    }
    else if("${stageName}" == "uploadartifacts"){
        sh "mvn deploy"
    }
}
