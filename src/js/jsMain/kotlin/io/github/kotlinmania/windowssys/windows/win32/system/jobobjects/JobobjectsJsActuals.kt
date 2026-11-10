@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SystemJobobjectsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun assignProcessToJobObject(hjob: Handle, hprocess: Handle): Bool =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_assignProcessToJobObject((hjob?.value ?: 0L).toString(), (hprocess?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createJobObjectA(lpjobattributes: COpaquePointer?, lpname: Pcstr): Handle =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_createJobObjectA((lpjobattributes?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createJobObjectW(lpjobattributes: COpaquePointer?, lpname: Pcwstr): Handle =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_createJobObjectW((lpjobattributes?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createJobSet(numjob: UInt, userjobset: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_createJobSet(numjob.toInt(), (userjobset?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeMemoryJobObject(buffer: COpaquePointer?) {
    if (_windowsWin32SystemJobobjectsNapiAddon != null) {
        _windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_freeMemoryJobObject((buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun isProcessInJob(processhandle: Handle, jobhandle: Handle, result: COpaquePointer?): Bool =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_isProcessInJob((processhandle?.value ?: 0L).toString(), (jobhandle?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openJobObjectA(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcstr): Handle =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_openJobObjectA(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openJobObjectW(dwdesiredaccess: UInt, binherithandle: Bool, lpname: Pcwstr): Handle =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_openJobObjectW(dwdesiredaccess.toInt(), binherithandle, (lpname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: COpaquePointer?, cbjobobjectinformationlength: UInt, lpreturnlength: COpaquePointer?): Bool =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_queryInformationJobObject((hjob?.value ?: 0L).toString(), jobobjectinformationclass, (lpjobobjectinformation?.value ?: 0L).toString(), cbjobobjectinformationlength.toInt(), (lpreturnlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIoRateControlInformationJobObject(hjob: Handle, volumename: Pcwstr, infoblocks: COpaquePointer?, infoblockcount: COpaquePointer?): UInt =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_queryIoRateControlInformationJobObject((hjob?.value ?: 0L).toString(), (volumename?.value ?: 0L).toString(), (infoblocks?.value ?: 0L).toString(), (infoblockcount?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInformationJobObject(hjob: Handle, jobobjectinformationclass: Jobobjectinfoclass, lpjobobjectinformation: COpaquePointer?, cbjobobjectinformationlength: UInt): Bool =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_setInformationJobObject((hjob?.value ?: 0L).toString(), jobobjectinformationclass, (lpjobobjectinformation?.value ?: 0L).toString(), cbjobobjectinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIoRateControlInformationJobObject(hjob: Handle, ioratecontrolinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_setIoRateControlInformationJobObject((hjob?.value ?: 0L).toString(), (ioratecontrolinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateJobObject(hjob: Handle, uexitcode: UInt): Bool =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_terminateJobObject((hjob?.value ?: 0L).toString(), uexitcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun userHandleGrantAccess(huserhandle: Handle, hjob: Handle, bgrant: Bool): Bool =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_userHandleGrantAccess((huserhandle?.value ?: 0L).toString(), (hjob?.value ?: 0L).toString(), bgrant) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
