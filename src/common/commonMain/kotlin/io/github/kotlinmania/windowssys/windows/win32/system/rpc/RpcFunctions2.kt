package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun uuidCreateSequential(uuid: MutPtr): RpcStatus

public expect fun uuidEqual(uuid1: ConstPtr, uuid2: ConstPtr, status: MutPtr): Int

public expect fun uuidFromStringA(stringuuid: Pcstr, uuid: MutPtr): RpcStatus

public expect fun uuidFromStringW(stringuuid: Pcwstr, uuid: MutPtr): RpcStatus

public expect fun uuidHash(uuid: ConstPtr, status: MutPtr): UShort

public expect fun uuidIsNil(uuid: ConstPtr, status: MutPtr): Int

public expect fun uuidToStringA(uuid: ConstPtr, stringuuid: MutPtr): RpcStatus

public expect fun uuidToStringW(uuid: ConstPtr, stringuuid: MutPtr): RpcStatus
