def call(String repoUrl, String branch) {
    echo "Checking out code from ${repoUrl} (branch: ${branch})"
    checkout([
        $class: 'GitSCM', 
        branches: [[name: branch]], 
        userRemoteConfigs: [[url: repoUrl, credentialsId: 'githubToken']]
    ])
}