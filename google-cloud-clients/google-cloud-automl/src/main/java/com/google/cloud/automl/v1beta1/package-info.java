/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Cloud AutoML API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= PredictionServiceClient =======================
 *
 * <p>Service Description: AutoML Prediction API.
 *
 * <p>Sample for PredictionServiceClient:
 *
 * <pre>
 * <code>
 * try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
 *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
 *   ExamplePayload payload = ExamplePayload.newBuilder().build();
 *   Map&lt;String, String&gt; params = new HashMap&lt;&gt;();
 *   PredictResponse response = predictionServiceClient.predict(name, payload, params);
 * }
 * </code>
 * </pre>
 *
 * ============ AutoMlClient ============
 *
 * <p>Service Description: AutoML Server API.
 *
 * <p>The resource names are assigned by the server. The server never reuses names that it has
 * created after the resources with those names are deleted.
 *
 * <p>An ID of a resource is the last element of the item's resource name. For
 * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`, then the id for the item
 * is `{dataset_id}`.
 *
 * <p>Sample for AutoMlClient:
 *
 * <pre>
 * <code>
 * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   Dataset dataset = Dataset.newBuilder().build();
 *   Dataset response = autoMlClient.createDataset(parent, dataset);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.automl.v1beta1;
