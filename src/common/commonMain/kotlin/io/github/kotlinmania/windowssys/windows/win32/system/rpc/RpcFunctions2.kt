package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun uuidCreateSequential(uuid: MutPtr<Guid>): RpcStatus

public expect fun uuidEqual(uuid1: ConstPtr<Guid>, uuid2: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int

public expect fun uuidFromStringA(stringuuid: Pcstr, uuid: MutPtr<Guid>): RpcStatus

public expect fun uuidFromStringW(stringuuid: Pcwstr, uuid: MutPtr<Guid>): RpcStatus

public expect fun uuidHash(uuid: ConstPtr<Guid>, status: MutPtr<RpcStatus>): UShort

public expect fun uuidIsNil(uuid: ConstPtr<Guid>, status: MutPtr<RpcStatus>): Int

public expect fun uuidToStringA(uuid: ConstPtr<Guid>, stringuuid: MutPtr<Pstr>): RpcStatus

public expect fun uuidToStringW(uuid: ConstPtr<Guid>, stringuuid: MutPtr<Pwstr>): RpcStatus
