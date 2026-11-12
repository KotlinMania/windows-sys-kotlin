@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemClrhostingNapiAddon(): Boolean

private val windowsWin32SystemClrhostingNapiAvailable: Boolean = initWindowsWin32SystemClrhostingNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCLRCreateInstance(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCLRCreateInstance(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCallFunctionShim(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCallFunctionShim(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingClrCreateManagedInstance(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingClrCreateManagedInstance(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCorBindToCurrentRuntime(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCorBindToCurrentRuntime(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCorBindToRuntime(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCorBindToRuntime(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeByCfg(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCorBindToRuntimeByCfg(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCorBindToRuntimeEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeHost(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCorBindToRuntimeHost(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCorExitProcess(p0)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCorExitProcess(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCorLaunchApplication(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCorLaunchApplication(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool()")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingCreateDebuggingInterfaceFromVersion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingCreateDebuggingInterfaceFromVersion(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingGetCLRIdentityManager(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingGetCLRIdentityManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingGetCORRequiredVersion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingGetCORRequiredVersion(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingGetCORSystemDirectory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingGetCORSystemDirectory(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingGetCORVersion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingGetCORVersion(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingGetFileVersion(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingGetFileVersion(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingGetRealProcAddress(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingGetRealProcAddress(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingGetRequestedRuntimeInfo(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersion(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersion(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersionForCLSID(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersionForCLSID(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingGetVersionFromProcess(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingGetVersionFromProcess(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingLoadLibraryShim(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingLoadLibraryShim(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingLoadStringRC(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingLoadStringRC(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingLoadStringRCEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingLoadStringRCEx(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingLockClrVersion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingLockClrVersion(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemClrhostingRunDll32ShimW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemClrhostingRunDll32ShimW(p0: String, p1: String, p2: String, p3: Int): Int

public actual fun cLRCreateInstance(clsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppinterface: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingCLRCreateInstance(clsid.rawAddress.toString(), riid.rawAddress.toString(), ppinterface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: MutPtr<CVoid>, lpvargument2: MutPtr<CVoid>, szversion: Pcwstr, pvreserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingCallFunctionShim(szdllname.rawAddress.toString(), szfunctionname.rawAddress.toString(), lpvargument1.rawAddress.toString(), lpvargument2.rawAddress.toString(), szversion.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clrCreateManagedInstance(ptypename: Pcwstr, riid: ConstPtr<Guid>, ppobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingClrCreateManagedInstance(ptypename.rawAddress.toString(), riid.rawAddress.toString(), ppobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingCorBindToCurrentRuntime(pwszfilename.rawAddress.toString(), rclsid.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingCorBindToRuntime(pwszversion.rawAddress.toString(), pwszbuildflavor.rawAddress.toString(), rclsid.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntimeByCfg(pcfgstream: MutPtr<CVoid>, reserved: UInt, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingCorBindToRuntimeByCfg(pcfgstream.rawAddress.toString(), reserved.toInt(), startupflags.toInt(), rclsid.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingCorBindToRuntimeEx(pwszversion.rawAddress.toString(), pwszbuildflavor.rawAddress.toString(), startupflags.toInt(), rclsid.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: MutPtr<CVoid>, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingCorBindToRuntimeHost(pwszversion.rawAddress.toString(), pwszbuildflavor.rawAddress.toString(), pwszhostconfigfile.rawAddress.toString(), preserved.rawAddress.toString(), startupflags.toInt(), rclsid.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corExitProcess(exitcode: Int) {
    if (windowsWin32SystemClrhostingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemClrhostingCorExitProcess(exitcode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: ConstPtr<Pcwstr>, dwactivationdata: UInt, ppwzactivationdata: ConstPtr<Pcwstr>, lpprocessinformation: MutPtr<ProcessInformation>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingCorLaunchApplication(dwclickoncehost, pwzappfullname.rawAddress.toString(), dwmanifestpaths.toInt(), ppwzmanifestpaths.rawAddress.toString(), dwactivationdata.toInt(), ppwzactivationdata.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corMarkThreadInThreadPool() {
    if (windowsWin32SystemClrhostingNapiAvailable) {
        wasmWindowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingCreateDebuggingInterfaceFromVersion(idebuggerversion, szdebuggeeversion.rawAddress.toString(), ppcordb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCLRIdentityManager(riid: ConstPtr<Guid>, ppmanager: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingGetCLRIdentityManager(riid.rawAddress.toString(), ppmanager.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingGetCORRequiredVersion(pbuffer.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingGetCORSystemDirectory(pbuffer.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingGetCORVersion(pbbuffer.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingGetFileVersion(szfilename.rawAddress.toString(), szbuffer.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRealProcAddress(pwszprocname: Pcstr, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingGetRealProcAddress(pwszprocname.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: MutPtr<UInt>, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingGetRequestedRuntimeInfo(pexe.rawAddress.toString(), pwszversion.rawAddress.toString(), pconfigurationfile.rawAddress.toString(), startupflags.toInt(), runtimeinfoflags.toInt(), pdirectory.rawAddress.toString(), dwdirectory.toInt(), dwdirectorylength.rawAddress.toString(), pversion.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersion(pexe.rawAddress.toString(), pversion.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRequestedRuntimeVersionForCLSID(rclsid: ConstPtr<Guid>, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>, dwresolutionflags: ClsidResolutionFlags): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersionForCLSID(rclsid.rawAddress.toString(), pversion.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString(), dwresolutionflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingGetVersionFromProcess(hprocess.rawAddress.toString(), pversion.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: MutPtr<CVoid>, phmoddll: MutPtr<Hmodule>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingLoadLibraryShim(szdllname.rawAddress.toString(), szversion.rawAddress.toString(), pvreserved.rawAddress.toString(), phmoddll.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingLoadStringRC(iresouceid.toInt(), szbuffer.rawAddress.toString(), imax, bquiet) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: MutPtr<Int>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingLoadStringRCEx(lcid.toInt(), iresouceid.toInt(), szbuffer.rawAddress.toString(), imax, bquiet, pcwchused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: MutPtr<FLockClrVersionCallback>, pendhostsetup: MutPtr<FLockClrVersionCallback>): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingLockClrVersion(0L.toString(), pbeginhostsetup.rawAddress.toString(), pendhostsetup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult =
    if (windowsWin32SystemClrhostingNapiAvailable) wasmWindowssysWindowsWin32SystemClrhostingRunDll32ShimW(hwnd.rawAddress.toString(), hinst.rawAddress.toString(), lpszcmdline.rawAddress.toString(), ncmdshow) else throw UnsupportedOperationException("Native FFI addon is not available")
