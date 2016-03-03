import java.io.File

/**
  * Created by liuhang on 2016/3/3.
  */
class ReadFileInDir {
  def main(args: Array[String]) {

  }

  def subdirs(dir:File):Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }

}
