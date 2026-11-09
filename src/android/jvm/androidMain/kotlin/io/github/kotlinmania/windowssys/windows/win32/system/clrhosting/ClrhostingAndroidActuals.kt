@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32SystemClrhostingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CLRCreateInstance(clsid: Long, riid: Long, ppinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CallFunctionShim(szdllname: Long, szfunctionname: Long, lpvargument1: Long, lpvargument2: Long, szversion: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_ClrCreateManagedInstance(ptypename: Long, riid: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CorBindToCurrentRuntime(pwszfilename: Long, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CorBindToRuntime(pwszversion: Long, pwszbuildflavor: Long, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CorBindToRuntimeByCfg(pcfgstream: Long, reserved: Int, startupflags: Int, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CorBindToRuntimeEx(pwszversion: Long, pwszbuildflavor: Long, startupflags: Int, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CorBindToRuntimeHost(pwszversion: Long, pwszbuildflavor: Long, pwszhostconfigfile: Long, preserved: Long, startupflags: Int, rclsid: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CorExitProcess(exitcode: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CorLaunchApplication(dwclickoncehost: Int, pwzappfullname: Long, dwmanifestpaths: Int, ppwzmanifestpaths: Long, dwactivationdata: Int, ppwzactivationdata: Long, lpprocessinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CorMarkThreadInThreadPool()

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_CreateDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Long, ppcordb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_GetCLRIdentityManager(riid: Long, ppmanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_GetCORRequiredVersion(pbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_GetCORSystemDirectory(pbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_GetCORVersion(pbbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_GetFileVersion(szfilename: Long, szbuffer: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_GetRealProcAddress(pwszprocname: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeInfo(pexe: Long, pwszversion: Long, pconfigurationfile: Long, startupflags: Int, runtimeinfoflags: Int, pdirectory: Long, dwdirectory: Int, dwdirectorylength: Long, pversion: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersion(pexe: Long, pversion: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersionForCLSID(rclsid: Long, pversion: Long, cchbuffer: Int, dwlength: Long, dwresolutionflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_GetVersionFromProcess(hprocess: Long, pversion: Long, cchbuffer: Int, dwlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_LoadLibraryShim(szdllname: Long, szversion: Long, pvreserved: Long, phmoddll: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_LoadStringRC(iresouceid: Int, szbuffer: Long, imax: Int, bquiet: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_LoadStringRCEx(lcid: Int, iresouceid: Int, szbuffer: Long, imax: Int, bquiet: Int, pcwchused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_LockClrVersion(hostcallback: Long, pbeginhostsetup: Long, pendhostsetup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_clrhosting_RunDll32ShimW(hwnd: Long, hinst: Long, lpszcmdline: Long, ncmdshow: Int): Int
}

public actual fun CLRCreateInstance(clsid: Long, riid: Long, ppinterface: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CLRCreateInstance(clsid, riid, ppinterface)

public actual fun CallFunctionShim(szdllname: PCWSTR, szfunctionname: PCSTR, lpvargument1: Long, lpvargument2: Long, szversion: PCWSTR, pvreserved: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CallFunctionShim(szdllname, szfunctionname, lpvargument1, lpvargument2, szversion, pvreserved)

public actual fun ClrCreateManagedInstance(ptypename: PCWSTR, riid: Long, ppobject: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_ClrCreateManagedInstance(ptypename, riid, ppobject)

public actual fun CorBindToCurrentRuntime(pwszfilename: PCWSTR, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CorBindToCurrentRuntime(pwszfilename, rclsid, riid, ppv)

public actual fun CorBindToRuntime(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CorBindToRuntime(pwszversion, pwszbuildflavor, rclsid, riid, ppv)

public actual fun CorBindToRuntimeByCfg(pcfgstream: Long, reserved: UInt, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CorBindToRuntimeByCfg(pcfgstream, reserved.toInt(), startupflags.toInt(), rclsid, riid, ppv)

public actual fun CorBindToRuntimeEx(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CorBindToRuntimeEx(pwszversion, pwszbuildflavor, startupflags.toInt(), rclsid, riid, ppv)

public actual fun CorBindToRuntimeHost(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, pwszhostconfigfile: PCWSTR, preserved: Long, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CorBindToRuntimeHost(pwszversion, pwszbuildflavor, pwszhostconfigfile, preserved, startupflags.toInt(), rclsid, riid, ppv)

public actual fun CorExitProcess(exitcode: Int) {
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CorExitProcess(exitcode)
}

public actual fun CorLaunchApplication(dwclickoncehost: HOST_TYPE, pwzappfullname: PCWSTR, dwmanifestpaths: UInt, ppwzmanifestpaths: Long, dwactivationdata: UInt, ppwzactivationdata: Long, lpprocessinformation: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CorLaunchApplication(dwclickoncehost, pwzappfullname, dwmanifestpaths.toInt(), ppwzmanifestpaths, dwactivationdata.toInt(), ppwzactivationdata, lpprocessinformation)

public actual fun CorMarkThreadInThreadPool() {
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CorMarkThreadInThreadPool()
}

public actual fun CreateDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: PCWSTR, ppcordb: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_CreateDebuggingInterfaceFromVersion(idebuggerversion, szdebuggeeversion, ppcordb)

public actual fun GetCLRIdentityManager(riid: Long, ppmanager: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_GetCLRIdentityManager(riid, ppmanager)

public actual fun GetCORRequiredVersion(pbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_GetCORRequiredVersion(pbuffer, cchbuffer.toInt(), dwlength)

public actual fun GetCORSystemDirectory(pbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_GetCORSystemDirectory(pbuffer, cchbuffer.toInt(), dwlength)

public actual fun GetCORVersion(pbbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_GetCORVersion(pbbuffer, cchbuffer.toInt(), dwlength)

public actual fun GetFileVersion(szfilename: PCWSTR, szbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_GetFileVersion(szfilename, szbuffer, cchbuffer.toInt(), dwlength)

public actual fun GetRealProcAddress(pwszprocname: PCSTR, ppv: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_GetRealProcAddress(pwszprocname, ppv)

public actual fun GetRequestedRuntimeInfo(pexe: PCWSTR, pwszversion: PCWSTR, pconfigurationfile: PCWSTR, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: PWSTR, dwdirectory: UInt, dwdirectorylength: Long, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeInfo(pexe, pwszversion, pconfigurationfile, startupflags.toInt(), runtimeinfoflags.toInt(), pdirectory, dwdirectory.toInt(), dwdirectorylength, pversion, cchbuffer.toInt(), dwlength)

public actual fun GetRequestedRuntimeVersion(pexe: PCWSTR, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersion(pexe, pversion, cchbuffer.toInt(), dwlength)

public actual fun GetRequestedRuntimeVersionForCLSID(rclsid: Long, pversion: PWSTR, cchbuffer: UInt, dwlength: Long, dwresolutionflags: CLSID_RESOLUTION_FLAGS): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersionForCLSID(rclsid, pversion, cchbuffer.toInt(), dwlength, dwresolutionflags)

public actual fun GetVersionFromProcess(hprocess: HANDLE, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_GetVersionFromProcess(hprocess, pversion, cchbuffer.toInt(), dwlength)

public actual fun LoadLibraryShim(szdllname: PCWSTR, szversion: PCWSTR, pvreserved: Long, phmoddll: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_LoadLibraryShim(szdllname, szversion, pvreserved, phmoddll)

public actual fun LoadStringRC(iresouceid: UInt, szbuffer: PWSTR, imax: Int, bquiet: Int): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_LoadStringRC(iresouceid.toInt(), szbuffer, imax, bquiet)

public actual fun LoadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: PWSTR, imax: Int, bquiet: Int, pcwchused: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_LoadStringRCEx(lcid.toInt(), iresouceid.toInt(), szbuffer, imax, bquiet, pcwchused)

public actual fun LockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: Long, pendhostsetup: Long): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_LockClrVersion(hostcallback.toLong(), pbeginhostsetup, pendhostsetup)

public actual fun RunDll32ShimW(hwnd: HWND, hinst: HINSTANCE, lpszcmdline: PCWSTR, ncmdshow: Int): HRESULT =
    WindowsWin32SystemClrhostingJniBridge.windowssys_windows_win32_system_clrhosting_RunDll32ShimW(hwnd, hinst, lpszcmdline, ncmdshow)
