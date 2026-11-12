@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun cLRCreateInstance(clsid: ConstPtr, riid: ConstPtr, ppinterface: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingCLRCreateInstance")

public actual fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: MutPtr, lpvargument2: MutPtr, szversion: Pcwstr, pvreserved: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingCallFunctionShim")

public actual fun clrCreateManagedInstance(ptypename: Pcwstr, riid: ConstPtr, ppobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingClrCreateManagedInstance")

public actual fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingCorBindToCurrentRuntime")

public actual fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingCorBindToRuntime")

public actual fun corBindToRuntimeByCfg(pcfgstream: MutPtr, reserved: UInt, startupflags: UInt, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingCorBindToRuntimeByCfg")

public actual fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingCorBindToRuntimeEx")

public actual fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: MutPtr, startupflags: UInt, rclsid: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingCorBindToRuntimeHost")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemClrhostingCorExitProcess")
private external fun wasiWindowssysWindowsWin32SystemClrhostingCorExitProcess(exitcode: Int): Unit

public actual fun corExitProcess(exitcode: Int): Unit =
    wasiWindowssysWindowsWin32SystemClrhostingCorExitProcess(exitcode)

public actual fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: ConstPtr, dwactivationdata: UInt, ppwzactivationdata: ConstPtr, lpprocessinformation: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingCorLaunchApplication")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool")
private external fun wasiWindowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool(): Unit

public actual fun corMarkThreadInThreadPool(): Unit =
    wasiWindowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool()

public actual fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingCreateDebuggingInterfaceFromVersion")

public actual fun getCLRIdentityManager(riid: ConstPtr, ppmanager: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingGetCLRIdentityManager")

public actual fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingGetCORRequiredVersion")

public actual fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingGetCORSystemDirectory")

public actual fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingGetCORVersion")

public actual fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingGetFileVersion")

public actual fun getRealProcAddress(pwszprocname: Pcstr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingGetRealProcAddress")

public actual fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: MutPtr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeInfo")

public actual fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersion")

public actual fun getRequestedRuntimeVersionForCLSID(rclsid: ConstPtr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr, dwresolutionflags: ClsidResolutionFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersionForCLSID")

public actual fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingGetVersionFromProcess")

public actual fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: MutPtr, phmoddll: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingLoadLibraryShim")

public actual fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingLoadStringRC")

public actual fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingLoadStringRCEx")

public actual fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: MutPtr, pendhostsetup: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingLockClrVersion")

public actual fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemClrhostingRunDll32ShimW")
