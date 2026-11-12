@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

private object WindowsWin32NetworkmanagementP2pJniBridge {
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
        val stream = WindowsWin32NetworkmanagementP2pJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtClose(hdrt: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtContinueSearch(hsearchcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKey(plocalcert: Long, pkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKeySecurityProvider(prootcert: Long, plocalcert: Long, ppsecurityprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtCreateDnsBootstrapResolver(port: Short, pwszaddress: Long, ppmodule: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtCreateIpv6UdpTransport(scope: Int, dwscopeid: Int, dwlocalitythreshold: Int, pwport: Long, phtransport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtCreateNullSecurityProvider(ppsecurityprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtCreatePnrpBootstrapResolver(fpublish: Int, pwzpeername: Long, pwzcloudname: Long, pwzpublishingidentity: Long, ppresolver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDerivedKeySecurityProvider(psecurityprovider: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDnsBootstrapResolver(presolver: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtDeleteIpv6UdpTransport(htransport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtDeleteNullSecurityProvider(psecurityprovider: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtDeletePnrpBootstrapResolver(presolver: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtEndSearch(hsearchcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtGetEventData(hdrt: Long, uleventdatalen: Int, peventdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtGetEventDataSize(hdrt: Long, puleventdatalen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceName(hdrt: Long, ulcbinstancenamesize: Int, pwzdrtinstancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceNameSize(hdrt: Long, pulcbinstancenamesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPath(hsearchcontext: Long, ulsearchpathsize: Int, psearchpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPathSize(hsearchcontext: Long, pulsearchpathsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResult(hsearchcontext: Long, ulsearchresultsize: Int, psearchresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResultSize(hsearchcontext: Long, pulsearchresultsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtOpen(psettings: Long, hevent: Long, pvcontext: Long, phdrt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtRegisterKey(hdrt: Long, pregistration: Long, pvkeycontext: Long, phkeyregistration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtStartSearch(hdrt: Long, pkey: Long, pinfo: Long, timeout: Int, hevent: Long, pvcontext: Long, hsearchcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtUnregisterKey(hkeyregistration: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pDrtUpdateKey(hkeyregistration: Long, pappdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabAddContact(pwzcontactdata: Long, ppcontact: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, hevent: Long, phinvitation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteEndpoint(pcendpoint: Long, pcinvitation: Long, hevent: Long, phinvitation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabCancelInvitation(hinvitation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabCloseHandle(hinvitation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteContact(pwzpeername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteObject(pobjectid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplicationRegistrationInfo(registrationtype: Int, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplications(pcendpoint: Long, papplicationid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumContacts(phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumEndpoints(pccontact: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumObjects(pcendpoint: Long, pobjectid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumPeopleNearMe(phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabExportContact(pwzpeername: Long, ppwzcontactdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetAppLaunchInfo(pplaunchinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetApplicationRegistrationInfo(papplicationid: Long, registrationtype: Int, ppapplication: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetContact(pwzpeername: Long, ppcontact: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEndpointName(ppwzendpointname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEventData(hpeerevent: Long, ppeventdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetInvitationResponse(hinvitation: Long, ppinvitationresponse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetPresenceInfo(pcendpoint: Long, pppresenceinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetSigninOptions(pdwsigninoptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, ppresponse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteEndpoint(pcendpoint: Long, pcinvitation: Long, ppresponse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabParseContact(pwzcontactdata: Long, ppcontact: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabQueryContactData(pcendpoint: Long, ppwzcontactdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabRefreshEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterApplication(pcapplication: Long, registrationtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterEvent(hevent: Long, ceventregistration: Int, peventregistrations: Long, phpeerevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetEndpointName(pwzendpointname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetObject(pcobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetPresenceInfo(pcpresenceinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignin(hwndparent: Long, dwsigninoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout(dwsigninoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup(wversionrequested: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabSubscribeEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterApplication(papplicationid: Long, registrationtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterEvent(hpeerevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnsubscribeEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCollabUpdateContact(pcontact: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerCreatePeerName(pwzidentity: Long, pwzclassifier: Long, ppwzpeername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: Int, pbuffer: Long, dwtimeoutinmilliseconds: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistClientFlushContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: Long, ulcompletionkey: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: Int, dwbuffersize: Int, lpinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistClientOpenContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: Long, ulcompletionkey: Long, phcontenthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: Int, pbuffer: Long, dwtimeoutinmilliseconds: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistGetOverlappedResult(lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatus(hpeerdist: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Long, ulcompletionkey: Long, lpoverlapped: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Long, ulcompletionkey: Long, lpoverlapped: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, ullcontentoffset: Long, cbcontentlength: Long, hcompletionport: Long, ulcompletionkey: Long, phcontentinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, ullcontentoffset: Long, cbcontentlength: Long, pretrievaloptions: Long, hcompletionport: Long, ulcompletionkey: Long, phcontentinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, cbcontentlength: Long, ppublishoptions: Long, hcompletionport: Long, ulcompletionkey: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown(hpeerdist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistStartup(dwversionrequested: Int, phpeerdist: Long, pdwsupportedversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification(hpeerdist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerEndEnumeration(hpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerEnumGroups(pwzidentity: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerEnumIdentities(phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerFreeData(pvdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGetItemCount(hpeerenum: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphAddRecord(hgraph: Long, precord: Long, precordid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphClose(hgraph: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphCloseDirectConnection(hgraph: Long, ullconnectionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphConnect(hgraph: Long, pwzpeerid: Long, paddress: Long, pullconnectionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphCreate(pgraphproperties: Long, pwzdatabasename: Long, psecurityinterface: Long, phgraph: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphDelete(pwzgraphid: Long, pwzpeerid: Long, pwzdatabasename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphDeleteRecord(hgraph: Long, precordid: Long, flocal: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphEndEnumeration(hpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumConnections(hgraph: Long, dwflags: Int, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumNodes(hgraph: Long, pwzpeerid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumRecords(hgraph: Long, precordtype: Long, pwzpeerid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphExportDatabase(hgraph: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphFreeData(pvdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetEventData(hpeerevent: Long, ppeventdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetItemCount(hpeerenum: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNodeInfo(hgraph: Long, ullnodeid: Long, ppnodeinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetProperties(hgraph: Long, ppgraphproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetRecord(hgraph: Long, precordid: Long, pprecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetStatus(hgraph: Long, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphImportDatabase(hgraph: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphListen(hgraph: Long, dwscope: Int, dwscopeid: Int, wport: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpen(pwzgraphid: Long, pwzpeerid: Long, pwzdatabasename: Long, psecurityinterface: Long, crecordtypesyncprecedence: Int, precordtypesyncprecedence: Long, phgraph: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpenDirectConnection(hgraph: Long, pwzpeerid: Long, paddress: Long, pullconnectionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphPeerTimeToUniversalTime(hgraph: Long, pftpeertime: Long, pftuniversaltime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphRegisterEvent(hgraph: Long, hevent: Long, ceventregistrations: Int, peventregistrations: Long, phpeerevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphSearchRecords(hgraph: Long, pwzcriteria: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphSendData(hgraph: Long, ullconnectionid: Long, ptype: Long, cbdata: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetNodeAttributes(hgraph: Long, pwzattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetPresence(hgraph: Long, fpresent: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetProperties(hgraph: Long, pgraphproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphStartup(wversionrequested: Short, pversiondata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphUniversalTimeToPeerTime(hgraph: Long, pftuniversaltime: Long, pftpeertime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphUnregisterEvent(hpeerevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphUpdateRecord(hgraph: Long, precord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGraphValidateDeferredRecords(hgraph: Long, crecordids: Int, precordids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupAddRecord(hgroup: Long, precord: Long, precordid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupClose(hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupCloseDirectConnection(hgroup: Long, ullconnectionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnect(hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnectByAddress(hgroup: Long, caddresses: Int, paddresses: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreate(pproperties: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreateInvitation(hgroup: Long, pwzidentityinfo: Long, pftexpiration: Long, croles: Int, proles: Long, ppwzinvitation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreatePasswordInvitation(hgroup: Long, ppwzinvitation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupDelete(pwzidentity: Long, pwzgrouppeername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupDeleteRecord(hgroup: Long, precordid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumConnections(hgroup: Long, dwflags: Int, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumMembers(hgroup: Long, dwflags: Int, pwzidentity: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumRecords(hgroup: Long, precordtype: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportConfig(hgroup: Long, pwzpassword: Long, ppwzxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportDatabase(hgroup: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetEventData(hpeerevent: Long, ppeventdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetProperties(hgroup: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetRecord(hgroup: Long, precordid: Long, pprecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetStatus(hgroup: Long, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportConfig(pwzxml: Long, pwzpassword: Long, foverwrite: Int, ppwzidentity: Long, ppwzgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportDatabase(hgroup: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupIssueCredentials(hgroup: Long, pwzsubjectidentity: Long, pcredentialinfo: Long, dwflags: Int, ppwzinvitation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupJoin(pwzidentity: Long, pwzinvitation: Long, pwzcloud: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpen(pwzidentity: Long, pwzgrouppeername: Long, pwzcloud: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpenDirectConnection(hgroup: Long, pwzidentity: Long, paddress: Long, pullconnectionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupParseInvitation(pwzinvitation: Long, ppinvitationinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupPasswordJoin(pwzidentity: Long, pwzinvitation: Long, pwzpassword: Long, pwzcloud: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupPeerTimeToUniversalTime(hgroup: Long, pftpeertime: Long, pftuniversaltime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupRegisterEvent(hgroup: Long, hevent: Long, ceventregistration: Int, peventregistrations: Long, phpeerevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupResumePasswordAuthentication(hgroup: Long, hpeereventhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupSearchRecords(hgroup: Long, pwzcriteria: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupSendData(hgroup: Long, ullconnectionid: Long, ptype: Long, cbdata: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupSetProperties(hgroup: Long, pproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupStartup(wversionrequested: Short, pversiondata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupUniversalTimeToPeerTime(hgroup: Long, pftuniversaltime: Long, pftpeertime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupUnregisterEvent(hpeerevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerGroupUpdateRecord(hgroup: Long, precord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerHostNameToPeerName(pwzhostname: Long, ppwzpeername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerIdentityCreate(pwzclassifier: Long, pwzfriendlyname: Long, hcryptprov: Long, ppwzidentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerIdentityDelete(pwzidentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerIdentityExport(pwzidentity: Long, pwzpassword: Long, ppwzexportxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetCryptKey(pwzidentity: Long, phcryptprov: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetDefault(ppwzpeername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetFriendlyName(pwzidentity: Long, ppwzfriendlyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetXML(pwzidentity: Long, ppwzidentityxml: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerIdentityImport(pwzimportxml: Long, pwzpassword: Long, ppwzidentity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerIdentitySetFriendlyName(pwzidentity: Long, pwzfriendlyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerNameToPeerHostName(pwzpeername: Long, ppwzhostname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerPnrpEndResolve(hresolve: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetCloudInfo(pcnumclouds: Long, ppcloudinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetEndpoint(hresolve: Long, ppendpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerPnrpRegister(pcwzpeername: Long, pregistrationinfo: Long, phregistration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerPnrpResolve(pcwzpeername: Long, pcwzcloudname: Long, pcendpoints: Long, ppendpoints: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartResolve(pcwzpeername: Long, pcwzcloudname: Long, cmaxendpoints: Int, hevent: Long, phresolve: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup(wversionrequested: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUnregister(hregistration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUpdateRegistration(hregistration: Long, pregistrationinfo: Long): Int
}

public actual fun drtClose(hdrt: ConstPtr<CVoid>) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtClose(hdrt.rawAddress)
}

public actual fun drtContinueSearch(hsearchcontext: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtContinueSearch(hsearchcontext.rawAddress)

public actual fun drtCreateDerivedKey(plocalcert: ConstPtr<CertContext>, pkey: MutPtr<DrtData>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKey(plocalcert.rawAddress, pkey.rawAddress)

public actual fun drtCreateDerivedKeySecurityProvider(prootcert: ConstPtr<CertContext>, plocalcert: ConstPtr<CertContext>, ppsecurityprovider: MutPtr<MutPtr<DrtSecurityProvider>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKeySecurityProvider(prootcert.rawAddress, plocalcert.rawAddress, ppsecurityprovider.rawAddress)

public actual fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: MutPtr<MutPtr<DrtBootstrapProvider>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDnsBootstrapResolver(port.toShort(), pwszaddress.rawAddress, ppmodule.rawAddress)

public actual fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: MutPtr<UShort>, phtransport: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreateIpv6UdpTransport(scope, dwscopeid.toInt(), dwlocalitythreshold.toInt(), pwport.rawAddress, phtransport.rawAddress)

public actual fun drtCreateNullSecurityProvider(ppsecurityprovider: MutPtr<MutPtr<DrtSecurityProvider>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreateNullSecurityProvider(ppsecurityprovider.rawAddress)

public actual fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: MutPtr<MutPtr<DrtBootstrapProvider>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreatePnrpBootstrapResolver(fpublish, pwzpeername.rawAddress, pwzcloudname.rawAddress, pwzpublishingidentity.rawAddress, ppresolver.rawAddress)

public actual fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: ConstPtr<DrtSecurityProvider>) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDerivedKeySecurityProvider(psecurityprovider.rawAddress)
}

public actual fun drtDeleteDnsBootstrapResolver(presolver: ConstPtr<DrtBootstrapProvider>) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDnsBootstrapResolver(presolver.rawAddress)
}

public actual fun drtDeleteIpv6UdpTransport(htransport: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteIpv6UdpTransport(htransport.rawAddress)

public actual fun drtDeleteNullSecurityProvider(psecurityprovider: ConstPtr<DrtSecurityProvider>) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteNullSecurityProvider(psecurityprovider.rawAddress)
}

public actual fun drtDeletePnrpBootstrapResolver(presolver: ConstPtr<DrtBootstrapProvider>) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtDeletePnrpBootstrapResolver(presolver.rawAddress)
}

public actual fun drtEndSearch(hsearchcontext: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtEndSearch(hsearchcontext.rawAddress)

public actual fun drtGetEventData(hdrt: ConstPtr<CVoid>, uleventdatalen: UInt, peventdata: MutPtr<DrtEventData>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetEventData(hdrt.rawAddress, uleventdatalen.toInt(), peventdata.rawAddress)

public actual fun drtGetEventDataSize(hdrt: ConstPtr<CVoid>, puleventdatalen: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetEventDataSize(hdrt.rawAddress, puleventdatalen.rawAddress)

public actual fun drtGetInstanceName(hdrt: ConstPtr<CVoid>, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceName(hdrt.rawAddress, ulcbinstancenamesize.toInt(), pwzdrtinstancename.rawAddress)

public actual fun drtGetInstanceNameSize(hdrt: ConstPtr<CVoid>, pulcbinstancenamesize: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceNameSize(hdrt.rawAddress, pulcbinstancenamesize.rawAddress)

public actual fun drtGetSearchPath(hsearchcontext: ConstPtr<CVoid>, ulsearchpathsize: UInt, psearchpath: MutPtr<DrtAddressList>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPath(hsearchcontext.rawAddress, ulsearchpathsize.toInt(), psearchpath.rawAddress)

public actual fun drtGetSearchPathSize(hsearchcontext: ConstPtr<CVoid>, pulsearchpathsize: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPathSize(hsearchcontext.rawAddress, pulsearchpathsize.rawAddress)

public actual fun drtGetSearchResult(hsearchcontext: ConstPtr<CVoid>, ulsearchresultsize: UInt, psearchresult: MutPtr<DrtSearchResult>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResult(hsearchcontext.rawAddress, ulsearchresultsize.toInt(), psearchresult.rawAddress)

public actual fun drtGetSearchResultSize(hsearchcontext: ConstPtr<CVoid>, pulsearchresultsize: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResultSize(hsearchcontext.rawAddress, pulsearchresultsize.rawAddress)

public actual fun drtOpen(psettings: ConstPtr<DrtSettings>, hevent: Handle, pvcontext: ConstPtr<CVoid>, phdrt: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtOpen(psettings.rawAddress, hevent.rawAddress, pvcontext.rawAddress, phdrt.rawAddress)

public actual fun drtRegisterKey(hdrt: ConstPtr<CVoid>, pregistration: ConstPtr<DrtRegistration>, pvkeycontext: ConstPtr<CVoid>, phkeyregistration: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtRegisterKey(hdrt.rawAddress, pregistration.rawAddress, pvkeycontext.rawAddress, phkeyregistration.rawAddress)

public actual fun drtStartSearch(hdrt: ConstPtr<CVoid>, pkey: ConstPtr<DrtData>, pinfo: ConstPtr<DrtSearchInfo>, timeout: UInt, hevent: Handle, pvcontext: ConstPtr<CVoid>, hsearchcontext: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtStartSearch(hdrt.rawAddress, pkey.rawAddress, pinfo.rawAddress, timeout.toInt(), hevent.rawAddress, pvcontext.rawAddress, hsearchcontext.rawAddress)

public actual fun drtUnregisterKey(hkeyregistration: ConstPtr<CVoid>) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtUnregisterKey(hkeyregistration.rawAddress)
}

public actual fun drtUpdateKey(hkeyregistration: ConstPtr<CVoid>, pappdata: ConstPtr<DrtData>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtUpdateKey(hkeyregistration.rawAddress, pappdata.rawAddress)

public actual fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr<MutPtr<PeerContact>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAddContact(pwzcontactdata.rawAddress, ppcontact.rawAddress)

public actual fun peerCollabAsyncInviteContact(pccontact: ConstPtr<PeerContact>, pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, hevent: Handle, phinvitation: MutPtr<Handle>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteContact(pccontact.rawAddress, pcendpoint.rawAddress, pcinvitation.rawAddress, hevent.rawAddress, phinvitation.rawAddress)

public actual fun peerCollabAsyncInviteEndpoint(pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, hevent: Handle, phinvitation: MutPtr<Handle>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteEndpoint(pcendpoint.rawAddress, pcinvitation.rawAddress, hevent.rawAddress, phinvitation.rawAddress)

public actual fun peerCollabCancelInvitation(hinvitation: Handle): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabCancelInvitation(hinvitation.rawAddress)

public actual fun peerCollabCloseHandle(hinvitation: Handle): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabCloseHandle(hinvitation.rawAddress)

public actual fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteContact(pwzpeername.rawAddress)

public actual fun peerCollabDeleteEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteEndpointData(pcendpoint.rawAddress)

public actual fun peerCollabDeleteObject(pobjectid: ConstPtr<Guid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteObject(pobjectid.rawAddress)

public actual fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplicationRegistrationInfo(registrationtype, phpeerenum.rawAddress)

public actual fun peerCollabEnumApplications(pcendpoint: ConstPtr<PeerEndpoint>, papplicationid: ConstPtr<Guid>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplications(pcendpoint.rawAddress, papplicationid.rawAddress, phpeerenum.rawAddress)

public actual fun peerCollabEnumContacts(phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumContacts(phpeerenum.rawAddress)

public actual fun peerCollabEnumEndpoints(pccontact: ConstPtr<PeerContact>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumEndpoints(pccontact.rawAddress, phpeerenum.rawAddress)

public actual fun peerCollabEnumObjects(pcendpoint: ConstPtr<PeerEndpoint>, pobjectid: ConstPtr<Guid>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumObjects(pcendpoint.rawAddress, pobjectid.rawAddress, phpeerenum.rawAddress)

public actual fun peerCollabEnumPeopleNearMe(phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumPeopleNearMe(phpeerenum.rawAddress)

public actual fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabExportContact(pwzpeername.rawAddress, ppwzcontactdata.rawAddress)

public actual fun peerCollabGetAppLaunchInfo(pplaunchinfo: MutPtr<MutPtr<PeerAppLaunchInfo>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetAppLaunchInfo(pplaunchinfo.rawAddress)

public actual fun peerCollabGetApplicationRegistrationInfo(papplicationid: ConstPtr<Guid>, registrationtype: PeerApplicationRegistrationType, ppapplication: MutPtr<MutPtr<PeerApplicationRegistrationInfo>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetApplicationRegistrationInfo(papplicationid.rawAddress, registrationtype, ppapplication.rawAddress)

public actual fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: MutPtr<MutPtr<PeerContact>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetContact(pwzpeername.rawAddress, ppcontact.rawAddress)

public actual fun peerCollabGetEndpointName(ppwzendpointname: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEndpointName(ppwzendpointname.rawAddress)

public actual fun peerCollabGetEventData(hpeerevent: ConstPtr<CVoid>, ppeventdata: MutPtr<MutPtr<PeerCollabEventData>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEventData(hpeerevent.rawAddress, ppeventdata.rawAddress)

public actual fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: MutPtr<MutPtr<PeerInvitationResponse>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetInvitationResponse(hinvitation.rawAddress, ppinvitationresponse.rawAddress)

public actual fun peerCollabGetPresenceInfo(pcendpoint: ConstPtr<PeerEndpoint>, pppresenceinfo: MutPtr<MutPtr<PeerPresenceInfo>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetPresenceInfo(pcendpoint.rawAddress, pppresenceinfo.rawAddress)

public actual fun peerCollabGetSigninOptions(pdwsigninoptions: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetSigninOptions(pdwsigninoptions.rawAddress)

public actual fun peerCollabInviteContact(pccontact: ConstPtr<PeerContact>, pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, ppresponse: MutPtr<MutPtr<PeerInvitationResponse>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteContact(pccontact.rawAddress, pcendpoint.rawAddress, pcinvitation.rawAddress, ppresponse.rawAddress)

public actual fun peerCollabInviteEndpoint(pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, ppresponse: MutPtr<MutPtr<PeerInvitationResponse>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteEndpoint(pcendpoint.rawAddress, pcinvitation.rawAddress, ppresponse.rawAddress)

public actual fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr<MutPtr<PeerContact>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabParseContact(pwzcontactdata.rawAddress, ppcontact.rawAddress)

public actual fun peerCollabQueryContactData(pcendpoint: ConstPtr<PeerEndpoint>, ppwzcontactdata: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabQueryContactData(pcendpoint.rawAddress, ppwzcontactdata.rawAddress)

public actual fun peerCollabRefreshEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRefreshEndpointData(pcendpoint.rawAddress)

public actual fun peerCollabRegisterApplication(pcapplication: ConstPtr<PeerApplicationRegistrationInfo>, registrationtype: PeerApplicationRegistrationType): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterApplication(pcapplication.rawAddress, registrationtype)

public actual fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr<PeerCollabEventRegistration>, phpeerevent: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterEvent(hevent.rawAddress, ceventregistration.toInt(), peventregistrations.rawAddress, phpeerevent.rawAddress)

public actual fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetEndpointName(pwzendpointname.rawAddress)

public actual fun peerCollabSetObject(pcobject: ConstPtr<PeerObject>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetObject(pcobject.rawAddress)

public actual fun peerCollabSetPresenceInfo(pcpresenceinfo: ConstPtr<PeerPresenceInfo>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetPresenceInfo(pcpresenceinfo.rawAddress)

public actual fun peerCollabShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown()

public actual fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignin(hwndparent.rawAddress, dwsigninoptions.toInt())

public actual fun peerCollabSignout(dwsigninoptions: UInt): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout(dwsigninoptions.toInt())

public actual fun peerCollabStartup(wversionrequested: UShort): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup(wversionrequested.toShort())

public actual fun peerCollabSubscribeEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSubscribeEndpointData(pcendpoint.rawAddress)

public actual fun peerCollabUnregisterApplication(papplicationid: ConstPtr<Guid>, registrationtype: PeerApplicationRegistrationType): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterApplication(papplicationid.rawAddress, registrationtype)

public actual fun peerCollabUnregisterEvent(hpeerevent: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterEvent(hpeerevent.rawAddress)

public actual fun peerCollabUnsubscribeEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnsubscribeEndpointData(pcendpoint.rawAddress)

public actual fun peerCollabUpdateContact(pcontact: ConstPtr<PeerContact>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUpdateContact(pcontact.rawAddress)

public actual fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCreatePeerName(pwzidentity.rawAddress, pwzclassifier.rawAddress, ppwzpeername.rawAddress)

public actual fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddContentInformation(hpeerdist, hcontenthandle, cbnumberofbytes.toInt(), pbuffer.rawAddress, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddData(hpeerdist, hcontenthandle, cbnumberofbytes.toInt(), pbuffer.rawAddress, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr<UByte>, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientBlockRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes.toInt(), pbuffer.rawAddress, dwtimeoutinmilliseconds.toInt(), lpoverlapped.rawAddress).toUInt()

public actual fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCancelAsyncOperation(hpeerdist, hcontenthandle, poverlapped.rawAddress).toUInt()

public actual fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent(hpeerdist, hcontenthandle).toUInt()

public actual fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCompleteContentInformation(hpeerdist, hcontenthandle, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: ConstPtr<PeerdistContentTag>, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientFlushContent(hpeerdist, pcontenttag.rawAddress, hcompletionport.rawAddress, ulcompletionkey.toLong(), lpoverlapped.rawAddress).toUInt()

public actual fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientGetInformationByHandle(hpeerdist, hcontenthandle, peerdistclientinfoclass, dwbuffersize.toInt(), lpinformation.rawAddress).toUInt()

public actual fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: ConstPtr<PeerdistContentTag>, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientOpenContent(hpeerdist, pcontenttag.rawAddress, hcompletionport.rawAddress, ulcompletionkey.toLong(), phcontenthandle.rawAddress).toUInt()

public actual fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr<UByte>, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientStreamRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes.toInt(), pbuffer.rawAddress, dwtimeoutinmilliseconds.toInt(), lpoverlapped.rawAddress).toUInt()

public actual fun peerDistGetOverlappedResult(lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, bwait: Bool): Bool =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetOverlappedResult(lpoverlapped.rawAddress, lpnumberofbytestransferred.rawAddress, bwait)

public actual fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: MutPtr<PeerdistStatus>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatus(hpeerdist, ppeerdiststatus.rawAddress).toUInt()

public actual fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: MutPtr<PeerdistStatusInfo>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatusEx(hpeerdist, ppeerdiststatus.rawAddress).toUInt()

public actual fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>, ppeerdiststatus: MutPtr<PeerdistStatus>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotification(hpeerdist, hcompletionport.rawAddress, ulcompletionkey.toLong(), lpoverlapped.rawAddress, ppeerdiststatus.rawAddress).toUInt()

public actual fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>, ppeerdiststatus: MutPtr<PeerdistStatusInfo>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotificationEx(hpeerdist, hcompletionport.rawAddress, ulcompletionkey.toLong(), lpoverlapped.rawAddress, ppeerdiststatus.rawAddress).toUInt()

public actual fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, poverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCancelAsyncOperation(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier.rawAddress, poverlapped.rawAddress).toUInt()

public actual fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation(hpeerdist, hcontentinfo).toUInt()

public actual fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle(hpeerdist, hstream).toUInt()

public actual fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformation(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier.rawAddress, ullcontentoffset.toLong(), cbcontentlength.toLong(), hcompletionport.rawAddress, ulcompletionkey.toLong(), phcontentinfo.rawAddress).toUInt()

public actual fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: ConstPtr<PeerdistRetrievalOptions>, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformationEx(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier.rawAddress, ullcontentoffset.toLong(), cbcontentlength.toLong(), pretrievaloptions.rawAddress, hcompletionport.rawAddress, ulcompletionkey.toLong(), phcontentinfo.rawAddress).toUInt()

public actual fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishAddToStream(hpeerdist, hstream, cbnumberofbytes.toInt(), pbuffer.rawAddress, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishCompleteStream(hpeerdist, hstream, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, cbcontentlength: ULong, ppublishoptions: ConstPtr<PeerdistPublicationOptions>, hcompletionport: Handle, ulcompletionkey: ULong, phstream: MutPtr<Long>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishStream(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier.rawAddress, cbcontentlength.toLong(), ppublishoptions.rawAddress, hcompletionport.rawAddress, ulcompletionkey.toLong(), phstream.rawAddress).toUInt()

public actual fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerRetrieveContentInformation(hpeerdist, hcontentinfo, cbmaxnumberofbytes.toInt(), pbuffer.rawAddress, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerUnpublish(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier.rawAddress).toUInt()

public actual fun peerDistShutdown(hpeerdist: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown(hpeerdist).toUInt()

public actual fun peerDistStartup(dwversionrequested: UInt, phpeerdist: MutPtr<Long>, pdwsupportedversion: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistStartup(dwversionrequested.toInt(), phpeerdist.rawAddress, pdwsupportedversion.rawAddress).toUInt()

public actual fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification(hpeerdist).toUInt()

public actual fun peerEndEnumeration(hpeerenum: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerEndEnumeration(hpeerenum.rawAddress)

public actual fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerEnumGroups(pwzidentity.rawAddress, phpeerenum.rawAddress)

public actual fun peerEnumIdentities(phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerEnumIdentities(phpeerenum.rawAddress)

public actual fun peerFreeData(pvdata: ConstPtr<CVoid>) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerFreeData(pvdata.rawAddress)
}

public actual fun peerGetItemCount(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGetItemCount(hpeerenum.rawAddress, pcount.rawAddress)

public actual fun peerGetNextItem(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>, pppvitems: MutPtr<MutPtr<MutPtr<CVoid>>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGetNextItem(hpeerenum.rawAddress, pcount.rawAddress, pppvitems.rawAddress)

public actual fun peerGraphAddRecord(hgraph: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>, precordid: MutPtr<Guid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphAddRecord(hgraph.rawAddress, precord.rawAddress, precordid.rawAddress)

public actual fun peerGraphClose(hgraph: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphClose(hgraph.rawAddress)

public actual fun peerGraphCloseDirectConnection(hgraph: ConstPtr<CVoid>, ullconnectionid: ULong): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphCloseDirectConnection(hgraph.rawAddress, ullconnectionid.toLong())

public actual fun peerGraphConnect(hgraph: ConstPtr<CVoid>, pwzpeerid: Pcwstr, paddress: ConstPtr<PeerAddress>, pullconnectionid: MutPtr<ULong>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphConnect(hgraph.rawAddress, pwzpeerid.rawAddress, paddress.rawAddress, pullconnectionid.rawAddress)

public actual fun peerGraphCreate(pgraphproperties: ConstPtr<PeerGraphProperties>, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr<PeerSecurityInterface>, phgraph: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphCreate(pgraphproperties.rawAddress, pwzdatabasename.rawAddress, psecurityinterface.rawAddress, phgraph.rawAddress)

public actual fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphDelete(pwzgraphid.rawAddress, pwzpeerid.rawAddress, pwzdatabasename.rawAddress)

public actual fun peerGraphDeleteRecord(hgraph: ConstPtr<CVoid>, precordid: ConstPtr<Guid>, flocal: Bool): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphDeleteRecord(hgraph.rawAddress, precordid.rawAddress, flocal)

public actual fun peerGraphEndEnumeration(hpeerenum: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEndEnumeration(hpeerenum.rawAddress)

public actual fun peerGraphEnumConnections(hgraph: ConstPtr<CVoid>, dwflags: UInt, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumConnections(hgraph.rawAddress, dwflags.toInt(), phpeerenum.rawAddress)

public actual fun peerGraphEnumNodes(hgraph: ConstPtr<CVoid>, pwzpeerid: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumNodes(hgraph.rawAddress, pwzpeerid.rawAddress, phpeerenum.rawAddress)

public actual fun peerGraphEnumRecords(hgraph: ConstPtr<CVoid>, precordtype: ConstPtr<Guid>, pwzpeerid: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumRecords(hgraph.rawAddress, precordtype.rawAddress, pwzpeerid.rawAddress, phpeerenum.rawAddress)

public actual fun peerGraphExportDatabase(hgraph: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphExportDatabase(hgraph.rawAddress, pwzfilepath.rawAddress)

public actual fun peerGraphFreeData(pvdata: ConstPtr<CVoid>) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphFreeData(pvdata.rawAddress)
}

public actual fun peerGraphGetEventData(hpeerevent: ConstPtr<CVoid>, ppeventdata: MutPtr<MutPtr<PeerGraphEventData>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetEventData(hpeerevent.rawAddress, ppeventdata.rawAddress)

public actual fun peerGraphGetItemCount(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetItemCount(hpeerenum.rawAddress, pcount.rawAddress)

public actual fun peerGraphGetNextItem(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>, pppvitems: MutPtr<MutPtr<MutPtr<CVoid>>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNextItem(hpeerenum.rawAddress, pcount.rawAddress, pppvitems.rawAddress)

public actual fun peerGraphGetNodeInfo(hgraph: ConstPtr<CVoid>, ullnodeid: ULong, ppnodeinfo: MutPtr<MutPtr<PeerNodeInfo>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNodeInfo(hgraph.rawAddress, ullnodeid.toLong(), ppnodeinfo.rawAddress)

public actual fun peerGraphGetProperties(hgraph: ConstPtr<CVoid>, ppgraphproperties: MutPtr<MutPtr<PeerGraphProperties>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetProperties(hgraph.rawAddress, ppgraphproperties.rawAddress)

public actual fun peerGraphGetRecord(hgraph: ConstPtr<CVoid>, precordid: ConstPtr<Guid>, pprecord: MutPtr<MutPtr<PeerRecord>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetRecord(hgraph.rawAddress, precordid.rawAddress, pprecord.rawAddress)

public actual fun peerGraphGetStatus(hgraph: ConstPtr<CVoid>, pdwstatus: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetStatus(hgraph.rawAddress, pdwstatus.rawAddress)

public actual fun peerGraphImportDatabase(hgraph: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphImportDatabase(hgraph.rawAddress, pwzfilepath.rawAddress)

public actual fun peerGraphListen(hgraph: ConstPtr<CVoid>, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphListen(hgraph.rawAddress, dwscope.toInt(), dwscopeid.toInt(), wport.toShort())

public actual fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr<PeerSecurityInterface>, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: ConstPtr<Guid>, phgraph: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpen(pwzgraphid.rawAddress, pwzpeerid.rawAddress, pwzdatabasename.rawAddress, psecurityinterface.rawAddress, crecordtypesyncprecedence.toInt(), precordtypesyncprecedence.rawAddress, phgraph.rawAddress)

public actual fun peerGraphOpenDirectConnection(hgraph: ConstPtr<CVoid>, pwzpeerid: Pcwstr, paddress: ConstPtr<PeerAddress>, pullconnectionid: MutPtr<ULong>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpenDirectConnection(hgraph.rawAddress, pwzpeerid.rawAddress, paddress.rawAddress, pullconnectionid.rawAddress)

public actual fun peerGraphPeerTimeToUniversalTime(hgraph: ConstPtr<CVoid>, pftpeertime: ConstPtr<Filetime>, pftuniversaltime: MutPtr<Filetime>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphPeerTimeToUniversalTime(hgraph.rawAddress, pftpeertime.rawAddress, pftuniversaltime.rawAddress)

public actual fun peerGraphRegisterEvent(hgraph: ConstPtr<CVoid>, hevent: Handle, ceventregistrations: UInt, peventregistrations: ConstPtr<PeerGraphEventRegistration>, phpeerevent: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphRegisterEvent(hgraph.rawAddress, hevent.rawAddress, ceventregistrations.toInt(), peventregistrations.rawAddress, phpeerevent.rawAddress)

public actual fun peerGraphSearchRecords(hgraph: ConstPtr<CVoid>, pwzcriteria: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSearchRecords(hgraph.rawAddress, pwzcriteria.rawAddress, phpeerenum.rawAddress)

public actual fun peerGraphSendData(hgraph: ConstPtr<CVoid>, ullconnectionid: ULong, ptype: ConstPtr<Guid>, cbdata: UInt, pvdata: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSendData(hgraph.rawAddress, ullconnectionid.toLong(), ptype.rawAddress, cbdata.toInt(), pvdata.rawAddress)

public actual fun peerGraphSetNodeAttributes(hgraph: ConstPtr<CVoid>, pwzattributes: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetNodeAttributes(hgraph.rawAddress, pwzattributes.rawAddress)

public actual fun peerGraphSetPresence(hgraph: ConstPtr<CVoid>, fpresent: Bool): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetPresence(hgraph.rawAddress, fpresent)

public actual fun peerGraphSetProperties(hgraph: ConstPtr<CVoid>, pgraphproperties: ConstPtr<PeerGraphProperties>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetProperties(hgraph.rawAddress, pgraphproperties.rawAddress)

public actual fun peerGraphShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown()

public actual fun peerGraphStartup(wversionrequested: UShort, pversiondata: MutPtr<PeerVersionData>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphStartup(wversionrequested.toShort(), pversiondata.rawAddress)

public actual fun peerGraphUniversalTimeToPeerTime(hgraph: ConstPtr<CVoid>, pftuniversaltime: ConstPtr<Filetime>, pftpeertime: MutPtr<Filetime>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUniversalTimeToPeerTime(hgraph.rawAddress, pftuniversaltime.rawAddress, pftpeertime.rawAddress)

public actual fun peerGraphUnregisterEvent(hpeerevent: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUnregisterEvent(hpeerevent.rawAddress)

public actual fun peerGraphUpdateRecord(hgraph: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUpdateRecord(hgraph.rawAddress, precord.rawAddress)

public actual fun peerGraphValidateDeferredRecords(hgraph: ConstPtr<CVoid>, crecordids: UInt, precordids: ConstPtr<Guid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphValidateDeferredRecords(hgraph.rawAddress, crecordids.toInt(), precordids.rawAddress)

public actual fun peerGroupAddRecord(hgroup: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>, precordid: MutPtr<Guid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupAddRecord(hgroup.rawAddress, precord.rawAddress, precordid.rawAddress)

public actual fun peerGroupClose(hgroup: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupClose(hgroup.rawAddress)

public actual fun peerGroupCloseDirectConnection(hgroup: ConstPtr<CVoid>, ullconnectionid: ULong): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCloseDirectConnection(hgroup.rawAddress, ullconnectionid.toLong())

public actual fun peerGroupConnect(hgroup: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnect(hgroup.rawAddress)

public actual fun peerGroupConnectByAddress(hgroup: ConstPtr<CVoid>, caddresses: UInt, paddresses: ConstPtr<PeerAddress>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnectByAddress(hgroup.rawAddress, caddresses.toInt(), paddresses.rawAddress)

public actual fun peerGroupCreate(pproperties: ConstPtr<PeerGroupProperties>, phgroup: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreate(pproperties.rawAddress, phgroup.rawAddress)

public actual fun peerGroupCreateInvitation(hgroup: ConstPtr<CVoid>, pwzidentityinfo: Pcwstr, pftexpiration: ConstPtr<Filetime>, croles: UInt, proles: ConstPtr<Guid>, ppwzinvitation: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreateInvitation(hgroup.rawAddress, pwzidentityinfo.rawAddress, pftexpiration.rawAddress, croles.toInt(), proles.rawAddress, ppwzinvitation.rawAddress)

public actual fun peerGroupCreatePasswordInvitation(hgroup: ConstPtr<CVoid>, ppwzinvitation: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreatePasswordInvitation(hgroup.rawAddress, ppwzinvitation.rawAddress)

public actual fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupDelete(pwzidentity.rawAddress, pwzgrouppeername.rawAddress)

public actual fun peerGroupDeleteRecord(hgroup: ConstPtr<CVoid>, precordid: ConstPtr<Guid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupDeleteRecord(hgroup.rawAddress, precordid.rawAddress)

public actual fun peerGroupEnumConnections(hgroup: ConstPtr<CVoid>, dwflags: UInt, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumConnections(hgroup.rawAddress, dwflags.toInt(), phpeerenum.rawAddress)

public actual fun peerGroupEnumMembers(hgroup: ConstPtr<CVoid>, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumMembers(hgroup.rawAddress, dwflags.toInt(), pwzidentity.rawAddress, phpeerenum.rawAddress)

public actual fun peerGroupEnumRecords(hgroup: ConstPtr<CVoid>, precordtype: ConstPtr<Guid>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumRecords(hgroup.rawAddress, precordtype.rawAddress, phpeerenum.rawAddress)

public actual fun peerGroupExportConfig(hgroup: ConstPtr<CVoid>, pwzpassword: Pcwstr, ppwzxml: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportConfig(hgroup.rawAddress, pwzpassword.rawAddress, ppwzxml.rawAddress)

public actual fun peerGroupExportDatabase(hgroup: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportDatabase(hgroup.rawAddress, pwzfilepath.rawAddress)

public actual fun peerGroupGetEventData(hpeerevent: ConstPtr<CVoid>, ppeventdata: MutPtr<MutPtr<PeerGroupEventData>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetEventData(hpeerevent.rawAddress, ppeventdata.rawAddress)

public actual fun peerGroupGetProperties(hgroup: ConstPtr<CVoid>, ppproperties: MutPtr<MutPtr<PeerGroupProperties>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetProperties(hgroup.rawAddress, ppproperties.rawAddress)

public actual fun peerGroupGetRecord(hgroup: ConstPtr<CVoid>, precordid: ConstPtr<Guid>, pprecord: MutPtr<MutPtr<PeerRecord>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetRecord(hgroup.rawAddress, precordid.rawAddress, pprecord.rawAddress)

public actual fun peerGroupGetStatus(hgroup: ConstPtr<CVoid>, pdwstatus: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetStatus(hgroup.rawAddress, pdwstatus.rawAddress)

public actual fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: MutPtr<Pwstr>, ppwzgroup: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportConfig(pwzxml.rawAddress, pwzpassword.rawAddress, foverwrite, ppwzidentity.rawAddress, ppwzgroup.rawAddress)

public actual fun peerGroupImportDatabase(hgroup: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportDatabase(hgroup.rawAddress, pwzfilepath.rawAddress)

public actual fun peerGroupIssueCredentials(hgroup: ConstPtr<CVoid>, pwzsubjectidentity: Pcwstr, pcredentialinfo: ConstPtr<PeerCredentialInfo>, dwflags: UInt, ppwzinvitation: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupIssueCredentials(hgroup.rawAddress, pwzsubjectidentity.rawAddress, pcredentialinfo.rawAddress, dwflags.toInt(), ppwzinvitation.rawAddress)

public actual fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupJoin(pwzidentity.rawAddress, pwzinvitation.rawAddress, pwzcloud.rawAddress, phgroup.rawAddress)

public actual fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpen(pwzidentity.rawAddress, pwzgrouppeername.rawAddress, pwzcloud.rawAddress, phgroup.rawAddress)

public actual fun peerGroupOpenDirectConnection(hgroup: ConstPtr<CVoid>, pwzidentity: Pcwstr, paddress: ConstPtr<PeerAddress>, pullconnectionid: MutPtr<ULong>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpenDirectConnection(hgroup.rawAddress, pwzidentity.rawAddress, paddress.rawAddress, pullconnectionid.rawAddress)

public actual fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: MutPtr<MutPtr<PeerInvitationInfo>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupParseInvitation(pwzinvitation.rawAddress, ppinvitationinfo.rawAddress)

public actual fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupPasswordJoin(pwzidentity.rawAddress, pwzinvitation.rawAddress, pwzpassword.rawAddress, pwzcloud.rawAddress, phgroup.rawAddress)

public actual fun peerGroupPeerTimeToUniversalTime(hgroup: ConstPtr<CVoid>, pftpeertime: ConstPtr<Filetime>, pftuniversaltime: MutPtr<Filetime>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupPeerTimeToUniversalTime(hgroup.rawAddress, pftpeertime.rawAddress, pftuniversaltime.rawAddress)

public actual fun peerGroupRegisterEvent(hgroup: ConstPtr<CVoid>, hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr<PeerGroupEventRegistration>, phpeerevent: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupRegisterEvent(hgroup.rawAddress, hevent.rawAddress, ceventregistration.toInt(), peventregistrations.rawAddress, phpeerevent.rawAddress)

public actual fun peerGroupResumePasswordAuthentication(hgroup: ConstPtr<CVoid>, hpeereventhandle: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupResumePasswordAuthentication(hgroup.rawAddress, hpeereventhandle.rawAddress)

public actual fun peerGroupSearchRecords(hgroup: ConstPtr<CVoid>, pwzcriteria: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSearchRecords(hgroup.rawAddress, pwzcriteria.rawAddress, phpeerenum.rawAddress)

public actual fun peerGroupSendData(hgroup: ConstPtr<CVoid>, ullconnectionid: ULong, ptype: ConstPtr<Guid>, cbdata: UInt, pvdata: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSendData(hgroup.rawAddress, ullconnectionid.toLong(), ptype.rawAddress, cbdata.toInt(), pvdata.rawAddress)

public actual fun peerGroupSetProperties(hgroup: ConstPtr<CVoid>, pproperties: ConstPtr<PeerGroupProperties>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSetProperties(hgroup.rawAddress, pproperties.rawAddress)

public actual fun peerGroupShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown()

public actual fun peerGroupStartup(wversionrequested: UShort, pversiondata: MutPtr<PeerVersionData>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupStartup(wversionrequested.toShort(), pversiondata.rawAddress)

public actual fun peerGroupUniversalTimeToPeerTime(hgroup: ConstPtr<CVoid>, pftuniversaltime: ConstPtr<Filetime>, pftpeertime: MutPtr<Filetime>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUniversalTimeToPeerTime(hgroup.rawAddress, pftuniversaltime.rawAddress, pftpeertime.rawAddress)

public actual fun peerGroupUnregisterEvent(hpeerevent: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUnregisterEvent(hpeerevent.rawAddress)

public actual fun peerGroupUpdateRecord(hgroup: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUpdateRecord(hgroup.rawAddress, precord.rawAddress)

public actual fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerHostNameToPeerName(pwzhostname.rawAddress, ppwzpeername.rawAddress)

public actual fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityCreate(pwzclassifier.rawAddress, pwzfriendlyname.rawAddress, hcryptprov.toLong(), ppwzidentity.rawAddress)

public actual fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityDelete(pwzidentity.rawAddress)

public actual fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityExport(pwzidentity.rawAddress, pwzpassword.rawAddress, ppwzexportxml.rawAddress)

public actual fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: MutPtr<ULong>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetCryptKey(pwzidentity.rawAddress, phcryptprov.rawAddress)

public actual fun peerIdentityGetDefault(ppwzpeername: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetDefault(ppwzpeername.rawAddress)

public actual fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetFriendlyName(pwzidentity.rawAddress, ppwzfriendlyname.rawAddress)

public actual fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetXML(pwzidentity.rawAddress, ppwzidentityxml.rawAddress)

public actual fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityImport(pwzimportxml.rawAddress, pwzpassword.rawAddress, ppwzidentity.rawAddress)

public actual fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentitySetFriendlyName(pwzidentity.rawAddress, pwzfriendlyname.rawAddress)

public actual fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: MutPtr<Pwstr>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerNameToPeerHostName(pwzpeername.rawAddress, ppwzhostname.rawAddress)

public actual fun peerPnrpEndResolve(hresolve: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpEndResolve(hresolve.rawAddress)

public actual fun peerPnrpGetCloudInfo(pcnumclouds: MutPtr<UInt>, ppcloudinfo: MutPtr<MutPtr<PeerPnrpCloudInfo>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetCloudInfo(pcnumclouds.rawAddress, ppcloudinfo.rawAddress)

public actual fun peerPnrpGetEndpoint(hresolve: ConstPtr<CVoid>, ppendpoint: MutPtr<MutPtr<PeerPnrpEndpointInfo>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetEndpoint(hresolve.rawAddress, ppendpoint.rawAddress)

public actual fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: ConstPtr<PeerPnrpRegistrationInfo>, phregistration: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpRegister(pcwzpeername.rawAddress, pregistrationinfo.rawAddress, phregistration.rawAddress)

public actual fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: MutPtr<UInt>, ppendpoints: MutPtr<MutPtr<PeerPnrpEndpointInfo>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpResolve(pcwzpeername.rawAddress, pcwzcloudname.rawAddress, pcendpoints.rawAddress, ppendpoints.rawAddress)

public actual fun peerPnrpShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown()

public actual fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartResolve(pcwzpeername.rawAddress, pcwzcloudname.rawAddress, cmaxendpoints.toInt(), hevent.rawAddress, phresolve.rawAddress)

public actual fun peerPnrpStartup(wversionrequested: UShort): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup(wversionrequested.toShort())

public actual fun peerPnrpUnregister(hregistration: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUnregister(hregistration.rawAddress)

public actual fun peerPnrpUpdateRegistration(hregistration: ConstPtr<CVoid>, pregistrationinfo: ConstPtr<PeerPnrpRegistrationInfo>): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUpdateRegistration(hregistration.rawAddress, pregistrationinfo.rawAddress)
