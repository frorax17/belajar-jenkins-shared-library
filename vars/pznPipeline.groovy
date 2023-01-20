def call(Map config){
    if(config.type == "maven"){
        mavenPipline()
    }else{
        pipeline{
            agent any
            stages{
                stage("Unsupported Pipeline"){
                    steps {
                        script{
                            echo("Unsupport Pipeline")
                        }
                    }
                }
            }
        }

    }
}