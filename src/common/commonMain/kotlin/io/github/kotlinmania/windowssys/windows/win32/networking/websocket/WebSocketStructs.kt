package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pstr

public data class WebSocketBuffer(public var data: WebSocketBuffer0 = WebSocketBuffer0(), public var closeStatus: WebSocketBuffer1 = WebSocketBuffer1())

public data class WebSocketBuffer1(
    public var pbReason: COpaquePointer? = null,
    public var ulReasonLength: UInt = 0u,
    public var usStatus: UShort = 0u,
)

public data class WebSocketBuffer0(public var pbBuffer: COpaquePointer? = null, public var ulBufferLength: UInt = 0u)

public data class WebSocketHttpHeader(
    public var pcName: Pstr = null,
    public var ulNameLength: UInt = 0u,
    public var pcValue: Pstr = null,
    public var ulValueLength: UInt = 0u,
)

public data class WebSocketProperty(
    public var type: WebSocketPropertyType = 0,
    public var pvValue: COpaquePointer? = null,
    public var ulValueSize: UInt = 0u,
)
