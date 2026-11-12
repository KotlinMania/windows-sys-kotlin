@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

private val windowsWin32NetworkingWinhttpNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun winHttpAddRequestHeaders(hrequest: MutPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpAddRequestHeadersEx(hrequest: MutPtr<CVoid>, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: ConstPtr<WinhttpExtendedHeader>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx(hrequest.rawAddress.toString(), dwmodifiers.toInt(), ullflags.toString(), ullextra.toString(), cheaders.toInt(), pheaders.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCheckPlatform(): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCloseHandle(hinternet: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle(hinternet.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpConnect(hsession: MutPtr<CVoid>, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) MutPtr((windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpConnect(hsession.rawAddress.toString(), pswzservername.rawAddress.toString(), nserverport.toInt(), dwreserved.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: MutPtr<UrlComponents>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl(pwszurl.rawAddress.toString(), dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCreateProxyResolver(hsession: ConstPtr<CVoid>, phresolver: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver(hsession.rawAddress.toString(), phresolver.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCreateUrl(lpurlcomponents: ConstPtr<UrlComponents>, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl(lpurlcomponents.rawAddress.toString(), dwflags.toInt(), pwszurl.rawAddress.toString(), pdwurllength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: MutPtr<Pwstr>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl(dwautodetectflags.toInt(), ppwstrautoconfigurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpFreeProxyResult(pproxyresult: MutPtr<WinhttpProxyResult>) {
    if (windowsWin32NetworkingWinhttpNapiAddon != null) {
        windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult(pproxyresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxyResultEx(pproxyresultex: MutPtr<WinhttpProxyResultEx>) {
    if (windowsWin32NetworkingWinhttpNapiAddon != null) {
        windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx(pproxyresultex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: ConstPtr<WinhttpProxySettings>) {
    if (windowsWin32NetworkingWinhttpNapiAddon != null) {
        windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings(pwinhttpproxysettings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx(proxysettingstype, pproxysettingsex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpFreeQueryConnectionGroupResult(presult: MutPtr<WinhttpQueryConnectionGroupResult>) {
    if (windowsWin32NetworkingWinhttpNapiAddon != null) {
        windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult(presult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration(pproxyinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: MutPtr<WinhttpCurrentUserIeProxyConfig>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser(pproxyconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrl(hsession: MutPtr<CVoid>, lpcwszurl: Pcwstr, pautoproxyoptions: MutPtr<WinhttpAutoproxyOptions>, pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl(hsession.rawAddress.toString(), lpcwszurl.rawAddress.toString(), pautoproxyoptions.rawAddress.toString(), pproxyinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrlEx(hresolver: ConstPtr<CVoid>, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr<WinhttpAutoproxyOptions>, pcontext: ULong): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx(hresolver.rawAddress.toString(), pcwszurl.rawAddress.toString(), pautoproxyoptions.rawAddress.toString(), pcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrlEx2(hresolver: ConstPtr<CVoid>, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr<WinhttpAutoproxyOptions>, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: ConstPtr<UByte>, pcontext: ULong): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2(hresolver.rawAddress.toString(), pcwszurl.rawAddress.toString(), pautoproxyoptions.rawAddress.toString(), cbinterfaceselectioncontext.toInt(), pinterfaceselectioncontext.rawAddress.toString(), pcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyResult(hresolver: ConstPtr<CVoid>, pproxyresult: MutPtr<WinhttpProxyResult>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult(hresolver.rawAddress.toString(), pproxyresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyResultEx(hresolver: ConstPtr<CVoid>, pproxyresultex: MutPtr<WinhttpProxyResultEx>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx(hresolver.rawAddress.toString(), pproxyresultex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsEx(hresolver: ConstPtr<CVoid>, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: ConstPtr<WinhttpProxySettingsParam>, pcontext: ULong): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx(hresolver.rawAddress.toString(), proxysettingstype, pproxysettingsparam.rawAddress.toString(), pcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsResultEx(hresolver: ConstPtr<CVoid>, pproxysettingsex: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx(hresolver.rawAddress.toString(), pproxysettingsex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsVersion(hsession: ConstPtr<CVoid>, pdwproxysettingsversion: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion(hsession.rawAddress.toString(), pdwproxysettingsversion.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) MutPtr((windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpOpen(pszagentw.rawAddress.toString(), dwaccesstype.toInt(), pszproxyw.rawAddress.toString(), pszproxybypassw.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpOpenRequest(hconnect: MutPtr<CVoid>, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: ConstPtr<Pcwstr>, dwflags: WinhttpOpenRequestFlags): MutPtr<CVoid> =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) MutPtr((windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest(hconnect.rawAddress.toString(), pwszverb.rawAddress.toString(), pwszobjectname.rawAddress.toString(), pwszversion.rawAddress.toString(), pwszreferrer.rawAddress.toString(), ppwszaccepttypes.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryAuthSchemes(hrequest: MutPtr<CVoid>, lpdwsupportedschemes: MutPtr<UInt>, lpdwfirstscheme: MutPtr<UInt>, pdwauthtarget: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes(hrequest.rawAddress.toString(), lpdwsupportedschemes.rawAddress.toString(), lpdwfirstscheme.rawAddress.toString(), pdwauthtarget.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryConnectionGroup(hinternet: ConstPtr<CVoid>, pguidconnection: ConstPtr<Guid>, ullflags: ULong, ppresult: MutPtr<MutPtr<WinhttpQueryConnectionGroupResult>>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup(hinternet.rawAddress.toString(), pguidconnection.rawAddress.toString(), ullflags.toString(), ppresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryDataAvailable(hrequest: MutPtr<CVoid>, lpdwnumberofbytesavailable: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable(hrequest.rawAddress.toString(), lpdwnumberofbytesavailable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryHeaders(hrequest: MutPtr<CVoid>, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpdwindex: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders(hrequest.rawAddress.toString(), dwinfolevel.toInt(), pwszname.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpdwindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryHeadersEx(hrequest: ConstPtr<CVoid>, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: MutPtr<UInt>, pheadername: ConstPtr<WinhttpHeaderName>, pbuffer: MutPtr<CVoid>, pdwbufferlength: MutPtr<UInt>, ppheaders: MutPtr<MutPtr<WinhttpExtendedHeader>>, pdwheaderscount: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx(hrequest.rawAddress.toString(), dwinfolevel.toInt(), ullflags.toString(), uicodepage.toInt(), pdwindex.rawAddress.toString(), pheadername.rawAddress.toString(), pbuffer.rawAddress.toString(), pdwbufferlength.rawAddress.toString(), ppheaders.rawAddress.toString(), pdwheaderscount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryOption(hinternet: MutPtr<CVoid>, dwoption: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadData(hrequest: MutPtr<CVoid>, lpbuffer: MutPtr<CVoid>, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpReadData(hrequest.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadDataEx(hrequest: MutPtr<CVoid>, lpbuffer: MutPtr<CVoid>, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr<UInt>, ullflags: ULong, cbproperty: UInt, pvproperty: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx(hrequest.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress.toString(), ullflags.toString(), cbproperty.toInt(), pvproperty.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadProxySettings(hsession: ConstPtr<CVoid>, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: MutPtr<UInt>, pfdefaultsettingsarereturned: MutPtr<Bool>, pwinhttpproxysettings: MutPtr<WinhttpProxySettings>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings(hsession.rawAddress.toString(), pcwszconnectionname.rawAddress.toString(), ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion.rawAddress.toString(), pfdefaultsettingsarereturned.rawAddress.toString(), pwinhttpproxysettings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReceiveResponse(hrequest: MutPtr<CVoid>, lpreserved: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse(hrequest.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: ConstPtr<CVoid>, hregistration: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification(ullflags.toString(), 0L.toString(), pvcontext.rawAddress.toString(), hregistration.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpResetAutoProxy(hsession: ConstPtr<CVoid>, dwflags: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy(hsession.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSendRequest(hrequest: MutPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr<CVoid>, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), lpoptional.rawAddress.toString(), dwoptionallength.toInt(), dwtotallength.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetCredentials(hrequest: MutPtr<CVoid>, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials(hrequest.rawAddress.toString(), authtargets.toInt(), authscheme.toInt(), pwszusername.rawAddress.toString(), pwszpassword.rawAddress.toString(), pauthparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration(pproxyinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetOption(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetStatusCallback(hinternet: MutPtr<CVoid>, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetTimeouts(hinternet: MutPtr<CVoid>, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts(hinternet.rawAddress.toString(), nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpTimeFromSystemTime(pst: ConstPtr<Systemtime>, pwsztime: Pwstr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime(pst.rawAddress.toString(), pwsztime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: MutPtr<Systemtime>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime(pwsztime.rawAddress.toString(), pst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification(hregistration.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketClose(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose(hwebsocket.rawAddress.toString(), usstatus.toInt(), pvreason.rawAddress.toString(), dwreasonlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: ConstPtr<CVoid>, pcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) MutPtr((windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade(hrequest.rawAddress.toString(), pcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: ConstPtr<CVoid>, pusstatus: MutPtr<UShort>, pvreason: MutPtr<CVoid>, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus(hwebsocket.rawAddress.toString(), pusstatus.rawAddress.toString(), pvreason.rawAddress.toString(), dwreasonlength.toInt(), pdwreasonlengthconsumed.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketReceive(hwebsocket: ConstPtr<CVoid>, pvbuffer: MutPtr<CVoid>, dwbufferlength: UInt, pdwbytesread: MutPtr<UInt>, pebuffertype: MutPtr<WinhttpWebSocketBufferType>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive(hwebsocket.rawAddress.toString(), pvbuffer.rawAddress.toString(), dwbufferlength.toInt(), pdwbytesread.rawAddress.toString(), pebuffertype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketSend(hwebsocket: ConstPtr<CVoid>, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend(hwebsocket.rawAddress.toString(), ebuffertype, pvbuffer.rawAddress.toString(), dwbufferlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketShutdown(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown(hwebsocket.rawAddress.toString(), usstatus.toInt(), pvreason.rawAddress.toString(), dwreasonlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWriteData(hrequest: MutPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData(hrequest.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWriteProxySettings(hsession: ConstPtr<CVoid>, fforceupdate: Bool, pwinhttpproxysettings: ConstPtr<WinhttpProxySettings>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings(hsession.rawAddress.toString(), fforceupdate, pwinhttpproxysettings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
