package com.canoo.projectgenerator

import org.eclipse.jgit.api.InitCommand
import org.eclipse.jgit.api.Git
import com.canoo.projectgenerator.admin.Project

class GitService {

    static transactional = true

    Git createEmptyGitRepository(Project project) {
        File dir = new File('gitdir/'+project.name)
        Git gitRep = new InitCommand(bare: true, directory: dir).call()
        return gitRep
    }
}
