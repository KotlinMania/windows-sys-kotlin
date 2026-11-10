package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

public data class OperationEndParameters(
    public var version: UInt = 0u,
    public var operationId: UInt = 0u,
    public var flags: OperationEndParametersFlags = 0u,
)

public data class OperationStartParameters(
    public var version: UInt = 0u,
    public var operationId: UInt = 0u,
    public var flags: OperationStartFlags = 0u,
)
