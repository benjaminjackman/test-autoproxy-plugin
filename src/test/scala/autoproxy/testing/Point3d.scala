package autoproxy.testing

import autoproxy.annotation.proxy


//////////////////////////////////////////////////////////////
// Copyright (c) 2010 Ben Jackman, Jeff Gomberg
// All Rights Reserved
// please contact ben@jackman.biz or jeff@cgtanalytics.com
// for licensing inquiries
//////////////////////////////////////////////////////////////

trait Point2d {
  def x: Int
  def y: Int
}

class Point2dImpl(x_ : Int, y_ : Int) extends Point2d {
  def x = x_
  override def y = y_
}

class Point3d(val point: Point2d, z: Int)

class Point3dProxyImplExt2d(@proxy val point: Point2dImpl, val z: Int) extends Point2d {
  def a = x
}

class Point3dProxyExtendsPoint2d(@proxy val point: Point2d, val z: Int) extends Point2d {
  def a = x
}
class Point3dProxyOverrideX(@proxy val point: Point2d, val z: Int) extends Point2d {
  override def x = 5
  def a = x
}

class Point3dProxy(@proxy val point: Point2d, val z: Int)

//TODO ERROR:
//src/test/scala/autoproxy/testing/Point3d.scala:35: error: method y overrides nothing
class Point3dProxyImpl(@proxy val point: Point2dImpl, val z: Int)

//Scratch area:
//case class Point3d(point: Point2d, z: Int)
//class Point3d(@proxy val point: Point2dImpl, val z: Int) {
//class Point3d(@proxy val point: Point2d, val z: Int) extends Point2d {
//class Point3d(val point: Point2d, val z: Int) {
