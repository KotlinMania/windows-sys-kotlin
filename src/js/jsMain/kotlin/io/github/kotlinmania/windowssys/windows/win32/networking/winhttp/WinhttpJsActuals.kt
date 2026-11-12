@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val windowsWin32NetworkingWinhttpNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun winHttpAddRequestHeaders(hrequest: MutPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpAddRequestHeadersEx(hrequest: MutPtr, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: ConstPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx(hrequest.rawAddress.toString(), dwmodifiers.toInt(), ullflags.toString(), ullextra.toString(), cheaders.toInt(), pheaders.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCheckPlatform(): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCloseHandle(hinternet: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle(hinternet.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpConnect(hsession: MutPtr, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): MutPtr =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) MutPtr((windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpConnect(hsession.rawAddress.toString(), pswzservername.rawAddress.toString(), nserverport.toInt(), dwreserved.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl(pwszurl.rawAddress.toString(), dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCreateProxyResolver(hsession: ConstPtr, phresolver: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver(hsession.rawAddress.toString(), phresolver.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCreateUrl(lpurlcomponents: ConstPtr, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl(lpurlcomponents.rawAddress.toString(), dwflags.toInt(), pwszurl.rawAddress.toString(), pdwurllength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl(dwautodetectflags.toInt(), ppwstrautoconfigurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpFreeProxyResult(pproxyresult: MutPtr) {
    if (windowsWin32NetworkingWinhttpNapiAddon != null) {
        windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult(pproxyresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxyResultEx(pproxyresultex: MutPtr) {
    if (windowsWin32NetworkingWinhttpNapiAddon != null) {
        windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx(pproxyresultex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: ConstPtr) {
    if (windowsWin32NetworkingWinhttpNapiAddon != null) {
        windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings(pwinhttpproxysettings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: ConstPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx(proxysettingstype, pproxysettingsex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpFreeQueryConnectionGroupResult(presult: MutPtr) {
    if (windowsWin32NetworkingWinhttpNapiAddon != null) {
        windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult(presult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration(pproxyinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser(pproxyconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrl(hsession: MutPtr, lpcwszurl: Pcwstr, pautoproxyoptions: MutPtr, pproxyinfo: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl(hsession.rawAddress.toString(), lpcwszurl.rawAddress.toString(), pautoproxyoptions.rawAddress.toString(), pproxyinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrlEx(hresolver: ConstPtr, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr, pcontext: ULong): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx(hresolver.rawAddress.toString(), pcwszurl.rawAddress.toString(), pautoproxyoptions.rawAddress.toString(), pcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrlEx2(hresolver: ConstPtr, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: ConstPtr, pcontext: ULong): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2(hresolver.rawAddress.toString(), pcwszurl.rawAddress.toString(), pautoproxyoptions.rawAddress.toString(), cbinterfaceselectioncontext.toInt(), pinterfaceselectioncontext.rawAddress.toString(), pcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyResult(hresolver: ConstPtr, pproxyresult: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult(hresolver.rawAddress.toString(), pproxyresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyResultEx(hresolver: ConstPtr, pproxyresultex: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx(hresolver.rawAddress.toString(), pproxyresultex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsEx(hresolver: ConstPtr, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: ConstPtr, pcontext: ULong): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx(hresolver.rawAddress.toString(), proxysettingstype, pproxysettingsparam.rawAddress.toString(), pcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsResultEx(hresolver: ConstPtr, pproxysettingsex: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx(hresolver.rawAddress.toString(), pproxysettingsex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsVersion(hsession: ConstPtr, pdwproxysettingsversion: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion(hsession.rawAddress.toString(), pdwproxysettingsversion.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): MutPtr =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) MutPtr((windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpOpen(pszagentw.rawAddress.toString(), dwaccesstype.toInt(), pszproxyw.rawAddress.toString(), pszproxybypassw.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpOpenRequest(hconnect: MutPtr, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: ConstPtr, dwflags: WinhttpOpenRequestFlags): MutPtr =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) MutPtr((windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest(hconnect.rawAddress.toString(), pwszverb.rawAddress.toString(), pwszobjectname.rawAddress.toString(), pwszversion.rawAddress.toString(), pwszreferrer.rawAddress.toString(), ppwszaccepttypes.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryAuthSchemes(hrequest: MutPtr, lpdwsupportedschemes: MutPtr, lpdwfirstscheme: MutPtr, pdwauthtarget: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes(hrequest.rawAddress.toString(), lpdwsupportedschemes.rawAddress.toString(), lpdwfirstscheme.rawAddress.toString(), pdwauthtarget.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryConnectionGroup(hinternet: ConstPtr, pguidconnection: ConstPtr, ullflags: ULong, ppresult: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup(hinternet.rawAddress.toString(), pguidconnection.rawAddress.toString(), ullflags.toString(), ppresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryDataAvailable(hrequest: MutPtr, lpdwnumberofbytesavailable: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable(hrequest.rawAddress.toString(), lpdwnumberofbytesavailable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryHeaders(hrequest: MutPtr, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders(hrequest.rawAddress.toString(), dwinfolevel.toInt(), pwszname.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpdwindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryHeadersEx(hrequest: ConstPtr, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: MutPtr, pheadername: ConstPtr, pbuffer: MutPtr, pdwbufferlength: MutPtr, ppheaders: MutPtr, pdwheaderscount: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx(hrequest.rawAddress.toString(), dwinfolevel.toInt(), ullflags.toString(), uicodepage.toInt(), pdwindex.rawAddress.toString(), pheadername.rawAddress.toString(), pbuffer.rawAddress.toString(), pdwbufferlength.rawAddress.toString(), ppheaders.rawAddress.toString(), pdwheaderscount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryOption(hinternet: MutPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadData(hrequest: MutPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpReadData(hrequest.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadDataEx(hrequest: MutPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr, ullflags: ULong, cbproperty: UInt, pvproperty: ConstPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx(hrequest.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress.toString(), ullflags.toString(), cbproperty.toInt(), pvproperty.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadProxySettings(hsession: ConstPtr, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: MutPtr, pfdefaultsettingsarereturned: MutPtr, pwinhttpproxysettings: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings(hsession.rawAddress.toString(), pcwszconnectionname.rawAddress.toString(), ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion.rawAddress.toString(), pfdefaultsettingsarereturned.rawAddress.toString(), pwinhttpproxysettings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReceiveResponse(hrequest: MutPtr, lpreserved: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse(hrequest.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: ConstPtr, hregistration: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification(ullflags.toString(), 0L.toString(), pvcontext.rawAddress.toString(), hregistration.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpResetAutoProxy(hsession: ConstPtr, dwflags: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy(hsession.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSendRequest(hrequest: MutPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), lpoptional.rawAddress.toString(), dwoptionallength.toInt(), dwtotallength.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetCredentials(hrequest: MutPtr, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials(hrequest.rawAddress.toString(), authtargets.toInt(), authscheme.toInt(), pwszusername.rawAddress.toString(), pwszpassword.rawAddress.toString(), pauthparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration(pproxyinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetOption(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetStatusCallback(hinternet: MutPtr, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetTimeouts(hinternet: MutPtr, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts(hinternet.rawAddress.toString(), nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpTimeFromSystemTime(pst: ConstPtr, pwsztime: Pwstr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime(pst.rawAddress.toString(), pwsztime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime(pwsztime.rawAddress.toString(), pst.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: ConstPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification(hregistration.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketClose(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose(hwebsocket.rawAddress.toString(), usstatus.toInt(), pvreason.rawAddress.toString(), dwreasonlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: ConstPtr, pcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) MutPtr((windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade(hrequest.rawAddress.toString(), pcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: ConstPtr, pusstatus: MutPtr, pvreason: MutPtr, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus(hwebsocket.rawAddress.toString(), pusstatus.rawAddress.toString(), pvreason.rawAddress.toString(), dwreasonlength.toInt(), pdwreasonlengthconsumed.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketReceive(hwebsocket: ConstPtr, pvbuffer: MutPtr, dwbufferlength: UInt, pdwbytesread: MutPtr, pebuffertype: MutPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive(hwebsocket.rawAddress.toString(), pvbuffer.rawAddress.toString(), dwbufferlength.toInt(), pdwbytesread.rawAddress.toString(), pebuffertype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketSend(hwebsocket: ConstPtr, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: ConstPtr, dwbufferlength: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend(hwebsocket.rawAddress.toString(), ebuffertype, pvbuffer.rawAddress.toString(), dwbufferlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketShutdown(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown(hwebsocket.rawAddress.toString(), usstatus.toInt(), pvreason.rawAddress.toString(), dwreasonlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWriteData(hrequest: MutPtr, lpbuffer: ConstPtr, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData(hrequest.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWriteProxySettings(hsession: ConstPtr, fforceupdate: Bool, pwinhttpproxysettings: ConstPtr): UInt =
    if (windowsWin32NetworkingWinhttpNapiAddon != null) (windowsWin32NetworkingWinhttpNapiAddon.windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings(hsession.rawAddress.toString(), fforceupdate, pwinhttpproxysettings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
