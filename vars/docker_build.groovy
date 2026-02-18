def call(String imageName, String tag, String hubUser) {
    echo "Building Docker Image: ${hubUser}/${imageName}:${tag}"
    sh "docker build -t ${hubUser}/${imageName}:${tag} ."
}