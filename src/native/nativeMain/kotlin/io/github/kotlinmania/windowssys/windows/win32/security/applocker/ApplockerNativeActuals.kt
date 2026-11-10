@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_saferCloseLevel(hlevelhandle?.value?.toCPointer<ByteVar>())

public actual fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: COpaquePointer?, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_saferComputeTokenFromLevel(levelhandle?.value?.toCPointer<ByteVar>(), inaccesstoken?.value?.toCPointer<ByteVar>(), outaccesstoken?.value?.toCPointer<ByteVar>(), dwflags, lpreserved?.value?.toCPointer<ByteVar>())

public actual fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_saferCreateLevel(dwscopeid, dwlevelid, openflags, plevelhandle?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt, lpdwoutbuffersize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_saferGetLevelInformation(levelhandle?.value?.toCPointer<ByteVar>(), dwinfotype, lpquerybuffer?.value?.toCPointer<ByteVar>(), dwinbuffersize, lpdwoutbuffersize?.value?.toCPointer<ByteVar>())

public actual fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, infobufferretsize: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_saferGetPolicyInformation(dwscopeid, saferpolicyinfoclass, infobuffersize, infobuffer?.value?.toCPointer<ByteVar>(), infobufferretsize?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: COpaquePointer?, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_saferIdentifyLevel(dwnumproperties, pcodeproperties?.value?.toCPointer<ByteVar>(), plevelhandle?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_saferRecordEventLogEntry(hlevel?.value?.toCPointer<ByteVar>(), sztargetpath?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_saferSetLevelInformation(levelhandle?.value?.toCPointer<ByteVar>(), dwinfotype, lpquerybuffer?.value?.toCPointer<ByteVar>(), dwinbuffersize)

public actual fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_saferSetPolicyInformation(dwscopeid, saferpolicyinfoclass, infobuffersize, infobuffer?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool =
    io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssys_windows_win32_security_applocker_saferiIsExecutableFileType(szfullpathname?.value?.toCPointer<ByteVar>(), bfromshellexecute)
