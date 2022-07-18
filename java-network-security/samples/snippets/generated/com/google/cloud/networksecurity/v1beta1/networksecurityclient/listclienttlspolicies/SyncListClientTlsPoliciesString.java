/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.networksecurity.v1beta1.samples;

// [START networksecurity_v1beta1_generated_networksecurityclient_listclienttlspolicies_string_sync]
import com.google.cloud.networksecurity.v1beta1.ClientTlsPolicy;
import com.google.cloud.networksecurity.v1beta1.LocationName;
import com.google.cloud.networksecurity.v1beta1.NetworkSecurityClient;

public class SyncListClientTlsPoliciesString {

  public static void main(String[] args) throws Exception {
    syncListClientTlsPoliciesString();
  }

  public static void syncListClientTlsPoliciesString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (NetworkSecurityClient networkSecurityClient = NetworkSecurityClient.create()) {
      String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
      for (ClientTlsPolicy element :
          networkSecurityClient.listClientTlsPolicies(parent).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END networksecurity_v1beta1_generated_networksecurityclient_listclienttlspolicies_string_sync]
