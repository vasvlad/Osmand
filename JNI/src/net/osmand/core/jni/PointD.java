/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class PointD {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PointD(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PointD obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OsmAndCoreJNI.delete_PointD(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(double value) {
    OsmAndCoreJNI.PointD_x_set(swigCPtr, this, value);
  }

  public double getX() {
    return OsmAndCoreJNI.PointD_x_get(swigCPtr, this);
  }

  public void setY(double value) {
    OsmAndCoreJNI.PointD_y_set(swigCPtr, this, value);
  }

  public double getY() {
    return OsmAndCoreJNI.PointD_y_get(swigCPtr, this);
  }

  public PointD() {
    this(OsmAndCoreJNI.new_PointD__SWIG_0(), true);
  }

  public PointD(PointD that) {
    this(OsmAndCoreJNI.new_PointD__SWIG_1(PointD.getCPtr(that), that), true);
  }

  public PointD(double x, double y) {
    this(OsmAndCoreJNI.new_PointD__SWIG_2(x, y), true);
  }

}