job('NodeJS HelloWorld') {
    scm {
        git('git://github.com/DiogoSimaoMadeira/Node-Helloword.git') 
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
