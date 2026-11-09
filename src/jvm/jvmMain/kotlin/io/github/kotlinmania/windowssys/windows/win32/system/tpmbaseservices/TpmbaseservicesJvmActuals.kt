@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PWSTR

private object WindowsWin32SystemTpmbaseservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_GetDeviceID(pbwindowsaik: Long, cbwindowsaik: Int, pcbresult: Long, pfprotectedbytpm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_GetDeviceIDString(pszwindowsaik: Long, cchwindowsaik: Int, pcchresult: Long, pfprotectedbytpm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsi_Context_Create(pcontextparams: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsi_Create_Windows_Key(keyhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsi_GetDeviceInfo(size: Int, info: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_OwnerAuth(hcontext: Long, ownerauthtype: Int, poutputbuf: Long, poutputbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_TCG_Log(hcontext: Long, poutputbuf: Long, poutputbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_TCG_Log_Ex(logtype: Int, pboutput: Long, pcboutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsi_Is_Tpm_Present(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsi_Physical_Presence_Command(hcontext: Long, pabinput: Long, cbinput: Int, paboutput: Long, pcboutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsi_Revoke_Attestation(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsip_Cancel_Commands(hcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsip_Context_Close(hcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_Tbsip_Submit_Command(hcontext: Long, locality: Int, priority: Int, pabcommand: Long, cbcommand: Int, pabresult: Long, pcbresult: Long): Int
}

public actual fun GetDeviceID(pbwindowsaik: Long, cbwindowsaik: UInt, pcbresult: Long, pfprotectedbytpm: Long): HRESULT =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_GetDeviceID(pbwindowsaik, cbwindowsaik.toInt(), pcbresult, pfprotectedbytpm)

public actual fun GetDeviceIDString(pszwindowsaik: PWSTR, cchwindowsaik: UInt, pcchresult: Long, pfprotectedbytpm: Long): HRESULT =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_GetDeviceIDString(pszwindowsaik, cchwindowsaik.toInt(), pcchresult, pfprotectedbytpm)

public actual fun Tbsi_Context_Create(pcontextparams: Long, phcontext: Long): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Context_Create(pcontextparams, phcontext).toUInt()

public actual fun Tbsi_Create_Windows_Key(keyhandle: UInt): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Create_Windows_Key(keyhandle.toInt()).toUInt()

public actual fun Tbsi_GetDeviceInfo(size: UInt, info: Long): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsi_GetDeviceInfo(size.toInt(), info).toUInt()

public actual fun Tbsi_Get_OwnerAuth(hcontext: Long, ownerauthtype: UInt, poutputbuf: Long, poutputbuflen: Long): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_OwnerAuth(hcontext, ownerauthtype.toInt(), poutputbuf, poutputbuflen).toUInt()

public actual fun Tbsi_Get_TCG_Log(hcontext: Long, poutputbuf: Long, poutputbuflen: Long): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_TCG_Log(hcontext, poutputbuf, poutputbuflen).toUInt()

public actual fun Tbsi_Get_TCG_Log_Ex(logtype: UInt, pboutput: Long, pcboutput: Long): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_TCG_Log_Ex(logtype.toInt(), pboutput, pcboutput).toUInt()

public actual fun Tbsi_Is_Tpm_Present(): BOOL =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Is_Tpm_Present()

public actual fun Tbsi_Physical_Presence_Command(hcontext: Long, pabinput: Long, cbinput: UInt, paboutput: Long, pcboutput: Long): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Physical_Presence_Command(hcontext, pabinput, cbinput.toInt(), paboutput, pcboutput).toUInt()

public actual fun Tbsi_Revoke_Attestation(): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsi_Revoke_Attestation().toUInt()

public actual fun Tbsip_Cancel_Commands(hcontext: Long): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsip_Cancel_Commands(hcontext).toUInt()

public actual fun Tbsip_Context_Close(hcontext: Long): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsip_Context_Close(hcontext).toUInt()

public actual fun Tbsip_Submit_Command(hcontext: Long, locality: TBS_COMMAND_LOCALITY, priority: TBS_COMMAND_PRIORITY, pabcommand: Long, cbcommand: UInt, pabresult: Long, pcbresult: Long): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_Tbsip_Submit_Command(hcontext, locality.toInt(), priority.toInt(), pabcommand, cbcommand.toInt(), pabresult, pcbresult).toUInt()
