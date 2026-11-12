@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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

public actual fun getDeviceID(pbwindowsaik: MutPtr<UByte>, cbwindowsaik: UInt, pcbresult: MutPtr<UInt>, pfprotectedbytpm: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32SystemTpmbaseservicesGetDeviceID(pbwindowsaik.rawAddress.toCPointer<ByteVar>(), cbwindowsaik, pcbresult.rawAddress.toCPointer<ByteVar>(), pfprotectedbytpm.rawAddress.toCPointer<ByteVar>())

public actual fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: MutPtr<UInt>, pfprotectedbytpm: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString(pszwindowsaik.rawAddress.toCPointer<ByteVar>(), cchwindowsaik, pcchresult.rawAddress.toCPointer<ByteVar>(), pfprotectedbytpm.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiContextCreate(pcontextparams: ConstPtr<TbsContextParams>, phcontext: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate(pcontextparams.rawAddress.toCPointer<ByteVar>(), phcontext.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiCreateWindowsKey(keyhandle: UInt): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(keyhandle)

public actual fun tbsiGetDeviceInfo(size: UInt, info: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo(size, info.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiGetOwnerAuth(hcontext: ConstPtr<CVoid>, ownerauthtype: UInt, poutputbuf: MutPtr<UByte>, poutputbuflen: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth(hcontext.rawAddress.toCPointer<ByteVar>(), ownerauthtype, poutputbuf.rawAddress.toCPointer<ByteVar>(), poutputbuflen.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiGetTcgLog(hcontext: ConstPtr<CVoid>, poutputbuf: MutPtr<UByte>, poutputbuflen: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog(hcontext.rawAddress.toCPointer<ByteVar>(), poutputbuf.rawAddress.toCPointer<ByteVar>(), poutputbuflen.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiGetTcgLogEx(logtype: UInt, pboutput: MutPtr<UByte>, pcboutput: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx(logtype, pboutput.rawAddress.toCPointer<ByteVar>(), pcboutput.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiIsTpmPresent(): Bool =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent()

public actual fun tbsiPhysicalPresenceCommand(hcontext: ConstPtr<CVoid>, pabinput: ConstPtr<UByte>, cbinput: UInt, paboutput: MutPtr<UByte>, pcboutput: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand(hcontext.rawAddress.toCPointer<ByteVar>(), pabinput.rawAddress.toCPointer<ByteVar>(), cbinput, paboutput.rawAddress.toCPointer<ByteVar>(), pcboutput.rawAddress.toCPointer<ByteVar>())

public actual fun tbsiRevokeAttestation(): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation()

public actual fun tbsipCancelCommands(hcontext: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands(hcontext.rawAddress.toCPointer<ByteVar>())

public actual fun tbsipContextClose(hcontext: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose(hcontext.rawAddress.toCPointer<ByteVar>())

public actual fun tbsipSubmitCommand(hcontext: ConstPtr<CVoid>, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: ConstPtr<UByte>, cbcommand: UInt, pabresult: MutPtr<UByte>, pcbresult: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand(hcontext.rawAddress.toCPointer<ByteVar>(), locality, priority, pabcommand.rawAddress.toCPointer<ByteVar>(), cbcommand, pabresult.rawAddress.toCPointer<ByteVar>(), pcbresult.rawAddress.toCPointer<ByteVar>())
