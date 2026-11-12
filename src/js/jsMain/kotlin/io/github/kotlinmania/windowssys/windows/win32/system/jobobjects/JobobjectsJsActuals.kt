@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SystemJobobjectsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun assignProcessToJobObject(hjob: Handle, hprocess: Handle): Bool =
    if (windowsWin32SystemJobobjectsNapiAddon != null) (windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsAssignProcessToJobObject(hjob.rawAddress.toString(), hprocess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createJobObjectA(lpjobattributes: ConstPtr, lpname: Pcstr): Handle =
    if (windowsWin32SystemJobobjectsNapiAddon != null) MutPtr((windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsCreateJobObjectA(lpjobattributes.rawAddress.toString(), lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createJobObjectW(lpjobattributes: ConstPtr, lpname: Pcwstr): Handle =
    if (windowsWin32SystemJobobjectsNapiAddon != null) MutPtr((windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsCreateJobObjectW(lpjobattributes.rawAddress.toString(), lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createJobSet(numjob: UInt, userjobset: ConstPtr, flags: UInt): Bool =
    if (windowsWin32SystemJobobjectsNapiAddon != null) (windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsCreateJobSet(numjob.toInt(), userjobset.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeMemoryJobObject(buffer: ConstPtr) {
    if (windowsWin32SystemJobobjectsNapiAddon != null) {
        windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsFreeMemoryJobObject(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun isProcessInJob(processhandle: Handle, jobhandle: Handle, result: MutPtr): Bool =
    if (windowsWin32SystemJobobjectsNapiAddon != null) (windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsIsProcessInJob(processhandle.rawAddress.toString(), jobhandle.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openJobObjectA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (windowsWin32SystemJobobjectsNapiAddon != null) MutPtr((windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsOpenJobObjectA(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openJobObjectW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (windowsWin32SystemJobobjectsNapiAddon != null) MutPtr((windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsOpenJobObjectW(dwdesiredaccess.toInt(), binherithandle, lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: MutPtr, cbjobobjectinformationlength: UInt, lpreturnlength: MutPtr): Bool =
    if (windowsWin32SystemJobobjectsNapiAddon != null) (windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsQueryInformationJobObject(hjob.rawAddress.toString(), jobobjectinformationclass, lpjobobjectinformation.rawAddress.toString(), cbjobobjectinformationlength.toInt(), lpreturnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIoRateControlInformationJobObject(hjob: Handle, volumename: Pcwstr, infoblocks: MutPtr, infoblockcount: MutPtr): UInt =
    if (windowsWin32SystemJobobjectsNapiAddon != null) (windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsQueryIoRateControlInformationJobObject(hjob.rawAddress.toString(), volumename.rawAddress.toString(), infoblocks.rawAddress.toString(), infoblockcount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: ConstPtr, cbjobobjectinformationlength: UInt): Bool =
    if (windowsWin32SystemJobobjectsNapiAddon != null) (windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsSetInformationJobObject(hjob.rawAddress.toString(), jobobjectinformationclass, lpjobobjectinformation.rawAddress.toString(), cbjobobjectinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIoRateControlInformationJobObject(hjob: Handle, ioratecontrolinfo: ConstPtr): UInt =
    if (windowsWin32SystemJobobjectsNapiAddon != null) (windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsSetIoRateControlInformationJobObject(hjob.rawAddress.toString(), ioratecontrolinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateJobObject(hjob: Handle, uexitcode: UInt): Bool =
    if (windowsWin32SystemJobobjectsNapiAddon != null) (windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsTerminateJobObject(hjob.rawAddress.toString(), uexitcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userHandleGrantAccess(huserhandle: Handle, hjob: Handle, bgrant: Bool): Bool =
    if (windowsWin32SystemJobobjectsNapiAddon != null) (windowsWin32SystemJobobjectsNapiAddon.windowssysWindowsWin32SystemJobobjectsUserHandleGrantAccess(huserhandle.rawAddress.toString(), hjob.rawAddress.toString(), bgrant) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
