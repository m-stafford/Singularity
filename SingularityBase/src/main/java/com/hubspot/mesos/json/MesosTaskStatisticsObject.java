package com.hubspot.mesos.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MesosTaskStatisticsObject {
  private final int cpusLimit;
  private final int cpusNrPeriods;
  private final int cpusNrThrottled;
  private final float cpusSystemTimeSecs;
  private final float cpusThrottledTimeSecs;
  private final float cpusUserTimeSecs;
  private final long memAnonBytes;
  private final long memFileBytes;
  private final long memLimitBytes;
  private final long memMappedFileBytes;
  private final long memRssBytes;
  private final double timestamp;

  @JsonCreator
  public MesosTaskStatisticsObject(@JsonProperty("cpus_limit") int cpusLimit,
                                   @JsonProperty("cpus_nr_periods") int cpusNrPeriods,
                                   @JsonProperty("cpus_nr_throttled") int cpusNrThrottled,
                                   @JsonProperty("cpus_system_time_secs") float cpusSystemTimeSecs,
                                   @JsonProperty("cpus_throttled_time_secs") float cpusThrottledTimeSecs,
                                   @JsonProperty("cpus_user_time_secs") float cpusUserTimeSecs,
                                   @JsonProperty("mem_anon_bytes") long memAnonBytes,
                                   @JsonProperty("mem_file_bytes") long memFileBytes,
                                   @JsonProperty("mem_limit_bytes") long memLimitBytes,
                                   @JsonProperty("mem_mapped_file_bytes") long memMappedFileBytes,
                                   @JsonProperty("mem_rss_bytes") long memRssBytes,
                                   @JsonProperty("timestamp") double timestamp) {
    this.cpusLimit = cpusLimit;
    this.cpusNrPeriods = cpusNrPeriods;
    this.cpusNrThrottled = cpusNrThrottled;
    this.cpusSystemTimeSecs = cpusSystemTimeSecs;
    this.cpusThrottledTimeSecs = cpusThrottledTimeSecs;
    this.cpusUserTimeSecs = cpusUserTimeSecs;
    this.memAnonBytes = memAnonBytes;
    this.memFileBytes = memFileBytes;
    this.memLimitBytes = memLimitBytes;
    this.memMappedFileBytes = memMappedFileBytes;
    this.memRssBytes = memRssBytes;
    this.timestamp = timestamp;
  }

  public int getCpusLimit() {
    return cpusLimit;
  }

  public int getCpusNrPeriods() {
    return cpusNrPeriods;
  }

  public int getCpusNrThrottled() {
    return cpusNrThrottled;
  }

  public float getCpusSystemTimeSecs() {
    return cpusSystemTimeSecs;
  }

  public float getCpusThrottledTimeSecs() {
    return cpusThrottledTimeSecs;
  }

  public float getCpusUserTimeSecs() {
    return cpusUserTimeSecs;
  }

  public long getMemAnonBytes() {
    return memAnonBytes;
  }

  public long getMemFileBytes() {
    return memFileBytes;
  }

  public long getMemLimitBytes() {
    return memLimitBytes;
  }

  public long getMemMappedFileBytes() {
    return memMappedFileBytes;
  }

  public long getMemRssBytes() {
    return memRssBytes;
  }

  public double getTimestamp() {
    return timestamp;
  }

  @Override
  public String toString() {
    return "MesosTaskStatisticsObject [" +
        "cpusLimit=" + cpusLimit +
        ", cpusNrPeriods=" + cpusNrPeriods +
        ", cpusNrThrottled=" + cpusNrThrottled +
        ", cpusSystemTimeSecs=" + cpusSystemTimeSecs +
        ", cpusThrottledTimeSecs=" + cpusThrottledTimeSecs +
        ", cpusUserTimeSecs=" + cpusUserTimeSecs +
        ", memAnonBytes=" + memAnonBytes +
        ", memFileBytes=" + memFileBytes +
        ", memLimitBytes=" + memLimitBytes +
        ", memMappedFileBytes=" + memMappedFileBytes +
        ", memRssBytes=" + memRssBytes +
        ", timestamp=" + timestamp +
        ']';
  }
}
