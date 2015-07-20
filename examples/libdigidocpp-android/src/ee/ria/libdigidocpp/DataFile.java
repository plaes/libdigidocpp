/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ee.ria.libdigidocpp;

public class DataFile {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected DataFile(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataFile obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        digidocJNI.delete_DataFile(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String id() {
    return digidocJNI.DataFile_id(swigCPtr, this);
  }

  public String fileName() {
    return digidocJNI.DataFile_fileName(swigCPtr, this);
  }

  public long fileSize() {
    return digidocJNI.DataFile_fileSize(swigCPtr, this);
  }

  public String mediaType() {
    return digidocJNI.DataFile_mediaType(swigCPtr, this);
  }

  public byte[] calcDigest(String method) {
    return digidocJNI.DataFile_calcDigest(swigCPtr, this, method);
  }

  public void saveAs(String path) {
    digidocJNI.DataFile_saveAs(swigCPtr, this, path);
  }

}
