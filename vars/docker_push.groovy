def call(String imageName, String tag, String hubUser) {
    echo "Pushing Docker Image: ${hubUser}/${imageName}:${tag}"
    // Note: This requires you to be wrapped in a 'withCredentials' block 
    // or previously logged in via 'docker login' on the agent.
    sh "docker push ${hubUser}/${imageName}:${tag}"
}