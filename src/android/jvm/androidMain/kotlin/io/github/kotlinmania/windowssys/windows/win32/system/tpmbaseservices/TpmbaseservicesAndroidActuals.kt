@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32SystemTpmbaseservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_getDeviceID(pbwindowsaik: Long, cbwindowsaik: Int, pcbresult: Long, pfprotectedbytpm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_getDeviceIDString(pszwindowsaik: Long, cchwindowsaik: Int, pcchresult: Long, pfprotectedbytpm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsiContextCreate(pcontextparams: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsiCreateWindowsKey(keyhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsiGetDeviceInfo(size: Int, info: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsiGetOwnerAuth(hcontext: Long, ownerauthtype: Int, poutputbuf: Long, poutputbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLog(hcontext: Long, poutputbuf: Long, poutputbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLogEx(logtype: Int, pboutput: Long, pcboutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsiIsTpmPresent(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsiPhysicalPresenceCommand(hcontext: Long, pabinput: Long, cbinput: Int, paboutput: Long, pcboutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsiRevokeAttestation(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsipCancelCommands(hcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsipContextClose(hcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_tpmbaseservices_tbsipSubmitCommand(hcontext: Long, locality: Int, priority: Int, pabcommand: Long, cbcommand: Int, pabresult: Long, pcbresult: Long): Int
}

public actual fun getDeviceID(pbwindowsaik: COpaquePointer?, cbwindowsaik: UInt, pcbresult: COpaquePointer?, pfprotectedbytpm: COpaquePointer?): Hresult =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_getDeviceID((pbwindowsaik?.value ?: 0L), cbwindowsaik.toInt(), (pcbresult?.value ?: 0L), (pfprotectedbytpm?.value ?: 0L))

public actual fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: COpaquePointer?, pfprotectedbytpm: COpaquePointer?): Hresult =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_getDeviceIDString((pszwindowsaik?.value ?: 0L), cchwindowsaik.toInt(), (pcchresult?.value ?: 0L), (pfprotectedbytpm?.value ?: 0L))

public actual fun tbsiContextCreate(pcontextparams: COpaquePointer?, phcontext: COpaquePointer?): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsiContextCreate((pcontextparams?.value ?: 0L), (phcontext?.value ?: 0L)).toUInt()

public actual fun tbsiCreateWindowsKey(keyhandle: UInt): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsiCreateWindowsKey(keyhandle.toInt()).toUInt()

public actual fun tbsiGetDeviceInfo(size: UInt, info: COpaquePointer?): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsiGetDeviceInfo(size.toInt(), (info?.value ?: 0L)).toUInt()

public actual fun tbsiGetOwnerAuth(hcontext: COpaquePointer?, ownerauthtype: UInt, poutputbuf: COpaquePointer?, poutputbuflen: COpaquePointer?): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsiGetOwnerAuth((hcontext?.value ?: 0L), ownerauthtype.toInt(), (poutputbuf?.value ?: 0L), (poutputbuflen?.value ?: 0L)).toUInt()

public actual fun tbsiGetTcgLog(hcontext: COpaquePointer?, poutputbuf: COpaquePointer?, poutputbuflen: COpaquePointer?): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLog((hcontext?.value ?: 0L), (poutputbuf?.value ?: 0L), (poutputbuflen?.value ?: 0L)).toUInt()

public actual fun tbsiGetTcgLogEx(logtype: UInt, pboutput: COpaquePointer?, pcboutput: COpaquePointer?): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLogEx(logtype.toInt(), (pboutput?.value ?: 0L), (pcboutput?.value ?: 0L)).toUInt()

public actual fun tbsiIsTpmPresent(): Bool =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsiIsTpmPresent()

public actual fun tbsiPhysicalPresenceCommand(hcontext: COpaquePointer?, pabinput: COpaquePointer?, cbinput: UInt, paboutput: COpaquePointer?, pcboutput: COpaquePointer?): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsiPhysicalPresenceCommand((hcontext?.value ?: 0L), (pabinput?.value ?: 0L), cbinput.toInt(), (paboutput?.value ?: 0L), (pcboutput?.value ?: 0L)).toUInt()

public actual fun tbsiRevokeAttestation(): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsiRevokeAttestation().toUInt()

public actual fun tbsipCancelCommands(hcontext: COpaquePointer?): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsipCancelCommands((hcontext?.value ?: 0L)).toUInt()

public actual fun tbsipContextClose(hcontext: COpaquePointer?): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsipContextClose((hcontext?.value ?: 0L)).toUInt()

public actual fun tbsipSubmitCommand(hcontext: COpaquePointer?, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: COpaquePointer?, cbcommand: UInt, pabresult: COpaquePointer?, pcbresult: COpaquePointer?): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssys_windows_win32_system_tpmbaseservices_tbsipSubmitCommand((hcontext?.value ?: 0L), locality.toInt(), priority.toInt(), (pabcommand?.value ?: 0L), cbcommand.toInt(), (pabresult?.value ?: 0L), (pcbresult?.value ?: 0L)).toUInt()
