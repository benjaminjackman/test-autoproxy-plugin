package autoproxy.testing

//import junit.framework.Assert.assertEquals
//import autoproxy.annotation.proxy
//import junit.framework.{TestSuite}
//import org.junit.Test
//import autoproxy.annotation.proxy


//////////////////////////////////////////////////////////////
// Copyright (c) 2010 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
//////////////////////////////////////////////////////////////

//scalac -verbose -sourcepath src/main/scala/:src/test/scala/ -d ./target/ `find src/main/scala src/test/scala/ -name *.scala`

//class TestAutoproxy extends TestSuite {
//  @Test
//  def testIt() {
//    val p1 = new Point2d {
//      val x = 1
//      val y = 2
//    }
//    //val p2 = new Point3d(p1, 3)
////    val p1x = p2.x
////    assertEquals(p2.x, 1)
////    assertEquals(p2.y, 2)
////    assertEquals(p2.z, 3)
////    assertEquals(p2.z, 5)
//
//  }
//
////  def testAutoproxy {
////    val p1 = new Point2d {
////      val x = 1
////      val y = 2
////    }
////    val p2 = Point3d(p1, 3)
//////    val p1x = p2.x
//////    assertEquals(p2.x, 1)
//////    assertEquals(p2.y, 2)
//////    assertEquals(p2.z, 3)
//////    assertEquals(p2.z, 5)
////  }
//
//}