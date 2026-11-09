@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.jobobjects

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemJobobjectsNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AssignProcessToJobObject(hjob: HANDLE, hprocess: HANDLE): BOOL =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_AssignProcessToJobObject(hjob.toString(), hprocess.toString()) as Int) else 0

public actual fun CreateJobObjectA(lpjobattributes: Long, lpname: PCSTR): HANDLE =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_CreateJobObjectA(lpjobattributes.toString(), lpname.toString()) as String).toLong() else 0L

public actual fun CreateJobObjectW(lpjobattributes: Long, lpname: PCWSTR): HANDLE =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_CreateJobObjectW(lpjobattributes.toString(), lpname.toString()) as String).toLong() else 0L

public actual fun CreateJobSet(numjob: UInt, userjobset: Long, flags: UInt): BOOL =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_CreateJobSet(numjob.toInt(), userjobset.toString(), flags.toInt()) as Int) else 0

public actual fun FreeMemoryJobObject(buffer: Long) {
    if (_windowsWin32SystemJobobjectsNapiAddon != null) {
        _windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_FreeMemoryJobObject(buffer.toString())
    }
}

public actual fun IsProcessInJob(processhandle: HANDLE, jobhandle: HANDLE, result: Long): BOOL =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_IsProcessInJob(processhandle.toString(), jobhandle.toString(), result.toString()) as Int) else 0

public actual fun OpenJobObjectA(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCSTR): HANDLE =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_OpenJobObjectA(dwdesiredaccess.toInt(), binherithandle, lpname.toString()) as String).toLong() else 0L

public actual fun OpenJobObjectW(dwdesiredaccess: UInt, binherithandle: BOOL, lpname: PCWSTR): HANDLE =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_OpenJobObjectW(dwdesiredaccess.toInt(), binherithandle, lpname.toString()) as String).toLong() else 0L

public actual fun QueryInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt, lpreturnlength: Long): BOOL =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_QueryInformationJobObject(hjob.toString(), jobobjectinformationclass, lpjobobjectinformation.toString(), cbjobobjectinformationlength.toInt(), lpreturnlength.toString()) as Int) else 0

public actual fun QueryIoRateControlInformationJobObject(hjob: HANDLE, volumename: PCWSTR, infoblocks: Long, infoblockcount: Long): UInt =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_QueryIoRateControlInformationJobObject(hjob.toString(), volumename.toString(), infoblocks.toString(), infoblockcount.toString()) as Int).toUInt() else 0u

public actual fun SetInformationJobObject(hjob: HANDLE, jobobjectinformationclass: JOBOBJECTINFOCLASS, lpjobobjectinformation: Long, cbjobobjectinformationlength: UInt): BOOL =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_SetInformationJobObject(hjob.toString(), jobobjectinformationclass, lpjobobjectinformation.toString(), cbjobobjectinformationlength.toInt()) as Int) else 0

public actual fun SetIoRateControlInformationJobObject(hjob: HANDLE, ioratecontrolinfo: Long): UInt =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_SetIoRateControlInformationJobObject(hjob.toString(), ioratecontrolinfo.toString()) as Int).toUInt() else 0u

public actual fun TerminateJobObject(hjob: HANDLE, uexitcode: UInt): BOOL =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_TerminateJobObject(hjob.toString(), uexitcode.toInt()) as Int) else 0

public actual fun UserHandleGrantAccess(huserhandle: HANDLE, hjob: HANDLE, bgrant: BOOL): BOOL =
    if (_windowsWin32SystemJobobjectsNapiAddon != null) (_windowsWin32SystemJobobjectsNapiAddon.windowssys_windows_win32_system_jobobjects_UserHandleGrantAccess(huserhandle.toString(), hjob.toString(), bgrant) as Int) else 0
