@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesGetDeviceID
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose
import io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices.cinterop.windowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getDeviceID(pbwindowsaik: MutPtr, cbwindowsaik: UInt, pcbresult: MutPtr, pfprotectedbytpm: MutPtr): Hresult =
    windowssysWindowsWin32SystemTpmbaseservicesGetDeviceID(pbwindowsaik.rawAddress.toCPointer<ByteVar>(), cbwindowsaik, pcbresult.rawAddress.toCPointer<ByteVar>(), pfprotectedbytpm.rawAddress.toCPointer<ByteVar>())

public actual fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: MutPtr, pfprotectedbytpm: MutPtr): Hresult =
    windowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString(pszwindowsaik.rawAddress.toCPointer<ByteVar>(), cchwindowsaik, pcchresult.rawAddress.toCPointer<ByteVar>(), pfprotectedbytpm.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiContextCreate(pcontextparams: ConstPtr, phcontext: MutPtr): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate(pcontextparams.rawAddress.toCPointer<ByteVar>(), phcontext.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiCreateWindowsKey(keyhandle: UInt): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(keyhandle)

public actual fun tbsiGetDeviceInfo(size: UInt, info: MutPtr): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo(size, info.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiGetOwnerAuth(hcontext: ConstPtr, ownerauthtype: UInt, poutputbuf: MutPtr, poutputbuflen: MutPtr): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth(hcontext.rawAddress.toCPointer<ByteVar>(), ownerauthtype, poutputbuf.rawAddress.toCPointer<ByteVar>(), poutputbuflen.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiGetTcgLog(hcontext: ConstPtr, poutputbuf: MutPtr, poutputbuflen: MutPtr): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog(hcontext.rawAddress.toCPointer<ByteVar>(), poutputbuf.rawAddress.toCPointer<ByteVar>(), poutputbuflen.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiGetTcgLogEx(logtype: UInt, pboutput: MutPtr, pcboutput: MutPtr): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx(logtype, pboutput.rawAddress.toCPointer<ByteVar>(), pcboutput.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiIsTpmPresent(): Bool =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent()

public actual fun tbsiPhysicalPresenceCommand(hcontext: ConstPtr, pabinput: ConstPtr, cbinput: UInt, paboutput: MutPtr, pcboutput: MutPtr): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand(hcontext.rawAddress.toCPointer<ByteVar>(), pabinput.rawAddress.toCPointer<ByteVar>(), cbinput, paboutput.rawAddress.toCPointer<ByteVar>(), pcboutput.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiRevokeAttestation(): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation()

public actual fun tbsipCancelCommands(hcontext: ConstPtr): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands(hcontext.rawAddress.toCPointer<ByteVar>())

public actual fun tbsipContextClose(hcontext: ConstPtr): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose(hcontext.rawAddress.toCPointer<ByteVar>())

public actual fun tbsipSubmitCommand(hcontext: ConstPtr, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: ConstPtr, cbcommand: UInt, pabresult: MutPtr, pcbresult: MutPtr): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand(hcontext.rawAddress.toCPointer<ByteVar>(), locality, priority, pabcommand.rawAddress.toCPointer<ByteVar>(), cbcommand, pabresult.rawAddress.toCPointer<ByteVar>(), pcbresult.rawAddress.toCPointer<ByteVar>())
