package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun UuidCreateSequential(uuid: Long): RPC_STATUS

public expect fun UuidEqual(uuid1: Long, uuid2: Long, status: Long): Int

public expect fun UuidFromStringA(stringuuid: PCSTR, uuid: Long): RPC_STATUS

public expect fun UuidFromStringW(stringuuid: PCWSTR, uuid: Long): RPC_STATUS

public expect fun UuidHash(uuid: Long, status: Long): UShort

public expect fun UuidIsNil(uuid: Long, status: Long): Int

public expect fun UuidToStringA(uuid: Long, stringuuid: Long): RPC_STATUS

public expect fun UuidToStringW(uuid: Long, stringuuid: Long): RPC_STATUS
