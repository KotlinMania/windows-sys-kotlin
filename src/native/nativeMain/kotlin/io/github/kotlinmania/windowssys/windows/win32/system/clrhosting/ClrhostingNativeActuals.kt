@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CLRCreateInstance(clsid: Long, riid: Long, ppinterface: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CLRCreateInstance(clsid.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppinterface.toCPointer<ByteVar>())

public actual fun CallFunctionShim(szdllname: PCWSTR, szfunctionname: PCSTR, lpvargument1: Long, lpvargument2: Long, szversion: PCWSTR, pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CallFunctionShim(szdllname.toCPointer<ByteVar>(), szfunctionname.toCPointer<ByteVar>(), lpvargument1.toCPointer<ByteVar>(), lpvargument2.toCPointer<ByteVar>(), szversion.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun ClrCreateManagedInstance(ptypename: PCWSTR, riid: Long, ppobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_ClrCreateManagedInstance(ptypename.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppobject.toCPointer<ByteVar>())

public actual fun CorBindToCurrentRuntime(pwszfilename: PCWSTR, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CorBindToCurrentRuntime(pwszfilename.toCPointer<ByteVar>(), rclsid.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CorBindToRuntime(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CorBindToRuntime(pwszversion.toCPointer<ByteVar>(), pwszbuildflavor.toCPointer<ByteVar>(), rclsid.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CorBindToRuntimeByCfg(pcfgstream: Long, reserved: UInt, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CorBindToRuntimeByCfg(pcfgstream.toCPointer<ByteVar>(), reserved, startupflags, rclsid.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CorBindToRuntimeEx(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CorBindToRuntimeEx(pwszversion.toCPointer<ByteVar>(), pwszbuildflavor.toCPointer<ByteVar>(), startupflags, rclsid.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CorBindToRuntimeHost(pwszversion: PCWSTR, pwszbuildflavor: PCWSTR, pwszhostconfigfile: PCWSTR, preserved: Long, startupflags: UInt, rclsid: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CorBindToRuntimeHost(pwszversion.toCPointer<ByteVar>(), pwszbuildflavor.toCPointer<ByteVar>(), pwszhostconfigfile.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), startupflags, rclsid.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CorExitProcess(exitcode: Int) {
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CorExitProcess(exitcode)
}

public actual fun CorLaunchApplication(dwclickoncehost: HOST_TYPE, pwzappfullname: PCWSTR, dwmanifestpaths: UInt, ppwzmanifestpaths: Long, dwactivationdata: UInt, ppwzactivationdata: Long, lpprocessinformation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CorLaunchApplication(dwclickoncehost, pwzappfullname.toCPointer<ByteVar>(), dwmanifestpaths, ppwzmanifestpaths.toCPointer<ByteVar>(), dwactivationdata, ppwzactivationdata.toCPointer<ByteVar>(), lpprocessinformation.toCPointer<ByteVar>())

public actual fun CorMarkThreadInThreadPool() {
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CorMarkThreadInThreadPool()
}

public actual fun CreateDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: PCWSTR, ppcordb: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_CreateDebuggingInterfaceFromVersion(idebuggerversion, szdebuggeeversion.toCPointer<ByteVar>(), ppcordb.toCPointer<ByteVar>())

public actual fun GetCLRIdentityManager(riid: Long, ppmanager: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_GetCLRIdentityManager(riid.toCPointer<ByteVar>(), ppmanager.toCPointer<ByteVar>())

public actual fun GetCORRequiredVersion(pbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_GetCORRequiredVersion(pbuffer.toCPointer<ByteVar>(), cchbuffer, dwlength.toCPointer<ByteVar>())

public actual fun GetCORSystemDirectory(pbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_GetCORSystemDirectory(pbuffer.toCPointer<ByteVar>(), cchbuffer, dwlength.toCPointer<ByteVar>())

public actual fun GetCORVersion(pbbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_GetCORVersion(pbbuffer.toCPointer<ByteVar>(), cchbuffer, dwlength.toCPointer<ByteVar>())

public actual fun GetFileVersion(szfilename: PCWSTR, szbuffer: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_GetFileVersion(szfilename.toCPointer<ByteVar>(), szbuffer.toCPointer<ByteVar>(), cchbuffer, dwlength.toCPointer<ByteVar>())

public actual fun GetRealProcAddress(pwszprocname: PCSTR, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_GetRealProcAddress(pwszprocname.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun GetRequestedRuntimeInfo(pexe: PCWSTR, pwszversion: PCWSTR, pconfigurationfile: PCWSTR, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: PWSTR, dwdirectory: UInt, dwdirectorylength: Long, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeInfo(pexe.toCPointer<ByteVar>(), pwszversion.toCPointer<ByteVar>(), pconfigurationfile.toCPointer<ByteVar>(), startupflags, runtimeinfoflags, pdirectory.toCPointer<ByteVar>(), dwdirectory, dwdirectorylength.toCPointer<ByteVar>(), pversion.toCPointer<ByteVar>(), cchbuffer, dwlength.toCPointer<ByteVar>())

public actual fun GetRequestedRuntimeVersion(pexe: PCWSTR, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersion(pexe.toCPointer<ByteVar>(), pversion.toCPointer<ByteVar>(), cchbuffer, dwlength.toCPointer<ByteVar>())

public actual fun GetRequestedRuntimeVersionForCLSID(rclsid: Long, pversion: PWSTR, cchbuffer: UInt, dwlength: Long, dwresolutionflags: CLSID_RESOLUTION_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersionForCLSID(rclsid.toCPointer<ByteVar>(), pversion.toCPointer<ByteVar>(), cchbuffer, dwlength.toCPointer<ByteVar>(), dwresolutionflags)

public actual fun GetVersionFromProcess(hprocess: HANDLE, pversion: PWSTR, cchbuffer: UInt, dwlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_GetVersionFromProcess(hprocess.toCPointer<ByteVar>(), pversion.toCPointer<ByteVar>(), cchbuffer, dwlength.toCPointer<ByteVar>())

public actual fun LoadLibraryShim(szdllname: PCWSTR, szversion: PCWSTR, pvreserved: Long, phmoddll: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_LoadLibraryShim(szdllname.toCPointer<ByteVar>(), szversion.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>(), phmoddll.toCPointer<ByteVar>())

public actual fun LoadStringRC(iresouceid: UInt, szbuffer: PWSTR, imax: Int, bquiet: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_LoadStringRC(iresouceid, szbuffer.toCPointer<ByteVar>(), imax, bquiet)

public actual fun LoadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: PWSTR, imax: Int, bquiet: Int, pcwchused: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_LoadStringRCEx(lcid, iresouceid, szbuffer.toCPointer<ByteVar>(), imax, bquiet, pcwchused.toCPointer<ByteVar>())

public actual fun LockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: Long, pendhostsetup: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_LockClrVersion(hostcallback.toLong().toCPointer<ByteVar>(), pbeginhostsetup.toCPointer<ByteVar>(), pendhostsetup.toCPointer<ByteVar>())

public actual fun RunDll32ShimW(hwnd: HWND, hinst: HINSTANCE, lpszcmdline: PCWSTR, ncmdshow: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.clrhosting.cinterop.windowssys_windows_win32_system_clrhosting_RunDll32ShimW(hwnd.toCPointer<ByteVar>(), hinst.toCPointer<ByteVar>(), lpszcmdline.toCPointer<ByteVar>(), ncmdshow)
