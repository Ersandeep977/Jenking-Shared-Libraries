def newgit(repo)
{
  git "${repo}"
}

def mvn()
{
  sh 'mvn package'
}

def scp1()
{
  sh 'scp /var/lib/jenkins/sa.txt ubuntu@172.31.20.2:/home/ubuntu'
}

def scp(a,b)
{
  sh 'scp /var/lib/jenkins/workspace/${a}/webapp/target/webapp.war ubuntu@${b}:/var/lib/tomcat9/webapps/testapp.war'
}
