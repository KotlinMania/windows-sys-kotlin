package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun createDataModelManager(debughost: MutPtr, manager: MutPtr): Hresult

public expect fun debugConnect(remoteoptions: Pcstr, interfaceid: ConstPtr, iface: MutPtr): Hresult

public expect fun debugConnectWide(remoteoptions: Pcwstr, interfaceid: ConstPtr, iface: MutPtr): Hresult

public expect fun debugCreate(interfaceid: ConstPtr, iface: MutPtr): Hresult

public expect fun debugCreateEx(interfaceid: ConstPtr, dbgengoptions: UInt, iface: MutPtr): Hresult
