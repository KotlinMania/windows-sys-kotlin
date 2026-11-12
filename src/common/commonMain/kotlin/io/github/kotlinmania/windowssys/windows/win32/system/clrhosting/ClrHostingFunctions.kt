package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.threading.ProcessInformation

public expect fun cLRCreateInstance(clsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppinterface: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: MutPtr<CVoid>, lpvargument2: MutPtr<CVoid>, szversion: Pcwstr, pvreserved: MutPtr<CVoid>): Hresult

public expect fun clrCreateManagedInstance(ptypename: Pcwstr, riid: ConstPtr<Guid>, ppobject: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun corBindToRuntimeByCfg(pcfgstream: MutPtr<CVoid>, reserved: UInt, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: MutPtr<CVoid>, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun corExitProcess(exitcode: Int)

public expect fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: ConstPtr<Pcwstr>, dwactivationdata: UInt, ppwzactivationdata: ConstPtr<Pcwstr>, lpprocessinformation: MutPtr<ProcessInformation>): Hresult

public expect fun corMarkThreadInThreadPool()

public expect fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun getCLRIdentityManager(riid: ConstPtr<Guid>, ppmanager: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult

public expect fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult

public expect fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult

public expect fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult

public expect fun getRealProcAddress(pwszprocname: Pcstr, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: MutPtr<UInt>, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult

public expect fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult

public expect fun getRequestedRuntimeVersionForCLSID(rclsid: ConstPtr<Guid>, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>, dwresolutionflags: ClsidResolutionFlags): Hresult

public expect fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult

public expect fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: MutPtr<CVoid>, phmoddll: MutPtr<Hmodule>): Hresult

public expect fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult

public expect fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: MutPtr<Int>): Hresult

public expect fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: MutPtr<FLockClrVersionCallback>, pendhostsetup: MutPtr<FLockClrVersionCallback>): Hresult

public expect fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult
