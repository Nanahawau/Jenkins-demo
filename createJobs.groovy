pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('ecommerce-app') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Nanahawau/Ecommerce-Application.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}