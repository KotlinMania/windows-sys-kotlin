@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRestoreSRRemoveRestorePoint")
private external fun wasiWindowssysWindowsWin32SystemRestoreSRRemoveRestorePoint(dwrpnum: Int): Int

public actual fun sRRemoveRestorePoint(dwrpnum: UInt): UInt =
    wasiWindowssysWindowsWin32SystemRestoreSRRemoveRestorePoint(dwrpnum.toInt()).toUInt()

public actual fun sRSetRestorePointA(prestoreptspec: ConstPtr<Restorepointinfoa>, psmgrstatus: MutPtr<Statemgrstatus>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestoreSRSetRestorePointA")

public actual fun sRSetRestorePointW(prestoreptspec: ConstPtr<Restorepointinfow>, psmgrstatus: MutPtr<Statemgrstatus>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestoreSRSetRestorePointW")
