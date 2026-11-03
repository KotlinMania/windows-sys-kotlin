package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun UuidCreateSequential(uuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidCreateSequential", longArrayOf(uuid)).toInt()
}

public fun UuidEqual(uuid1: Long, uuid2: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidEqual", longArrayOf(uuid1, uuid2, status)).toInt()
}

public fun UuidFromStringA(stringuuid: PCSTR, uuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidFromStringA", longArrayOf(stringuuid, uuid)).toInt()
}

public fun UuidFromStringW(stringuuid: PCWSTR, uuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidFromStringW", longArrayOf(stringuuid, uuid)).toInt()
}

public fun UuidHash(uuid: Long, status: Long): UShort {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidHash", longArrayOf(uuid, status)).toUShort()
}

public fun UuidIsNil(uuid: Long, status: Long): Int {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidIsNil", longArrayOf(uuid, status)).toInt()
}

public fun UuidToStringA(uuid: Long, stringuuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidToStringA", longArrayOf(uuid, stringuuid)).toInt()
}

public fun UuidToStringW(uuid: Long, stringuuid: Long): RPC_STATUS {
    return Win32DynamicFfi.invoke("rpcrt4.dll", "UuidToStringW", longArrayOf(uuid, stringuuid)).toInt()
}
