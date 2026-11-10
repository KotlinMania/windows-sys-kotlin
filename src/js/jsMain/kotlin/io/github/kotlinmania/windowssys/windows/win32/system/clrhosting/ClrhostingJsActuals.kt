@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val _windowsWin32SystemClrhostingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun cLRCreateInstance(clsid: COpaquePointer?, riid: COpaquePointer?, ppinterface: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_cLRCreateInstance((clsid?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppinterface?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callFunctionShim(szdllname: Pcwstr, szfunctionname: Pcstr, lpvargument1: COpaquePointer?, lpvargument2: COpaquePointer?, szversion: Pcwstr, pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_callFunctionShim((szdllname?.value ?: 0L).toString(), (szfunctionname?.value ?: 0L).toString(), (lpvargument1?.value ?: 0L).toString(), (lpvargument2?.value ?: 0L).toString(), (szversion?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clrCreateManagedInstance(ptypename: Pcwstr, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_clrCreateManagedInstance((ptypename?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToCurrentRuntime(pwszfilename: Pcwstr, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_corBindToCurrentRuntime((pwszfilename?.value ?: 0L).toString(), (rclsid?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntime(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_corBindToRuntime((pwszversion?.value ?: 0L).toString(), (pwszbuildflavor?.value ?: 0L).toString(), (rclsid?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntimeByCfg(pcfgstream: COpaquePointer?, reserved: UInt, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_corBindToRuntimeByCfg((pcfgstream?.value ?: 0L).toString(), reserved.toInt(), startupflags.toInt(), (rclsid?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntimeEx(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_corBindToRuntimeEx((pwszversion?.value ?: 0L).toString(), (pwszbuildflavor?.value ?: 0L).toString(), startupflags.toInt(), (rclsid?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corBindToRuntimeHost(pwszversion: Pcwstr, pwszbuildflavor: Pcwstr, pwszhostconfigfile: Pcwstr, preserved: COpaquePointer?, startupflags: UInt, rclsid: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_corBindToRuntimeHost((pwszversion?.value ?: 0L).toString(), (pwszbuildflavor?.value ?: 0L).toString(), (pwszhostconfigfile?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), startupflags.toInt(), (rclsid?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corExitProcess(exitcode: Int) {
    if (_windowsWin32SystemClrhostingNapiAddon != null) {
        _windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_corExitProcess(exitcode)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun corLaunchApplication(dwclickoncehost: HostType, pwzappfullname: Pcwstr, dwmanifestpaths: UInt, ppwzmanifestpaths: COpaquePointer?, dwactivationdata: UInt, ppwzactivationdata: COpaquePointer?, lpprocessinformation: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_corLaunchApplication(dwclickoncehost, (pwzappfullname?.value ?: 0L).toString(), dwmanifestpaths.toInt(), (ppwzmanifestpaths?.value ?: 0L).toString(), dwactivationdata.toInt(), (ppwzactivationdata?.value ?: 0L).toString(), (lpprocessinformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun corMarkThreadInThreadPool() {
    if (_windowsWin32SystemClrhostingNapiAddon != null) {
        _windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_corMarkThreadInThreadPool()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun createDebuggingInterfaceFromVersion(idebuggerversion: Int, szdebuggeeversion: Pcwstr, ppcordb: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_createDebuggingInterfaceFromVersion(idebuggerversion, (szdebuggeeversion?.value ?: 0L).toString(), (ppcordb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCLRIdentityManager(riid: COpaquePointer?, ppmanager: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_getCLRIdentityManager((riid?.value ?: 0L).toString(), (ppmanager?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCORRequiredVersion(pbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_getCORRequiredVersion((pbuffer?.value ?: 0L).toString(), cchbuffer.toInt(), (dwlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCORSystemDirectory(pbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_getCORSystemDirectory((pbuffer?.value ?: 0L).toString(), cchbuffer.toInt(), (dwlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCORVersion(pbbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_getCORVersion((pbbuffer?.value ?: 0L).toString(), cchbuffer.toInt(), (dwlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersion(szfilename: Pcwstr, szbuffer: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_getFileVersion((szfilename?.value ?: 0L).toString(), (szbuffer?.value ?: 0L).toString(), cchbuffer.toInt(), (dwlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRealProcAddress(pwszprocname: Pcstr, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_getRealProcAddress((pwszprocname?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRequestedRuntimeInfo(pexe: Pcwstr, pwszversion: Pcwstr, pconfigurationfile: Pcwstr, startupflags: UInt, runtimeinfoflags: UInt, pdirectory: Pwstr, dwdirectory: UInt, dwdirectorylength: COpaquePointer?, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_getRequestedRuntimeInfo((pexe?.value ?: 0L).toString(), (pwszversion?.value ?: 0L).toString(), (pconfigurationfile?.value ?: 0L).toString(), startupflags.toInt(), runtimeinfoflags.toInt(), (pdirectory?.value ?: 0L).toString(), dwdirectory.toInt(), (dwdirectorylength?.value ?: 0L).toString(), (pversion?.value ?: 0L).toString(), cchbuffer.toInt(), (dwlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRequestedRuntimeVersion(pexe: Pcwstr, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersion((pexe?.value ?: 0L).toString(), (pversion?.value ?: 0L).toString(), cchbuffer.toInt(), (dwlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRequestedRuntimeVersionForCLSID(rclsid: COpaquePointer?, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?, dwresolutionflags: ClsidResolutionFlags): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersionForCLSID((rclsid?.value ?: 0L).toString(), (pversion?.value ?: 0L).toString(), cchbuffer.toInt(), (dwlength?.value ?: 0L).toString(), dwresolutionflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVersionFromProcess(hprocess: Handle, pversion: Pwstr, cchbuffer: UInt, dwlength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_getVersionFromProcess((hprocess?.value ?: 0L).toString(), (pversion?.value ?: 0L).toString(), cchbuffer.toInt(), (dwlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadLibraryShim(szdllname: Pcwstr, szversion: Pcwstr, pvreserved: COpaquePointer?, phmoddll: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_loadLibraryShim((szdllname?.value ?: 0L).toString(), (szversion?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString(), (phmoddll?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringRC(iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_loadStringRC(iresouceid.toInt(), (szbuffer?.value ?: 0L).toString(), imax, bquiet) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadStringRCEx(lcid: UInt, iresouceid: UInt, szbuffer: Pwstr, imax: Int, bquiet: Int, pcwchused: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_loadStringRCEx(lcid.toInt(), iresouceid.toInt(), (szbuffer?.value ?: 0L).toString(), imax, bquiet, (pcwchused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockClrVersion(hostcallback: FLockClrVersionCallback, pbeginhostsetup: COpaquePointer?, pendhostsetup: COpaquePointer?): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_lockClrVersion(0L.toString(), (pbeginhostsetup?.value ?: 0L).toString(), (pendhostsetup?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runDll32ShimW(hwnd: Hwnd, hinst: Hinstance, lpszcmdline: Pcwstr, ncmdshow: Int): Hresult =
    if (_windowsWin32SystemClrhostingNapiAddon != null) (_windowsWin32SystemClrhostingNapiAddon.windowssys_windows_win32_system_clrhosting_runDll32ShimW((hwnd?.value ?: 0L).toString(), (hinst?.value ?: 0L).toString(), (lpszcmdline?.value ?: 0L).toString(), ncmdshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
