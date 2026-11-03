package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.core.GUID

public typealias EAPHOST_AUTH_STATUS = Int

public typealias EAP_ATTRIBUTE_TYPE = Int

public typealias EAP_AUTHENTICATOR_SEND_TIMEOUT = Int

public typealias EAP_CONFIG_INPUT_FIELD_TYPE = Int

public typealias EAP_INTERACTIVE_UI_DATA_TYPE = Int

public typealias EAP_METHOD_AUTHENTICATOR_RESPONSE_ACTION = Int

public typealias EAP_METHOD_PROPERTY_TYPE = Int

public typealias EAP_METHOD_PROPERTY_VALUE_TYPE = Int

public typealias EapCode = Int

public typealias EapCredentialType = Int

public typealias EapHostPeerAuthParams = Int

public typealias EapHostPeerMethodResultReason = Int

public typealias EapHostPeerResponseAction = Int

public typealias EapPeerMethodResponseAction = Int

public typealias EapPeerMethodResultReason = Int

public typealias ISOLATION_STATE = Int

public fun interface NotificationHandlerFn {
    public operator fun invoke(connectionid: GUID, pcontextdata: Long)
}

public typealias NotificationHandler = NotificationHandlerFn?

public typealias PPP_EAP_ACTION = Int

public typealias RAS_AUTH_ATTRIBUTE_TYPE = Int
