@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32SystemTpmbaseservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesGetDeviceID(pbwindowsaik: Long, cbwindowsaik: Int, pcbresult: Long, pfprotectedbytpm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString(pszwindowsaik: Long, cchwindowsaik: Int, pcchresult: Long, pfprotectedbytpm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate(pcontextparams: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(keyhandle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo(size: Int, info: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth(hcontext: Long, ownerauthtype: Int, poutputbuf: Long, poutputbuflen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog(hcontext: Long, poutputbuf: Long, poutputbuflen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx(logtype: Int, pboutput: Long, pcboutput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand(hcontext: Long, pabinput: Long, cbinput: Int, paboutput: Long, pcboutput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands(hcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose(hcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand(hcontext: Long, locality: Int, priority: Int, pabcommand: Long, cbcommand: Int, pabresult: Long, pcbresult: Long): Int
}

public actual fun getDeviceID(pbwindowsaik: MutPtr, cbwindowsaik: UInt, pcbresult: MutPtr, pfprotectedbytpm: MutPtr): Hresult =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesGetDeviceID(pbwindowsaik.rawAddress, cbwindowsaik.toInt(), pcbresult.rawAddress, pfprotectedbytpm.rawAddress)

public actual fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: MutPtr, pfprotectedbytpm: MutPtr): Hresult =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString(pszwindowsaik.rawAddress, cchwindowsaik.toInt(), pcchresult.rawAddress, pfprotectedbytpm.rawAddress)

public actual fun tbsiContextCreate(pcontextparams: ConstPtr, phcontext: MutPtr): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate(pcontextparams.rawAddress, phcontext.rawAddress).toUInt()

public actual fun tbsiCreateWindowsKey(keyhandle: UInt): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(keyhandle.toInt()).toUInt()

public actual fun tbsiGetDeviceInfo(size: UInt, info: MutPtr): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo(size.toInt(), info.rawAddress).toUInt()

public actual fun tbsiGetOwnerAuth(hcontext: ConstPtr, ownerauthtype: UInt, poutputbuf: MutPtr, poutputbuflen: MutPtr): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth(hcontext.rawAddress, ownerauthtype.toInt(), poutputbuf.rawAddress, poutputbuflen.rawAddress).toUInt()

public actual fun tbsiGetTcgLog(hcontext: ConstPtr, poutputbuf: MutPtr, poutputbuflen: MutPtr): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog(hcontext.rawAddress, poutputbuf.rawAddress, poutputbuflen.rawAddress).toUInt()

public actual fun tbsiGetTcgLogEx(logtype: UInt, pboutput: MutPtr, pcboutput: MutPtr): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx(logtype.toInt(), pboutput.rawAddress, pcboutput.rawAddress).toUInt()

public actual fun tbsiIsTpmPresent(): Bool =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent()

public actual fun tbsiPhysicalPresenceCommand(hcontext: ConstPtr, pabinput: ConstPtr, cbinput: UInt, paboutput: MutPtr, pcboutput: MutPtr): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand(hcontext.rawAddress, pabinput.rawAddress, cbinput.toInt(), paboutput.rawAddress, pcboutput.rawAddress).toUInt()

public actual fun tbsiRevokeAttestation(): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation().toUInt()

public actual fun tbsipCancelCommands(hcontext: ConstPtr): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands(hcontext.rawAddress).toUInt()

public actual fun tbsipContextClose(hcontext: ConstPtr): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose(hcontext.rawAddress).toUInt()

public actual fun tbsipSubmitCommand(hcontext: ConstPtr, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: ConstPtr, cbcommand: UInt, pabresult: MutPtr, pcbresult: MutPtr): UInt =
    WindowsWin32SystemTpmbaseservicesJniBridge.windowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand(hcontext.rawAddress, locality.toInt(), priority.toInt(), pabcommand.rawAddress, cbcommand.toInt(), pabresult.rawAddress, pcbresult.rawAddress).toUInt()
