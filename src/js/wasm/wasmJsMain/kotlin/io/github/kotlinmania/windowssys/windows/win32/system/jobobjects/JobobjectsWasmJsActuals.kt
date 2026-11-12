@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemJobobjectsNapiAddon(): Boolean

private val windowsWin32SystemJobobjectsNapiAvailable: Boolean = initWindowsWin32SystemJobobjectsNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsAssignProcessToJobObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsAssignProcessToJobObject(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsCreateJobObjectA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsCreateJobObjectA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsCreateJobObjectW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsCreateJobObjectW(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsCreateJobSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsCreateJobSet(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsFreeMemoryJobObject(p0)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsFreeMemoryJobObject(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsIsProcessInJob(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsIsProcessInJob(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsOpenJobObjectA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsOpenJobObjectA(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsOpenJobObjectW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsOpenJobObjectW(p0: Int, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsQueryInformationJobObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsQueryInformationJobObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsQueryIoRateControlInformationJobObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsQueryIoRateControlInformationJobObject(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsSetInformationJobObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsSetInformationJobObject(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsSetIoRateControlInformationJobObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsSetIoRateControlInformationJobObject(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsTerminateJobObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsTerminateJobObject(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemJobobjectsUserHandleGrantAccess(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemJobobjectsUserHandleGrantAccess(p0: String, p1: String, p2: Int): Int

public actual fun assignProcessToJobObject(hjob: Handle, hprocess: Handle): Bool =
    if (windowsWin32SystemJobobjectsNapiAvailable) wasmWindowssysWindowsWin32SystemJobobjectsAssignProcessToJobObject(hjob.rawAddress.toString(), hprocess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createJobObjectA(lpjobattributes: ConstPtr, lpname: Pcstr): Handle =
    if (windowsWin32SystemJobobjectsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemJobobjectsCreateJobObjectA(lpjobattributes.rawAddress.toString(), lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createJobObjectW(lpjobattributes: ConstPtr, lpname: Pcwstr): Handle =
    if (windowsWin32SystemJobobjectsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemJobobjectsCreateJobObjectW(lpjobattributes.rawAddress.toString(), lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createJobSet(numjob: UInt, userjobset: ConstPtr, flags: UInt): Bool =
    if (windowsWin32SystemJobobjectsNapiAvailable) wasmWindowssysWindowsWin32SystemJobobjectsCreateJobSet(numjob.toInt(), userjobset.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeMemoryJobObject(buffer: ConstPtr) {
    if (windowsWin32SystemJobobjectsNapiAvailable) {
        wasmWindowssysWindowsWin32SystemJobobjectsFreeMemoryJobObject(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun isProcessInJob(processhandle: Handle, jobhandle: Handle, result: MutPtr): Bool =
    if (windowsWin32SystemJobobjectsNapiAvailable) wasmWindowssysWindowsWin32SystemJobobjectsIsProcessInJob(processhandle.rawAddress.toString(), jobhandle.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openJobObjectA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemJobobjectsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemJobobjectsOpenJobObjectA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openJobObjectW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemJobobjectsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemJobobjectsOpenJobObjectW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: MutPtr, cbjobobjectinformationlength: UInt, lpreturnlength: MutPtr): Bool =
    if (windowsWin32SystemJobobjectsNapiAvailable) wasmWindowssysWindowsWin32SystemJobobjectsQueryInformationJobObject(hjob.rawAddress.toString(), jobobjectinformationclass, lpjobobjectinformation.rawAddress.toString(), cbjobobjectinformationlength.toInt(), lpreturnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIoRateControlInformationJobObject(hjob: Handle, volumename: Pcwstr, infoblocks: MutPtr, infoblockcount: MutPtr): UInt =
    if (windowsWin32SystemJobobjectsNapiAvailable) wasmWindowssysWindowsWin32SystemJobobjectsQueryIoRateControlInformationJobObject(hjob.rawAddress.toString(), volumename.rawAddress.toString(), infoblocks.rawAddress.toString(), infoblockcount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: ConstPtr, cbjobobjectinformationlength: UInt): Bool =
    if (windowsWin32SystemJobobjectsNapiAvailable) wasmWindowssysWindowsWin32SystemJobobjectsSetInformationJobObject(hjob.rawAddress.toString(), jobobjectinformationclass, lpjobobjectinformation.rawAddress.toString(), cbjobobjectinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIoRateControlInformationJobObject(hjob: Handle, ioratecontrolinfo: ConstPtr): UInt =
    if (windowsWin32SystemJobobjectsNapiAvailable) wasmWindowssysWindowsWin32SystemJobobjectsSetIoRateControlInformationJobObject(hjob.rawAddress.toString(), ioratecontrolinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateJobObject(hjob: Handle, uexitcode: UInt): Bool =
    if (windowsWin32SystemJobobjectsNapiAvailable) wasmWindowssysWindowsWin32SystemJobobjectsTerminateJobObject(hjob.rawAddress.toString(), uexitcode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userHandleGrantAccess(huserhandle: Handle, hjob: Handle, bgrant: Bool): Bool =
    if (windowsWin32SystemJobobjectsNapiAvailable) wasmWindowssysWindowsWin32SystemJobobjectsUserHandleGrantAccess(huserhandle.rawAddress.toString(), hjob.rawAddress.toString(), bgrant) else throw UnsupportedOperationException("Native FFI addon is not available")
