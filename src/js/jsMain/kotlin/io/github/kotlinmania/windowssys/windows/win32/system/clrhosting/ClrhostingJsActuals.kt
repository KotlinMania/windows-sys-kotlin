@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemClrhostingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun cLRCreateInstance(clsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppinterface: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCLRCreateInstance(clsid.rawAddress.toString(), riid.rawAddress.toString(), ppinterface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: MutPtr<CVoid>, lpvargument2: MutPtr<CVoid>, szversion: Pcwstr, pvreserved: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCallFunctionShim(szdllname.rawAddress.toString(), szfunctionname.rawAddress.toString(), lpvargument1.rawAddress.toString(), lpvargument2.rawAddress.toString(), szversion.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clrCreateManagedInstance(ptypename: Pcwstr, riid: ConstPtr<Guid>, ppobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingClrCreateManagedInstance(ptypename.rawAddress.toString(), riid.rawAddress.toString(), ppobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCorBindToCurrentRuntime(pwszfilename.rawAddress.toString(), rclsid.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCorBindToRuntime(pwszversion.rawAddress.toString(), pwszbuildflavor.rawAddress.toString(), rclsid.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntimeByCfg(pcfgstream: MutPtr<CVoid>, reserved: UInt, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeByCfg(pcfgstream.rawAddress.toString(), reserved.toInt(), startupflags.toInt(), rclsid.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeEx(pwszversion.rawAddress.toString(), pwszbuildflavor.rawAddress.toString(), startupflags.toInt(), rclsid.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: MutPtr<CVoid>, startupflags: UInt, rclsid: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCorBindToRuntimeHost(pwszversion.rawAddress.toString(), pwszbuildflavor.rawAddress.toString(), pwszhostconfigfile.rawAddress.toString(), preserved.rawAddress.toString(), startupflags.toInt(), rclsid.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corExitProcess(exitcode: Int) {
    if (windowsWin32SystemClrhostingNapiAddon != null) {
        windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCorExitProcess(exitcode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: ConstPtr<Pcwstr>, dwactivationdata: UInt, ppwzactivationdata: ConstPtr<Pcwstr>, lpprocessinformation: MutPtr<ProcessInformation>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCorLaunchApplication(dwclickoncehost, pwzappfullname.rawAddress.toString(), dwmanifestpaths.toInt(), ppwzmanifestpaths.rawAddress.toString(), dwactivationdata.toInt(), ppwzactivationdata.rawAddress.toString(), lpprocessinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corMarkThreadInThreadPool() {
    if (windowsWin32SystemClrhostingNapiAddon != null) {
        windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingCreateDebuggingInterfaceFromVersion(idebuggerversion, szdebuggeeversion.rawAddress.toString(), ppcordb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCLRIdentityManager(riid: ConstPtr<Guid>, ppmanager: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingGetCLRIdentityManager(riid.rawAddress.toString(), ppmanager.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingGetCORRequiredVersion(pbuffer.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingGetCORSystemDirectory(pbuffer.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingGetCORVersion(pbbuffer.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingGetFileVersion(szfilename.rawAddress.toString(), szbuffer.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRealProcAddress(pwszprocname: Pcstr, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingGetRealProcAddress(pwszprocname.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: MutPtr<UInt>, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeInfo(pexe.rawAddress.toString(), pwszversion.rawAddress.toString(), pconfigurationfile.rawAddress.toString(), startupflags.toInt(), runtimeinfoflags.toInt(), pdirectory.rawAddress.toString(), dwdirectory.toInt(), dwdirectorylength.rawAddress.toString(), pversion.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersion(pexe.rawAddress.toString(), pversion.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRequestedRuntimeVersionForCLSID(rclsid: ConstPtr<Guid>, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>, dwresolutionflags: ClsidResolutionFlags): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersionForCLSID(rclsid.rawAddress.toString(), pversion.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString(), dwresolutionflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingGetVersionFromProcess(hprocess.rawAddress.toString(), pversion.rawAddress.toString(), cchbuffer.toInt(), dwlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: MutPtr<CVoid>, phmoddll: MutPtr<Hmodule>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingLoadLibraryShim(szdllname.rawAddress.toString(), szversion.rawAddress.toString(), pvreserved.rawAddress.toString(), phmoddll.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingLoadStringRC(iresouceid.toInt(), szbuffer.rawAddress.toString(), imax, bquiet) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: MutPtr<Int>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingLoadStringRCEx(lcid.toInt(), iresouceid.toInt(), szbuffer.rawAddress.toString(), imax, bquiet, pcwchused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: MutPtr<FLockClrVersionCallback>, pendhostsetup: MutPtr<FLockClrVersionCallback>): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingLockClrVersion(0L.toString(), pbeginhostsetup.rawAddress.toString(), pendhostsetup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult =
    if (windowsWin32SystemClrhostingNapiAddon != null) (windowsWin32SystemClrhostingNapiAddon.windowssysWindowsWin32SystemClrhostingRunDll32ShimW(hwnd.rawAddress.toString(), hinst.rawAddress.toString(), lpszcmdline.rawAddress.toString(), ncmdshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
