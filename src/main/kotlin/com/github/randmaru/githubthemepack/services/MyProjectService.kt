package com.github.randmaru.githubthemepack.services

import com.intellij.openapi.project.Project
import com.github.randmaru.githubthemepack.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
