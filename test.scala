import com.rackspacecloud.client.cloudfiles.{FilesAuthorizationException, FilesException, FilesNotFoundException, FilesClient}

object CloudFilesJava {
  private lazy val client = new FilesClient(???, ???, ???)
}