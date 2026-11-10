@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32NetworkingWinhttpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpAddRequestHeaders(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, dwmodifiers: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpAddRequestHeadersEx(hrequest: Long, dwmodifiers: Int, ullflags: Long, ullextra: Long, cheaders: Int, pheaders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpCheckPlatform(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpCloseHandle(hinternet: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpConnect(hsession: Long, pswzservername: Long, nserverport: Short, dwreserved: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpCrackUrl(pwszurl: Long, dwurllength: Int, dwflags: Int, lpurlcomponents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpCreateProxyResolver(hsession: Long, phresolver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpCreateUrl(lpurlcomponents: Long, dwflags: Int, pwszurl: Long, pdwurllength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpDetectAutoProxyConfigUrl(dwautodetectflags: Int, ppwstrautoconfigurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpFreeProxyResult(pproxyresult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpFreeProxyResultEx(pproxyresultex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpFreeProxySettings(pwinhttpproxysettings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpFreeProxySettingsEx(proxysettingstype: Int, pproxysettingsex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpFreeQueryConnectionGroupResult(presult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpGetDefaultProxyConfiguration(pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrl(hsession: Long, lpcwszurl: Long, pautoproxyoptions: Long, pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrlEx(hresolver: Long, pcwszurl: Long, pautoproxyoptions: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrlEx2(hresolver: Long, pcwszurl: Long, pautoproxyoptions: Long, cbinterfaceselectioncontext: Int, pinterfaceselectioncontext: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpGetProxyResult(hresolver: Long, pproxyresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpGetProxyResultEx(hresolver: Long, pproxyresultex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsEx(hresolver: Long, proxysettingstype: Int, pproxysettingsparam: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsResultEx(hresolver: Long, pproxysettingsex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsVersion(hsession: Long, pdwproxysettingsversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpOpen(pszagentw: Long, dwaccesstype: Int, pszproxyw: Long, pszproxybypassw: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpOpenRequest(hconnect: Long, pwszverb: Long, pwszobjectname: Long, pwszversion: Long, pwszreferrer: Long, ppwszaccepttypes: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpQueryAuthSchemes(hrequest: Long, lpdwsupportedschemes: Long, lpdwfirstscheme: Long, pdwauthtarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpQueryConnectionGroup(hinternet: Long, pguidconnection: Long, ullflags: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpQueryDataAvailable(hrequest: Long, lpdwnumberofbytesavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpQueryHeaders(hrequest: Long, dwinfolevel: Int, pwszname: Long, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpQueryHeadersEx(hrequest: Long, dwinfolevel: Int, ullflags: Long, uicodepage: Int, pdwindex: Long, pheadername: Long, pbuffer: Long, pdwbufferlength: Long, ppheaders: Long, pdwheaderscount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpQueryOption(hinternet: Long, dwoption: Int, lpbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpReadData(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: Int, lpdwnumberofbytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpReadDataEx(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: Int, lpdwnumberofbytesread: Long, ullflags: Long, cbproperty: Int, pvproperty: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpReadProxySettings(hsession: Long, pcwszconnectionname: Long, ffallbacktodefaultsettings: Int, fsetautodiscoverfordefaultsettings: Int, pdwsettingsversion: Long, pfdefaultsettingsarereturned: Long, pwinhttpproxysettings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpReceiveResponse(hrequest: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpRegisterProxyChangeNotification(ullflags: Long, pfncallback: Long, pvcontext: Long, hregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpResetAutoProxy(hsession: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpSendRequest(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, lpoptional: Long, dwoptionallength: Int, dwtotallength: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpSetCredentials(hrequest: Long, authtargets: Int, authscheme: Int, pwszusername: Long, pwszpassword: Long, pauthparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpSetDefaultProxyConfiguration(pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpSetOption(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpSetProxySettingsPerUser(fproxysettingsperuser: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpSetStatusCallback(hinternet: Long, lpfninternetcallback: Long, dwnotificationflags: Int, dwreserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpSetTimeouts(hinternet: Long, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpTimeFromSystemTime(pst: Long, pwsztime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpTimeToSystemTime(pwsztime: Long, pst: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpUnregisterProxyChangeNotification(hregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpWebSocketClose(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpWebSocketCompleteUpgrade(hrequest: Long, pcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: Int, pdwreasonlengthconsumed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: Int, pdwbytesread: Long, pebuffertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpWebSocketSend(hwebsocket: Long, ebuffertype: Int, pvbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpWebSocketShutdown(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpWriteData(hrequest: Long, lpbuffer: Long, dwnumberofbytestowrite: Int, lpdwnumberofbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_winhttp_winHttpWriteProxySettings(hsession: Long, fforceupdate: Int, pwinhttpproxysettings: Long): Int
}

public actual fun winHttpAddRequestHeaders(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpAddRequestHeaders((hrequest?.value ?: 0L), (lpszheaders?.value ?: 0L), dwheaderslength.toInt(), dwmodifiers.toInt())

public actual fun winHttpAddRequestHeadersEx(hrequest: COpaquePointer?, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpAddRequestHeadersEx((hrequest?.value ?: 0L), dwmodifiers.toInt(), ullflags.toLong(), ullextra.toLong(), cheaders.toInt(), (pheaders?.value ?: 0L)).toUInt()

public actual fun winHttpCheckPlatform(): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpCheckPlatform()

public actual fun winHttpCloseHandle(hinternet: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpCloseHandle((hinternet?.value ?: 0L))

public actual fun winHttpConnect(hsession: COpaquePointer?, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): COpaquePointer? =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpConnect((hsession?.value ?: 0L), (pswzservername?.value ?: 0L), nserverport.toShort(), dwreserved.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpCrackUrl((pwszurl?.value ?: 0L), dwurllength.toInt(), dwflags.toInt(), (lpurlcomponents?.value ?: 0L))

public actual fun winHttpCreateProxyResolver(hsession: COpaquePointer?, phresolver: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpCreateProxyResolver((hsession?.value ?: 0L), (phresolver?.value ?: 0L)).toUInt()

public actual fun winHttpCreateUrl(lpurlcomponents: COpaquePointer?, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpCreateUrl((lpurlcomponents?.value ?: 0L), dwflags.toInt(), (pwszurl?.value ?: 0L), (pdwurllength?.value ?: 0L))

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpDetectAutoProxyConfigUrl(dwautodetectflags.toInt(), (ppwstrautoconfigurl?.value ?: 0L))

public actual fun winHttpFreeProxyResult(pproxyresult: COpaquePointer?) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpFreeProxyResult((pproxyresult?.value ?: 0L))
}

public actual fun winHttpFreeProxyResultEx(pproxyresultex: COpaquePointer?) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpFreeProxyResultEx((pproxyresultex?.value ?: 0L))
}

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: COpaquePointer?) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpFreeProxySettings((pwinhttpproxysettings?.value ?: 0L))
}

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpFreeProxySettingsEx(proxysettingstype, (pproxysettingsex?.value ?: 0L)).toUInt()

public actual fun winHttpFreeQueryConnectionGroupResult(presult: COpaquePointer?) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpFreeQueryConnectionGroupResult((presult?.value ?: 0L))
}

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpGetDefaultProxyConfiguration((pproxyinfo?.value ?: 0L))

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpGetIEProxyConfigForCurrentUser((pproxyconfig?.value ?: 0L))

public actual fun winHttpGetProxyForUrl(hsession: COpaquePointer?, lpcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, pproxyinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrl((hsession?.value ?: 0L), (lpcwszurl?.value ?: 0L), (pautoproxyoptions?.value ?: 0L), (pproxyinfo?.value ?: 0L))

public actual fun winHttpGetProxyForUrlEx(hresolver: COpaquePointer?, pcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, pcontext: ULong): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrlEx((hresolver?.value ?: 0L), (pcwszurl?.value ?: 0L), (pautoproxyoptions?.value ?: 0L), pcontext.toLong()).toUInt()

public actual fun winHttpGetProxyForUrlEx2(hresolver: COpaquePointer?, pcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: COpaquePointer?, pcontext: ULong): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrlEx2((hresolver?.value ?: 0L), (pcwszurl?.value ?: 0L), (pautoproxyoptions?.value ?: 0L), cbinterfaceselectioncontext.toInt(), (pinterfaceselectioncontext?.value ?: 0L), pcontext.toLong()).toUInt()

public actual fun winHttpGetProxyResult(hresolver: COpaquePointer?, pproxyresult: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpGetProxyResult((hresolver?.value ?: 0L), (pproxyresult?.value ?: 0L)).toUInt()

public actual fun winHttpGetProxyResultEx(hresolver: COpaquePointer?, pproxyresultex: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpGetProxyResultEx((hresolver?.value ?: 0L), (pproxyresultex?.value ?: 0L)).toUInt()

public actual fun winHttpGetProxySettingsEx(hresolver: COpaquePointer?, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: COpaquePointer?, pcontext: ULong): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsEx((hresolver?.value ?: 0L), proxysettingstype, (pproxysettingsparam?.value ?: 0L), pcontext.toLong()).toUInt()

public actual fun winHttpGetProxySettingsResultEx(hresolver: COpaquePointer?, pproxysettingsex: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsResultEx((hresolver?.value ?: 0L), (pproxysettingsex?.value ?: 0L)).toUInt()

public actual fun winHttpGetProxySettingsVersion(hsession: COpaquePointer?, pdwproxysettingsversion: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsVersion((hsession?.value ?: 0L), (pdwproxysettingsversion?.value ?: 0L)).toUInt()

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): COpaquePointer? =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpOpen((pszagentw?.value ?: 0L), dwaccesstype.toInt(), (pszproxyw?.value ?: 0L), (pszproxybypassw?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun winHttpOpenRequest(hconnect: COpaquePointer?, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: COpaquePointer?, dwflags: WinhttpOpenRequestFlags): COpaquePointer? =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpOpenRequest((hconnect?.value ?: 0L), (pwszverb?.value ?: 0L), (pwszobjectname?.value ?: 0L), (pwszversion?.value ?: 0L), (pwszreferrer?.value ?: 0L), (ppwszaccepttypes?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun winHttpQueryAuthSchemes(hrequest: COpaquePointer?, lpdwsupportedschemes: COpaquePointer?, lpdwfirstscheme: COpaquePointer?, pdwauthtarget: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpQueryAuthSchemes((hrequest?.value ?: 0L), (lpdwsupportedschemes?.value ?: 0L), (lpdwfirstscheme?.value ?: 0L), (pdwauthtarget?.value ?: 0L))

public actual fun winHttpQueryConnectionGroup(hinternet: COpaquePointer?, pguidconnection: COpaquePointer?, ullflags: ULong, ppresult: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpQueryConnectionGroup((hinternet?.value ?: 0L), (pguidconnection?.value ?: 0L), ullflags.toLong(), (ppresult?.value ?: 0L)).toUInt()

public actual fun winHttpQueryDataAvailable(hrequest: COpaquePointer?, lpdwnumberofbytesavailable: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpQueryDataAvailable((hrequest?.value ?: 0L), (lpdwnumberofbytesavailable?.value ?: 0L))

public actual fun winHttpQueryHeaders(hrequest: COpaquePointer?, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpQueryHeaders((hrequest?.value ?: 0L), dwinfolevel.toInt(), (pwszname?.value ?: 0L), (lpbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L), (lpdwindex?.value ?: 0L))

public actual fun winHttpQueryHeadersEx(hrequest: COpaquePointer?, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: COpaquePointer?, pheadername: COpaquePointer?, pbuffer: COpaquePointer?, pdwbufferlength: COpaquePointer?, ppheaders: COpaquePointer?, pdwheaderscount: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpQueryHeadersEx((hrequest?.value ?: 0L), dwinfolevel.toInt(), ullflags.toLong(), uicodepage.toInt(), (pdwindex?.value ?: 0L), (pheadername?.value ?: 0L), (pbuffer?.value ?: 0L), (pdwbufferlength?.value ?: 0L), (ppheaders?.value ?: 0L), (pdwheaderscount?.value ?: 0L)).toUInt()

public actual fun winHttpQueryOption(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpQueryOption((hinternet?.value ?: 0L), dwoption.toInt(), (lpbuffer?.value ?: 0L), (lpdwbufferlength?.value ?: 0L))

public actual fun winHttpReadData(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpReadData((hrequest?.value ?: 0L), (lpbuffer?.value ?: 0L), dwnumberofbytestoread.toInt(), (lpdwnumberofbytesread?.value ?: 0L))

public actual fun winHttpReadDataEx(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?, ullflags: ULong, cbproperty: UInt, pvproperty: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpReadDataEx((hrequest?.value ?: 0L), (lpbuffer?.value ?: 0L), dwnumberofbytestoread.toInt(), (lpdwnumberofbytesread?.value ?: 0L), ullflags.toLong(), cbproperty.toInt(), (pvproperty?.value ?: 0L)).toUInt()

public actual fun winHttpReadProxySettings(hsession: COpaquePointer?, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: COpaquePointer?, pfdefaultsettingsarereturned: COpaquePointer?, pwinhttpproxysettings: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpReadProxySettings((hsession?.value ?: 0L), (pcwszconnectionname?.value ?: 0L), ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, (pdwsettingsversion?.value ?: 0L), (pfdefaultsettingsarereturned?.value ?: 0L), (pwinhttpproxysettings?.value ?: 0L)).toUInt()

public actual fun winHttpReceiveResponse(hrequest: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpReceiveResponse((hrequest?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: COpaquePointer?, hregistration: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpRegisterProxyChangeNotification(ullflags.toLong(), 0L, (pvcontext?.value ?: 0L), (hregistration?.value ?: 0L)).toUInt()

public actual fun winHttpResetAutoProxy(hsession: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpResetAutoProxy((hsession?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun winHttpSendRequest(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpSendRequest((hrequest?.value ?: 0L), (lpszheaders?.value ?: 0L), dwheaderslength.toInt(), (lpoptional?.value ?: 0L), dwoptionallength.toInt(), dwtotallength.toInt(), dwcontext.toLong())

public actual fun winHttpSetCredentials(hrequest: COpaquePointer?, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpSetCredentials((hrequest?.value ?: 0L), authtargets.toInt(), authscheme.toInt(), (pwszusername?.value ?: 0L), (pwszpassword?.value ?: 0L), (pauthparams?.value ?: 0L))

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpSetDefaultProxyConfiguration((pproxyinfo?.value ?: 0L))

public actual fun winHttpSetOption(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpSetOption((hinternet?.value ?: 0L), dwoption.toInt(), (lpbuffer?.value ?: 0L), dwbufferlength.toInt())

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpSetProxySettingsPerUser(fproxysettingsperuser).toUInt()

public actual fun winHttpSetStatusCallback(hinternet: COpaquePointer?, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    null

public actual fun winHttpSetTimeouts(hinternet: COpaquePointer?, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpSetTimeouts((hinternet?.value ?: 0L), nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout)

public actual fun winHttpTimeFromSystemTime(pst: COpaquePointer?, pwsztime: Pwstr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpTimeFromSystemTime((pst?.value ?: 0L), (pwsztime?.value ?: 0L))

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpTimeToSystemTime((pwsztime?.value ?: 0L), (pst?.value ?: 0L))

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpUnregisterProxyChangeNotification((hregistration?.value ?: 0L)).toUInt()

public actual fun winHttpWebSocketClose(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpWebSocketClose((hwebsocket?.value ?: 0L), usstatus.toShort(), (pvreason?.value ?: 0L), dwreasonlength.toInt()).toUInt()

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: COpaquePointer?, pcontext: ULong): COpaquePointer? =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpWebSocketCompleteUpgrade((hrequest?.value ?: 0L), pcontext.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: COpaquePointer?, pusstatus: COpaquePointer?, pvreason: COpaquePointer?, dwreasonlength: UInt, pdwreasonlengthconsumed: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpWebSocketQueryCloseStatus((hwebsocket?.value ?: 0L), (pusstatus?.value ?: 0L), (pvreason?.value ?: 0L), dwreasonlength.toInt(), (pdwreasonlengthconsumed?.value ?: 0L)).toUInt()

public actual fun winHttpWebSocketReceive(hwebsocket: COpaquePointer?, pvbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbytesread: COpaquePointer?, pebuffertype: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpWebSocketReceive((hwebsocket?.value ?: 0L), (pvbuffer?.value ?: 0L), dwbufferlength.toInt(), (pdwbytesread?.value ?: 0L), (pebuffertype?.value ?: 0L)).toUInt()

public actual fun winHttpWebSocketSend(hwebsocket: COpaquePointer?, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: COpaquePointer?, dwbufferlength: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpWebSocketSend((hwebsocket?.value ?: 0L), ebuffertype, (pvbuffer?.value ?: 0L), dwbufferlength.toInt()).toUInt()

public actual fun winHttpWebSocketShutdown(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpWebSocketShutdown((hwebsocket?.value ?: 0L), usstatus.toShort(), (pvreason?.value ?: 0L), dwreasonlength.toInt()).toUInt()

public actual fun winHttpWriteData(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: COpaquePointer?): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpWriteData((hrequest?.value ?: 0L), (lpbuffer?.value ?: 0L), dwnumberofbytestowrite.toInt(), (lpdwnumberofbyteswritten?.value ?: 0L))

public actual fun winHttpWriteProxySettings(hsession: COpaquePointer?, fforceupdate: Bool, pwinhttpproxysettings: COpaquePointer?): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssys_windows_win32_networking_winhttp_winHttpWriteProxySettings((hsession?.value ?: 0L), fforceupdate, (pwinhttpproxysettings?.value ?: 0L)).toUInt()
