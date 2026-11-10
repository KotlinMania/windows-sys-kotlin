package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun uuidCreateSequential(uuid: COpaquePointer?): RpcStatus

public expect fun uuidEqual(uuid1: COpaquePointer?, uuid2: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uuidFromStringA(stringuuid: Pcstr, uuid: COpaquePointer?): RpcStatus

public expect fun uuidFromStringW(stringuuid: Pcwstr, uuid: COpaquePointer?): RpcStatus

public expect fun uuidHash(uuid: COpaquePointer?, status: COpaquePointer?): UShort

public expect fun uuidIsNil(uuid: COpaquePointer?, status: COpaquePointer?): Int

public expect fun uuidToStringA(uuid: COpaquePointer?, stringuuid: COpaquePointer?): RpcStatus

public expect fun uuidToStringW(uuid: COpaquePointer?, stringuuid: COpaquePointer?): RpcStatus
