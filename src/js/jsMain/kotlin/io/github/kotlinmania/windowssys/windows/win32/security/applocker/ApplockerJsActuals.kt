@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.SAFER_LEVEL_HANDLE

private val _windowsWin32SecurityApplockerNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun SaferCloseLevel(hlevelhandle: SAFER_LEVEL_HANDLE): BOOL =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_SaferCloseLevel(hlevelhandle.toString()) as Int) else 0

public actual fun SaferComputeTokenFromLevel(levelhandle: SAFER_LEVEL_HANDLE, inaccesstoken: HANDLE, outaccesstoken: Long, dwflags: SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS, lpreserved: Long): BOOL =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_SaferComputeTokenFromLevel(levelhandle.toString(), inaccesstoken.toString(), outaccesstoken.toString(), dwflags.toInt(), lpreserved.toString()) as Int) else 0

public actual fun SaferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: Long, lpreserved: Long): BOOL =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_SaferCreateLevel(dwscopeid.toInt(), dwlevelid.toInt(), openflags.toInt(), plevelhandle.toString(), lpreserved.toString()) as Int) else 0

public actual fun SaferGetLevelInformation(levelhandle: SAFER_LEVEL_HANDLE, dwinfotype: SAFER_OBJECT_INFO_CLASS, lpquerybuffer: Long, dwinbuffersize: UInt, lpdwoutbuffersize: Long): BOOL =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_SaferGetLevelInformation(levelhandle.toString(), dwinfotype, lpquerybuffer.toString(), dwinbuffersize.toInt(), lpdwoutbuffersize.toString()) as Int) else 0

public actual fun SaferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SAFER_POLICY_INFO_CLASS, infobuffersize: UInt, infobuffer: Long, infobufferretsize: Long, lpreserved: Long): BOOL =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_SaferGetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), infobuffer.toString(), infobufferretsize.toString(), lpreserved.toString()) as Int) else 0

public actual fun SaferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: Long, plevelhandle: Long, lpreserved: Long): BOOL =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_SaferIdentifyLevel(dwnumproperties.toInt(), pcodeproperties.toString(), plevelhandle.toString(), lpreserved.toString()) as Int) else 0

public actual fun SaferRecordEventLogEntry(hlevel: SAFER_LEVEL_HANDLE, sztargetpath: PCWSTR, lpreserved: Long): BOOL =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_SaferRecordEventLogEntry(hlevel.toString(), sztargetpath.toString(), lpreserved.toString()) as Int) else 0

public actual fun SaferSetLevelInformation(levelhandle: SAFER_LEVEL_HANDLE, dwinfotype: SAFER_OBJECT_INFO_CLASS, lpquerybuffer: Long, dwinbuffersize: UInt): BOOL =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_SaferSetLevelInformation(levelhandle.toString(), dwinfotype, lpquerybuffer.toString(), dwinbuffersize.toInt()) as Int) else 0

public actual fun SaferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SAFER_POLICY_INFO_CLASS, infobuffersize: UInt, infobuffer: Long, lpreserved: Long): BOOL =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_SaferSetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), infobuffer.toString(), lpreserved.toString()) as Int) else 0

public actual fun SaferiIsExecutableFileType(szfullpathname: PCWSTR, bfromshellexecute: Boolean): BOOL =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_SaferiIsExecutableFileType(szfullpathname.toString(), bfromshellexecute) as Int) else 0
