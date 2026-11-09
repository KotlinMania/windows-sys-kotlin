@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun CLRCreateInstance(clsid: Long, riid: Long, ppinterface: Long): HRESULT =
    0

public actual fun CallFunctionShim(szdllname: PCWSTR, szfunctionname: PCSTR, lpvargument1: Long, lpvargument2: Long, szversion: PCWSTR, pvreserved: Long): HRESULT =
    0

public actual fun ClrCreateManagedInstance(ptypename: PCWSTR, riid: Long, ppobject: Long): HRESULT =
    0

public actual fun CorBindToCurrentRuntime(pwszfilename: PCWSTR, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun CorBindToRuntime(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun CorBindToRuntimeByCfg(pcfgstream: Long, reserved: UInt, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun CorBindToRuntimeEx(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun CorBindToRuntimeHost(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, pwszhostconfigfile: PCWSTR, preserved: Long, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun CorExitProcess(exitcode: Int) {
}

public actual fun CorLaunchApplication(dwclickoncehost: HOST_TYPE, pwzappfullname: PCWSTR, dwmanifestpaths: UInt, ppwzmanifestpaths: Long, dwactivationdata: UInt, ppwzactivationdata: Long, lpprocessinformation: Long): HRESULT =
    0

public actual fun CorMarkThreadInThreadPool() {
}

public actual fun CreateDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: PCWSTR, ppcordb: Long): HRESULT =
    0

public actual fun GetCLRIdentityManager(riid: Long, ppmanager: Long): HRESULT =
    0

public actual fun GetCORRequiredVersion(pbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    0

public actual fun GetCORSystemDirectory(pbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    0

public actual fun GetCORVersion(pbbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    0

public actual fun GetFileVersion(szfilename: PCWSTR, szbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    0

public actual fun GetRealProcAddress(pwszprocname: PCSTR, ppv: Long): HRESULT =
    0

public actual fun GetRequestedRuntimeInfo(pexe: PCWSTR, pwszversion: PCWSTR, pconfigurationfile: PCWSTR, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: PWSTR, dwdirectory: UInt, dwdirectorylength: Long, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    0

public actual fun GetRequestedRuntimeVersion(pexe: PCWSTR, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    0

public actual fun GetRequestedRuntimeVersionForCLSID(rclsid: Long, pversion: PWSTR, cchbuffer: UInt, dwlength: Long, dwresolutionflags: CLSID_RESOLUTION_FLAGS): HRESULT =
    0

public actual fun GetVersionFromProcess(hprocess: HANDLE, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    0

public actual fun LoadLibraryShim(szdllname: PCWSTR, szversion: PCWSTR, pvreserved: Long, phmoddll: Long): HRESULT =
    0

public actual fun LoadStringRC(iresouceid: UInt, szbuffer: PWSTR, imax: Int, bquiet: Int): HRESULT =
    0

public actual fun LoadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: PWSTR, imax: Int, bquiet: Int, pcwchused: Long): HRESULT =
    0

public actual fun LockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: Long, pendhostsetup: Long): HRESULT =
    0

public actual fun RunDll32ShimW(hwnd: HWND, hinst: HINSTANCE, lpszcmdline: PCWSTR, ncmdshow: Int): HRESULT =
    0
