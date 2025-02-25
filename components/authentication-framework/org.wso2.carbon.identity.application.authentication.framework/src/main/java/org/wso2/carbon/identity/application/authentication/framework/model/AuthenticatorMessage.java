/*
 * Copyright (c) 2023, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.authentication.framework.model;

import org.wso2.carbon.identity.application.authentication.framework.util.FrameworkConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds the messages related to an authenticator which requires to populate {@Code AuthenticatorData}
 * during an authentication flow. This contains messages related details specific to authentication flow.
 */
public class AuthenticatorMessage {

    private FrameworkConstants.AuthenticatorMessageType type;
    private String code;
    private String message;
    private Map<String, String> context = new HashMap<>();

    public AuthenticatorMessage() {

    }

    public AuthenticatorMessage(FrameworkConstants.AuthenticatorMessageType type, String code, String message,
                                Map<String, String> context) {

        this.type = type;
        this.code = code;
        this.message = message;
        this.context = context;
    }

    public AuthenticatorMessage(FrameworkConstants.AuthenticatorMessageType type, String message,
                                Map<String, String> context) {

        this.type = type;
        this.message = message;
        this.context = context;
    }

    public FrameworkConstants.AuthenticatorMessageType getType() {

        return type;
    }

    public void setType(FrameworkConstants.AuthenticatorMessageType type) {

        this.type = type;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }

    public Map<String, String> getContext() {

        return context;
    }

    public void setContext(Map<String, String> context) {

        this.context = context;
    }
}
