/* sbt -- Simple Build Tool
 * Copyright  2010 Mark Harrah
 */
package object sbt extends sbt.std.TaskExtra with sbt.Types with sbt.ProcessExtra with sbt.impl.DependencyBuilders with sbt.PathExtra with sbt.ProjectConstructors
{
	type File = java.io.File
	type URI = java.net.URI
	implicit def maybeToOption[S](m: xsbti.Maybe[S]): Option[S] =
		if(m.isDefined) Some(m.get) else None
	def uri(s: String): URI = new URI(s)
	def file(s: String): File = new File(s)
}
