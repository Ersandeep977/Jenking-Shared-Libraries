def newgit(repo)
{
  git "${repo}"
}

def mvn()
{
  sh 'mvn package'
}
