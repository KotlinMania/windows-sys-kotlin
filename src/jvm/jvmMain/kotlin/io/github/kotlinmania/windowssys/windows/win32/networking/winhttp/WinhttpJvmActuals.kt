@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private object WindowsWin32NetworkingWinhttpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeaders(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, dwmodifiers: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeadersEx(hrequest: Long, dwmodifiers: Int, ullflags: Long, ullextra: Long, cheaders: Int, pheaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpCheckPlatform(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpCloseHandle(hinternet: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpConnect(hsession: Long, pswzservername: Long, nserverport: Short, dwreserved: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpCrackUrl(pwszurl: Long, dwurllength: Int, dwflags: Int, lpurlcomponents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpCreateProxyResolver(hsession: Long, phresolver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpCreateUrl(lpurlcomponents: Long, dwflags: Int, pwszurl: Long, pdwurllength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpDetectAutoProxyConfigUrl(dwautodetectflags: Int, ppwstrautoconfigurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResult(pproxyresult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResultEx(pproxyresultex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettings(pwinhttpproxysettings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettingsEx(proxysettingstype: Int, pproxysettingsex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpFreeQueryConnectionGroupResult(presult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpGetDefaultProxyConfiguration(pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpGetIEProxyConfigForCurrentUser(pproxyconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrl(hsession: Long, lpcwszurl: Long, pautoproxyoptions: Long, pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx(hresolver: Long, pcwszurl: Long, pautoproxyoptions: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx2(hresolver: Long, pcwszurl: Long, pautoproxyoptions: Long, cbinterfaceselectioncontext: Int, pinterfaceselectioncontext: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResult(hresolver: Long, pproxyresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResultEx(hresolver: Long, pproxyresultex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsEx(hresolver: Long, proxysettingstype: Int, pproxysettingsparam: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsResultEx(hresolver: Long, pproxysettingsex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsVersion(hsession: Long, pdwproxysettingsversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpOpen(pszagentw: Long, dwaccesstype: Int, pszproxyw: Long, pszproxybypassw: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpOpenRequest(hconnect: Long, pwszverb: Long, pwszobjectname: Long, pwszversion: Long, pwszreferrer: Long, ppwszaccepttypes: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpQueryAuthSchemes(hrequest: Long, lpdwsupportedschemes: Long, lpdwfirstscheme: Long, pdwauthtarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpQueryConnectionGroup(hinternet: Long, pguidconnection: Long, ullflags: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpQueryDataAvailable(hrequest: Long, lpdwnumberofbytesavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpQueryHeaders(hrequest: Long, dwinfolevel: Int, pwszname: Long, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpQueryHeadersEx(hrequest: Long, dwinfolevel: Int, ullflags: Long, uicodepage: Int, pdwindex: Long, pheadername: Long, pbuffer: Long, pdwbufferlength: Long, ppheaders: Long, pdwheaderscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpQueryOption(hinternet: Long, dwoption: Int, lpbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpReadData(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: Int, lpdwnumberofbytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpReadDataEx(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: Int, lpdwnumberofbytesread: Long, ullflags: Long, cbproperty: Int, pvproperty: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpReadProxySettings(hsession: Long, pcwszconnectionname: Long, ffallbacktodefaultsettings: Int, fsetautodiscoverfordefaultsettings: Int, pdwsettingsversion: Long, pfdefaultsettingsarereturned: Long, pwinhttpproxysettings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpReceiveResponse(hrequest: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpRegisterProxyChangeNotification(ullflags: Long, pfncallback: Long, pvcontext: Long, hregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpResetAutoProxy(hsession: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpSendRequest(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, lpoptional: Long, dwoptionallength: Int, dwtotallength: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpSetCredentials(hrequest: Long, authtargets: Int, authscheme: Int, pwszusername: Long, pwszpassword: Long, pauthparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpSetDefaultProxyConfiguration(pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpSetOption(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpSetProxySettingsPerUser(fproxysettingsperuser: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpSetStatusCallback(hinternet: Long, lpfninternetcallback: Long, dwnotificationflags: Int, dwreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpSetTimeouts(hinternet: Long, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpTimeFromSystemTime(pst: Long, pwsztime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpTimeToSystemTime(pwsztime: Long, pst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpUnregisterProxyChangeNotification(hregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpWebSocketClose(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpWebSocketCompleteUpgrade(hrequest: Long, pcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: Int, pdwreasonlengthconsumed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: Int, pdwbytesread: Long, pebuffertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpWebSocketSend(hwebsocket: Long, ebuffertype: Int, pvbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpWebSocketShutdown(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpWriteData(hrequest: Long, lpbuffer: Long, dwnumberofbytestowrite: Int, lpdwnumberofbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_WinHttpWriteProxySettings(hsession: Long, fforceupdate: Int, pwinhttpproxysettings: Long): Int
}

public actual fun WinHttpAddRequestHeaders(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: UInt): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeaders(hrequest, lpszheaders, dwheaderslength.toInt(), dwmodifiers.toInt())

public actual fun WinHttpAddRequestHeadersEx(hrequest: Long, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeadersEx(hrequest, dwmodifiers.toInt(), ullflags.toLong(), ullextra.toLong(), cheaders.toInt(), pheaders).toUInt()

public actual fun WinHttpCheckPlatform(): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpCheckPlatform()

public actual fun WinHttpCloseHandle(hinternet: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpCloseHandle(hinternet)

public actual fun WinHttpConnect(hsession: Long, pswzservername: PCWSTR, nserverport: UShort, dwreserved: UInt): Long =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpConnect(hsession, pswzservername, nserverport.toShort(), dwreserved.toInt())

public actual fun WinHttpCrackUrl(pwszurl: PCWSTR, dwurllength: UInt, dwflags: UInt, lpurlcomponents: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpCrackUrl(pwszurl, dwurllength.toInt(), dwflags.toInt(), lpurlcomponents)

public actual fun WinHttpCreateProxyResolver(hsession: Long, phresolver: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpCreateProxyResolver(hsession, phresolver).toUInt()

public actual fun WinHttpCreateUrl(lpurlcomponents: Long, dwflags: WIN_HTTP_CREATE_URL_FLAGS, pwszurl: PWSTR, pdwurllength: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpCreateUrl(lpurlcomponents, dwflags.toInt(), pwszurl, pdwurllength)

public actual fun WinHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpDetectAutoProxyConfigUrl(dwautodetectflags.toInt(), ppwstrautoconfigurl)

public actual fun WinHttpFreeProxyResult(pproxyresult: Long) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResult(pproxyresult)
}

public actual fun WinHttpFreeProxyResultEx(pproxyresultex: Long) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResultEx(pproxyresultex)
}

public actual fun WinHttpFreeProxySettings(pwinhttpproxysettings: Long) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettings(pwinhttpproxysettings)
}

public actual fun WinHttpFreeProxySettingsEx(proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsex: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettingsEx(proxysettingstype, pproxysettingsex).toUInt()

public actual fun WinHttpFreeQueryConnectionGroupResult(presult: Long) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpFreeQueryConnectionGroupResult(presult)
}

public actual fun WinHttpGetDefaultProxyConfiguration(pproxyinfo: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpGetDefaultProxyConfiguration(pproxyinfo)

public actual fun WinHttpGetIEProxyConfigForCurrentUser(pproxyconfig: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpGetIEProxyConfigForCurrentUser(pproxyconfig)

public actual fun WinHttpGetProxyForUrl(hsession: Long, lpcwszurl: PCWSTR, pautoproxyoptions: Long, pproxyinfo: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrl(hsession, lpcwszurl, pautoproxyoptions, pproxyinfo)

public actual fun WinHttpGetProxyForUrlEx(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, pcontext: ULong): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx(hresolver, pcwszurl, pautoproxyoptions, pcontext.toLong()).toUInt()

public actual fun WinHttpGetProxyForUrlEx2(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: Long, pcontext: ULong): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx2(hresolver, pcwszurl, pautoproxyoptions, cbinterfaceselectioncontext.toInt(), pinterfaceselectioncontext, pcontext.toLong()).toUInt()

public actual fun WinHttpGetProxyResult(hresolver: Long, pproxyresult: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResult(hresolver, pproxyresult).toUInt()

public actual fun WinHttpGetProxyResultEx(hresolver: Long, pproxyresultex: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResultEx(hresolver, pproxyresultex).toUInt()

public actual fun WinHttpGetProxySettingsEx(hresolver: Long, proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsparam: Long, pcontext: ULong): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsEx(hresolver, proxysettingstype, pproxysettingsparam, pcontext.toLong()).toUInt()

public actual fun WinHttpGetProxySettingsResultEx(hresolver: Long, pproxysettingsex: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsResultEx(hresolver, pproxysettingsex).toUInt()

public actual fun WinHttpGetProxySettingsVersion(hsession: Long, pdwproxysettingsversion: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsVersion(hsession, pdwproxysettingsversion).toUInt()

public actual fun WinHttpOpen(pszagentw: PCWSTR, dwaccesstype: WINHTTP_ACCESS_TYPE, pszproxyw: PCWSTR, pszproxybypassw: PCWSTR, dwflags: UInt): Long =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpOpen(pszagentw, dwaccesstype.toInt(), pszproxyw, pszproxybypassw, dwflags.toInt())

public actual fun WinHttpOpenRequest(hconnect: Long, pwszverb: PCWSTR, pwszobjectname: PCWSTR, pwszversion: PCWSTR, pwszreferrer: PCWSTR, ppwszaccepttypes: Long, dwflags: WINHTTP_OPEN_REQUEST_FLAGS): Long =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpOpenRequest(hconnect, pwszverb, pwszobjectname, pwszversion, pwszreferrer, ppwszaccepttypes, dwflags.toInt())

public actual fun WinHttpQueryAuthSchemes(hrequest: Long, lpdwsupportedschemes: Long, lpdwfirstscheme: Long, pdwauthtarget: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpQueryAuthSchemes(hrequest, lpdwsupportedschemes, lpdwfirstscheme, pdwauthtarget)

public actual fun WinHttpQueryConnectionGroup(hinternet: Long, pguidconnection: Long, ullflags: ULong, ppresult: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpQueryConnectionGroup(hinternet, pguidconnection, ullflags.toLong(), ppresult).toUInt()

public actual fun WinHttpQueryDataAvailable(hrequest: Long, lpdwnumberofbytesavailable: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpQueryDataAvailable(hrequest, lpdwnumberofbytesavailable)

public actual fun WinHttpQueryHeaders(hrequest: Long, dwinfolevel: UInt, pwszname: PCWSTR, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpQueryHeaders(hrequest, dwinfolevel.toInt(), pwszname, lpbuffer, lpdwbufferlength, lpdwindex)

public actual fun WinHttpQueryHeadersEx(hrequest: Long, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: Long, pheadername: Long, pbuffer: Long, pdwbufferlength: Long, ppheaders: Long, pdwheaderscount: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpQueryHeadersEx(hrequest, dwinfolevel.toInt(), ullflags.toLong(), uicodepage.toInt(), pdwindex, pheadername, pbuffer, pdwbufferlength, ppheaders, pdwheaderscount).toUInt()

public actual fun WinHttpQueryOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpQueryOption(hinternet, dwoption.toInt(), lpbuffer, lpdwbufferlength)

public actual fun WinHttpReadData(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpReadData(hrequest, lpbuffer, dwnumberofbytestoread.toInt(), lpdwnumberofbytesread)

public actual fun WinHttpReadDataEx(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long, ullflags: ULong, cbproperty: UInt, pvproperty: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpReadDataEx(hrequest, lpbuffer, dwnumberofbytestoread.toInt(), lpdwnumberofbytesread, ullflags.toLong(), cbproperty.toInt(), pvproperty).toUInt()

public actual fun WinHttpReadProxySettings(hsession: Long, pcwszconnectionname: PCWSTR, ffallbacktodefaultsettings: BOOL, fsetautodiscoverfordefaultsettings: BOOL, pdwsettingsversion: Long, pfdefaultsettingsarereturned: Long, pwinhttpproxysettings: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpReadProxySettings(hsession, pcwszconnectionname, ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion, pfdefaultsettingsarereturned, pwinhttpproxysettings).toUInt()

public actual fun WinHttpReceiveResponse(hrequest: Long, lpreserved: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpReceiveResponse(hrequest, lpreserved)

public actual fun WinHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WINHTTP_PROXY_CHANGE_CALLBACK, pvcontext: Long, hregistration: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpRegisterProxyChangeNotification(ullflags.toLong(), pfncallback.toLong(), pvcontext, hregistration).toUInt()

public actual fun WinHttpResetAutoProxy(hsession: Long, dwflags: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpResetAutoProxy(hsession, dwflags.toInt()).toUInt()

public actual fun WinHttpSendRequest(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpSendRequest(hrequest, lpszheaders, dwheaderslength.toInt(), lpoptional, dwoptionallength.toInt(), dwtotallength.toInt(), dwcontext.toLong())

public actual fun WinHttpSetCredentials(hrequest: Long, authtargets: UInt, authscheme: UInt, pwszusername: PCWSTR, pwszpassword: PCWSTR, pauthparams: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpSetCredentials(hrequest, authtargets.toInt(), authscheme.toInt(), pwszusername, pwszpassword, pauthparams)

public actual fun WinHttpSetDefaultProxyConfiguration(pproxyinfo: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpSetDefaultProxyConfiguration(pproxyinfo)

public actual fun WinHttpSetOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpSetOption(hinternet, dwoption.toInt(), lpbuffer, dwbufferlength.toInt())

public actual fun WinHttpSetProxySettingsPerUser(fproxysettingsperuser: BOOL): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpSetProxySettingsPerUser(fproxysettingsperuser).toUInt()

public actual fun WinHttpSetStatusCallback(hinternet: Long, lpfninternetcallback: WINHTTP_STATUS_CALLBACK, dwnotificationflags: UInt, dwreserved: ULong): WINHTTP_STATUS_CALLBACK =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpSetStatusCallback(hinternet, lpfninternetcallback.toLong(), dwnotificationflags.toInt(), dwreserved.toLong())

public actual fun WinHttpSetTimeouts(hinternet: Long, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpSetTimeouts(hinternet, nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout)

public actual fun WinHttpTimeFromSystemTime(pst: Long, pwsztime: PWSTR): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpTimeFromSystemTime(pst, pwsztime)

public actual fun WinHttpTimeToSystemTime(pwsztime: PCWSTR, pst: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpTimeToSystemTime(pwsztime, pst)

public actual fun WinHttpUnregisterProxyChangeNotification(hregistration: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpUnregisterProxyChangeNotification(hregistration).toUInt()

public actual fun WinHttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketClose(hwebsocket, usstatus.toShort(), pvreason, dwreasonlength.toInt()).toUInt()

public actual fun WinHttpWebSocketCompleteUpgrade(hrequest: Long, pcontext: ULong): Long =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketCompleteUpgrade(hrequest, pcontext.toLong())

public actual fun WinHttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketQueryCloseStatus(hwebsocket, pusstatus, pvreason, dwreasonlength.toInt(), pdwreasonlengthconsumed).toUInt()

public actual fun WinHttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pebuffertype: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketReceive(hwebsocket, pvbuffer, dwbufferlength.toInt(), pdwbytesread, pebuffertype).toUInt()

public actual fun WinHttpWebSocketSend(hwebsocket: Long, ebuffertype: WINHTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketSend(hwebsocket, ebuffertype, pvbuffer, dwbufferlength.toInt()).toUInt()

public actual fun WinHttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketShutdown(hwebsocket, usstatus.toShort(), pvreason, dwreasonlength.toInt()).toUInt()

public actual fun WinHttpWriteData(hrequest: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpWriteData(hrequest, lpbuffer, dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten)

public actual fun WinHttpWriteProxySettings(hsession: Long, fforceupdate: BOOL, pwinhttpproxysettings: Long): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_WinHttpWriteProxySettings(hsession, fforceupdate, pwinhttpproxysettings).toUInt()
