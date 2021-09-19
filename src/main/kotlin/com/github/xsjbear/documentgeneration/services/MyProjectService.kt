package com.github.xsjbear.documentgeneration.services

import com.intellij.openapi.project.Project
import com.github.xsjbear.documentgeneration.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
