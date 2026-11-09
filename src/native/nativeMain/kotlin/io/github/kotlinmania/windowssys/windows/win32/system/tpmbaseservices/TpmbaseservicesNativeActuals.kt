@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun GetDeviceID(pbwindowsaik: Long, cbwindowsaik: UInt, pcbresult: Long, pfprotectedbytpm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_GetDeviceID(pbwindowsaik.toCPointer<ByteVar>(), cbwindowsaik, pcbresult.toCPointer<ByteVar>(), pfprotectedbytpm.toCPointer<ByteVar>())

public actual fun GetDeviceIDString(pszwindowsaik: PWSTR, cchwindowsaik: UInt, pcchresult: Long, pfprotectedbytpm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_GetDeviceIDString(pszwindowsaik.toCPointer<ByteVar>(), cchwindowsaik, pcchresult.toCPointer<ByteVar>(), pfprotectedbytpm.toCPointer<ByteVar>())

public actual fun Tbsi_Context_Create(pcontextparams: Long, phcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Context_Create(pcontextparams.toCPointer<ByteVar>(), phcontext.toCPointer<ByteVar>())

public actual fun Tbsi_Create_Windows_Key(keyhandle: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Create_Windows_Key(keyhandle)

public actual fun Tbsi_GetDeviceInfo(size: UInt, info: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsi_GetDeviceInfo(size, info.toCPointer<ByteVar>())

public actual fun Tbsi_Get_OwnerAuth(hcontext: Long, ownerauthtype: UInt, poutputbuf: Long, poutputbuflen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_OwnerAuth(hcontext.toCPointer<ByteVar>(), ownerauthtype, poutputbuf.toCPointer<ByteVar>(), poutputbuflen.toCPointer<ByteVar>())

public actual fun Tbsi_Get_TCG_Log(hcontext: Long, poutputbuf: Long, poutputbuflen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_TCG_Log(hcontext.toCPointer<ByteVar>(), poutputbuf.toCPointer<ByteVar>(), poutputbuflen.toCPointer<ByteVar>())

public actual fun Tbsi_Get_TCG_Log_Ex(logtype: UInt, pboutput: Long, pcboutput: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_TCG_Log_Ex(logtype, pboutput.toCPointer<ByteVar>(), pcboutput.toCPointer<ByteVar>())

public actual fun Tbsi_Is_Tpm_Present(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Is_Tpm_Present()

public actual fun Tbsi_Physical_Presence_Command(hcontext: Long, pabinput: Long, cbinput: UInt, paboutput: Long, pcboutput: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Physical_Presence_Command(hcontext.toCPointer<ByteVar>(), pabinput.toCPointer<ByteVar>(), cbinput, paboutput.toCPointer<ByteVar>(), pcboutput.toCPointer<ByteVar>())

public actual fun Tbsi_Revoke_Attestation(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Revoke_Attestation()

public actual fun Tbsip_Cancel_Commands(hcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsip_Cancel_Commands(hcontext.toCPointer<ByteVar>())

public actual fun Tbsip_Context_Close(hcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsip_Context_Close(hcontext.toCPointer<ByteVar>())

public actual fun Tbsip_Submit_Command(hcontext: Long, locality: TBS_COMMAND_LOCALITY, priority: TBS_COMMAND_PRIORITY, pabcommand: Long, cbcommand: UInt, pabresult: Long, pcbresult: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssys_windows_win32_system_tpmbaseservices_Tbsip_Submit_Command(hcontext.toCPointer<ByteVar>(), locality, priority, pabcommand.toCPointer<ByteVar>(), cbcommand, pabresult.toCPointer<ByteVar>(), pcbresult.toCPointer<ByteVar>())
