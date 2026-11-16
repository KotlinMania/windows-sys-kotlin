@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32NetworkingWinhttpJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32NetworkingWinhttpJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, dwmodifiers: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx(hrequest: Long, dwmodifiers: Int, ullflags: Long, ullextra: Long, cheaders: Int, pheaders: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle(hinternet: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpConnect(hsession: Long, pswzservername: Long, nserverport: Short, dwreserved: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl(pwszurl: Long, dwurllength: Int, dwflags: Int, lpurlcomponents: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver(hsession: Long, phresolver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl(lpurlcomponents: Long, dwflags: Int, pwszurl: Long, pdwurllength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl(dwautodetectflags: Int, ppwstrautoconfigurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult(pproxyresult: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx(pproxyresultex: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings(pwinhttpproxysettings: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx(proxysettingstype: Int, pproxysettingsex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult(presult: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration(pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser(pproxyconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl(hsession: Long, lpcwszurl: Long, pautoproxyoptions: Long, pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx(hresolver: Long, pcwszurl: Long, pautoproxyoptions: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2(hresolver: Long, pcwszurl: Long, pautoproxyoptions: Long, cbinterfaceselectioncontext: Int, pinterfaceselectioncontext: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult(hresolver: Long, pproxyresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx(hresolver: Long, pproxyresultex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx(hresolver: Long, proxysettingstype: Int, pproxysettingsparam: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx(hresolver: Long, pproxysettingsex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion(hsession: Long, pdwproxysettingsversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpOpen(pszagentw: Long, dwaccesstype: Int, pszproxyw: Long, pszproxybypassw: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest(hconnect: Long, pwszverb: Long, pwszobjectname: Long, pwszversion: Long, pwszreferrer: Long, ppwszaccepttypes: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes(hrequest: Long, lpdwsupportedschemes: Long, lpdwfirstscheme: Long, pdwauthtarget: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup(hinternet: Long, pguidconnection: Long, ullflags: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable(hrequest: Long, lpdwnumberofbytesavailable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders(hrequest: Long, dwinfolevel: Int, pwszname: Long, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx(hrequest: Long, dwinfolevel: Int, ullflags: Long, uicodepage: Int, pdwindex: Long, pheadername: Long, pbuffer: Long, pdwbufferlength: Long, ppheaders: Long, pdwheaderscount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption(hinternet: Long, dwoption: Int, lpbuffer: Long, lpdwbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpReadData(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: Int, lpdwnumberofbytesread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: Int, lpdwnumberofbytesread: Long, ullflags: Long, cbproperty: Int, pvproperty: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings(hsession: Long, pcwszconnectionname: Long, ffallbacktodefaultsettings: Int, fsetautodiscoverfordefaultsettings: Int, pdwsettingsversion: Long, pfdefaultsettingsarereturned: Long, pwinhttpproxysettings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse(hrequest: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification(ullflags: Long, pfncallback: Long, pvcontext: Long, hregistration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy(hsession: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest(hrequest: Long, lpszheaders: Long, dwheaderslength: Int, lpoptional: Long, dwoptionallength: Int, dwtotallength: Int, dwcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials(hrequest: Long, authtargets: Int, authscheme: Int, pwszusername: Long, pwszpassword: Long, pauthparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration(pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption(hinternet: Long, dwoption: Int, lpbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpSetStatusCallback(hinternet: Long, lpfninternetcallback: Long, dwnotificationflags: Int, dwreserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts(hinternet: Long, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime(pst: Long, pwsztime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime(pwsztime: Long, pst: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification(hregistration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade(hrequest: Long, pcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: Int, pdwreasonlengthconsumed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: Int, pdwbytesread: Long, pebuffertype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend(hwebsocket: Long, ebuffertype: Int, pvbuffer: Long, dwbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown(hwebsocket: Long, usstatus: Short, pvreason: Long, dwreasonlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData(hrequest: Long, lpbuffer: Long, dwnumberofbytestowrite: Int, lpdwnumberofbyteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings(hsession: Long, fforceupdate: Int, pwinhttpproxysettings: Long): Int
}

public actual fun winHttpAddRequestHeaders(hrequest: MutPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders(hrequest.rawAddress, lpszheaders.rawAddress, dwheaderslength.toInt(), dwmodifiers.toInt())

public actual fun winHttpAddRequestHeadersEx(hrequest: MutPtr, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: ConstPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx(hrequest.rawAddress, dwmodifiers.toInt(), ullflags.toLong(), ullextra.toLong(), cheaders.toInt(), pheaders.rawAddress).toUInt()

public actual fun winHttpCheckPlatform(): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform()

public actual fun winHttpCloseHandle(hinternet: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle(hinternet.rawAddress)

public actual fun winHttpConnect(hsession: MutPtr, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpConnect(hsession.rawAddress, pswzservername.rawAddress, nserverport.toShort(), dwreserved.toInt()))

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl(pwszurl.rawAddress, dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.rawAddress)

public actual fun winHttpCreateProxyResolver(hsession: ConstPtr, phresolver: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver(hsession.rawAddress, phresolver.rawAddress).toUInt()

public actual fun winHttpCreateUrl(lpurlcomponents: ConstPtr, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl(lpurlcomponents.rawAddress, dwflags.toInt(), pwszurl.rawAddress, pdwurllength.rawAddress)

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl(dwautodetectflags.toInt(), ppwstrautoconfigurl.rawAddress)

public actual fun winHttpFreeProxyResult(pproxyresult: MutPtr) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult(pproxyresult.rawAddress)
}

public actual fun winHttpFreeProxyResultEx(pproxyresultex: MutPtr) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx(pproxyresultex.rawAddress)
}

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: ConstPtr) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings(pwinhttpproxysettings.rawAddress)
}

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: ConstPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx(proxysettingstype, pproxysettingsex.rawAddress).toUInt()

public actual fun winHttpFreeQueryConnectionGroupResult(presult: MutPtr) {
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult(presult.rawAddress)
}

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration(pproxyinfo.rawAddress)

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser(pproxyconfig.rawAddress)

public actual fun winHttpGetProxyForUrl(hsession: MutPtr, lpcwszurl: Pcwstr, pautoproxyoptions: MutPtr, pproxyinfo: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl(hsession.rawAddress, lpcwszurl.rawAddress, pautoproxyoptions.rawAddress, pproxyinfo.rawAddress)

public actual fun winHttpGetProxyForUrlEx(hresolver: ConstPtr, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr, pcontext: ULong): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx(hresolver.rawAddress, pcwszurl.rawAddress, pautoproxyoptions.rawAddress, pcontext.toLong()).toUInt()

public actual fun winHttpGetProxyForUrlEx2(hresolver: ConstPtr, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: ConstPtr, pcontext: ULong): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2(hresolver.rawAddress, pcwszurl.rawAddress, pautoproxyoptions.rawAddress, cbinterfaceselectioncontext.toInt(), pinterfaceselectioncontext.rawAddress, pcontext.toLong()).toUInt()

public actual fun winHttpGetProxyResult(hresolver: ConstPtr, pproxyresult: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult(hresolver.rawAddress, pproxyresult.rawAddress).toUInt()

public actual fun winHttpGetProxyResultEx(hresolver: ConstPtr, pproxyresultex: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx(hresolver.rawAddress, pproxyresultex.rawAddress).toUInt()

public actual fun winHttpGetProxySettingsEx(hresolver: ConstPtr, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: ConstPtr, pcontext: ULong): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx(hresolver.rawAddress, proxysettingstype, pproxysettingsparam.rawAddress, pcontext.toLong()).toUInt()

public actual fun winHttpGetProxySettingsResultEx(hresolver: ConstPtr, pproxysettingsex: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx(hresolver.rawAddress, pproxysettingsex.rawAddress).toUInt()

public actual fun winHttpGetProxySettingsVersion(hsession: ConstPtr, pdwproxysettingsversion: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion(hsession.rawAddress, pdwproxysettingsversion.rawAddress).toUInt()

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): MutPtr =
    MutPtr(WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpOpen(pszagentw.rawAddress, dwaccesstype.toInt(), pszproxyw.rawAddress, pszproxybypassw.rawAddress, dwflags.toInt()))

public actual fun winHttpOpenRequest(hconnect: MutPtr, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: ConstPtr, dwflags: WinhttpOpenRequestFlags): MutPtr =
    MutPtr(WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest(hconnect.rawAddress, pwszverb.rawAddress, pwszobjectname.rawAddress, pwszversion.rawAddress, pwszreferrer.rawAddress, ppwszaccepttypes.rawAddress, dwflags.toInt()))

public actual fun winHttpQueryAuthSchemes(hrequest: MutPtr, lpdwsupportedschemes: MutPtr, lpdwfirstscheme: MutPtr, pdwauthtarget: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes(hrequest.rawAddress, lpdwsupportedschemes.rawAddress, lpdwfirstscheme.rawAddress, pdwauthtarget.rawAddress)

public actual fun winHttpQueryConnectionGroup(hinternet: ConstPtr, pguidconnection: ConstPtr, ullflags: ULong, ppresult: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup(hinternet.rawAddress, pguidconnection.rawAddress, ullflags.toLong(), ppresult.rawAddress).toUInt()

public actual fun winHttpQueryDataAvailable(hrequest: MutPtr, lpdwnumberofbytesavailable: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable(hrequest.rawAddress, lpdwnumberofbytesavailable.rawAddress)

public actual fun winHttpQueryHeaders(hrequest: MutPtr, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders(hrequest.rawAddress, dwinfolevel.toInt(), pwszname.rawAddress, lpbuffer.rawAddress, lpdwbufferlength.rawAddress, lpdwindex.rawAddress)

public actual fun winHttpQueryHeadersEx(hrequest: ConstPtr, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: MutPtr, pheadername: ConstPtr, pbuffer: MutPtr, pdwbufferlength: MutPtr, ppheaders: MutPtr, pdwheaderscount: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx(hrequest.rawAddress, dwinfolevel.toInt(), ullflags.toLong(), uicodepage.toInt(), pdwindex.rawAddress, pheadername.rawAddress, pbuffer.rawAddress, pdwbufferlength.rawAddress, ppheaders.rawAddress, pdwheaderscount.rawAddress).toUInt()

public actual fun winHttpQueryOption(hinternet: MutPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption(hinternet.rawAddress, dwoption.toInt(), lpbuffer.rawAddress, lpdwbufferlength.rawAddress)

public actual fun winHttpReadData(hrequest: MutPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpReadData(hrequest.rawAddress, lpbuffer.rawAddress, dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress)

public actual fun winHttpReadDataEx(hrequest: MutPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr, ullflags: ULong, cbproperty: UInt, pvproperty: ConstPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx(hrequest.rawAddress, lpbuffer.rawAddress, dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress, ullflags.toLong(), cbproperty.toInt(), pvproperty.rawAddress).toUInt()

public actual fun winHttpReadProxySettings(hsession: ConstPtr, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: MutPtr, pfdefaultsettingsarereturned: MutPtr, pwinhttpproxysettings: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings(hsession.rawAddress, pcwszconnectionname.rawAddress, ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion.rawAddress, pfdefaultsettingsarereturned.rawAddress, pwinhttpproxysettings.rawAddress).toUInt()

public actual fun winHttpReceiveResponse(hrequest: MutPtr, lpreserved: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse(hrequest.rawAddress, lpreserved.rawAddress)

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: ConstPtr, hregistration: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification(ullflags.toLong(), 0L, pvcontext.rawAddress, hregistration.rawAddress).toUInt()

public actual fun winHttpResetAutoProxy(hsession: ConstPtr, dwflags: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy(hsession.rawAddress, dwflags.toInt()).toUInt()

public actual fun winHttpSendRequest(hrequest: MutPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest(hrequest.rawAddress, lpszheaders.rawAddress, dwheaderslength.toInt(), lpoptional.rawAddress, dwoptionallength.toInt(), dwtotallength.toInt(), dwcontext.toLong())

public actual fun winHttpSetCredentials(hrequest: MutPtr, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials(hrequest.rawAddress, authtargets.toInt(), authscheme.toInt(), pwszusername.rawAddress, pwszpassword.rawAddress, pauthparams.rawAddress)

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration(pproxyinfo.rawAddress)

public actual fun winHttpSetOption(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption(hinternet.rawAddress, dwoption.toInt(), lpbuffer.rawAddress, dwbufferlength.toInt())

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser).toUInt()

public actual fun winHttpSetStatusCallback(hinternet: MutPtr, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    null

public actual fun winHttpSetTimeouts(hinternet: MutPtr, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts(hinternet.rawAddress, nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout)

public actual fun winHttpTimeFromSystemTime(pst: ConstPtr, pwsztime: Pwstr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime(pst.rawAddress, pwsztime.rawAddress)

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime(pwsztime.rawAddress, pst.rawAddress)

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: ConstPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification(hregistration.rawAddress).toUInt()

public actual fun winHttpWebSocketClose(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose(hwebsocket.rawAddress, usstatus.toShort(), pvreason.rawAddress, dwreasonlength.toInt()).toUInt()

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: ConstPtr, pcontext: ULong): MutPtr =
    MutPtr(WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade(hrequest.rawAddress, pcontext.toLong()))

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: ConstPtr, pusstatus: MutPtr, pvreason: MutPtr, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus(hwebsocket.rawAddress, pusstatus.rawAddress, pvreason.rawAddress, dwreasonlength.toInt(), pdwreasonlengthconsumed.rawAddress).toUInt()

public actual fun winHttpWebSocketReceive(hwebsocket: ConstPtr, pvbuffer: MutPtr, dwbufferlength: UInt, pdwbytesread: MutPtr, pebuffertype: MutPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive(hwebsocket.rawAddress, pvbuffer.rawAddress, dwbufferlength.toInt(), pdwbytesread.rawAddress, pebuffertype.rawAddress).toUInt()

public actual fun winHttpWebSocketSend(hwebsocket: ConstPtr, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: ConstPtr, dwbufferlength: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend(hwebsocket.rawAddress, ebuffertype, pvbuffer.rawAddress, dwbufferlength.toInt()).toUInt()

public actual fun winHttpWebSocketShutdown(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown(hwebsocket.rawAddress, usstatus.toShort(), pvreason.rawAddress, dwreasonlength.toInt()).toUInt()

public actual fun winHttpWriteData(hrequest: MutPtr, lpbuffer: ConstPtr, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr): Bool =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData(hrequest.rawAddress, lpbuffer.rawAddress, dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten.rawAddress)

public actual fun winHttpWriteProxySettings(hsession: ConstPtr, fforceupdate: Bool, pwinhttpproxysettings: ConstPtr): UInt =
    WindowsWin32NetworkingWinhttpJniBridge.windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings(hsession.rawAddress, fforceupdate, pwinhttpproxysettings.rawAddress).toUInt()
