/*
 * This Scala source file was generated by the Gradle 'init' task.
 */
package taller


object App {

  def main(args: Array[String]): Unit = {
    println(greeting())

  }
  def greeting(): String = "Hello!, world!!!"

  val movimientos = new TorresHanoi().movsTorresHanoi(3)
  println(s"El número de movimientos es: $movimientos")
}
