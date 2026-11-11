@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_cLRCreateInstance
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_callFunctionShim
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_clrCreateManagedInstance
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_corBindToCurrentRuntime
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_corBindToRuntime
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_corBindToRuntimeByCfg
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_corBindToRuntimeEx
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_corBindToRuntimeHost
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_corExitProcess
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_corLaunchApplication
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_corMarkThreadInThreadPool
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_createDebuggingInterfaceFromVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_getCLRIdentityManager
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_getCORRequiredVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_getCORSystemDirectory
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_getCORVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_getFileVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_getRealProcAddress
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_getRequestedRuntimeInfo
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersionForCLSID
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_getVersionFromProcess
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_loadLibraryShim
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_loadStringRC
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_loadStringRCEx
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_lockClrVersion
import io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_runDll32ShimW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun cLRCreateInstance(clsid: COpaquePointer?, riid: COpaquePointer?, ppinterface: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_cLRCreateInstance(clsid?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppinterface?.value?.toCPointer<ByteVar>())

public actual fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: COpaquePointer?, lpvargument2: COpaquePointer?, szversion: Pcwstr, pvreserved: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_callFunctionShim(szdllname?.value?.toCPointer<ByteVar>(), szfunctionname?.value?.toCPointer<ByteVar>(), lpvargument1?.value?.toCPointer<ByteVar>(), lpvargument2?.value?.toCPointer<ByteVar>(), szversion?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun clrCreateManagedInstance(ptypename: Pcwstr, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_clrCreateManagedInstance(ptypename?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppobject?.value?.toCPointer<ByteVar>())

public actual fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_corBindToCurrentRuntime(pwszfilename?.value?.toCPointer<ByteVar>(), rclsid?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_corBindToRuntime(pwszversion?.value?.toCPointer<ByteVar>(), pwszbuildflavor?.value?.toCPointer<ByteVar>(), rclsid?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun corBindToRuntimeByCfg(pcfgstream: COpaquePointer?, reserved: UInt, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_corBindToRuntimeByCfg(pcfgstream?.value?.toCPointer<ByteVar>(), reserved, startupflags, rclsid?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_corBindToRuntimeEx(pwszversion?.value?.toCPointer<ByteVar>(), pwszbuildflavor?.value?.toCPointer<ByteVar>(), startupflags, rclsid?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: COpaquePointer?, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_corBindToRuntimeHost(pwszversion?.value?.toCPointer<ByteVar>(), pwszbuildflavor?.value?.toCPointer<ByteVar>(), pwszhostconfigfile?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), startupflags, rclsid?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun corExitProcess(exitcode: Int) {
    windowssys_windows_win32_system_clrhosting_corExitProcess(exitcode)
}

public actual fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: COpaquePointer?, dwactivationdata: UInt, ppwzactivationdata: COpaquePointer?, lpprocessinformation: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_corLaunchApplication(dwclickoncehost, pwzappfullname?.value?.toCPointer<ByteVar>(), dwmanifestpaths, ppwzmanifestpaths?.value?.toCPointer<ByteVar>(), dwactivationdata, ppwzactivationdata?.value?.toCPointer<ByteVar>(), lpprocessinformation?.value?.toCPointer<ByteVar>())

public actual fun corMarkThreadInThreadPool() {
    windowssys_windows_win32_system_clrhosting_corMarkThreadInThreadPool()
}

public actual fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_createDebuggingInterfaceFromVersion(idebuggerversion, szdebuggeeversion?.value?.toCPointer<ByteVar>(), ppcordb?.value?.toCPointer<ByteVar>())

public actual fun getCLRIdentityManager(riid: COpaquePointer?, ppmanager: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_getCLRIdentityManager(riid?.value?.toCPointer<ByteVar>(), ppmanager?.value?.toCPointer<ByteVar>())

public actual fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_getCORRequiredVersion(pbuffer?.value?.toCPointer<ByteVar>(), cchbuffer, dwlength?.value?.toCPointer<ByteVar>())

public actual fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_getCORSystemDirectory(pbuffer?.value?.toCPointer<ByteVar>(), cchbuffer, dwlength?.value?.toCPointer<ByteVar>())

public actual fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_getCORVersion(pbbuffer?.value?.toCPointer<ByteVar>(), cchbuffer, dwlength?.value?.toCPointer<ByteVar>())

public actual fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_getFileVersion(szfilename?.value?.toCPointer<ByteVar>(), szbuffer?.value?.toCPointer<ByteVar>(), cchbuffer, dwlength?.value?.toCPointer<ByteVar>())

public actual fun getRealProcAddress(pwszprocname: Pcstr, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_getRealProcAddress(pwszprocname?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: COpaquePointer?, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_getRequestedRuntimeInfo(pexe?.value?.toCPointer<ByteVar>(), pwszversion?.value?.toCPointer<ByteVar>(), pconfigurationfile?.value?.toCPointer<ByteVar>(), startupflags, runtimeinfoflags, pdirectory?.value?.toCPointer<ByteVar>(), dwdirectory, dwdirectorylength?.value?.toCPointer<ByteVar>(), pversion?.value?.toCPointer<ByteVar>(), cchbuffer, dwlength?.value?.toCPointer<ByteVar>())

public actual fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersion(pexe?.value?.toCPointer<ByteVar>(), pversion?.value?.toCPointer<ByteVar>(), cchbuffer, dwlength?.value?.toCPointer<ByteVar>())

public actual fun getRequestedRuntimeVersionForCLSID(rclsid: COpaquePointer?, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?, dwresolutionflags: ClsidResolutionFlags): Hresult =
    windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersionForCLSID(rclsid?.value?.toCPointer<ByteVar>(), pversion?.value?.toCPointer<ByteVar>(), cchbuffer, dwlength?.value?.toCPointer<ByteVar>(), dwresolutionflags)

public actual fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_getVersionFromProcess(hprocess?.value?.toCPointer<ByteVar>(), pversion?.value?.toCPointer<ByteVar>(), cchbuffer, dwlength?.value?.toCPointer<ByteVar>())

public actual fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: COpaquePointer?, phmoddll: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_loadLibraryShim(szdllname?.value?.toCPointer<ByteVar>(), szversion?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>(), phmoddll?.value?.toCPointer<ByteVar>())

public actual fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult =
    windowssys_windows_win32_system_clrhosting_loadStringRC(iresouceid, szbuffer?.value?.toCPointer<ByteVar>(), imax, bquiet)

public actual fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_loadStringRCEx(lcid, iresouceid, szbuffer?.value?.toCPointer<ByteVar>(), imax, bquiet, pcwchused?.value?.toCPointer<ByteVar>())

public actual fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: COpaquePointer?, pendhostsetup: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_clrhosting_lockClrVersion(0L.toCPointer<ByteVar>(), pbeginhostsetup?.value?.toCPointer<ByteVar>(), pendhostsetup?.value?.toCPointer<ByteVar>())

public actual fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult =
    windowssys_windows_win32_system_clrhosting_runDll32ShimW(hwnd?.value?.toCPointer<ByteVar>(), hinst?.value?.toCPointer<ByteVar>(), lpszcmdline?.value?.toCPointer<ByteVar>(), ncmdshow)
