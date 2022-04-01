package com.github.levviathan.bddframeworkplugin.services

import com.intellij.openapi.project.Project
import com.github.levviathan.bddframeworkplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
