@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SystemClrhostingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_cLRCreateInstance(clsid: Long, riid: Long, ppinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_callFunctionShim(szdllname: Long, szfunctionname: Long, lpvargument1: Long, lpvargument2: Long, szversion: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_clrCreateManagedInstance(ptypename: Long, riid: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_corBindToCurrentRuntime(pwszfilename: Long, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_corBindToRuntime(pwszversion: Long, pwszbuildflavor: Long, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_corBindToRuntimeByCfg(pcfgstream: Long, reserved: Int, startupflags: Int, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_corBindToRuntimeEx(pwszversion: Long, pwszbuildflavor: Long, startupflags: Int, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_corBindToRuntimeHost(pwszversion: Long, pwszbuildflavor: Long, pwszhostconfigfile: Long, preserved: Long, startupflags: Int, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_corExitProcess(exitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_corLaunchApplication(dwclickoncehost: Int, pwzappfullname: Long, dwmanifestpaths: Int, ppwzmanifestpaths: Long, dwactivationdata: Int, ppwzactivationdata: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_corMarkThreadInThreadPool()

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Long, ppcordb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_getCLRIdentityManager(riid: Long, ppmanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_getCORRequiredVersion(pbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_getCORSystemDirectory(pbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_getCORVersion(pbbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_getFileVersion(szfilename: Long, szbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_getRealProcAddress(pwszprocname: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_getRequestedRuntimeInfo(pexe: Long, pwszversion: Long, pconfigurationfile: Long, startupflags: Int, runtimeinfoflags: Int, pdirectory: Long, dwdirectory: Int, dwdirectorylength: Long, pversion: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersion(pexe: Long, pversion: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersionForCLSID(rclsid: Long, pversion: Long, cchbuffer: Int, dwlength: Long, dwresolutionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_getVersionFromProcess(hprocess: Long, pversion: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_loadLibraryShim(szdllname: Long, szversion: Long, pvreserved: Long, phmoddll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_loadStringRC(iresouceid: Int, szbuffer: Long, imax: Int, bquiet: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_loadStringRCEx(lcid: Int, iresouceid: Int, szbuffer: Long, imax: Int, bquiet: Int, pcwchused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_lockClrVersion(hostcallback: Long, pbeginhostsetup: Long, pendhostsetup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_runDll32ShimW(hwnd: Long, hinst: Long, lpszcmdline: Long, ncmdshow: Int): Int
}

public actual fun cLRCreateInstance(clsid: COpaquePointer?, riid: COpaquePointer?, ppinterface: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_cLRCreateInstance((clsid?.value ?: 0L), (riid?.value ?: 0L), (ppinterface?.value ?: 0L))

public actual fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: COpaquePointer?, lpvargument2: COpaquePointer?, szversion: Pcwstr, pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_callFunctionShim((szdllname?.value ?: 0L), (szfunctionname?.value ?: 0L), (lpvargument1?.value ?: 0L), (lpvargument2?.value ?: 0L), (szversion?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun clrCreateManagedInstance(ptypename: Pcwstr, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_clrCreateManagedInstance((ptypename?.value ?: 0L), (riid?.value ?: 0L), (ppobject?.value ?: 0L))

public actual fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_corBindToCurrentRuntime((pwszfilename?.value ?: 0L), (rclsid?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_corBindToRuntime((pwszversion?.value ?: 0L), (pwszbuildflavor?.value ?: 0L), (rclsid?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun corBindToRuntimeByCfg(pcfgstream: COpaquePointer?, reserved: UInt, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_corBindToRuntimeByCfg((pcfgstream?.value ?: 0L), reserved.toInt(), startupflags.toInt(), (rclsid?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_corBindToRuntimeEx((pwszversion?.value ?: 0L), (pwszbuildflavor?.value ?: 0L), startupflags.toInt(), (rclsid?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: COpaquePointer?, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_corBindToRuntimeHost((pwszversion?.value ?: 0L), (pwszbuildflavor?.value ?: 0L), (pwszhostconfigfile?.value ?: 0L), (preserved?.value ?: 0L), startupflags.toInt(), (rclsid?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun corExitProcess(exitcode: Int) {
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_corExitProcess(exitcode)
}

public actual fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: COpaquePointer?, dwactivationdata: UInt, ppwzactivationdata: COpaquePointer?, lpprocessinformation: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_corLaunchApplication(dwclickoncehost, (pwzappfullname?.value ?: 0L), dwmanifestpaths.toInt(), (ppwzmanifestpaths?.value ?: 0L), dwactivationdata.toInt(), (ppwzactivationdata?.value ?: 0L), (lpprocessinformation?.value ?: 0L))

public actual fun corMarkThreadInThreadPool() {
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_corMarkThreadInThreadPool()
}

public actual fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_createDebuggingInterfaceFromVersion(idebuggerversion, (szdebuggeeversion?.value ?: 0L), (ppcordb?.value ?: 0L))

public actual fun getCLRIdentityManager(riid: COpaquePointer?, ppmanager: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_getCLRIdentityManager((riid?.value ?: 0L), (ppmanager?.value ?: 0L))

public actual fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_getCORRequiredVersion((pbuffer?.value ?: 0L), cchbuffer.toInt(), (dwlength?.value ?: 0L))

public actual fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_getCORSystemDirectory((pbuffer?.value ?: 0L), cchbuffer.toInt(), (dwlength?.value ?: 0L))

public actual fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_getCORVersion((pbbuffer?.value ?: 0L), cchbuffer.toInt(), (dwlength?.value ?: 0L))

public actual fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_getFileVersion((szfilename?.value ?: 0L), (szbuffer?.value ?: 0L), cchbuffer.toInt(), (dwlength?.value ?: 0L))

public actual fun getRealProcAddress(pwszprocname: Pcstr, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_getRealProcAddress((pwszprocname?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: COpaquePointer?, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_getRequestedRuntimeInfo((pexe?.value ?: 0L), (pwszversion?.value ?: 0L), (pconfigurationfile?.value ?: 0L), startupflags.toInt(), runtimeinfoflags.toInt(), (pdirectory?.value ?: 0L), dwdirectory.toInt(), (dwdirectorylength?.value ?: 0L), (pversion?.value ?: 0L), cchbuffer.toInt(), (dwlength?.value ?: 0L))

public actual fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersion((pexe?.value ?: 0L), (pversion?.value ?: 0L), cchbuffer.toInt(), (dwlength?.value ?: 0L))

public actual fun getRequestedRuntimeVersionForCLSID(rclsid: COpaquePointer?, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?, dwresolutionflags: ClsidResolutionFlags): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersionForCLSID((rclsid?.value ?: 0L), (pversion?.value ?: 0L), cchbuffer.toInt(), (dwlength?.value ?: 0L), dwresolutionflags)

public actual fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_getVersionFromProcess((hprocess?.value ?: 0L), (pversion?.value ?: 0L), cchbuffer.toInt(), (dwlength?.value ?: 0L))

public actual fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: COpaquePointer?, phmoddll: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_loadLibraryShim((szdllname?.value ?: 0L), (szversion?.value ?: 0L), (pvreserved?.value ?: 0L), (phmoddll?.value ?: 0L))

public actual fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_loadStringRC(iresouceid.toInt(), (szbuffer?.value ?: 0L), imax, bquiet)

public actual fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_loadStringRCEx(lcid.toInt(), iresouceid.toInt(), (szbuffer?.value ?: 0L), imax, bquiet, (pcwchused?.value ?: 0L))

public actual fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: COpaquePointer?, pendhostsetup: COpaquePointer?): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_lockClrVersion(0L, (pbeginhostsetup?.value ?: 0L), (pendhostsetup?.value ?: 0L))

public actual fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_runDll32ShimW((hwnd?.value ?: 0L), (hinst?.value ?: 0L), (lpszcmdline?.value ?: 0L), ncmdshow)
