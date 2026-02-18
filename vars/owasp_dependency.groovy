def call() {
    echo "Running OWASP Dependency Check..."
    dependencyCheck additionalArguments: '--format HTML --format XML', odcInstallation: 'DP-Check'
    // This assumes you named your tool 'DP-Check' in Jenkins Global Tool Configuration
}