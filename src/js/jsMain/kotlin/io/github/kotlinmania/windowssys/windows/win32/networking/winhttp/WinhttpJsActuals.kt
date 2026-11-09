@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private val _windowsWin32NetworkingWinhttpNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun WinHttpAddRequestHeaders(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: UInt): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeaders(hrequest.toString(), lpszheaders.toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) as Int) else 0

public actual fun WinHttpAddRequestHeadersEx(hrequest: Long, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeadersEx(hrequest.toString(), dwmodifiers.toInt(), ullflags.toString(), ullextra.toString(), cheaders.toInt(), pheaders.toString()) as Int).toUInt() else 0u

public actual fun WinHttpCheckPlatform(): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpCheckPlatform() as Int) else 0

public actual fun WinHttpCloseHandle(hinternet: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpCloseHandle(hinternet.toString()) as Int) else 0

public actual fun WinHttpConnect(hsession: Long, pswzservername: PCWSTR, nserverport: UShort, dwreserved: UInt): Long =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpConnect(hsession.toString(), pswzservername.toString(), nserverport.toInt(), dwreserved.toInt()) as String).toLong() else 0L

public actual fun WinHttpCrackUrl(pwszurl: PCWSTR, dwurllength: UInt, dwflags: UInt, lpurlcomponents: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpCrackUrl(pwszurl.toString(), dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.toString()) as Int) else 0

public actual fun WinHttpCreateProxyResolver(hsession: Long, phresolver: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpCreateProxyResolver(hsession.toString(), phresolver.toString()) as Int).toUInt() else 0u

public actual fun WinHttpCreateUrl(lpurlcomponents: Long, dwflags: WIN_HTTP_CREATE_URL_FLAGS, pwszurl: PWSTR, pdwurllength: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpCreateUrl(lpurlcomponents.toString(), dwflags.toInt(), pwszurl.toString(), pdwurllength.toString()) as Int) else 0

public actual fun WinHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpDetectAutoProxyConfigUrl(dwautodetectflags.toInt(), ppwstrautoconfigurl.toString()) as Int) else 0

public actual fun WinHttpFreeProxyResult(pproxyresult: Long) {
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) {
        _windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResult(pproxyresult.toString())
    }
}

public actual fun WinHttpFreeProxyResultEx(pproxyresultex: Long) {
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) {
        _windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResultEx(pproxyresultex.toString())
    }
}

public actual fun WinHttpFreeProxySettings(pwinhttpproxysettings: Long) {
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) {
        _windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettings(pwinhttpproxysettings.toString())
    }
}

public actual fun WinHttpFreeProxySettingsEx(proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsex: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettingsEx(proxysettingstype, pproxysettingsex.toString()) as Int).toUInt() else 0u

public actual fun WinHttpFreeQueryConnectionGroupResult(presult: Long) {
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) {
        _windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpFreeQueryConnectionGroupResult(presult.toString())
    }
}

public actual fun WinHttpGetDefaultProxyConfiguration(pproxyinfo: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpGetDefaultProxyConfiguration(pproxyinfo.toString()) as Int) else 0

public actual fun WinHttpGetIEProxyConfigForCurrentUser(pproxyconfig: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpGetIEProxyConfigForCurrentUser(pproxyconfig.toString()) as Int) else 0

public actual fun WinHttpGetProxyForUrl(hsession: Long, lpcwszurl: PCWSTR, pautoproxyoptions: Long, pproxyinfo: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrl(hsession.toString(), lpcwszurl.toString(), pautoproxyoptions.toString(), pproxyinfo.toString()) as Int) else 0

public actual fun WinHttpGetProxyForUrlEx(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, pcontext: ULong): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx(hresolver.toString(), pcwszurl.toString(), pautoproxyoptions.toString(), pcontext.toString()) as Int).toUInt() else 0u

public actual fun WinHttpGetProxyForUrlEx2(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: Long, pcontext: ULong): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx2(hresolver.toString(), pcwszurl.toString(), pautoproxyoptions.toString(), cbinterfaceselectioncontext.toInt(), pinterfaceselectioncontext.toString(), pcontext.toString()) as Int).toUInt() else 0u

public actual fun WinHttpGetProxyResult(hresolver: Long, pproxyresult: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResult(hresolver.toString(), pproxyresult.toString()) as Int).toUInt() else 0u

public actual fun WinHttpGetProxyResultEx(hresolver: Long, pproxyresultex: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResultEx(hresolver.toString(), pproxyresultex.toString()) as Int).toUInt() else 0u

