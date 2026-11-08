package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public data class HCS_CREATE_OPTIONS_1(
    public var Version: HCS_CREATE_OPTIONS = 0,
    public var UserToken: HANDLE = 0L,
    public var SecurityDescriptor: Long = 0L,
    public var CallbackOptions: HCS_EVENT_OPTIONS = 0,
    public var CallbackContext: Long = 0L,
    public var Callback: HCS_EVENT_CALLBACK = null,
)

public data class HCS_EVENT(
    public var Type: HCS_EVENT_TYPE = 0,
    public var EventData: PCWSTR = 0L,
    public var Operation: HCS_OPERATION = 0L,
)

public data class HCS_PROCESS_INFORMATION(
    public var ProcessId: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var StdInput: HANDLE = 0L,
    public var StdOutput: HANDLE = 0L,
    public var StdError: HANDLE = 0L,
)
