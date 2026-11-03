package io.github.kotlinmania.windowssys.windows.win32.networking.websocket

import io.github.kotlinmania.windowssys.core.PSTR

public data class WEB_SOCKET_BUFFER(public var Data: WEB_SOCKET_BUFFER_0 = WEB_SOCKET_BUFFER_0(), public var CloseStatus: WEB_SOCKET_BUFFER_1 = WEB_SOCKET_BUFFER_1())

public data class WEB_SOCKET_BUFFER_1(
    public var pbReason: Long = 0L,
    public var ulReasonLength: UInt = 0u,
    public var usStatus: UShort = 0u,
)

public data class WEB_SOCKET_BUFFER_0(public var pbBuffer: Long = 0L, public var ulBufferLength: UInt = 0u)

public data class WEB_SOCKET_HTTP_HEADER(
    public var pcName: PSTR = 0L,
    public var ulNameLength: UInt = 0u,
    public var pcValue: PSTR = 0L,
    public var ulValueLength: UInt = 0u,
)

public data class WEB_SOCKET_PROPERTY(
    public var Type: WEB_SOCKET_PROPERTY_TYPE = 0,
    public var pvValue: Long = 0L,
    public var ulValueSize: UInt = 0u,
)
