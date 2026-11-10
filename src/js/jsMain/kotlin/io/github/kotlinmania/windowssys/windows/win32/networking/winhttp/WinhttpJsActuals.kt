@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val _windowsWin32NetworkingWinhttpNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun winHttpAddRequestHeaders(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpAddRequestHeaders((hrequest?.value ?: 0L).toString(), (lpszheaders?.value ?: 0L).toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpAddRequestHeadersEx(hrequest: COpaquePointer?, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpAddRequestHeadersEx((hrequest?.value ?: 0L).toString(), dwmodifiers.toInt(), ullflags.toString(), ullextra.toString(), cheaders.toInt(), (pheaders?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCheckPlatform(): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpCheckPlatform() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCloseHandle(hinternet: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpCloseHandle((hinternet?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpConnect(hsession: COpaquePointer?, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpConnect((hsession?.value ?: 0L).toString(), (pswzservername?.value ?: 0L).toString(), nserverport.toInt(), dwreserved.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpCrackUrl((pwszurl?.value ?: 0L).toString(), dwurllength.toInt(), dwflags.toInt(), (lpurlcomponents?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCreateProxyResolver(hsession: COpaquePointer?, phresolver: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpCreateProxyResolver((hsession?.value ?: 0L).toString(), (phresolver?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCreateUrl(lpurlcomponents: COpaquePointer?, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpCreateUrl((lpurlcomponents?.value ?: 0L).toString(), dwflags.toInt(), (pwszurl?.value ?: 0L).toString(), (pdwurllength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpDetectAutoProxyConfigUrl(dwautodetectflags.toInt(), (ppwstrautoconfigurl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpFreeProxyResult(pproxyresult: COpaquePointer?) {
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) {
        _windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpFreeProxyResult((pproxyresult?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxyResultEx(pproxyresultex: COpaquePointer?) {
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) {
        _windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpFreeProxyResultEx((pproxyresultex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: COpaquePointer?) {
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) {
        _windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpFreeProxySettings((pwinhttpproxysettings?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpFreeProxySettingsEx(proxysettingstype, (pproxysettingsex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpFreeQueryConnectionGroupResult(presult: COpaquePointer?) {
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) {
        _windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpFreeQueryConnectionGroupResult((presult?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpGetDefaultProxyConfiguration((pproxyinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpGetIEProxyConfigForCurrentUser((pproxyconfig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrl(hsession: COpaquePointer?, lpcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, pproxyinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrl((hsession?.value ?: 0L).toString(), (lpcwszurl?.value ?: 0L).toString(), (pautoproxyoptions?.value ?: 0L).toString(), (pproxyinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrlEx(hresolver: COpaquePointer?, pcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, pcontext: ULong): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrlEx((hresolver?.value ?: 0L).toString(), (pcwszurl?.value ?: 0L).toString(), (pautoproxyoptions?.value ?: 0L).toString(), pcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrlEx2(hresolver: COpaquePointer?, pcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: COpaquePointer?, pcontext: ULong): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrlEx2((hresolver?.value ?: 0L).toString(), (pcwszurl?.value ?: 0L).toString(), (pautoproxyoptions?.value ?: 0L).toString(), cbinterfaceselectioncontext.toInt(), (pinterfaceselectioncontext?.value ?: 0L).toString(), pcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyResult(hresolver: COpaquePointer?, pproxyresult: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpGetProxyResult((hresolver?.value ?: 0L).toString(), (pproxyresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyResultEx(hresolver: COpaquePointer?, pproxyresultex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpGetProxyResultEx((hresolver?.value ?: 0L).toString(), (pproxyresultex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsEx(hresolver: COpaquePointer?, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: COpaquePointer?, pcontext: ULong): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsEx((hresolver?.value ?: 0L).toString(), proxysettingstype, (pproxysettingsparam?.value ?: 0L).toString(), pcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsResultEx(hresolver: COpaquePointer?, pproxysettingsex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsResultEx((hresolver?.value ?: 0L).toString(), (pproxysettingsex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsVersion(hsession: COpaquePointer?, pdwproxysettingsversion: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsVersion((hsession?.value ?: 0L).toString(), (pdwproxysettingsversion?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpOpen((pszagentw?.value ?: 0L).toString(), dwaccesstype.toInt(), (pszproxyw?.value ?: 0L).toString(), (pszproxybypassw?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpOpenRequest(hconnect: COpaquePointer?, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: COpaquePointer?, dwflags: WinhttpOpenRequestFlags): COpaquePointer? =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpOpenRequest((hconnect?.value ?: 0L).toString(), (pwszverb?.value ?: 0L).toString(), (pwszobjectname?.value ?: 0L).toString(), (pwszversion?.value ?: 0L).toString(), (pwszreferrer?.value ?: 0L).toString(), (ppwszaccepttypes?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryAuthSchemes(hrequest: COpaquePointer?, lpdwsupportedschemes: COpaquePointer?, lpdwfirstscheme: COpaquePointer?, pdwauthtarget: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpQueryAuthSchemes((hrequest?.value ?: 0L).toString(), (lpdwsupportedschemes?.value ?: 0L).toString(), (lpdwfirstscheme?.value ?: 0L).toString(), (pdwauthtarget?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryConnectionGroup(hinternet: COpaquePointer?, pguidconnection: COpaquePointer?, ullflags: ULong, ppresult: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpQueryConnectionGroup((hinternet?.value ?: 0L).toString(), (pguidconnection?.value ?: 0L).toString(), ullflags.toString(), (ppresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryDataAvailable(hrequest: COpaquePointer?, lpdwnumberofbytesavailable: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpQueryDataAvailable((hrequest?.value ?: 0L).toString(), (lpdwnumberofbytesavailable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryHeaders(hrequest: COpaquePointer?, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpQueryHeaders((hrequest?.value ?: 0L).toString(), dwinfolevel.toInt(), (pwszname?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), (lpdwindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryHeadersEx(hrequest: COpaquePointer?, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: COpaquePointer?, pheadername: COpaquePointer?, pbuffer: COpaquePointer?, pdwbufferlength: COpaquePointer?, ppheaders: COpaquePointer?, pdwheaderscount: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpQueryHeadersEx((hrequest?.value ?: 0L).toString(), dwinfolevel.toInt(), ullflags.toString(), uicodepage.toInt(), (pdwindex?.value ?: 0L).toString(), (pheadername?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), (pdwbufferlength?.value ?: 0L).toString(), (ppheaders?.value ?: 0L).toString(), (pdwheaderscount?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryOption(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpQueryOption((hinternet?.value ?: 0L).toString(), dwoption.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadData(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpReadData((hrequest?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), dwnumberofbytestoread.toInt(), (lpdwnumberofbytesread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadDataEx(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?, ullflags: ULong, cbproperty: UInt, pvproperty: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpReadDataEx((hrequest?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), dwnumberofbytestoread.toInt(), (lpdwnumberofbytesread?.value ?: 0L).toString(), ullflags.toString(), cbproperty.toInt(), (pvproperty?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadProxySettings(hsession: COpaquePointer?, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: COpaquePointer?, pfdefaultsettingsarereturned: COpaquePointer?, pwinhttpproxysettings: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpReadProxySettings((hsession?.value ?: 0L).toString(), (pcwszconnectionname?.value ?: 0L).toString(), ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, (pdwsettingsversion?.value ?: 0L).toString(), (pfdefaultsettingsarereturned?.value ?: 0L).toString(), (pwinhttpproxysettings?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReceiveResponse(hrequest: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpReceiveResponse((hrequest?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: COpaquePointer?, hregistration: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpRegisterProxyChangeNotification(ullflags.toString(), 0L.toString(), (pvcontext?.value ?: 0L).toString(), (hregistration?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpResetAutoProxy(hsession: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpResetAutoProxy((hsession?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSendRequest(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpSendRequest((hrequest?.value ?: 0L).toString(), (lpszheaders?.value ?: 0L).toString(), dwheaderslength.toInt(), (lpoptional?.value ?: 0L).toString(), dwoptionallength.toInt(), dwtotallength.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetCredentials(hrequest: COpaquePointer?, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpSetCredentials((hrequest?.value ?: 0L).toString(), authtargets.toInt(), authscheme.toInt(), (pwszusername?.value ?: 0L).toString(), (pwszpassword?.value ?: 0L).toString(), (pauthparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpSetDefaultProxyConfiguration((pproxyinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetOption(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpSetOption((hinternet?.value ?: 0L).toString(), dwoption.toInt(), (lpbuffer?.value ?: 0L).toString(), dwbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpSetProxySettingsPerUser(fproxysettingsperuser) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetStatusCallback(hinternet: COpaquePointer?, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetTimeouts(hinternet: COpaquePointer?, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpSetTimeouts((hinternet?.value ?: 0L).toString(), nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpTimeFromSystemTime(pst: COpaquePointer?, pwsztime: Pwstr): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpTimeFromSystemTime((pst?.value ?: 0L).toString(), (pwsztime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpTimeToSystemTime((pwsztime?.value ?: 0L).toString(), (pst?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpUnregisterProxyChangeNotification((hregistration?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketClose(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpWebSocketClose((hwebsocket?.value ?: 0L).toString(), usstatus.toInt(), (pvreason?.value ?: 0L).toString(), dwreasonlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: COpaquePointer?, pcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpWebSocketCompleteUpgrade((hrequest?.value ?: 0L).toString(), pcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: COpaquePointer?, pusstatus: COpaquePointer?, pvreason: COpaquePointer?, dwreasonlength: UInt, pdwreasonlengthconsumed: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpWebSocketQueryCloseStatus((hwebsocket?.value ?: 0L).toString(), (pusstatus?.value ?: 0L).toString(), (pvreason?.value ?: 0L).toString(), dwreasonlength.toInt(), (pdwreasonlengthconsumed?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketReceive(hwebsocket: COpaquePointer?, pvbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbytesread: COpaquePointer?, pebuffertype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpWebSocketReceive((hwebsocket?.value ?: 0L).toString(), (pvbuffer?.value ?: 0L).toString(), dwbufferlength.toInt(), (pdwbytesread?.value ?: 0L).toString(), (pebuffertype?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketSend(hwebsocket: COpaquePointer?, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: COpaquePointer?, dwbufferlength: UInt): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpWebSocketSend((hwebsocket?.value ?: 0L).toString(), ebuffertype, (pvbuffer?.value ?: 0L).toString(), dwbufferlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketShutdown(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpWebSocketShutdown((hwebsocket?.value ?: 0L).toString(), usstatus.toInt(), (pvreason?.value ?: 0L).toString(), dwreasonlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWriteData(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpWriteData((hrequest?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), dwnumberofbytestowrite.toInt(), (lpdwnumberofbyteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWriteProxySettings(hsession: COpaquePointer?, fforceupdate: Bool, pwinhttpproxysettings: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_winHttpWriteProxySettings((hsession?.value ?: 0L).toString(), fforceupdate, (pwinhttpproxysettings?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
