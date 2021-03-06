// Generated source.
// Generator: org.eclipse.wst.jsdt.chromium.internal.wip.tools.protocolgenerator.Generator
// Origin: http://src.chromium.org/blink/trunk/Source/devtools/protocol.json@<unknown>

package org.eclipse.wst.jsdt.chromium.internal.wip.protocol.output.dom;

/**
Requests that a batch of nodes is sent to the caller given their backend node ids.
 */
public class PushNodesByBackendIdsToFrontendParams extends org.eclipse.wst.jsdt.chromium.internal.wip.protocol.output.WipParamsWithResponse<org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.dom.PushNodesByBackendIdsToFrontendData> {
  /**
   @param backendNodeIds The array of backend node ids.
   */
  public PushNodesByBackendIdsToFrontendParams(java.util.List<Long/*See org.eclipse.wst.jsdt.chromium.internal.wip.protocol.common.dom.BackendNodeIdTypedef*/> backendNodeIds) {
    this.put("backendNodeIds", backendNodeIds);
  }

  public static final String METHOD_NAME = org.eclipse.wst.jsdt.chromium.internal.wip.protocol.BasicConstants.Domain.DOM + ".pushNodesByBackendIdsToFrontend";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.dom.PushNodesByBackendIdsToFrontendData parseResponse(org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.WipCommandResponse.Data data, org.eclipse.wst.jsdt.chromium.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.eclipse.wst.jsdt.chromium.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDOMPushNodesByBackendIdsToFrontendData(data.getUnderlyingObject());
  }

}
