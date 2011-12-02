package com.canoo.projectgenerator



import grails.test.mixin.*
import org.junit.*
import org.eclipse.jgit.api.Git
import com.canoo.projectgenerator.admin.Project

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(GitService)
class GitServiceTests {

    GitService gitProjectService

    @Before
    void setUp() {
        gitProjectService = new GitService()
    }


    @Test
    void testCreateEmptyGitDir() {
        Project project = new Project(name: "test", description: "an empty git dir")
        Git repository = gitProjectService.createEmptyGitRepository(project)
        assertNotNull("Could not create git repository", repository)
    }
}
