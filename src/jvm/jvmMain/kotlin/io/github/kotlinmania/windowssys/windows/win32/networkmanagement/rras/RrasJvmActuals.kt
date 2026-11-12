@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.MibIpmcastMfe

private object WindowsWin32NetworkmanagementRrasJniBridge {
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
        val stream = WindowsWin32NetworkmanagementRrasJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry(hprotocol: Long, dwsourceaddr: Int, dwsourcemask: Int, dwgroupaddr: Int, dwgroupmask: Int, dwifindex: Int, dwifnexthopipaddr: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol(hprotocol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry(hprotocol: Long, dwsourceaddr: Int, dwsourcemask: Int, dwgroupaddr: Int, dwgroupmask: Int, dwifindex: Int, dwifnexthopipaddr: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats(pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmGetMfe(pimm: Long, pdwbuffersize: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats(pimm: Long, pdwbuffersize: Long, pbbuffer: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats(pimmstart: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface(dwifindex: Int, dwifnexthopaddr: Int, pdwifprotocolid: Long, pdwifcomponentid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd(henum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext(henum: Long, pdwbuffersize: Long, pbbuffer: Long, pdwnumentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart(hprotocol: Long, metenumtype: Int, phenumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol(prpiinfo: Long, dwprotocolid: Int, dwcomponentid: Int, phprotocol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership(hprotocol: Long, dwifindex: Int, dwifnexthopaddr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership(hprotocol: Long, dwifindex: Int, dwifnexthopaddr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree(pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum(hrasserver: Long, dwlevel: Int, lplpbbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: Long, dwpreferedmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, pprasconn: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo(hrasserver: Long, dwlevel: Int, hrasconnection: Long, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Long, prasconnection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine(hrasserver: Long, hrasconnection: Long, fisipaddress: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long, lpdwtotalentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer(pszdomain: Long, pszmachine: Long, benable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString(dwerror: Int, lplpwserrorstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer(lpszdomain: Long, lpszserver: Long, lpszpdcserver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect(hmprserver: Long, hinterface: Long, hevent: Long, fsynchronous: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate(hmprserver: Long, dwlevel: Int, lpbbuffer: Long, phinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete(hmprserver: Long, hinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Long, dwindex: Int, dwlevel: Int, lplpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Long, dwindex: Int, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials(lpwsserver: Long, lpwsinterfacename: Long, lpwsusername: Long, lpwspassword: Long, lpwsdomainname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Long, phinterface: Long, fincludeclientinterfaces: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Long, dwprotocolid: Int, lpdwupdateresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials(lpwsserver: Long, lpwsinterfacename: Long, lpwsusername: Long, lpwsdomainname: Long, lpwspassword: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Long, dwtransportid: Int, pinterfaceinfo: Long, dwinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Long, dwtransportid: Int, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Long, dwtransportid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Long, dwtransportid: Int, pinterfaceinfo: Long, dwinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Long, dwprotocolid: Int, hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer(pszdomain: Long, pszmachine: Long, pbisrasserver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized(lpwsservername: Long, fisserviceinitialized: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning(lpwsservername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree(pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate(hmibserver: Long, dwpid: Int, dwroutingpid: Int, lpentry: Long, dwentrysize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpentry: Long, dwentrysize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpinentry: Long, dwinentrysize: Int, lplpoutentry: Long, lpoutentrysize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpinentry: Long, dwinentrysize: Int, lplpoutentry: Long, lpoutentrysize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpinentry: Long, dwinentrysize: Int, lplpoutentry: Long, lpoutentrysize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: Int, dwroutingpid: Int, lpentry: Long, dwentrysize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect(lpwsservername: Long, phmibserver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect(hmibserver: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats(hrasserver: Long, hport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect(hrasserver: Long, hport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum(hrasserver: Long, dwlevel: Int, hrasconnection: Long, lplpbbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo(hrasserver: Long, dwlevel: Int, hport: Long, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset(hrasserver: Long, hport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage(hmprserver: Long, hconnection: Long, lpwszmessage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect(lpwsservername: Long, phmprserver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect(hmprserver: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo(hmprserver: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials(hmprserver: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo(hmprserver: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate(hmprserver: Long, dwtransportid: Int, lpwstransportname: Long, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int, lpwsdllpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo(hmprserver: Long, dwtransportid: Int, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo(hmprserver: Long, dwtransportid: Int, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection(hrasserver: Long, hrasconnection: Long, prasupdateconnection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo(lpszserver: Long, lpszuser: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo(lpszserver: Long, lpszuser: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree(pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo(hmprconfig: Long, dwlevel: Int, dwtransportid: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo(hmprconfig: Long, dwlevel: Int, dwtransportid: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName(hmprconfig: Long, pszguidname: Long, pszbuffer: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName(hmprconfig: Long, pszfriendlyname: Long, pszbuffer: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate(hmprconfig: Long, dwlevel: Int, lpbbuffer: Long, phrouterinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete(hmprconfig: Long, hrouterinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum(hmprconfig: Long, dwlevel: Int, lplpbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx(hmprconfig: Long, hrouterinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle(hmprconfig: Long, lpwsinterfacename: Long, phrouterinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo(hmprconfig: Long, hrouterinterface: Long, dwlevel: Int, lplpbuffer: Long, lpdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx(hmprconfig: Long, hrouterinterface: Long, pcustominfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo(hmprconfig: Long, hrouterinterface: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd(hmprconfig: Long, hrouterinterface: Long, dwtransportid: Int, lpwstransportname: Long, pinterfaceinfo: Long, dwinterfaceinfosize: Int, phrouteriftransport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum(hmprconfig: Long, hrouterinterface: Long, dwlevel: Int, lplpbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle(hmprconfig: Long, hrouterinterface: Long, dwtransportid: Int, phrouteriftransport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo(hmprconfig: Long, hrouterinterface: Long, hrouteriftransport: Long, ppinterfaceinfo: Long, lpdwinterfaceinfosize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove(hmprconfig: Long, hrouterinterface: Long, hrouteriftransport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo(hmprconfig: Long, hrouterinterface: Long, hrouteriftransport: Long, pinterfaceinfo: Long, dwinterfaceinfosize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup(hmprconfig: Long, lpwspath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect(lpwsservername: Long, phmprconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect(hmprconfig: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo(hmprconfig: Long, dwlevel: Int, lplpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx(hmprconfig: Long, pserverinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall(dwlevel: Int, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh(hmprconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore(hmprconfig: Long, lpwspath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo(hmprserver: Long, dwlevel: Int, lpbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx(hmprconfig: Long, psetserverconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate(hmprconfig: Long, dwtransportid: Int, lpwstransportname: Long, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int, lpwsdllpath: Long, phroutertransport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete(hmprconfig: Long, hroutertransport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum(hmprconfig: Long, dwlevel: Int, lplpbuffer: Long, dwprefmaxlen: Int, lpdwentriesread: Long, lpdwtotalentries: Long, lpdwresumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle(hmprconfig: Long, dwtransportid: Int, phroutertransport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo(hmprconfig: Long, hroutertransport: Long, ppglobalinfo: Long, lpdwglobalinfosize: Long, ppclientinterfaceinfo: Long, lpdwclientinterfaceinfosize: Long, lplpwsdllpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo(hmprconfig: Long, hroutertransport: Long, pglobalinfo: Long, dwglobalinfosize: Int, pclientinterfaceinfo: Long, dwclientinterfaceinfosize: Int, lpwsdllpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd(lpheader: Long, dwinfotype: Int, dwitemsize: Int, dwitemcount: Int, lpitemdata: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind(lpheader: Long, dwinfotype: Int, lpdwitemsize: Long, lpdwitemcount: Long, lplpitemdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize(lpheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove(lpheader: Long, dwinfotype: Int, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet(lpheader: Long, dwinfotype: Int, dwitemsize: Int, dwitemcount: Int, lpitemdata: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprInfoCreate(dwversion: Int, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprInfoDelete(lpheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate(lpheader: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll(lpheader: Long, lplpnewheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics(hrasconn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics(hrasconn: Long, dwsubentry: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA(pszphonebook: Long, pszentry: Long, dwsubentryid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW(pszphonebook: Long, pszentry: Long, dwsubentryid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasDialA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasDialDlgA(lpszphonebook: Long, lpszentry: Long, lpszphonenumber: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasDialDlgW(lpszphonebook: Long, lpszentry: Long, lpszphonenumber: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasDialW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW(lpprasautodialaddresses: Long, lpdwcbrasautodialaddresses: Long, lpdwcrasautodialaddresses: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA(praseapuseridentity: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW(praseapuseridentity: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA(param0: Int, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW(param0: Int, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA(param0: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW(param0: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics(hrasconn: Long, lpstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, pdwsizeofcustomauthdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, pdwsizeofeapdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, pdwsizeofeapdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA(pszphonebook: Long, pszentry: Long, dwflags: Int, hwnd: Long, ppraseapuseridentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW(pszphonebook: Long, pszentry: Long, dwflags: Int, hwnd: Long, ppraseapuseridentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA(resourceid: Int, lpszstring: Long, inbufsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW(resourceid: Int, lpszstring: Long, inbufsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics(hrasconn: Long, dwsubentry: Int, lpstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetPCscf(lpszpcscf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx(hrasconn: Long, prasprojection: Long, lpdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA(param0: Long, param1: Long, param2: Int, param3: Long, param4: Long, param5: Long, param6: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW(param0: Long, param1: Long, param2: Int, param3: Long, param4: Long, param5: Long, param6: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasHangUpA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasHangUpW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI(param0: Long, param1: Int, param2: Long, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW(lpszphonebook: Long, lpszentry: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW(param0: Long, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA(param0: Long, param1: Int, param2: Long, param3: Int, param4: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW(param0: Long, param1: Int, param2: Long, param3: Int, param4: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA(param0: Int, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW(param0: Int, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA(param0: Int, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW(param0: Int, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA(param0: Long, param1: Long, param2: Long, param3: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW(param0: Long, param1: Long, param2: Long, param3: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, dwsizeofcustomauthdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW(pszphonebook: Long, pszentry: Long, pbcustomauthdata: Long, dwsizeofcustomauthdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, dwsizeofeapdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW(htoken: Long, pszphonebook: Long, pszentry: Long, pbeapdata: Long, dwsizeofeapdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW(param0: Long, param1: Long, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long, param5: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA(param0: Long, param1: Long, param2: Int, param3: Long, param4: Int, param5: Long, param6: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW(param0: Long, param1: Long, param2: Int, param3: Long, param4: Int, param5: Long, param6: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection(hrasconn: Long, lprasupdateconn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW(param0: Long, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, changeflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest(rtmreghandle: Long, routehandle: Long, destaddress: Long, routeinfo: Long, timetolive: Int, routelisthandle: Long, notifytype: Int, notifyhandle: Long, changeflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods(rtmreghandle: Long, targethandle: Long, targettype: Byte, blockingflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: Long, paddress: Long, plength: Long, dwaddresssize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum(rtmreghandle: Long, targetviews: Int, enumflags: Int, netaddress: Long, protocolid: Int, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum(rtmreghandle: Long, enumflags: Int, netaddress: Long, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: Int, enumflags: Int, startdest: Long, matchingflags: Int, criteriaroute: Long, criteriainterface: Int, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList(rtmreghandle: Long, routelisthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity(rtmreghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop(rtmreghandle: Long, nexthopinfo: Long, nexthophandle: Long, nexthoppointer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Long, changeddests: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: Long, exptmethods: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: Long, destinfos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: Long, nexthophandles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination(rtmreghandle: Long, destaddress: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute(rtmreghandle: Long, destaddress: Long, matchingflags: Int, routeinfo: Long, interfaceindex: Int, targetviews: Int, routehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: Long, routehandles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: Long, protocolid: Int, targetviews: Int, destinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities(rtmreghandle: Long, numentities: Long, entityhandles: Long, entityinfos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: Long, destaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: Int, holdtime: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Int, changeddests: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: Int, routehandles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: Long, outputsize: Long, output: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Int, lockdest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Int, locknexthop: Int, nexthoppointer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Int, lockroute: Int, routepointer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles(rtmreghandle: Long, numhandles: Int, rtmhandles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity(rtmentityinfo: Long, exportmethods: Long, eventcallback: Long, reserveopaquepointer: Int, rtmregprofile: Long, rtmreghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: Int, notifyflags: Int, notifycontext: Long, notifyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: Int, changeddests: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo(rtmreghandle: Long, destinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests(rtmreghandle: Long, numdests: Int, destinfos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities(rtmreghandle: Long, numentities: Int, entityhandles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops(rtmreghandle: Long, numnexthops: Int, nexthophandles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes(rtmreghandle: Long, numroutes: Int, routehandles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: Int, routelisthandle: Long, notifytype: Int, notifyhandle: Long, changeflags: Long): Int
}

public actual fun mgmAddGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry(hprotocol.rawAddress, dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()).toUInt()

public actual fun mgmDeRegisterMProtocol(hprotocol: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol(hprotocol.rawAddress).toUInt()

public actual fun mgmDeleteGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry(hprotocol.rawAddress, dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()).toUInt()

public actual fun mgmGetFirstMfe(pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe(pdwbuffersize.rawAddress, pbbuffer.rawAddress, pdwnumentries.rawAddress).toUInt()

public actual fun mgmGetFirstMfeStats(pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats(pdwbuffersize.rawAddress, pbbuffer.rawAddress, pdwnumentries.rawAddress, dwflags.toInt()).toUInt()

public actual fun mgmGetMfe(pimm: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmGetMfe(pimm.rawAddress, pdwbuffersize.rawAddress, pbbuffer.rawAddress).toUInt()

public actual fun mgmGetMfeStats(pimm: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats(pimm.rawAddress, pdwbuffersize.rawAddress, pbbuffer.rawAddress, dwflags.toInt()).toUInt()

public actual fun mgmGetNextMfe(pimmstart: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe(pimmstart.rawAddress, pdwbuffersize.rawAddress, pbbuffer.rawAddress, pdwnumentries.rawAddress).toUInt()

public actual fun mgmGetNextMfeStats(pimmstart: MutPtr<MibIpmcastMfe>, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats(pimmstart.rawAddress, pdwbuffersize.rawAddress, pbbuffer.rawAddress, pdwnumentries.rawAddress, dwflags.toInt()).toUInt()

public actual fun mgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: MutPtr<UInt>, pdwifcomponentid: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface(dwifindex.toInt(), dwifnexthopaddr.toInt(), pdwifprotocolid.rawAddress, pdwifcomponentid.rawAddress).toUInt()

public actual fun mgmGroupEnumerationEnd(henum: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd(henum.rawAddress).toUInt()

public actual fun mgmGroupEnumerationGetNext(henum: Handle, pdwbuffersize: MutPtr<UInt>, pbbuffer: MutPtr<UByte>, pdwnumentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext(henum.rawAddress, pdwbuffersize.rawAddress, pbbuffer.rawAddress, pdwnumentries.rawAddress).toUInt()

public actual fun mgmGroupEnumerationStart(hprotocol: Handle, metenumtype: MgmEnumTypes, phenumhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart(hprotocol.rawAddress, metenumtype, phenumhandle.rawAddress).toUInt()

public actual fun mgmRegisterMProtocol(prpiinfo: MutPtr<RoutingProtocolConfig>, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol(prpiinfo.rawAddress, dwprotocolid.toInt(), dwcomponentid.toInt(), phprotocol.rawAddress).toUInt()

public actual fun mgmReleaseInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership(hprotocol.rawAddress, dwifindex.toInt(), dwifnexthopaddr.toInt()).toUInt()

public actual fun mgmTakeInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership(hprotocol.rawAddress, dwifindex.toInt(), dwifnexthopaddr.toInt()).toUInt()

public actual fun mprAdminBufferFree(pbuffer: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree(pbuffer.rawAddress).toUInt()

public actual fun mprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats(hrasserver, hrasconnection.rawAddress).toUInt()

public actual fun mprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: ConstPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum(hrasserver, dwlevel.toInt(), lplpbbuffer.rawAddress, dwprefmaxlen.toInt(), lpdwentriesread.rawAddress, lpdwtotalentries.rawAddress, lpdwresumehandle.rawAddress).toUInt()

public actual fun mprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: ConstPtr<MprapiObjectHeader>, dwpreferedmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, pprasconn: MutPtr<MutPtr<RasConnectionEx>>, lpdwresumehandle: ConstPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx(hrasserver, pobjectheader.rawAddress, dwpreferedmaxlen.toInt(), lpdwentriesread.rawAddress, lpdwtotalentries.rawAddress, pprasconn.rawAddress, lpdwresumehandle.rawAddress).toUInt()

public actual fun mprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo(hrasserver, dwlevel.toInt(), hrasconnection.rawAddress, lplpbbuffer.rawAddress).toUInt()

public actual fun mprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Handle, prasconnection: MutPtr<RasConnectionEx>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx(hrasserver, hrasconnection.rawAddress, prasconnection.rawAddress).toUInt()

public actual fun mprAdminConnectionRemoveQuarantine(hrasserver: Handle, hrasconnection: Handle, fisipaddress: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine(hrasserver.rawAddress, hrasconnection.rawAddress, fisipaddress).toUInt()

public actual fun mprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification(hmprserver, heventnotification.rawAddress).toUInt()

public actual fun mprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>, lpdwtotalentries: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum(hmprserver, dwlevel.toInt(), lplpbbuffer.rawAddress, lpdwtotalentries.rawAddress).toUInt()

public actual fun mprAdminEstablishDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, benable: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer(pszdomain.rawAddress, pszmachine.rawAddress, benable).toUInt()

public actual fun mprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: MutPtr<Pwstr>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString(dwerror.toInt(), lplpwserrorstring.rawAddress).toUInt()

public actual fun mprAdminGetPDCServer(lpszdomain: Pcwstr, lpszserver: Pcwstr, lpszpdcserver: Pwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer(lpszdomain.rawAddress, lpszserver.rawAddress, lpszpdcserver.rawAddress).toUInt()

public actual fun mprAdminInterfaceConnect(hmprserver: Long, hinterface: Handle, hevent: Handle, fsynchronous: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect(hmprserver, hinterface.rawAddress, hevent.rawAddress, fsynchronous).toUInt()

public actual fun mprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>, phinterface: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate(hmprserver, dwlevel.toInt(), lpbbuffer.rawAddress, phinterface.rawAddress).toUInt()

public actual fun mprAdminInterfaceDelete(hmprserver: Long, hinterface: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete(hmprserver, hinterface.rawAddress).toUInt()

public actual fun mprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo(hmprserver, hinterface.rawAddress, dwindex.toInt(), dwlevel.toInt(), lplpbuffer.rawAddress).toUInt()

public actual fun mprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo(hmprserver, hinterface.rawAddress, dwindex.toInt(), dwlevel.toInt(), lpbbuffer.rawAddress).toUInt()

public actual fun mprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect(hmprserver, hinterface.rawAddress).toUInt()

public actual fun mprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: ConstPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum(hmprserver, dwlevel.toInt(), lplpbbuffer.rawAddress, dwprefmaxlen.toInt(), lpdwentriesread.rawAddress, lpdwtotalentries.rawAddress, lpdwresumehandle.rawAddress).toUInt()

public actual fun mprAdminInterfaceGetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pwstr, lpwspassword: Pwstr, lpwsdomainname: Pwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials(lpwsserver.rawAddress, lpwsinterfacename.rawAddress, lpwsusername.rawAddress, lpwspassword.rawAddress, lpwsdomainname.rawAddress).toUInt()

public actual fun mprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx(hmprserver, hinterface.rawAddress, dwlevel.toInt(), lplpbbuffer.rawAddress).toUInt()

public actual fun mprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: MutPtr<MprIfCustominfoex2>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx(hmprserver, hinterface.rawAddress, pcustominfo.rawAddress).toUInt()

public actual fun mprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Pcwstr, phinterface: MutPtr<Handle>, fincludeclientinterfaces: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle(hmprserver, lpwsinterfacename.rawAddress, phinterface.rawAddress, fincludeclientinterfaces).toUInt()

public actual fun mprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: ConstPtr<ConstPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo(hmprserver, hinterface.rawAddress, dwlevel.toInt(), lplpbbuffer.rawAddress).toUInt()

public actual fun mprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, lpdwupdateresult: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult(hmprserver, hinterface.rawAddress, dwprotocolid.toInt(), lpdwupdateresult.rawAddress).toUInt()

public actual fun mprAdminInterfaceSetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pcwstr, lpwsdomainname: Pcwstr, lpwspassword: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials(lpwsserver.rawAddress, lpwsinterfacename.rawAddress, lpwsusername.rawAddress, lpwsdomainname.rawAddress, lpwspassword.rawAddress).toUInt()

public actual fun mprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx(hmprserver, hinterface.rawAddress, dwlevel.toInt(), lpbbuffer.rawAddress).toUInt()

public actual fun mprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: ConstPtr<MprIfCustominfoex2>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx(hmprserver, hinterface.rawAddress, pcustominfo.rawAddress).toUInt()

public actual fun mprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo(hmprserver, hinterface.rawAddress, dwlevel.toInt(), lpbbuffer.rawAddress).toUInt()

public actual fun mprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd(hmprserver, hinterface.rawAddress, dwtransportid.toInt(), pinterfaceinfo.rawAddress, dwinterfaceinfosize.toInt()).toUInt()

public actual fun mprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, ppinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwinterfaceinfosize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo(hmprserver, hinterface.rawAddress, dwtransportid.toInt(), ppinterfaceinfo.rawAddress, lpdwinterfaceinfosize.rawAddress).toUInt()

public actual fun mprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Handle, dwtransportid: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove(hmprserver, hinterface.rawAddress, dwtransportid.toInt()).toUInt()

public actual fun mprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo(hmprserver, hinterface.rawAddress, dwtransportid.toInt(), pinterfaceinfo.rawAddress, dwinterfaceinfosize.toInt()).toUInt()

public actual fun mprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo(hmprserver, hinterface.rawAddress).toUInt()

public actual fun mprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, hevent: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes(hmprserver, hinterface.rawAddress, dwprotocolid.toInt(), hevent.rawAddress).toUInt()

public actual fun mprAdminIsDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, pbisrasserver: MutPtr<Bool>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer(pszdomain.rawAddress, pszmachine.rawAddress, pbisrasserver.rawAddress).toUInt()

public actual fun mprAdminIsServiceInitialized(lpwsservername: Pcwstr, fisserviceinitialized: ConstPtr<Bool>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized(lpwsservername.rawAddress, fisserviceinitialized.rawAddress).toUInt()

public actual fun mprAdminIsServiceRunning(lpwsservername: Pcwstr): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning(lpwsservername.rawAddress)

public actual fun mprAdminMIBBufferFree(pbuffer: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree(pbuffer.rawAddress).toUInt()

public actual fun mprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: ConstPtr<CVoid>, dwentrysize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate(hmibserver, dwpid.toInt(), dwroutingpid.toInt(), lpentry.rawAddress, dwentrysize.toInt()).toUInt()

public actual fun mprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: ConstPtr<CVoid>, dwentrysize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), lpentry.rawAddress, dwentrysize.toInt()).toUInt()

public actual fun mprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr<CVoid>, dwinentrysize: UInt, lplpoutentry: MutPtr<MutPtr<CVoid>>, lpoutentrysize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.rawAddress, dwinentrysize.toInt(), lplpoutentry.rawAddress, lpoutentrysize.rawAddress).toUInt()

public actual fun mprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr<CVoid>, dwinentrysize: UInt, lplpoutentry: MutPtr<MutPtr<CVoid>>, lpoutentrysize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.rawAddress, dwinentrysize.toInt(), lplpoutentry.rawAddress, lpoutentrysize.rawAddress).toUInt()

public actual fun mprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr<CVoid>, dwinentrysize: UInt, lplpoutentry: MutPtr<MutPtr<CVoid>>, lpoutentrysize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.rawAddress, dwinentrysize.toInt(), lplpoutentry.rawAddress, lpoutentrysize.rawAddress).toUInt()

public actual fun mprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: ConstPtr<CVoid>, dwentrysize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet(hmibserver, dwprotocolid.toInt(), dwroutingpid.toInt(), lpentry.rawAddress, dwentrysize.toInt()).toUInt()

public actual fun mprAdminMIBServerConnect(lpwsservername: Pcwstr, phmibserver: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect(lpwsservername.rawAddress, phmibserver.rawAddress).toUInt()

public actual fun mprAdminMIBServerDisconnect(hmibserver: Long) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect(hmibserver)
}

public actual fun mprAdminPortClearStats(hrasserver: Long, hport: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats(hrasserver, hport.rawAddress).toUInt()

public actual fun mprAdminPortDisconnect(hrasserver: Long, hport: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect(hrasserver, hport.rawAddress).toUInt()

public actual fun mprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: ConstPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum(hrasserver, dwlevel.toInt(), hrasconnection.rawAddress, lplpbbuffer.rawAddress, dwprefmaxlen.toInt(), lpdwentriesread.rawAddress, lpdwtotalentries.rawAddress, lpdwresumehandle.rawAddress).toUInt()

public actual fun mprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: Handle, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo(hrasserver, dwlevel.toInt(), hport.rawAddress, lplpbbuffer.rawAddress).toUInt()

public actual fun mprAdminPortReset(hrasserver: Long, hport: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset(hrasserver, hport.rawAddress).toUInt()

public actual fun mprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification(hmprserver, heventnotification.rawAddress).toUInt()

public actual fun mprAdminSendUserMessage(hmprserver: Long, hconnection: Handle, lpwszmessage: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage(hmprserver, hconnection.rawAddress, lpwszmessage.rawAddress).toUInt()

public actual fun mprAdminServerConnect(lpwsservername: Pcwstr, phmprserver: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect(lpwsservername.rawAddress, phmprserver.rawAddress).toUInt()

public actual fun mprAdminServerDisconnect(hmprserver: Long) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect(hmprserver)
}

public actual fun mprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: ConstPtr<ConstPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials(hmprserver, dwlevel.toInt(), lplpbbuffer.rawAddress).toUInt()

public actual fun mprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo(hmprserver, dwlevel.toInt(), lplpbbuffer.rawAddress).toUInt()

public actual fun mprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: MutPtr<MprServerEx1>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx(hmprserver, pserverinfo.rawAddress).toUInt()

public actual fun mprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials(hmprserver, dwlevel.toInt(), lpbbuffer.rawAddress).toUInt()

public actual fun mprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo(hmprserver, dwlevel.toInt(), lpbbuffer.rawAddress).toUInt()

public actual fun mprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: ConstPtr<MprServerSetConfigEx1>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx(hmprserver, pserverinfo.rawAddress).toUInt()

public actual fun mprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate(hmprserver, dwtransportid.toInt(), lpwstransportname.rawAddress, pglobalinfo.rawAddress, dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress, dwclientinterfaceinfosize.toInt(), lpwsdllpath.rawAddress).toUInt()

public actual fun mprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: MutPtr<MutPtr<UByte>>, lpdwglobalinfosize: MutPtr<UInt>, ppclientinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwclientinterfaceinfosize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo(hmprserver, dwtransportid.toInt(), ppglobalinfo.rawAddress, lpdwglobalinfosize.rawAddress, ppclientinterfaceinfo.rawAddress, lpdwclientinterfaceinfosize.rawAddress).toUInt()

public actual fun mprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo(hmprserver, dwtransportid.toInt(), pglobalinfo.rawAddress, dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress, dwclientinterfaceinfosize.toInt()).toUInt()

public actual fun mprAdminUpdateConnection(hrasserver: Long, hrasconnection: Handle, prasupdateconnection: ConstPtr<RasUpdateConnection>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection(hrasserver, hrasconnection.rawAddress, prasupdateconnection.rawAddress).toUInt()

public actual fun mprAdminUserGetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: MutPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo(lpszserver.rawAddress, lpszuser.rawAddress, dwlevel.toInt(), lpbbuffer.rawAddress).toUInt()

public actual fun mprAdminUserSetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo(lpszserver.rawAddress, lpszuser.rawAddress, dwlevel.toInt(), lpbbuffer.rawAddress).toUInt()

public actual fun mprConfigBufferFree(pbuffer: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree(pbuffer.rawAddress).toUInt()

public actual fun mprConfigFilterGetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: MutPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo(hmprconfig.rawAddress, dwlevel.toInt(), dwtransportid.toInt(), lpbuffer.rawAddress).toUInt()

public actual fun mprConfigFilterSetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo(hmprconfig.rawAddress, dwlevel.toInt(), dwtransportid.toInt(), lpbuffer.rawAddress).toUInt()

public actual fun mprConfigGetFriendlyName(hmprconfig: Handle, pszguidname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName(hmprconfig.rawAddress, pszguidname.rawAddress, pszbuffer.rawAddress, dwbuffersize.toInt()).toUInt()

public actual fun mprConfigGetGuidName(hmprconfig: Handle, pszfriendlyname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName(hmprconfig.rawAddress, pszfriendlyname.rawAddress, pszbuffer.rawAddress, dwbuffersize.toInt()).toUInt()

public actual fun mprConfigInterfaceCreate(hmprconfig: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>, phrouterinterface: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate(hmprconfig.rawAddress, dwlevel.toInt(), lpbbuffer.rawAddress, phrouterinterface.rawAddress).toUInt()

public actual fun mprConfigInterfaceDelete(hmprconfig: Handle, hrouterinterface: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete(hmprconfig.rawAddress, hrouterinterface.rawAddress).toUInt()

public actual fun mprConfigInterfaceEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum(hmprconfig.rawAddress, dwlevel.toInt(), lplpbuffer.rawAddress, dwprefmaxlen.toInt(), lpdwentriesread.rawAddress, lpdwtotalentries.rawAddress, lpdwresumehandle.rawAddress).toUInt()

public actual fun mprConfigInterfaceGetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: MutPtr<MprIfCustominfoex2>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx(hmprconfig.rawAddress, hrouterinterface.rawAddress, pcustominfo.rawAddress).toUInt()

public actual fun mprConfigInterfaceGetHandle(hmprconfig: Handle, lpwsinterfacename: Pcwstr, phrouterinterface: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle(hmprconfig.rawAddress, lpwsinterfacename.rawAddress, phrouterinterface.rawAddress).toUInt()

public actual fun mprConfigInterfaceGetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, lpdwbuffersize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo(hmprconfig.rawAddress, hrouterinterface.rawAddress, dwlevel.toInt(), lplpbuffer.rawAddress, lpdwbuffersize.rawAddress).toUInt()

public actual fun mprConfigInterfaceSetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: ConstPtr<MprIfCustominfoex2>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx(hmprconfig.rawAddress, hrouterinterface.rawAddress, pcustominfo.rawAddress).toUInt()

public actual fun mprConfigInterfaceSetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo(hmprconfig.rawAddress, hrouterinterface.rawAddress, dwlevel.toInt(), lpbbuffer.rawAddress).toUInt()

public actual fun mprConfigInterfaceTransportAdd(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt, phrouteriftransport: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd(hmprconfig.rawAddress, hrouterinterface.rawAddress, dwtransportid.toInt(), lpwstransportname.rawAddress, pinterfaceinfo.rawAddress, dwinterfaceinfosize.toInt(), phrouteriftransport.rawAddress).toUInt()

public actual fun mprConfigInterfaceTransportEnum(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum(hmprconfig.rawAddress, hrouterinterface.rawAddress, dwlevel.toInt(), lplpbuffer.rawAddress, dwprefmaxlen.toInt(), lpdwentriesread.rawAddress, lpdwtotalentries.rawAddress, lpdwresumehandle.rawAddress).toUInt()

public actual fun mprConfigInterfaceTransportGetHandle(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, phrouteriftransport: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle(hmprconfig.rawAddress, hrouterinterface.rawAddress, dwtransportid.toInt(), phrouteriftransport.rawAddress).toUInt()

public actual fun mprConfigInterfaceTransportGetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, ppinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwinterfaceinfosize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo(hmprconfig.rawAddress, hrouterinterface.rawAddress, hrouteriftransport.rawAddress, ppinterfaceinfo.rawAddress, lpdwinterfaceinfosize.rawAddress).toUInt()

public actual fun mprConfigInterfaceTransportRemove(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove(hmprconfig.rawAddress, hrouterinterface.rawAddress, hrouteriftransport.rawAddress).toUInt()

public actual fun mprConfigInterfaceTransportSetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, pinterfaceinfo: ConstPtr<UByte>, dwinterfaceinfosize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo(hmprconfig.rawAddress, hrouterinterface.rawAddress, hrouteriftransport.rawAddress, pinterfaceinfo.rawAddress, dwinterfaceinfosize.toInt()).toUInt()

public actual fun mprConfigServerBackup(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup(hmprconfig.rawAddress, lpwspath.rawAddress).toUInt()

public actual fun mprConfigServerConnect(lpwsservername: Pcwstr, phmprconfig: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect(lpwsservername.rawAddress, phmprconfig.rawAddress).toUInt()

public actual fun mprConfigServerDisconnect(hmprconfig: Handle) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect(hmprconfig.rawAddress)
}

public actual fun mprConfigServerGetInfo(hmprconfig: Handle, dwlevel: UInt, lplpbbuffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo(hmprconfig.rawAddress, dwlevel.toInt(), lplpbbuffer.rawAddress).toUInt()

public actual fun mprConfigServerGetInfoEx(hmprconfig: Handle, pserverinfo: MutPtr<MprServerEx1>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx(hmprconfig.rawAddress, pserverinfo.rawAddress).toUInt()

public actual fun mprConfigServerInstall(dwlevel: UInt, pbuffer: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall(dwlevel.toInt(), pbuffer.rawAddress).toUInt()

public actual fun mprConfigServerRefresh(hmprconfig: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh(hmprconfig.rawAddress).toUInt()

public actual fun mprConfigServerRestore(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore(hmprconfig.rawAddress, lpwspath.rawAddress).toUInt()

public actual fun mprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo(hmprserver, dwlevel.toInt(), lpbbuffer.rawAddress).toUInt()

public actual fun mprConfigServerSetInfoEx(hmprconfig: Handle, psetserverconfig: ConstPtr<MprServerSetConfigEx1>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx(hmprconfig.rawAddress, psetserverconfig.rawAddress).toUInt()

public actual fun mprConfigTransportCreate(hmprconfig: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr, phroutertransport: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate(hmprconfig.rawAddress, dwtransportid.toInt(), lpwstransportname.rawAddress, pglobalinfo.rawAddress, dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress, dwclientinterfaceinfosize.toInt(), lpwsdllpath.rawAddress, phroutertransport.rawAddress).toUInt()

public actual fun mprConfigTransportDelete(hmprconfig: Handle, hroutertransport: Handle): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete(hmprconfig.rawAddress, hroutertransport.rawAddress).toUInt()

public actual fun mprConfigTransportEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, dwprefmaxlen: UInt, lpdwentriesread: MutPtr<UInt>, lpdwtotalentries: MutPtr<UInt>, lpdwresumehandle: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum(hmprconfig.rawAddress, dwlevel.toInt(), lplpbuffer.rawAddress, dwprefmaxlen.toInt(), lpdwentriesread.rawAddress, lpdwtotalentries.rawAddress, lpdwresumehandle.rawAddress).toUInt()

public actual fun mprConfigTransportGetHandle(hmprconfig: Handle, dwtransportid: UInt, phroutertransport: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle(hmprconfig.rawAddress, dwtransportid.toInt(), phroutertransport.rawAddress).toUInt()

public actual fun mprConfigTransportGetInfo(hmprconfig: Handle, hroutertransport: Handle, ppglobalinfo: MutPtr<MutPtr<UByte>>, lpdwglobalinfosize: MutPtr<UInt>, ppclientinterfaceinfo: MutPtr<MutPtr<UByte>>, lpdwclientinterfaceinfosize: MutPtr<UInt>, lplpwsdllpath: MutPtr<Pwstr>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo(hmprconfig.rawAddress, hroutertransport.rawAddress, ppglobalinfo.rawAddress, lpdwglobalinfosize.rawAddress, ppclientinterfaceinfo.rawAddress, lpdwclientinterfaceinfosize.rawAddress, lplpwsdllpath.rawAddress).toUInt()

public actual fun mprConfigTransportSetInfo(hmprconfig: Handle, hroutertransport: Handle, pglobalinfo: ConstPtr<UByte>, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr<UByte>, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo(hmprconfig.rawAddress, hroutertransport.rawAddress, pglobalinfo.rawAddress, dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress, dwclientinterfaceinfosize.toInt(), lpwsdllpath.rawAddress).toUInt()

public actual fun mprInfoBlockAdd(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: ConstPtr<UByte>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd(lpheader.rawAddress, dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), lpitemdata.rawAddress, lplpnewheader.rawAddress).toUInt()

public actual fun mprInfoBlockFind(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, lpdwitemsize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, lplpitemdata: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind(lpheader.rawAddress, dwinfotype.toInt(), lpdwitemsize.rawAddress, lpdwitemcount.rawAddress, lplpitemdata.rawAddress).toUInt()

public actual fun mprInfoBlockQuerySize(lpheader: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize(lpheader.rawAddress).toUInt()

public actual fun mprInfoBlockRemove(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove(lpheader.rawAddress, dwinfotype.toInt(), lplpnewheader.rawAddress).toUInt()

public actual fun mprInfoBlockSet(lpheader: ConstPtr<CVoid>, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: ConstPtr<UByte>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet(lpheader.rawAddress, dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), lpitemdata.rawAddress, lplpnewheader.rawAddress).toUInt()

public actual fun mprInfoCreate(dwversion: UInt, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprInfoCreate(dwversion.toInt(), lplpnewheader.rawAddress).toUInt()

public actual fun mprInfoDelete(lpheader: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprInfoDelete(lpheader.rawAddress).toUInt()

public actual fun mprInfoDuplicate(lpheader: ConstPtr<CVoid>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate(lpheader.rawAddress, lplpnewheader.rawAddress).toUInt()

public actual fun mprInfoRemoveAll(lpheader: ConstPtr<CVoid>, lplpnewheader: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll(lpheader.rawAddress, lplpnewheader.rawAddress).toUInt()

public actual fun rasClearConnectionStatistics(hrasconn: Hrasconn): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics(hrasconn.rawAddress).toUInt()

public actual fun rasClearLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics(hrasconn.rawAddress, dwsubentry.toInt()).toUInt()

public actual fun rasConnectionNotificationA(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA(param0.rawAddress, param1.rawAddress, param2.toInt()).toUInt()

public actual fun rasConnectionNotificationW(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW(param0.rawAddress, param1.rawAddress, param2.toInt()).toUInt()

public actual fun rasCreatePhonebookEntryA(param0: Hwnd, param1: Pcstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA(param0.rawAddress, param1.rawAddress).toUInt()

public actual fun rasCreatePhonebookEntryW(param0: Hwnd, param1: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW(param0.rawAddress, param1.rawAddress).toUInt()

public actual fun rasDeleteEntryA(param0: Pcstr, param1: Pcstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA(param0.rawAddress, param1.rawAddress).toUInt()

public actual fun rasDeleteEntryW(param0: Pcwstr, param1: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW(param0.rawAddress, param1.rawAddress).toUInt()

public actual fun rasDeleteSubEntryA(pszphonebook: Pcstr, pszentry: Pcstr, dwsubentryid: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA(pszphonebook.rawAddress, pszentry.rawAddress, dwsubentryid.toInt()).toUInt()

public actual fun rasDeleteSubEntryW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwsubentryid: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW(pszphonebook.rawAddress, pszentry.rawAddress, dwsubentryid.toInt()).toUInt()

public actual fun rasDialA(param0: ConstPtr<Rasdialextensions>, param1: Pcstr, param2: ConstPtr<Rasdialparamsa>, param3: UInt, param4: ConstPtr<CVoid>, param5: MutPtr<Hrasconn>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasDialA(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.toInt(), param4.rawAddress, param5.rawAddress).toUInt()

public actual fun rasDialDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpszphonenumber: Pcstr, lpinfo: MutPtr<Rasdialdlg>): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasDialDlgA(lpszphonebook.rawAddress, lpszentry.rawAddress, lpszphonenumber.rawAddress, lpinfo.rawAddress)

public actual fun rasDialDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpszphonenumber: Pcwstr, lpinfo: MutPtr<Rasdialdlg>): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasDialDlgW(lpszphonebook.rawAddress, lpszentry.rawAddress, lpszphonenumber.rawAddress, lpinfo.rawAddress)

public actual fun rasDialW(param0: ConstPtr<Rasdialextensions>, param1: Pcwstr, param2: ConstPtr<Rasdialparamsw>, param3: UInt, param4: ConstPtr<CVoid>, param5: MutPtr<Hrasconn>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasDialW(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.toInt(), param4.rawAddress, param5.rawAddress).toUInt()

public actual fun rasEditPhonebookEntryA(param0: Hwnd, param1: Pcstr, param2: Pcstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasEditPhonebookEntryW(param0: Hwnd, param1: Pcwstr, param2: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasEntryDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: MutPtr<Rasentrydlga>): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA(lpszphonebook.rawAddress, lpszentry.rawAddress, lpinfo.rawAddress)

public actual fun rasEntryDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: MutPtr<Rasentrydlgw>): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW(lpszphonebook.rawAddress, lpszentry.rawAddress, lpinfo.rawAddress)

public actual fun rasEnumAutodialAddressesA(lpprasautodialaddresses: MutPtr<Pstr>, lpdwcbrasautodialaddresses: MutPtr<UInt>, lpdwcrasautodialaddresses: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA(lpprasautodialaddresses.rawAddress, lpdwcbrasautodialaddresses.rawAddress, lpdwcrasautodialaddresses.rawAddress).toUInt()

public actual fun rasEnumAutodialAddressesW(lpprasautodialaddresses: MutPtr<Pwstr>, lpdwcbrasautodialaddresses: MutPtr<UInt>, lpdwcrasautodialaddresses: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW(lpprasautodialaddresses.rawAddress, lpdwcbrasautodialaddresses.rawAddress, lpdwcrasautodialaddresses.rawAddress).toUInt()

public actual fun rasEnumConnectionsA(param0: MutPtr<Rasconna>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasEnumConnectionsW(param0: MutPtr<Rasconnw>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasEnumDevicesA(param0: MutPtr<Rasdevinfoa>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasEnumDevicesW(param0: MutPtr<Rasdevinfow>, param1: MutPtr<UInt>, param2: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasEnumEntriesA(param0: Pcstr, param1: Pcstr, param2: MutPtr<Rasentrynamea>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.rawAddress, param4.rawAddress).toUInt()

public actual fun rasEnumEntriesW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr<Rasentrynamew>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.rawAddress, param4.rawAddress).toUInt()

public actual fun rasFreeEapUserIdentityA(praseapuseridentity: ConstPtr<Raseapuseridentitya>) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA(praseapuseridentity.rawAddress)
}

public actual fun rasFreeEapUserIdentityW(praseapuseridentity: ConstPtr<Raseapuseridentityw>) {
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW(praseapuseridentity.rawAddress)
}

public actual fun rasGetAutodialAddressA(param0: Pcstr, param1: ConstPtr<UInt>, param2: MutPtr<Rasautodialentrya>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.rawAddress, param4.rawAddress).toUInt()

public actual fun rasGetAutodialAddressW(param0: Pcwstr, param1: ConstPtr<UInt>, param2: MutPtr<Rasautodialentryw>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.rawAddress, param4.rawAddress).toUInt()

public actual fun rasGetAutodialEnableA(param0: UInt, param1: MutPtr<Bool>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA(param0.toInt(), param1.rawAddress).toUInt()

public actual fun rasGetAutodialEnableW(param0: UInt, param1: MutPtr<Bool>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW(param0.toInt(), param1.rawAddress).toUInt()

public actual fun rasGetAutodialParamA(param0: UInt, param1: MutPtr<CVoid>, param2: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA(param0.toInt(), param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasGetAutodialParamW(param0: UInt, param1: MutPtr<CVoid>, param2: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW(param0.toInt(), param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasGetConnectStatusA(param0: Hrasconn, param1: MutPtr<Rasconnstatusa>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA(param0.rawAddress, param1.rawAddress).toUInt()

public actual fun rasGetConnectStatusW(param0: Hrasconn, param1: MutPtr<Rasconnstatusw>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW(param0.rawAddress, param1.rawAddress).toUInt()

public actual fun rasGetConnectionStatistics(hrasconn: Hrasconn, lpstatistics: MutPtr<RasStats>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics(hrasconn.rawAddress, lpstatistics.rawAddress).toUInt()

public actual fun rasGetCountryInfoA(param0: MutPtr<Rasctryinfo>, param1: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA(param0.rawAddress, param1.rawAddress).toUInt()

public actual fun rasGetCountryInfoW(param0: MutPtr<Rasctryinfo>, param1: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW(param0.rawAddress, param1.rawAddress).toUInt()

public actual fun rasGetCredentialsA(param0: Pcstr, param1: Pcstr, param2: MutPtr<Rascredentialsa>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasGetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr<Rascredentialsw>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasGetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: MutPtr<UByte>, pdwsizeofcustomauthdata: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA(pszphonebook.rawAddress, pszentry.rawAddress, pbcustomauthdata.rawAddress, pdwsizeofcustomauthdata.rawAddress).toUInt()

public actual fun rasGetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: MutPtr<UByte>, pdwsizeofcustomauthdata: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW(pszphonebook.rawAddress, pszentry.rawAddress, pbcustomauthdata.rawAddress, pdwsizeofcustomauthdata.rawAddress).toUInt()

public actual fun rasGetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: MutPtr<UByte>, pdwsizeofeapdata: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA(htoken.rawAddress, pszphonebook.rawAddress, pszentry.rawAddress, pbeapdata.rawAddress, pdwsizeofeapdata.rawAddress).toUInt()

public actual fun rasGetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: MutPtr<UByte>, pdwsizeofeapdata: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW(htoken.rawAddress, pszphonebook.rawAddress, pszentry.rawAddress, pbeapdata.rawAddress, pdwsizeofeapdata.rawAddress).toUInt()

public actual fun rasGetEapUserIdentityA(pszphonebook: Pcstr, pszentry: Pcstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: MutPtr<MutPtr<Raseapuseridentitya>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA(pszphonebook.rawAddress, pszentry.rawAddress, dwflags.toInt(), hwnd.rawAddress, ppraseapuseridentity.rawAddress).toUInt()

public actual fun rasGetEapUserIdentityW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: MutPtr<MutPtr<Raseapuseridentityw>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW(pszphonebook.rawAddress, pszentry.rawAddress, dwflags.toInt(), hwnd.rawAddress, ppraseapuseridentity.rawAddress).toUInt()

public actual fun rasGetEntryDialParamsA(param0: Pcstr, param1: MutPtr<Rasdialparamsa>, param2: MutPtr<Bool>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasGetEntryDialParamsW(param0: Pcwstr, param1: MutPtr<Rasdialparamsw>, param2: MutPtr<Bool>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasGetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: MutPtr<Rasentrya>, param3: MutPtr<UInt>, param4: MutPtr<UByte>, param5: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.rawAddress, param4.rawAddress, param5.rawAddress).toUInt()

public actual fun rasGetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr<Rasentryw>, param3: MutPtr<UInt>, param4: MutPtr<UByte>, param5: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.rawAddress, param4.rawAddress, param5.rawAddress).toUInt()

public actual fun rasGetErrorStringA(resourceid: UInt, lpszstring: Pstr, inbufsize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA(resourceid.toInt(), lpszstring.rawAddress, inbufsize.toInt()).toUInt()

public actual fun rasGetErrorStringW(resourceid: UInt, lpszstring: Pwstr, inbufsize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW(resourceid.toInt(), lpszstring.rawAddress, inbufsize.toInt()).toUInt()

public actual fun rasGetLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt, lpstatistics: MutPtr<RasStats>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics(hrasconn.rawAddress, dwsubentry.toInt(), lpstatistics.rawAddress).toUInt()

public actual fun rasGetPCscf(lpszpcscf: Pwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetPCscf(lpszpcscf.rawAddress).toUInt()

public actual fun rasGetProjectionInfoA(param0: Hrasconn, param1: Rasprojection, param2: MutPtr<CVoid>, param3: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA(param0.rawAddress, param1, param2.rawAddress, param3.rawAddress).toUInt()

public actual fun rasGetProjectionInfoEx(hrasconn: Hrasconn, prasprojection: MutPtr<RasProjectionInfo>, lpdwsize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx(hrasconn.rawAddress, prasprojection.rawAddress, lpdwsize.rawAddress).toUInt()

public actual fun rasGetProjectionInfoW(param0: Hrasconn, param1: Rasprojection, param2: MutPtr<CVoid>, param3: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW(param0.rawAddress, param1, param2.rawAddress, param3.rawAddress).toUInt()

public actual fun rasGetSubEntryHandleA(param0: Hrasconn, param1: UInt, param2: MutPtr<Hrasconn>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun rasGetSubEntryHandleW(param0: Hrasconn, param1: UInt, param2: MutPtr<Hrasconn>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun rasGetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: MutPtr<Rassubentrya>, param4: MutPtr<UInt>, param5: MutPtr<UByte>, param6: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress, param4.rawAddress, param5.rawAddress, param6.rawAddress).toUInt()

public actual fun rasGetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: MutPtr<Rassubentryw>, param4: MutPtr<UInt>, param5: MutPtr<UByte>, param6: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress, param4.rawAddress, param5.rawAddress, param6.rawAddress).toUInt()

public actual fun rasHangUpA(param0: Hrasconn): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasHangUpA(param0.rawAddress).toUInt()

public actual fun rasHangUpW(param0: Hrasconn): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasHangUpW(param0.rawAddress).toUInt()

public actual fun rasInvokeEapUI(param0: Hrasconn, param1: UInt, param2: ConstPtr<Rasdialextensions>, param3: Hwnd): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI(param0.rawAddress, param1.toInt(), param2.rawAddress, param3.rawAddress).toUInt()

public actual fun rasPhonebookDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: MutPtr<Raspbdlga>): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA(lpszphonebook.rawAddress, lpszentry.rawAddress, lpinfo.rawAddress)

public actual fun rasPhonebookDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: MutPtr<Raspbdlgw>): Bool =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW(lpszphonebook.rawAddress, lpszentry.rawAddress, lpinfo.rawAddress)

public actual fun rasRenameEntryA(param0: Pcstr, param1: Pcstr, param2: Pcstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasRenameEntryW(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW(param0.rawAddress, param1.rawAddress, param2.rawAddress).toUInt()

public actual fun rasSetAutodialAddressA(param0: Pcstr, param1: UInt, param2: ConstPtr<Rasautodialentrya>, param3: UInt, param4: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA(param0.rawAddress, param1.toInt(), param2.rawAddress, param3.toInt(), param4.toInt()).toUInt()

public actual fun rasSetAutodialAddressW(param0: Pcwstr, param1: UInt, param2: ConstPtr<Rasautodialentryw>, param3: UInt, param4: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW(param0.rawAddress, param1.toInt(), param2.rawAddress, param3.toInt(), param4.toInt()).toUInt()

public actual fun rasSetAutodialEnableA(param0: UInt, param1: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA(param0.toInt(), param1).toUInt()

public actual fun rasSetAutodialEnableW(param0: UInt, param1: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW(param0.toInt(), param1).toUInt()

public actual fun rasSetAutodialParamA(param0: UInt, param1: ConstPtr<CVoid>, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA(param0.toInt(), param1.rawAddress, param2.toInt()).toUInt()

public actual fun rasSetAutodialParamW(param0: UInt, param1: ConstPtr<CVoid>, param2: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW(param0.toInt(), param1.rawAddress, param2.toInt()).toUInt()

public actual fun rasSetCredentialsA(param0: Pcstr, param1: Pcstr, param2: ConstPtr<Rascredentialsa>, param3: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3).toUInt()

public actual fun rasSetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: ConstPtr<Rascredentialsw>, param3: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3).toUInt()

public actual fun rasSetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: ConstPtr<UByte>, dwsizeofcustomauthdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA(pszphonebook.rawAddress, pszentry.rawAddress, pbcustomauthdata.rawAddress, dwsizeofcustomauthdata.toInt()).toUInt()

public actual fun rasSetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: ConstPtr<UByte>, dwsizeofcustomauthdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW(pszphonebook.rawAddress, pszentry.rawAddress, pbcustomauthdata.rawAddress, dwsizeofcustomauthdata.toInt()).toUInt()

public actual fun rasSetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: ConstPtr<UByte>, dwsizeofeapdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA(htoken.rawAddress, pszphonebook.rawAddress, pszentry.rawAddress, pbeapdata.rawAddress, dwsizeofeapdata.toInt()).toUInt()

public actual fun rasSetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: ConstPtr<UByte>, dwsizeofeapdata: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW(htoken.rawAddress, pszphonebook.rawAddress, pszentry.rawAddress, pbeapdata.rawAddress, dwsizeofeapdata.toInt()).toUInt()

public actual fun rasSetEntryDialParamsA(param0: Pcstr, param1: ConstPtr<Rasdialparamsa>, param2: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA(param0.rawAddress, param1.rawAddress, param2).toUInt()

public actual fun rasSetEntryDialParamsW(param0: Pcwstr, param1: ConstPtr<Rasdialparamsw>, param2: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW(param0.rawAddress, param1.rawAddress, param2).toUInt()

public actual fun rasSetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: ConstPtr<Rasentrya>, param3: UInt, param4: ConstPtr<UByte>, param5: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.toInt(), param4.rawAddress, param5.toInt()).toUInt()

public actual fun rasSetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: ConstPtr<Rasentryw>, param3: UInt, param4: ConstPtr<UByte>, param5: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.toInt(), param4.rawAddress, param5.toInt()).toUInt()

public actual fun rasSetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: ConstPtr<Rassubentrya>, param4: UInt, param5: ConstPtr<UByte>, param6: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress, param4.toInt(), param5.rawAddress, param6.toInt()).toUInt()

public actual fun rasSetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: ConstPtr<Rassubentryw>, param4: UInt, param5: ConstPtr<UByte>, param6: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress, param4.toInt(), param5.rawAddress, param6.toInt()).toUInt()

public actual fun rasUpdateConnection(hrasconn: Hrasconn, lprasupdateconn: ConstPtr<Rasupdateconn>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection(hrasconn.rawAddress, lprasupdateconn.rawAddress).toUInt()

public actual fun rasValidateEntryNameA(param0: Pcstr, param1: Pcstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA(param0.rawAddress, param1.rawAddress).toUInt()

public actual fun rasValidateEntryNameW(param0: Pcwstr, param1: Pcwstr): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW(param0.rawAddress, param1.rawAddress).toUInt()

public actual fun rtmAddNextHop(rtmreghandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>, nexthophandle: MutPtr<Long>, changeflags: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop(rtmreghandle, nexthopinfo.rawAddress, nexthophandle.rawAddress, changeflags.rawAddress).toUInt()

public actual fun rtmAddRouteToDest(rtmreghandle: Long, routehandle: MutPtr<Long>, destaddress: MutPtr<RtmNetAddress>, routeinfo: MutPtr<RtmRouteInfo>, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest(rtmreghandle, routehandle.rawAddress, destaddress.rawAddress, routeinfo.rawAddress, timetolive.toInt(), routelisthandle, notifytype.toInt(), notifyhandle, changeflags.rawAddress).toUInt()

public actual fun rtmBlockMethods(rtmreghandle: Long, targethandle: Handle, targettype: UByte, blockingflag: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods(rtmreghandle, targethandle.rawAddress, targettype.toByte(), blockingflag.toInt()).toUInt()

public actual fun rtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: MutPtr<RtmNetAddress>, address: In6Addr, dwlength: UInt, dwaddresssize: UInt): UInt =
    0u

public actual fun rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: MutPtr<RtmNetAddress>, paddress: MutPtr<In6Addr>, plength: MutPtr<UInt>, dwaddresssize: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength(pnetaddress.rawAddress, paddress.rawAddress, plength.rawAddress, dwaddresssize.toInt()).toUInt()

public actual fun rtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: MutPtr<RtmNetAddress>, protocolid: UInt, rtmenumhandle: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum(rtmreghandle, targetviews.toInt(), enumflags.toInt(), netaddress.rawAddress, protocolid.toInt(), rtmenumhandle.rawAddress).toUInt()

public actual fun rtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: MutPtr<RtmNetAddress>, rtmenumhandle: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum(rtmreghandle, enumflags.toInt(), netaddress.rawAddress, rtmenumhandle.rawAddress).toUInt()

public actual fun rtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: MutPtr<RtmNetAddress>, matchingflags: UInt, criteriaroute: MutPtr<RtmRouteInfo>, criteriainterface: UInt, rtmenumhandle: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum(rtmreghandle, desthandle, targetviews.toInt(), enumflags.toInt(), startdest.rawAddress, matchingflags.toInt(), criteriaroute.rawAddress, criteriainterface.toInt(), rtmenumhandle.rawAddress).toUInt()

public actual fun rtmCreateRouteList(rtmreghandle: Long, routelisthandle: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList(rtmreghandle, routelisthandle.rawAddress).toUInt()

public actual fun rtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum(rtmreghandle, routelisthandle, rtmenumhandle.rawAddress).toUInt()

public actual fun rtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle(rtmreghandle, enumhandle).toUInt()

public actual fun rtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop(rtmreghandle, nexthophandle, nexthopinfo.rawAddress).toUInt()

public actual fun rtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList(rtmreghandle, routelisthandle).toUInt()

public actual fun rtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest(rtmreghandle, routehandle, changeflags.rawAddress).toUInt()

public actual fun rtmDeregisterEntity(rtmreghandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity(rtmreghandle).toUInt()

public actual fun rtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification(rtmreghandle, notifyhandle).toUInt()

public actual fun rtmFindNextHop(rtmreghandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>, nexthophandle: MutPtr<Long>, nexthoppointer: MutPtr<MutPtr<RtmNexthopInfo>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop(rtmreghandle, nexthopinfo.rawAddress, nexthophandle.rawAddress, nexthoppointer.rawAddress).toUInt()

public actual fun rtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: MutPtr<Bool>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus(rtmreghandle, notifyhandle, desthandle, changestatus.rawAddress).toUInt()

public actual fun rtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: MutPtr<UInt>, changeddests: MutPtr<RtmDestInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests(rtmreghandle, notifyhandle, numdests.rawAddress, changeddests.rawAddress).toUInt()

public actual fun rtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo(rtmreghandle, desthandle, protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress).toUInt()

public actual fun rtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: MutPtr<RtmEntityInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo(rtmreghandle, entityhandle, entityinfo.rawAddress).toUInt()

public actual fun rtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: MutPtr<UInt>, exptmethods: MutPtr<RtmEntityExportMethod>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods(rtmreghandle, entityhandle, nummethods.rawAddress, exptmethods.rawAddress).toUInt()

public actual fun rtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: MutPtr<UInt>, destinfos: MutPtr<RtmDestInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests(rtmreghandle, enumhandle, numdests.rawAddress, destinfos.rawAddress).toUInt()

public actual fun rtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: MutPtr<UInt>, nexthophandles: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops(rtmreghandle, enumhandle, numnexthops.rawAddress, nexthophandles.rawAddress).toUInt()

public actual fun rtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: MutPtr<UInt>, routehandles: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes(rtmreghandle, enumhandle, numroutes.rawAddress, routehandles.rawAddress).toUInt()

public actual fun rtmGetExactMatchDestination(rtmreghandle: Long, destaddress: MutPtr<RtmNetAddress>, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination(rtmreghandle, destaddress.rawAddress, protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress).toUInt()

public actual fun rtmGetExactMatchRoute(rtmreghandle: Long, destaddress: MutPtr<RtmNetAddress>, matchingflags: UInt, routeinfo: MutPtr<RtmRouteInfo>, interfaceindex: UInt, targetviews: UInt, routehandle: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute(rtmreghandle, destaddress.rawAddress, matchingflags.toInt(), routeinfo.rawAddress, interfaceindex.toInt(), targetviews.toInt(), routehandle.rawAddress).toUInt()

public actual fun rtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination(rtmreghandle, desthandle, protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress).toUInt()

public actual fun rtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: MutPtr<UInt>, routehandles: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes(rtmreghandle, enumhandle, numroutes.rawAddress, routehandles.rawAddress).toUInt()

public actual fun rtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: MutPtr<RtmNetAddress>, protocolid: UInt, targetviews: UInt, destinfo: MutPtr<RtmDestInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination(rtmreghandle, destaddress.rawAddress, protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress).toUInt()

public actual fun rtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo(rtmreghandle, nexthophandle, nexthopinfo.rawAddress).toUInt()

public actual fun rtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: MutPtr<MutPtr<RtmNexthopInfo>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer(rtmreghandle, nexthophandle, nexthoppointer.rawAddress).toUInt()

public actual fun rtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer(rtmreghandle, desthandle, opaqueinfopointer.rawAddress).toUInt()

public actual fun rtmGetRegisteredEntities(rtmreghandle: Long, numentities: MutPtr<UInt>, entityhandles: MutPtr<Long>, entityinfos: MutPtr<RtmEntityInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities(rtmreghandle, numentities.rawAddress, entityhandles.rawAddress, entityinfos.rawAddress).toUInt()

public actual fun rtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: MutPtr<RtmRouteInfo>, destaddress: MutPtr<RtmNetAddress>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo(rtmreghandle, routehandle, routeinfo.rawAddress, destaddress.rawAddress).toUInt()

public actual fun rtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: MutPtr<MutPtr<RtmRouteInfo>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer(rtmreghandle, routehandle, routepointer.rawAddress).toUInt()

public actual fun rtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination(rtmreghandle, desthandle, targetviews.toInt(), holdtime.toInt()).toUInt()

public actual fun rtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests(rtmreghandle, notifyhandle, numdests.toInt(), changeddests.rawAddress).toUInt()

public actual fun rtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList(rtmreghandle, routelisthandle, numroutes.toInt(), routehandles.rawAddress).toUInt()

public actual fun rtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: MutPtr<RtmEntityMethodInput>, outputsize: MutPtr<UInt>, output: MutPtr<RtmEntityMethodOutput>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod(rtmreghandle, entityhandle, input.rawAddress, outputsize.rawAddress, output.rawAddress).toUInt()

public actual fun rtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute(rtmreghandle, routehandle, bestinviews.rawAddress).toUInt()

public actual fun rtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: MutPtr<Bool>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification(rtmreghandle, notifyhandle, desthandle, destmarked.rawAddress).toUInt()

public actual fun rtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Bool, lockdest: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmLockDestination(rtmreghandle, desthandle, exclusive, lockdest).toUInt()

public actual fun rtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Bool, locknexthop: Bool, nexthoppointer: MutPtr<MutPtr<RtmNexthopInfo>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop(rtmreghandle, nexthophandle, exclusive, locknexthop, nexthoppointer.rawAddress).toUInt()

public actual fun rtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Bool, lockroute: Bool, routepointer: MutPtr<MutPtr<RtmRouteInfo>>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmLockRoute(rtmreghandle, routehandle, exclusive, lockroute, routepointer.rawAddress).toUInt()

public actual fun rtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Bool): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification(rtmreghandle, notifyhandle, desthandle, markdest).toUInt()

public actual fun rtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles(rtmreghandle, numhandles.toInt(), rtmhandles.rawAddress).toUInt()

public actual fun rtmRegisterEntity(rtmentityinfo: MutPtr<RtmEntityInfo>, exportmethods: MutPtr<RtmEntityExportMethods>, eventcallback: RtmEventCallback, reserveopaquepointer: Bool, rtmregprofile: MutPtr<RtmRegnProfile>, rtmreghandle: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity(rtmentityinfo.rawAddress, exportmethods.rawAddress, 0L, reserveopaquepointer, rtmregprofile.rawAddress, rtmreghandle.rawAddress).toUInt()

public actual fun rtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: MutPtr<CVoid>, notifyhandle: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification(rtmreghandle, targetviews.toInt(), notifyflags.toInt(), notifycontext.rawAddress, notifyhandle.rawAddress).toUInt()

public actual fun rtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: MutPtr<RtmDestInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests(rtmreghandle, notifyhandle, numdests.toInt(), changeddests.rawAddress).toUInt()

public actual fun rtmReleaseDestInfo(rtmreghandle: Long, destinfo: MutPtr<RtmDestInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo(rtmreghandle, destinfo.rawAddress).toUInt()

public actual fun rtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: MutPtr<RtmDestInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests(rtmreghandle, numdests.toInt(), destinfos.rawAddress).toUInt()

public actual fun rtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities(rtmreghandle, numentities.toInt(), entityhandles.rawAddress).toUInt()

public actual fun rtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: MutPtr<RtmEntityInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo(rtmreghandle, entityinfo.rawAddress).toUInt()

public actual fun rtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: MutPtr<RtmNexthopInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo(rtmreghandle, nexthopinfo.rawAddress).toUInt()

public actual fun rtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops(rtmreghandle, numnexthops.toInt(), nexthophandles.rawAddress).toUInt()

public actual fun rtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: MutPtr<RtmRouteInfo>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo(rtmreghandle, routeinfo.rawAddress).toUInt()

public actual fun rtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes(rtmreghandle, numroutes.toInt(), routehandles.rawAddress).toUInt()

public actual fun rtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementRrasJniBridge.windowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute(rtmreghandle, routehandle, timetolive.toInt(), routelisthandle, notifytype.toInt(), notifyhandle, changeflags.rawAddress).toUInt()
