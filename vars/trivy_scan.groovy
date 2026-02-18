def call() {
    echo "Running Trivy Filesystem Scan..."
    // Scans the current directory and outputs to a report file
    sh 'trivy fs . --format table -o trivy-fs-report.html'
}