/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.rs.security.httpsignature;

import java.util.List;
import java.util.Map;

import org.apache.cxf.rs.security.httpsignature.provider.AlgorithmProvider;
import org.apache.cxf.rs.security.httpsignature.provider.PublicKeyProvider;
import org.apache.cxf.rs.security.httpsignature.provider.SecurityProvider;

public interface SignatureValidator {
    void validate(Map<String, List<String>> messageHeaders,
                  AlgorithmProvider algorithmProvider,
                  PublicKeyProvider publicKeyProvider,
                  SecurityProvider securityProvider,
                  String method,
                  String uri);

}
