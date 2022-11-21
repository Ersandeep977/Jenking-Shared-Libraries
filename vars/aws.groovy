withCredentials([[ 
                $class: 'AmazonWebServicesCredentialsBinding', 
                credentialsId: 'AWS-Jenkins-Ec2-Full-acess', 
                accessKeyVariable: 'AWS_ACCESS_KEY_ID', 
                secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']])
