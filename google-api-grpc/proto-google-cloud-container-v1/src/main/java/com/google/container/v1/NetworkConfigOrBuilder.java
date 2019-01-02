// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface NetworkConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1.NetworkConfig.network](/compute/docs/networks-and-firewalls#networks) to which
   * the cluster is connected.
   * Example: projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1.NetworkConfig.network](/compute/docs/networks-and-firewalls#networks) to which
   * the cluster is connected.
   * Example: projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](/compute/docs/vpc) to which the cluster is connected.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   */
  com.google.protobuf.ByteString getSubnetworkBytes();
}