public actual fun WinHttpGetProxySettingsEx(hresolver: Long, proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsparam: Long, pcontext: ULong): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsEx(hresolver.toString(), proxysettingstype, pproxysettingsparam.toString(), pcontext.toString()) as Int).toUInt() else 0u

public actual fun WinHttpGetProxySettingsResultEx(hresolver: Long, pproxysettingsex: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsResultEx(hresolver.toString(), pproxysettingsex.toString()) as Int).toUInt() else 0u

public actual fun WinHttpGetProxySettingsVersion(hsession: Long, pdwproxysettingsversion: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsVersion(hsession.toString(), pdwproxysettingsversion.toString()) as Int).toUInt() else 0u

public actual fun WinHttpOpen(pszagentw: PCWSTR, dwaccesstype: WINHTTP_ACCESS_TYPE, pszproxyw: PCWSTR, pszproxybypassw: PCWSTR, dwflags: UInt): Long =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpOpen(pszagentw.toString(), dwaccesstype.toInt(), pszproxyw.toString(), pszproxybypassw.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun WinHttpOpenRequest(hconnect: Long, pwszverb: PCWSTR, pwszobjectname: PCWSTR, pwszversion: PCWSTR, pwszreferrer: PCWSTR, ppwszaccepttypes: Long, dwflags: WINHTTP_OPEN_REQUEST_FLAGS): Long =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpOpenRequest(hconnect.toString(), pwszverb.toString(), pwszobjectname.toString(), pwszversion.toString(), pwszreferrer.toString(), ppwszaccepttypes.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun WinHttpQueryAuthSchemes(hrequest: Long, lpdwsupportedschemes: Long, lpdwfirstscheme: Long, pdwauthtarget: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpQueryAuthSchemes(hrequest.toString(), lpdwsupportedschemes.toString(), lpdwfirstscheme.toString(), pdwauthtarget.toString()) as Int) else 0

public actual fun WinHttpQueryConnectionGroup(hinternet: Long, pguidconnection: Long, ullflags: ULong, ppresult: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpQueryConnectionGroup(hinternet.toString(), pguidconnection.toString(), ullflags.toString(), ppresult.toString()) as Int).toUInt() else 0u

public actual fun WinHttpQueryDataAvailable(hrequest: Long, lpdwnumberofbytesavailable: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpQueryDataAvailable(hrequest.toString(), lpdwnumberofbytesavailable.toString()) as Int) else 0

public actual fun WinHttpQueryHeaders(hrequest: Long, dwinfolevel: UInt, pwszname: PCWSTR, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpQueryHeaders(hrequest.toString(), dwinfolevel.toInt(), pwszname.toString(), lpbuffer.toString(), lpdwbufferlength.toString(), lpdwindex.toString()) as Int) else 0

public actual fun WinHttpQueryHeadersEx(hrequest: Long, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: Long, pheadername: Long, pbuffer: Long, pdwbufferlength: Long, ppheaders: Long, pdwheaderscount: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpQueryHeadersEx(hrequest.toString(), dwinfolevel.toInt(), ullflags.toString(), uicodepage.toInt(), pdwindex.toString(), pheadername.toString(), pbuffer.toString(), pdwbufferlength.toString(), ppheaders.toString(), pdwheaderscount.toString()) as Int).toUInt() else 0u

public actual fun WinHttpQueryOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpQueryOption(hinternet.toString(), dwoption.toInt(), lpbuffer.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun WinHttpReadData(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpReadData(hrequest.toString(), lpbuffer.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.toString()) as Int) else 0

public actual fun WinHttpReadDataEx(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long, ullflags: ULong, cbproperty: UInt, pvproperty: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpReadDataEx(hrequest.toString(), lpbuffer.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.toString(), ullflags.toString(), cbproperty.toInt(), pvproperty.toString()) as Int).toUInt() else 0u

public actual fun WinHttpReadProxySettings(hsession: Long, pcwszconnectionname: PCWSTR, ffallbacktodefaultsettings: BOOL, fsetautodiscoverfordefaultsettings: BOOL, pdwsettingsversion: Long, pfdefaultsettingsarereturned: Long, pwinhttpproxysettings: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpReadProxySettings(hsession.toString(), pcwszconnectionname.toString(), ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion.toString(), pfdefaultsettingsarereturned.toString(), pwinhttpproxysettings.toString()) as Int).toUInt() else 0u

public actual fun WinHttpReceiveResponse(hrequest: Long, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpReceiveResponse(hrequest.toString(), lpreserved.toString()) as Int) else 0

public actual fun WinHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WINHTTP_PROXY_CHANGE_CALLBACK, pvcontext: Long, hregistration: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpRegisterProxyChangeNotification(ullflags.toString(), pfncallback.toLong().toString(), pvcontext.toString(), hregistration.toString()) as Int).toUInt() else 0u

public actual fun WinHttpResetAutoProxy(hsession: Long, dwflags: UInt): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpResetAutoProxy(hsession.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun WinHttpSendRequest(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpSendRequest(hrequest.toString(), lpszheaders.toString(), dwheaderslength.toInt(), lpoptional.toString(), dwoptionallength.toInt(), dwtotallength.toInt(), dwcontext.toString()) as Int) else 0

public actual fun WinHttpSetCredentials(hrequest: Long, authtargets: UInt, authscheme: UInt, pwszusername: PCWSTR, pwszpassword: PCWSTR, pauthparams: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpSetCredentials(hrequest.toString(), authtargets.toInt(), authscheme.toInt(), pwszusername.toString(), pwszpassword.toString(), pauthparams.toString()) as Int) else 0

public actual fun WinHttpSetDefaultProxyConfiguration(pproxyinfo: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpSetDefaultProxyConfiguration(pproxyinfo.toString()) as Int) else 0

public actual fun WinHttpSetOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpSetOption(hinternet.toString(), dwoption.toInt(), lpbuffer.toString(), dwbufferlength.toInt()) as Int) else 0

public actual fun WinHttpSetProxySettingsPerUser(fproxysettingsperuser: BOOL): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpSetProxySettingsPerUser(fproxysettingsperuser) as Int).toUInt() else 0u

public actual fun WinHttpSetStatusCallback(hinternet: Long, lpfninternetcallback: WINHTTP_STATUS_CALLBACK, dwnotificationflags: UInt, dwreserved: ULong): WINHTTP_STATUS_CALLBACK =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpSetStatusCallback(hinternet.toString(), lpfninternetcallback.toLong().toString(), dwnotificationflags.toInt(), dwreserved.toString()) as String).toLong() else null

