@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.SPropProblemArray
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.SPropTagArray

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageImapiCloseIMsgSession")
private external fun wasiWindowssysWindowsWin32StorageImapiCloseIMsgSession(lpmsgsess: Long): Unit

public actual fun closeIMsgSession(lpmsgsess: Lpmsgsess): Unit =
    wasiWindowssysWindowsWin32StorageImapiCloseIMsgSession(lpmsgsess)

public actual fun getAttribIMsgOnIStg(lpobject: MutPtr<CVoid>, lpproptagarray: MutPtr<SPropTagArray>, lpppropattrarray: MutPtr<MutPtr<SPropAttrArray>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageImapiMapStorageSCode")
private external fun wasiWindowssysWindowsWin32StorageImapiMapStorageSCode(stgscode: Int): Int

public actual fun mapStorageSCode(stgscode: Int): Int =
    wasiWindowssysWindowsWin32StorageImapiMapStorageSCode(stgscode)

public actual fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr<CVoid>, lpmapisup: MutPtr<CVoid>, lpstg: MutPtr<CVoid>, lpfmsgcallrelease: MutPtr<Msgcallrelease>, ulcallerdata: UInt, ulflags: UInt, lppmsg: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageImapiOpenIMsgOnIStg")

public actual fun openIMsgSession(lpmalloc: MutPtr<CVoid>, ulflags: UInt, lppmsgsess: MutPtr<Lpmsgsess>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageImapiOpenIMsgSession")

public actual fun setAttribIMsgOnIStg(lpobject: MutPtr<CVoid>, lpproptags: MutPtr<SPropTagArray>, lppropattrs: MutPtr<SPropAttrArray>, lpppropproblems: MutPtr<MutPtr<SPropProblemArray>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg")
