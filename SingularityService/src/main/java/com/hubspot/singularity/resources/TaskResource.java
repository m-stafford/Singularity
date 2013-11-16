package com.hubspot.singularity.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.inject.Inject;
import com.hubspot.singularity.SingularityPendingTaskId;
import com.hubspot.singularity.SingularityTask;
import com.hubspot.singularity.SingularityTaskRequest;
import com.hubspot.singularity.data.RequestManager;
import com.hubspot.singularity.data.TaskManager;

@Path("/tasks")
@Produces({ MediaType.APPLICATION_JSON })
public class TaskResource {
  
  private final TaskManager taskManager;
  private final RequestManager requestManager;
    
  @Inject
  public TaskResource(TaskManager taskManager, RequestManager requestManager) {
    this.taskManager = taskManager;
    this.requestManager = requestManager;
  }
  
  @GET
  @Path("/scheduled")
  public List<SingularityTaskRequest> getScheduledTasks() {
    final List<SingularityPendingTaskId> taskIds = taskManager.getScheduledTasks();
    
    return requestManager.fetchTasks(taskIds);
  }
  
  @GET
  @Path("/active")
  public List<SingularityTask> getActiveTasks() {
    return taskManager.getActiveTasks();
  }

}