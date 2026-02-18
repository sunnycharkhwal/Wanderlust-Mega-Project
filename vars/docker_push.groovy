def call(String imageName, String tag, String hubUser) {
    echo "Pushing Docker Image: ${hubUser}/${imageName}:${tag}"
    
    // 'docker-hub-creds' is the ID of the credentials you create in Jenkins
    withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', 
                                    passwordVariable: 'DOCKER_HUB_PASSWORD', 
                                    usernameVariable: 'DOCKER_HUB_USERNAME')]) {
        sh "echo ${DOCKER_HUB_PASSWORD} | docker login -u ${DOCKER_HUB_USERNAME} --password-stdin"
        sh "docker push ${hubUser}/${imageName}:${tag}"
    }
}