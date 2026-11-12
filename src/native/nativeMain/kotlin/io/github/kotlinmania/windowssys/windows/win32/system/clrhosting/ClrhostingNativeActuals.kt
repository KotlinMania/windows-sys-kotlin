@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCLRCreateInstance
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCallFunctionShim
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingClrCreateManagedInstance
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCorBindToCurrentRuntime
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCorBindToRuntime
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeByCfg
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeEx
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeHost
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCorExitProcess
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCorLaunchApplication
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingCreateDebuggingInterfaceFromVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingGetCLRIdentityManager
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingGetCORRequiredVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingGetCORSystemDirectory
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingGetCORVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingGetFileVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingGetRealProcAddress
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeInfo
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersionForCLSID
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingGetVersionFromProcess
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingLoadLibraryShim
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingLoadStringRC
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingLoadStringRCEx
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingLockClrVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssysWindowsWin32SystemClrhostingRunDll32ShimW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun cLRCreateInstance(clsid: ConstPtr, riid: ConstPtr, ppinterface: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingCLRCreateInstance(clsid.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppinterface.rawAddress.toCPointer<ByteVar>())

public actual fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: MutPtr, lpvargument2: MutPtr, szversion: Pcwstr, pvreserved: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingCallFunctionShim(szdllname.rawAddress.toCPointer<ByteVar>(), szfunctionname.rawAddress.toCPointer<ByteVar>(), lpvargument1.rawAddress.toCPointer<ByteVar>(), lpvargument2.rawAddress.toCPointer<ByteVar>(), szversion.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun clrCreateManagedInstance(ptypename: Pcwstr, riid: ConstPtr, ppobject: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingClrCreateManagedInstance(ptypename.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppobject.rawAddress.toCPointer<ByteVar>())

public actual fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingCorBindToCurrentRuntime(pwszfilename.rawAddress.toCPointer<ByteVar>(), rclsid.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingCorBindToRuntime(pwszversion.rawAddress.toCPointer<ByteVar>(), pwszbuildflavor.rawAddress.toCPointer<ByteVar>(), rclsid.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun corBindToRuntimeByCfg(pcfgstream: MutPtr, reserved: UInt, startupflags: UInt, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingCorBindToRuntimeByCfg(pcfgstream.rawAddress.toCPointer<ByteVar>(), reserved, startupflags, rclsid.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingCorBindToRuntimeEx(pwszversion.rawAddress.toCPointer<ByteVar>(), pwszbuildflavor.rawAddress.toCPointer<ByteVar>(), startupflags, rclsid.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: MutPtr, startupflags: UInt, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingCorBindToRuntimeHost(pwszversion.rawAddress.toCPointer<ByteVar>(), pwszbuildflavor.rawAddress.toCPointer<ByteVar>(), pwszhostconfigfile.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), startupflags, rclsid.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun corExitProcess(exitcode: Int) {
    windowssysWindowsWin32SystemClrhostingCorExitProcess(exitcode)
}

public actual fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: ConstPtr, dwactivationdata: UInt, ppwzactivationdata: ConstPtr, lpprocessinformation: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingCorLaunchApplication(dwclickoncehost, pwzappfullname.rawAddress.toCPointer<ByteVar>(), dwmanifestpaths, ppwzmanifestpaths.rawAddress.toCPointer<ByteVar>(), dwactivationdata, ppwzactivationdata.rawAddress.toCPointer<ByteVar>(), lpprocessinformation.rawAddress.toCPointer<ByteVar>())

public actual fun corMarkThreadInThreadPool() {
    windowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool()
}

public actual fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingCreateDebuggingInterfaceFromVersion(idebuggerversion, szdebuggeeversion.rawAddress.toCPointer<ByteVar>(), ppcordb.rawAddress.toCPointer<ByteVar>())

public actual fun getCLRIdentityManager(riid: ConstPtr, ppmanager: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingGetCLRIdentityManager(riid.rawAddress.toCPointer<ByteVar>(), ppmanager.rawAddress.toCPointer<ByteVar>())

public actual fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingGetCORRequiredVersion(pbuffer.rawAddress.toCPointer<ByteVar>(), cchbuffer, dwlength.rawAddress.toCPointer<ByteVar>())

public actual fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingGetCORSystemDirectory(pbuffer.rawAddress.toCPointer<ByteVar>(), cchbuffer, dwlength.rawAddress.toCPointer<ByteVar>())

public actual fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingGetCORVersion(pbbuffer.rawAddress.toCPointer<ByteVar>(), cchbuffer, dwlength.rawAddress.toCPointer<ByteVar>())

public actual fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingGetFileVersion(szfilename.rawAddress.toCPointer<ByteVar>(), szbuffer.rawAddress.toCPointer<ByteVar>(), cchbuffer, dwlength.rawAddress.toCPointer<ByteVar>())

public actual fun getRealProcAddress(pwszprocname: Pcstr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingGetRealProcAddress(pwszprocname.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: MutPtr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeInfo(pexe.rawAddress.toCPointer<ByteVar>(), pwszversion.rawAddress.toCPointer<ByteVar>(), pconfigurationfile.rawAddress.toCPointer<ByteVar>(), startupflags, runtimeinfoflags, pdirectory.rawAddress.toCPointer<ByteVar>(), dwdirectory, dwdirectorylength.rawAddress.toCPointer<ByteVar>(), pversion.rawAddress.toCPointer<ByteVar>(), cchbuffer, dwlength.rawAddress.toCPointer<ByteVar>())

public actual fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersion(pexe.rawAddress.toCPointer<ByteVar>(), pversion.rawAddress.toCPointer<ByteVar>(), cchbuffer, dwlength.rawAddress.toCPointer<ByteVar>())

public actual fun getRequestedRuntimeVersionForCLSID(rclsid: ConstPtr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr, dwresolutionflags: ClsidResolutionFlags): Hresult =
    windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersionForCLSID(rclsid.rawAddress.toCPointer<ByteVar>(), pversion.rawAddress.toCPointer<ByteVar>(), cchbuffer, dwlength.rawAddress.toCPointer<ByteVar>(), dwresolutionflags)

public actual fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingGetVersionFromProcess(hprocess.rawAddress.toCPointer<ByteVar>(), pversion.rawAddress.toCPointer<ByteVar>(), cchbuffer, dwlength.rawAddress.toCPointer<ByteVar>())

public actual fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: MutPtr, phmoddll: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingLoadLibraryShim(szdllname.rawAddress.toCPointer<ByteVar>(), szversion.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>(), phmoddll.rawAddress.toCPointer<ByteVar>())

public actual fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult =
    windowssysWindowsWin32SystemClrhostingLoadStringRC(iresouceid, szbuffer.rawAddress.toCPointer<ByteVar>(), imax, bquiet)

public actual fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingLoadStringRCEx(lcid, iresouceid, szbuffer.rawAddress.toCPointer<ByteVar>(), imax, bquiet, pcwchused.rawAddress.toCPointer<ByteVar>())

public actual fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: MutPtr, pendhostsetup: MutPtr): Hresult =
    windowssysWindowsWin32SystemClrhostingLockClrVersion(0L.toCPointer<ByteVar>(), pbeginhostsetup.rawAddress.toCPointer<ByteVar>(), pendhostsetup.rawAddress.toCPointer<ByteVar>())

public actual fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult =
    windowssysWindowsWin32SystemClrhostingRunDll32ShimW(hwnd.rawAddress.toCPointer<ByteVar>(), hinst.rawAddress.toCPointer<ByteVar>(), lpszcmdline.rawAddress.toCPointer<ByteVar>(), ncmdshow)
