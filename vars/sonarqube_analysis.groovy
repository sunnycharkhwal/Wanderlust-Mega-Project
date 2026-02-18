def call(String sonarTool, String projectKey, String projectName) {
    def scannerHome = tool sonarTool
    withSonarQubeEnv('SonarQube') { // 'SonarQube' must match your System Config name
        sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=${projectKey} -Dsonar.projectName=${projectName}"
    }
}