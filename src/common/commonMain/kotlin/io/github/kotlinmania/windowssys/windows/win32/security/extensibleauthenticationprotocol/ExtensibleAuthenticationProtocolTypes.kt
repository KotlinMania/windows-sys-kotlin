package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid

public typealias EaphostAuthStatus = Int

public typealias EapAttributeType = Int

public typealias EapAuthenticatorSendTimeout = Int

public typealias EapConfigInputFieldType = Int

public typealias EapInteractiveUiDataType = Int

public typealias EapMethodAuthenticatorResponseAction = Int

public typealias EapMethodPropertyType = Int

public typealias EapMethodPropertyValueType = Int

public typealias EapCode = Int

public typealias EapCredentialType = Int

public typealias EapHostPeerAuthParams = Int

public typealias EapHostPeerMethodResultReason = Int

public typealias EapHostPeerResponseAction = Int

public typealias EapPeerMethodResponseAction = Int

public typealias EapPeerMethodResultReason = Int

public typealias IsolationState = Int

public fun interface NotificationHandlerFn {
    public operator fun invoke(connectionid: Guid, pcontextdata: MutPtr<CVoid>)
}

public typealias NotificationHandler = NotificationHandlerFn?

public typealias PppEapAction = Int

public typealias RasAuthAttributeType = Int
