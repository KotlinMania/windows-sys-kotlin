package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun interface FnCallback {
    public operator fun invoke(): HRESULT
}

public fun CLRCreateInstance(clsid: Long, riid: Long, ppinterface: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "CLRCreateInstance", longArrayOf(clsid, riid, ppinterface)).toInt()
}

public fun CallFunctionShim(szdllname: PCWSTR, szfunctionname: PCSTR, lpvargument1: Long, lpvargument2: Long, szversion: PCWSTR, pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "CallFunctionShim", longArrayOf(szdllname, szfunctionname, lpvargument1, lpvargument2, szversion, pvreserved)).toInt()
}

public fun ClrCreateManagedInstance(ptypename: PCWSTR, riid: Long, ppobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "ClrCreateManagedInstance", longArrayOf(ptypename, riid, ppobject)).toInt()
}

public fun CorBindToCurrentRuntime(pwszfilename: PCWSTR, rclsid: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "CorBindToCurrentRuntime", longArrayOf(pwszfilename, rclsid, riid, ppv)).toInt()
}

public fun CorBindToRuntime(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, rclsid: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "CorBindToRuntime", longArrayOf(pwszversion, pwszbuildflavor, rclsid, riid, ppv)).toInt()
}

public fun CorBindToRuntimeByCfg(pcfgstream: Long, reserved: UInt, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "CorBindToRuntimeByCfg", longArrayOf(pcfgstream, reserved.toLong(), startupflags.toLong(), rclsid, riid, ppv)).toInt()
}

public fun CorBindToRuntimeEx(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "CorBindToRuntimeEx", longArrayOf(pwszversion, pwszbuildflavor, startupflags.toLong(), rclsid, riid, ppv)).toInt()
}

public fun CorBindToRuntimeHost(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, pwszhostconfigfile: PCWSTR, preserved: Long, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "CorBindToRuntimeHost", longArrayOf(pwszversion, pwszbuildflavor, pwszhostconfigfile, preserved, startupflags.toLong(), rclsid, riid, ppv)).toInt()
}

public fun CorExitProcess(exitcode: Int) {
    Win32DynamicFfi.invoke("mscoree.dll", "CorExitProcess", longArrayOf(exitcode.toLong()))
}

public fun CorLaunchApplication(dwclickoncehost: HOST_TYPE, pwzappfullname: PCWSTR, dwmanifestpaths: UInt, ppwzmanifestpaths: Long, dwactivationdata: UInt, ppwzactivationdata: Long, lpprocessinformation: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "CorLaunchApplication", longArrayOf(dwclickoncehost.toLong(), pwzappfullname, dwmanifestpaths.toLong(), ppwzmanifestpaths, dwactivationdata.toLong(), ppwzactivationdata, lpprocessinformation)).toInt()
}

public fun CorMarkThreadInThreadPool() {
    Win32DynamicFfi.invoke("mscoree.dll", "CorMarkThreadInThreadPool", longArrayOf())
}

public fun CreateDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: PCWSTR, ppcordb: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "CreateDebuggingInterfaceFromVersion", longArrayOf(idebuggerversion.toLong(), szdebuggeeversion, ppcordb)).toInt()
}

public fun GetCLRIdentityManager(riid: Long, ppmanager: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "GetCLRIdentityManager", longArrayOf(riid, ppmanager)).toInt()
}

public fun GetCORRequiredVersion(pbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "GetCORRequiredVersion", longArrayOf(pbuffer, cchbuffer.toLong(), dwlength)).toInt()
}

public fun GetCORSystemDirectory(pbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "GetCORSystemDirectory", longArrayOf(pbuffer, cchbuffer.toLong(), dwlength)).toInt()
}

public fun GetCORVersion(pbbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "GetCORVersion", longArrayOf(pbbuffer, cchbuffer.toLong(), dwlength)).toInt()
}

public fun GetFileVersion(szfilename: PCWSTR, szbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "GetFileVersion", longArrayOf(szfilename, szbuffer, cchbuffer.toLong(), dwlength)).toInt()
}

public fun GetRealProcAddress(pwszprocname: PCSTR, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "GetRealProcAddress", longArrayOf(pwszprocname, ppv)).toInt()
}

public fun GetRequestedRuntimeInfo(pexe: PCWSTR, pwszversion: PCWSTR, pconfigurationfile: PCWSTR, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: PWSTR, dwdirectory: UInt, dwdirectorylength: Long, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "GetRequestedRuntimeInfo", longArrayOf(pexe, pwszversion, pconfigurationfile, startupflags.toLong(), runtimeinfoflags.toLong(), pdirectory, dwdirectory.toLong(), dwdirectorylength, pversion, cchbuffer.toLong(), dwlength)).toInt()
}

public fun GetRequestedRuntimeVersion(pexe: PCWSTR, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "GetRequestedRuntimeVersion", longArrayOf(pexe, pversion, cchbuffer.toLong(), dwlength)).toInt()
}

public fun GetRequestedRuntimeVersionForCLSID(rclsid: Long, pversion: PWSTR, cchbuffer: UInt, dwlength: Long, dwresolutionflags: CLSID_RESOLUTION_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "GetRequestedRuntimeVersionForCLSID", longArrayOf(rclsid, pversion, cchbuffer.toLong(), dwlength, dwresolutionflags.toLong())).toInt()
}

public fun GetVersionFromProcess(hprocess: HANDLE, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "GetVersionFromProcess", longArrayOf(hprocess, pversion, cchbuffer.toLong(), dwlength)).toInt()
}

public fun LoadLibraryShim(szdllname: PCWSTR, szversion: PCWSTR, pvreserved: Long, phmoddll: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "LoadLibraryShim", longArrayOf(szdllname, szversion, pvreserved, phmoddll)).toInt()
}

public fun LoadStringRC(iresouceid: UInt, szbuffer: PWSTR, imax: Int, bquiet: Int): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "LoadStringRC", longArrayOf(iresouceid.toLong(), szbuffer, imax.toLong(), bquiet.toLong())).toInt()
}

public fun LoadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: PWSTR, imax: Int, bquiet: Int, pcwchused: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "LoadStringRCEx", longArrayOf(lcid.toLong(), iresouceid.toLong(), szbuffer, imax.toLong(), bquiet.toLong(), pcwchused)).toInt()
}

public fun LockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: Long, pendhostsetup: Long): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "LockClrVersion", longArrayOf(Win32DynamicFfi.objectSlot(hostcallback), pbeginhostsetup, pendhostsetup)).toInt()
}

public fun RunDll32ShimW(hwnd: HWND, hinst: HINSTANCE, lpszcmdline: PCWSTR, ncmdshow: Int): HRESULT {
    return Win32DynamicFfi.invoke("mscoree.dll", "RunDll32ShimW", longArrayOf(hwnd, hinst, lpszcmdline, ncmdshow.toLong())).toInt()
}
