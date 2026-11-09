@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32SystemClrhostingNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CLRCreateInstance(clsid: Long, riid: Long, ppinterface: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CLRCreateInstance(clsid.toString(), riid.toString(), ppinterface.toString()) as Int) else 0

public actual fun CallFunctionShim(szdllname: PCWSTR, szfunctionname: PCSTR, lpvargument1: Long, lpvargument2: Long, szversion: PCWSTR, pvreserved: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CallFunctionShim(szdllname.toString(), szfunctionname.toString(), lpvargument1.toString(), lpvargument2.toString(), szversion.toString(), pvreserved.toString()) as Int) else 0

public actual fun ClrCreateManagedInstance(ptypename: PCWSTR, riid: Long, ppobject: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_ClrCreateManagedInstance(ptypename.toString(), riid.toString(), ppobject.toString()) as Int) else 0

public actual fun CorBindToCurrentRuntime(pwszfilename: PCWSTR, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CorBindToCurrentRuntime(pwszfilename.toString(), rclsid.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun CorBindToRuntime(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CorBindToRuntime(pwszversion.toString(), pwszbuildflavor.toString(), rclsid.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun CorBindToRuntimeByCfg(pcfgstream: Long, reserved: UInt, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CorBindToRuntimeByCfg(pcfgstream.toString(), reserved.toInt(), startupflags.toInt(), rclsid.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun CorBindToRuntimeEx(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CorBindToRuntimeEx(pwszversion.toString(), pwszbuildflavor.toString(), startupflags.toInt(), rclsid.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun CorBindToRuntimeHost(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, pwszhostconfigfile: PCWSTR, preserved: Long, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CorBindToRuntimeHost(pwszversion.toString(), pwszbuildflavor.toString(), pwszhostconfigfile.toString(), preserved.toString(), startupflags.toInt(), rclsid.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun CorExitProcess(exitcode: Int) {
    if (_windowsWin32SystemClrhostingNapiAddon != null) {
        _windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CorExitProcess(exitcode)
    }
}

public actual fun CorLaunchApplication(dwclickoncehost: HOST_TYPE, pwzappfullname: PCWSTR, dwmanifestpaths: UInt, ppwzmanifestpaths: Long, dwactivationdata: UInt, ppwzactivationdata: Long, lpprocessinformation: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CorLaunchApplication(dwclickoncehost, pwzappfullname.toString(), dwmanifestpaths.toInt(), ppwzmanifestpaths.toString(), dwactivationdata.toInt(), ppwzactivationdata.toString(), lpprocessinformation.toString()) as Int) else 0

public actual fun CorMarkThreadInThreadPool() {
    if (_windowsWin32SystemClrhostingNapiAddon != null) {
        _windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CorMarkThreadInThreadPool()
    }
}

public actual fun CreateDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: PCWSTR, ppcordb: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_CreateDebuggingInterfaceFromVersion(idebuggerversion, szdebuggeeversion.toString(), ppcordb.toString()) as Int) else 0

public actual fun GetCLRIdentityManager(riid: Long, ppmanager: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_GetCLRIdentityManager(riid.toString(), ppmanager.toString()) as Int) else 0

public actual fun GetCORRequiredVersion(pbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_GetCORRequiredVersion(pbuffer.toString(), cchbuffer.toInt(), dwlength.toString()) as Int) else 0

public actual fun GetCORSystemDirectory(pbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_GetCORSystemDirectory(pbuffer.toString(), cchbuffer.toInt(), dwlength.toString()) as Int) else 0

public actual fun GetCORVersion(pbbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_GetCORVersion(pbbuffer.toString(), cchbuffer.toInt(), dwlength.toString()) as Int) else 0

public actual fun GetFileVersion(szfilename: PCWSTR, szbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_GetFileVersion(szfilename.toString(), szbuffer.toString(), cchbuffer.toInt(), dwlength.toString()) as Int) else 0

public actual fun GetRealProcAddress(pwszprocname: PCSTR, ppv: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_GetRealProcAddress(pwszprocname.toString(), ppv.toString()) as Int) else 0

public actual fun GetRequestedRuntimeInfo(pexe: PCWSTR, pwszversion: PCWSTR, pconfigurationfile: PCWSTR, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: PWSTR, dwdirectory: UInt, dwdirectorylength: Long, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeInfo(pexe.toString(), pwszversion.toString(), pconfigurationfile.toString(), startupflags.toInt(), runtimeinfoflags.toInt(), pdirectory.toString(), dwdirectory.toInt(), dwdirectorylength.toString(), pversion.toString(), cchbuffer.toInt(), dwlength.toString()) as Int) else 0

public actual fun GetRequestedRuntimeVersion(pexe: PCWSTR, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersion(pexe.toString(), pversion.toString(), cchbuffer.toInt(), dwlength.toString()) as Int) else 0

public actual fun GetRequestedRuntimeVersionForCLSID(rclsid: Long, pversion: PWSTR, cchbuffer: UInt, dwlength: Long, dwresolutionflags: CLSID_RESOLUTION_FLAGS): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersionForCLSID(rclsid.toString(), pversion.toString(), cchbuffer.toInt(), dwlength.toString(), dwresolutionflags) as Int) else 0

public actual fun GetVersionFromProcess(hprocess: HANDLE, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_GetVersionFromProcess(hprocess.toString(), pversion.toString(), cchbuffer.toInt(), dwlength.toString()) as Int) else 0

public actual fun LoadLibraryShim(szdllname: PCWSTR, szversion: PCWSTR, pvreserved: Long, phmoddll: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_LoadLibraryShim(szdllname.toString(), szversion.toString(), pvreserved.toString(), phmoddll.toString()) as Int) else 0

public actual fun LoadStringRC(iresouceid: UInt, szbuffer: PWSTR, imax: Int, bquiet: Int): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_LoadStringRC(iresouceid.toInt(), szbuffer.toString(), imax, bquiet) as Int) else 0

public actual fun LoadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: PWSTR, imax: Int, bquiet: Int, pcwchused: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_LoadStringRCEx(lcid.toInt(), iresouceid.toInt(), szbuffer.toString(), imax, bquiet, pcwchused.toString()) as Int) else 0

public actual fun LockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: Long, pendhostsetup: Long): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_LockClrVersion(hostcallback.toLong().toString(), pbeginhostsetup.toString(), pendhostsetup.toString()) as Int) else 0

public actual fun RunDll32ShimW(hwnd: HWND, hinst: HINSTANCE, lpszcmdline: PCWSTR, ncmdshow: Int): HRESULT =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_RunDll32ShimW(hwnd.toString(), hinst.toString(), lpszcmdline.toString(), ncmdshow) as Int) else 0