public actual fun WinHttpSetTimeouts(hinternet: Long, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpSetTimeouts(hinternet.toString(), nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout) as Int) else 0

public actual fun WinHttpTimeFromSystemTime(pst: Long, pwsztime: PWSTR): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpTimeFromSystemTime(pst.toString(), pwsztime.toString()) as Int) else 0

public actual fun WinHttpTimeToSystemTime(pwsztime: PCWSTR, pst: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpTimeToSystemTime(pwsztime.toString(), pst.toString()) as Int) else 0

public actual fun WinHttpUnregisterProxyChangeNotification(hregistration: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpUnregisterProxyChangeNotification(hregistration.toString()) as Int).toUInt() else 0u

public actual fun WinHttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketClose(hwebsocket.toString(), usstatus.toInt(), pvreason.toString(), dwreasonlength.toInt()) as Int).toUInt() else 0u

public actual fun WinHttpWebSocketCompleteUpgrade(hrequest: Long, pcontext: ULong): Long =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketCompleteUpgrade(hrequest.toString(), pcontext.toString()) as String).toLong() else 0L

public actual fun WinHttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketQueryCloseStatus(hwebsocket.toString(), pusstatus.toString(), pvreason.toString(), dwreasonlength.toInt(), pdwreasonlengthconsumed.toString()) as Int).toUInt() else 0u

public actual fun WinHttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pebuffertype: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketReceive(hwebsocket.toString(), pvbuffer.toString(), dwbufferlength.toInt(), pdwbytesread.toString(), pebuffertype.toString()) as Int).toUInt() else 0u

public actual fun WinHttpWebSocketSend(hwebsocket: Long, ebuffertype: WINHTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketSend(hwebsocket.toString(), ebuffertype, pvbuffer.toString(), dwbufferlength.toInt()) as Int).toUInt() else 0u

public actual fun WinHttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketShutdown(hwebsocket.toString(), usstatus.toInt(), pvreason.toString(), dwreasonlength.toInt()) as Int).toUInt() else 0u

public actual fun WinHttpWriteData(hrequest: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpWriteData(hrequest.toString(), lpbuffer.toString(), dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten.toString()) as Int) else 0

public actual fun WinHttpWriteProxySettings(hsession: Long, fforceupdate: BOOL, pwinhttpproxysettings: Long): UInt =
    if (_windowsWin32NetworkingWinhttpNapiAddon != null) (_windowsWin32NetworkingWinhttpNapiAddon.windowssys_windows_win32_networking_winhttp_WinHttpWriteProxySettings(hsession.toString(), fforceupdate, pwinhttpproxysettings.toString()) as Int).toUInt() else 0u
