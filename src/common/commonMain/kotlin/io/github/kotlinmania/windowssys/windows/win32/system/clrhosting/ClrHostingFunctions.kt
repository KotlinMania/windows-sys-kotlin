package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun cLRCreateInstance(clsid: COpaquePointer?, riid: COpaquePointer?, ppinterface: COpaquePointer?): Hresult

public expect fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: COpaquePointer?, lpvargument2: COpaquePointer?, szversion: Pcwstr, pvreserved: COpaquePointer?): Hresult

public expect fun clrCreateManagedInstance(ptypename: Pcwstr, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult

public expect fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun corBindToRuntimeByCfg(pcfgstream: COpaquePointer?, reserved: UInt, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: COpaquePointer?, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun corExitProcess(exitcode: Int)

public expect fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: COpaquePointer?, dwactivationdata: UInt, ppwzactivationdata: COpaquePointer?, lpprocessinformation: COpaquePointer?): Hresult

public expect fun corMarkThreadInThreadPool()

public expect fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: COpaquePointer?): Hresult

public expect fun getCLRIdentityManager(riid: COpaquePointer?, ppmanager: COpaquePointer?): Hresult

public expect fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult

public expect fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult

public expect fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult

public expect fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult

public expect fun getRealProcAddress(pwszprocname: Pcstr, ppv: COpaquePointer?): Hresult

public expect fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: COpaquePointer?, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult

public expect fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult

public expect fun getRequestedRuntimeVersionForCLSID(rclsid: COpaquePointer?, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?, dwresolutionflags: ClsidResolutionFlags): Hresult

public expect fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult

public expect fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: COpaquePointer?, phmoddll: COpaquePointer?): Hresult

public expect fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult

public expect fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: COpaquePointer?): Hresult

public expect fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: COpaquePointer?, pendhostsetup: COpaquePointer?): Hresult

public expect fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult
