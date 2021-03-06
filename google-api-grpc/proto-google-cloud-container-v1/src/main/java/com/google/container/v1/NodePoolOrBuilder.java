// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface NodePoolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NodePool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the node pool.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the node pool.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The node configuration of the pool.
   * </pre>
   *
   * <code>.google.container.v1.NodeConfig config = 2;</code>
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * The node configuration of the pool.
   * </pre>
   *
   * <code>.google.container.v1.NodeConfig config = 2;</code>
   */
  com.google.container.v1.NodeConfig getConfig();
  /**
   *
   *
   * <pre>
   * The node configuration of the pool.
   * </pre>
   *
   * <code>.google.container.v1.NodeConfig config = 2;</code>
   */
  com.google.container.v1.NodeConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The initial node count for the pool. You must ensure that your
   * Compute Engine &lt;a href="/compute/docs/resource-quotas"&gt;resource quota&lt;/a&gt;
   * is sufficient for this number of instances. You must also have available
   * firewall and routes quota.
   * </pre>
   *
   * <code>int32 initial_node_count = 3;</code>
   */
  int getInitialNodeCount();

  /**
   *
   *
   * <pre>
   * [Output only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 100;</code>
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 100;</code>
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * The version of the Kubernetes of this node.
   * </pre>
   *
   * <code>string version = 101;</code>
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The version of the Kubernetes of this node.
   * </pre>
   *
   * <code>string version = 101;</code>
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * [Output only] The resource URLs of the [managed instance
   * groups](/compute/docs/instance-groups/creating-groups-of-managed-instances)
   * associated with this node pool.
   * </pre>
   *
   * <code>repeated string instance_group_urls = 102;</code>
   */
  java.util.List<java.lang.String> getInstanceGroupUrlsList();
  /**
   *
   *
   * <pre>
   * [Output only] The resource URLs of the [managed instance
   * groups](/compute/docs/instance-groups/creating-groups-of-managed-instances)
   * associated with this node pool.
   * </pre>
   *
   * <code>repeated string instance_group_urls = 102;</code>
   */
  int getInstanceGroupUrlsCount();
  /**
   *
   *
   * <pre>
   * [Output only] The resource URLs of the [managed instance
   * groups](/compute/docs/instance-groups/creating-groups-of-managed-instances)
   * associated with this node pool.
   * </pre>
   *
   * <code>repeated string instance_group_urls = 102;</code>
   */
  java.lang.String getInstanceGroupUrls(int index);
  /**
   *
   *
   * <pre>
   * [Output only] The resource URLs of the [managed instance
   * groups](/compute/docs/instance-groups/creating-groups-of-managed-instances)
   * associated with this node pool.
   * </pre>
   *
   * <code>repeated string instance_group_urls = 102;</code>
   */
  com.google.protobuf.ByteString getInstanceGroupUrlsBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output only] The status of the nodes in this pool instance.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.Status status = 103;</code>
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * [Output only] The status of the nodes in this pool instance.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.Status status = 103;</code>
   */
  com.google.container.v1.NodePool.Status getStatus();

  /**
   *
   *
   * <pre>
   * [Output only] Additional information about the current status of this
   * node pool instance, if available.
   * </pre>
   *
   * <code>string status_message = 104;</code>
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * [Output only] Additional information about the current status of this
   * node pool instance, if available.
   * </pre>
   *
   * <code>string status_message = 104;</code>
   */
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * Autoscaler configuration for this NodePool. Autoscaler is enabled
   * only if a valid configuration is present.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 4;</code>
   */
  boolean hasAutoscaling();
  /**
   *
   *
   * <pre>
   * Autoscaler configuration for this NodePool. Autoscaler is enabled
   * only if a valid configuration is present.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 4;</code>
   */
  com.google.container.v1.NodePoolAutoscaling getAutoscaling();
  /**
   *
   *
   * <pre>
   * Autoscaler configuration for this NodePool. Autoscaler is enabled
   * only if a valid configuration is present.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 4;</code>
   */
  com.google.container.v1.NodePoolAutoscalingOrBuilder getAutoscalingOrBuilder();

  /**
   *
   *
   * <pre>
   * NodeManagement configuration for this NodePool.
   * </pre>
   *
   * <code>.google.container.v1.NodeManagement management = 5;</code>
   */
  boolean hasManagement();
  /**
   *
   *
   * <pre>
   * NodeManagement configuration for this NodePool.
   * </pre>
   *
   * <code>.google.container.v1.NodeManagement management = 5;</code>
   */
  com.google.container.v1.NodeManagement getManagement();
  /**
   *
   *
   * <pre>
   * NodeManagement configuration for this NodePool.
   * </pre>
   *
   * <code>.google.container.v1.NodeManagement management = 5;</code>
   */
  com.google.container.v1.NodeManagementOrBuilder getManagementOrBuilder();
}
