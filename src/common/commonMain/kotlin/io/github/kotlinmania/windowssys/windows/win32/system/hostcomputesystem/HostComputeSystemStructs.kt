package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityDescriptor

public data class HcsCreateOptions1(
    public var version: HcsCreateOptions = 0,
    public var userToken: Handle = null,
    public var securityDescriptor: SecurityDescriptor? = null,
    public var callbackOptions: HcsEventOptions = 0,
    public var callbackContext: COpaquePointer? = null,
    public var callback: HcsEventCallback = null,
)

public data class HcsEvent(
    public var type: HcsEventType = 0,
    public var eventData: Pcwstr = null,
    public var operation: HcsOperation = null,
)

public data class HcsProcessInformation(
    public var processId: UInt = 0u,
    public var reserved: UInt = 0u,
    public var stdInput: Handle = null,
    public var stdOutput: Handle = null,
    public var stdError: Handle = null,
)
