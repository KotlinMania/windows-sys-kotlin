@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.SAFER_LEVEL_HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun SaferCloseLevel(hlevelhandle: SAFER_LEVEL_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_SaferCloseLevel(hlevelhandle.toCPointer<ByteVar>())

public actual fun SaferComputeTokenFromLevel(levelhandle: SAFER_LEVEL_HANDLE, inaccesstoken: HANDLE, outaccesstoken: Long, dwflags: SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_SaferComputeTokenFromLevel(levelhandle.toCPointer<ByteVar>(), inaccesstoken.toCPointer<ByteVar>(), outaccesstoken.toCPointer<ByteVar>(), dwflags, lpreserved.toCPointer<ByteVar>())

public actual fun SaferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_SaferCreateLevel(dwscopeid, dwlevelid, openflags, plevelhandle.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun SaferGetLevelInformation(levelhandle: SAFER_LEVEL_HANDLE, dwinfotype: SAFER_OBJECT_INFO_CLASS, lpquerybuffer: Long, dwinbuffersize: UInt, lpdwoutbuffersize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_SaferGetLevelInformation(levelhandle.toCPointer<ByteVar>(), dwinfotype, lpquerybuffer.toCPointer<ByteVar>(), dwinbuffersize, lpdwoutbuffersize.toCPointer<ByteVar>())

public actual fun SaferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SAFER_POLICY_INFO_CLASS, infobuffersize: UInt, infobuffer: Long, infobufferretsize: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_SaferGetPolicyInformation(dwscopeid, saferpolicyinfoclass, infobuffersize, infobuffer.toCPointer<ByteVar>(), infobufferretsize.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun SaferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: Long, plevelhandle: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_SaferIdentifyLevel(dwnumproperties, pcodeproperties.toCPointer<ByteVar>(), plevelhandle.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun SaferRecordEventLogEntry(hlevel: SAFER_LEVEL_HANDLE, sztargetpath: PCWSTR, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_SaferRecordEventLogEntry(hlevel.toCPointer<ByteVar>(), sztargetpath.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun SaferSetLevelInformation(levelhandle: SAFER_LEVEL_HANDLE, dwinfotype: SAFER_OBJECT_INFO_CLASS, lpquerybuffer: Long, dwinbuffersize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_SaferSetLevelInformation(levelhandle.toCPointer<ByteVar>(), dwinfotype, lpquerybuffer.toCPointer<ByteVar>(), dwinbuffersize)

public actual fun SaferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SAFER_POLICY_INFO_CLASS, infobuffersize: UInt, infobuffer: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_SaferSetPolicyInformation(dwscopeid, saferpolicyinfoclass, infobuffersize, infobuffer.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun SaferiIsExecutableFileType(szfullpathname: PCWSTR, bfromshellexecute: Boolean): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_SaferiIsExecutableFileType(szfullpathname.toCPointer<ByteVar>(), bfromshellexecute)
