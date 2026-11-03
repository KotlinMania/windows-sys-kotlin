package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

public data class OPERATION_END_PARAMETERS(
    public var Version: UInt = 0u,
    public var OperationId: UInt = 0u,
    public var Flags: OPERATION_END_PARAMETERS_FLAGS = 0u,
)

public data class OPERATION_START_PARAMETERS(
    public var Version: UInt = 0u,
    public var OperationId: UInt = 0u,
    public var Flags: OPERATION_START_FLAGS = 0u,
)
