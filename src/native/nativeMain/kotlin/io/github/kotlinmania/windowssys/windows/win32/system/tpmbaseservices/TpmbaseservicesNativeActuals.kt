@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getDeviceID(pbwindowsaik: COpaquePointer?, cbwindowsaik: UInt, pcbresult: COpaquePointer?, pfprotectedbytpm: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_getDeviceID(pbwindowsaik?.value?.toCPointer<ByteVar>(), cbwindowsaik, pcbresult?.value?.toCPointer<ByteVar>(), pfprotectedbytpm?.value?.toCPointer<ByteVar>())

public actual fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: COpaquePointer?, pfprotectedbytpm: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_getDeviceIDString(pszwindowsaik?.value?.toCPointer<ByteVar>(), cchwindowsaik, pcchresult?.value?.toCPointer<ByteVar>(), pfprotectedbytpm?.value?.toCPointer<ByteVar>())

public actual fun tbsiContextCreate(pcontextparams: COpaquePointer?, phcontext: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsiContextCreate(pcontextparams?.value?.toCPointer<ByteVar>(), phcontext?.value?.toCPointer<ByteVar>())

public actual fun tbsiCreateWindowsKey(keyhandle: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsiCreateWindowsKey(keyhandle)

public actual fun tbsiGetDeviceInfo(size: UInt, info: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsiGetDeviceInfo(size, info?.value?.toCPointer<ByteVar>())

public actual fun tbsiGetOwnerAuth(hcontext: COpaquePointer?, ownerauthtype: UInt, poutputbuf: COpaquePointer?, poutputbuflen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsiGetOwnerAuth(hcontext?.value?.toCPointer<ByteVar>(), ownerauthtype, poutputbuf?.value?.toCPointer<ByteVar>(), poutputbuflen?.value?.toCPointer<ByteVar>())

public actual fun tbsiGetTcgLog(hcontext: COpaquePointer?, poutputbuf: COpaquePointer?, poutputbuflen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLog(hcontext?.value?.toCPointer<ByteVar>(), poutputbuf?.value?.toCPointer<ByteVar>(), poutputbuflen?.value?.toCPointer<ByteVar>())

public actual fun tbsiGetTcgLogEx(logtype: UInt, pboutput: COpaquePointer?, pcboutput: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLogEx(logtype, pboutput?.value?.toCPointer<ByteVar>(), pcboutput?.value?.toCPointer<ByteVar>())

public actual fun tbsiIsTpmPresent(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsiIsTpmPresent()

public actual fun tbsiPhysicalPresenceCommand(hcontext: COpaquePointer?, pabinput: COpaquePointer?, cbinput: UInt, paboutput: COpaquePointer?, pcboutput: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsiPhysicalPresenceCommand(hcontext?.value?.toCPointer<ByteVar>(), pabinput?.value?.toCPointer<ByteVar>(), cbinput, paboutput?.value?.toCPointer<ByteVar>(), pcboutput?.value?.toCPointer<ByteVar>())

public actual fun tbsiRevokeAttestation(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsiRevokeAttestation()

public actual fun tbsipCancelCommands(hcontext: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsipCancelCommands(hcontext?.value?.toCPointer<ByteVar>())

public actual fun tbsipContextClose(hcontext: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsipContextClose(hcontext?.value?.toCPointer<ByteVar>())

public actual fun tbsipSubmitCommand(hcontext: COpaquePointer?, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: COpaquePointer?, cbcommand: UInt, pabresult: COpaquePointer?, pcbresult: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_tbsipSubmitCommand(hcontext?.value?.toCPointer<ByteVar>(), locality, priority, pabcommand?.value?.toCPointer<ByteVar>(), cbcommand, pabresult?.value?.toCPointer<ByteVar>(), pcbresult?.value?.toCPointer<ByteVar>())
