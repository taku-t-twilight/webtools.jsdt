// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// This program and the accompanying materials are made available
// under the terms of the Eclipse Public License v1.0 which accompanies
// this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html

package org.eclipse.wst.jsdt.chromium.sdk.internal.liveeditprotocol;

/**
 * An accessor to generated implementation of a liveedit protocol parser.
 */
public class LiveEditProtocolParserAccess {
  private static final GeneratedLiveEditProtocolParser PARSER =
      new GeneratedLiveEditProtocolParser();

  public static LiveEditProtocolParser get() {
    return PARSER;
  }
}