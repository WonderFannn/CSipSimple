/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjmedia_snd_dev_info {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjmedia_snd_dev_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjmedia_snd_dev_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjmedia_snd_dev_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    pjsuaJNI.pjmedia_snd_dev_info_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return pjsuaJNI.pjmedia_snd_dev_info_name_get(swigCPtr, this);
  }

  public void setInput_count(long value) {
    pjsuaJNI.pjmedia_snd_dev_info_input_count_set(swigCPtr, this, value);
  }

  public long getInput_count() {
    return pjsuaJNI.pjmedia_snd_dev_info_input_count_get(swigCPtr, this);
  }

  public void setOutput_count(long value) {
    pjsuaJNI.pjmedia_snd_dev_info_output_count_set(swigCPtr, this, value);
  }

  public long getOutput_count() {
    return pjsuaJNI.pjmedia_snd_dev_info_output_count_get(swigCPtr, this);
  }

  public void setDefault_samples_per_sec(long value) {
    pjsuaJNI.pjmedia_snd_dev_info_default_samples_per_sec_set(swigCPtr, this, value);
  }

  public long getDefault_samples_per_sec() {
    return pjsuaJNI.pjmedia_snd_dev_info_default_samples_per_sec_get(swigCPtr, this);
  }

  public pjmedia_snd_dev_info() {
    this(pjsuaJNI.new_pjmedia_snd_dev_info(), true);
  }

}
