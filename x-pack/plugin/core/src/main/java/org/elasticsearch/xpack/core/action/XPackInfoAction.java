/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.core.action;

import org.elasticsearch.action.Action;
import org.elasticsearch.license.XPackInfoResponse;

public class XPackInfoAction extends Action<XPackInfoRequest, XPackInfoResponse> {

    public static final String NAME = "cluster:monitor/xpack/info";
    public static final XPackInfoAction INSTANCE = new XPackInfoAction();

    public XPackInfoAction() {
        super(NAME);
    }

    @Override
    public XPackInfoResponse newResponse() {
        return new XPackInfoResponse();
    }
}
