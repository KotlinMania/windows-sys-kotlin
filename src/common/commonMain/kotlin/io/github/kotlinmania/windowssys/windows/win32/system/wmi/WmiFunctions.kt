package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun miApplicationInitializeV1(flags: UInt, applicationid: ConstPtr<UShort>, extendederror: MutPtr<MutPtr<MiInstance>>, application: MutPtr<MiApplication>): MiResult
