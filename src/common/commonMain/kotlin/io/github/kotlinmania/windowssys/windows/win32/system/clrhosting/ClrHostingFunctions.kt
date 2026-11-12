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

public expect fun cLRCreateInstance(clsid: ConstPtr, riid: ConstPtr, ppinterface: MutPtr): Hresult

public expect fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: MutPtr, lpvargument2: MutPtr, szversion: Pcwstr, pvreserved: MutPtr): Hresult

public expect fun clrCreateManagedInstance(ptypename: Pcwstr, riid: ConstPtr, ppobject: MutPtr): Hresult

public expect fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun corBindToRuntimeByCfg(pcfgstream: MutPtr, reserved: UInt, startupflags: UInt, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: MutPtr, startupflags: UInt, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun corExitProcess(exitcode: Int)

public expect fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: ConstPtr, dwactivationdata: UInt, ppwzactivationdata: ConstPtr, lpprocessinformation: MutPtr): Hresult

public expect fun corMarkThreadInThreadPool()

public expect fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: MutPtr): Hresult

public expect fun getCLRIdentityManager(riid: ConstPtr, ppmanager: MutPtr): Hresult

public expect fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult

public expect fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult

public expect fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult

public expect fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult

public expect fun getRealProcAddress(pwszprocname: Pcstr, ppv: MutPtr): Hresult

public expect fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: MutPtr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult

public expect fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult

public expect fun getRequestedRuntimeVersionForCLSID(rclsid: ConstPtr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr, dwresolutionflags: ClsidResolutionFlags): Hresult

public expect fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult

public expect fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: MutPtr, phmoddll: MutPtr): Hresult

public expect fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult

public expect fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: MutPtr): Hresult

public expect fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: MutPtr, pendhostsetup: MutPtr): Hresult

public expect fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult
