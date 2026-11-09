@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32NetworkmanagementP2pJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtClose(hdrt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtContinueSearch(hsearchcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKey(plocalcert: Long, pkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKeySecurityProvider(prootcert: Long, plocalcert: Long, ppsecurityprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtCreateDnsBootstrapResolver(port: Short, pwszaddress: Long, ppmodule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtCreateIpv6UdpTransport(scope: Int, dwscopeid: Int, dwlocalitythreshold: Int, pwport: Long, phtransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtCreateNullSecurityProvider(ppsecurityprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtCreatePnrpBootstrapResolver(fpublish: Int, pwzpeername: Long, pwzcloudname: Long, pwzpublishingidentity: Long, ppresolver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDerivedKeySecurityProvider(psecurityprovider: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDnsBootstrapResolver(presolver: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtDeleteIpv6UdpTransport(htransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtDeleteNullSecurityProvider(psecurityprovider: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtDeletePnrpBootstrapResolver(presolver: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtEndSearch(hsearchcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtGetEventData(hdrt: Long, uleventdatalen: Int, peventdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtGetEventDataSize(hdrt: Long, puleventdatalen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceName(hdrt: Long, ulcbinstancenamesize: Int, pwzdrtinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceNameSize(hdrt: Long, pulcbinstancenamesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPath(hsearchcontext: Long, ulsearchpathsize: Int, psearchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPathSize(hsearchcontext: Long, pulsearchpathsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResult(hsearchcontext: Long, ulsearchresultsize: Int, psearchresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResultSize(hsearchcontext: Long, pulsearchresultsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtOpen(psettings: Long, hevent: Long, pvcontext: Long, phdrt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtRegisterKey(hdrt: Long, pregistration: Long, pvkeycontext: Long, phkeyregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtStartSearch(hdrt: Long, pkey: Long, pinfo: Long, timeout: Int, hevent: Long, pvcontext: Long, hsearchcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtUnregisterKey(hkeyregistration: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_DrtUpdateKey(hkeyregistration: Long, pappdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabAddContact(pwzcontactdata: Long, ppcontact: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, hevent: Long, phinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteEndpoint(pcendpoint: Long, pcinvitation: Long, hevent: Long, phinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabCancelInvitation(hinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabCloseHandle(hinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteContact(pwzpeername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteObject(pobjectid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplicationRegistrationInfo(registrationtype: Int, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplications(pcendpoint: Long, papplicationid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumContacts(phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumEndpoints(pccontact: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumObjects(pcendpoint: Long, pobjectid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumPeopleNearMe(phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabExportContact(pwzpeername: Long, ppwzcontactdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetAppLaunchInfo(pplaunchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetApplicationRegistrationInfo(papplicationid: Long, registrationtype: Int, ppapplication: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetContact(pwzpeername: Long, ppcontact: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEndpointName(ppwzendpointname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEventData(hpeerevent: Long, ppeventdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetInvitationResponse(hinvitation: Long, ppinvitationresponse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetPresenceInfo(pcendpoint: Long, pppresenceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetSigninOptions(pdwsigninoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, ppresponse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteEndpoint(pcendpoint: Long, pcinvitation: Long, ppresponse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabParseContact(pwzcontactdata: Long, ppcontact: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabQueryContactData(pcendpoint: Long, ppwzcontactdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabRefreshEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterApplication(pcapplication: Long, registrationtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterEvent(hevent: Long, ceventregistration: Int, peventregistrations: Long, phpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetEndpointName(pwzendpointname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetObject(pcobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetPresenceInfo(pcpresenceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignin(hwndparent: Long, dwsigninoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignout(dwsigninoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabStartup(wversionrequested: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabSubscribeEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterApplication(papplicationid: Long, registrationtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterEvent(hpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnsubscribeEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCollabUpdateContact(pcontact: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerCreatePeerName(pwzidentity: Long, pwzclassifier: Long, ppwzpeername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: Int, pbuffer: Long, dwtimeoutinmilliseconds: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistClientFlushContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: Long, ulcompletionkey: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: Int, dwbuffersize: Int, lpinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistClientOpenContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: Long, ulcompletionkey: Long, phcontenthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: Int, pbuffer: Long, dwtimeoutinmilliseconds: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistGetOverlappedResult(lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatus(hpeerdist: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Long, ulcompletionkey: Long, lpoverlapped: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Long, ulcompletionkey: Long, lpoverlapped: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, ullcontentoffset: Long, cbcontentlength: Long, hcompletionport: Long, ulcompletionkey: Long, phcontentinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, ullcontentoffset: Long, cbcontentlength: Long, pretrievaloptions: Long, hcompletionport: Long, ulcompletionkey: Long, phcontentinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, cbcontentlength: Long, ppublishoptions: Long, hcompletionport: Long, ulcompletionkey: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistShutdown(hpeerdist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistStartup(dwversionrequested: Int, phpeerdist: Long, pdwsupportedversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerDistUnregisterForStatusChangeNotification(hpeerdist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerEndEnumeration(hpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerEnumGroups(pwzidentity: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerEnumIdentities(phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerFreeData(pvdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGetItemCount(hpeerenum: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphAddRecord(hgraph: Long, precord: Long, precordid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphClose(hgraph: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphCloseDirectConnection(hgraph: Long, ullconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphConnect(hgraph: Long, pwzpeerid: Long, paddress: Long, pullconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphCreate(pgraphproperties: Long, pwzdatabasename: Long, psecurityinterface: Long, phgraph: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphDelete(pwzgraphid: Long, pwzpeerid: Long, pwzdatabasename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphDeleteRecord(hgraph: Long, precordid: Long, flocal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphEndEnumeration(hpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumConnections(hgraph: Long, dwflags: Int, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumNodes(hgraph: Long, pwzpeerid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumRecords(hgraph: Long, precordtype: Long, pwzpeerid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphExportDatabase(hgraph: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphFreeData(pvdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetEventData(hpeerevent: Long, ppeventdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetItemCount(hpeerenum: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNodeInfo(hgraph: Long, ullnodeid: Long, ppnodeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetProperties(hgraph: Long, ppgraphproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetRecord(hgraph: Long, precordid: Long, pprecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetStatus(hgraph: Long, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphImportDatabase(hgraph: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphListen(hgraph: Long, dwscope: Int, dwscopeid: Int, wport: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpen(pwzgraphid: Long, pwzpeerid: Long, pwzdatabasename: Long, psecurityinterface: Long, crecordtypesyncprecedence: Int, precordtypesyncprecedence: Long, phgraph: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpenDirectConnection(hgraph: Long, pwzpeerid: Long, paddress: Long, pullconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphPeerTimeToUniversalTime(hgraph: Long, pftpeertime: Long, pftuniversaltime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphRegisterEvent(hgraph: Long, hevent: Long, ceventregistrations: Int, peventregistrations: Long, phpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphSearchRecords(hgraph: Long, pwzcriteria: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphSendData(hgraph: Long, ullconnectionid: Long, ptype: Long, cbdata: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetNodeAttributes(hgraph: Long, pwzattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetPresence(hgraph: Long, fpresent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetProperties(hgraph: Long, pgraphproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphStartup(wversionrequested: Short, pversiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphUniversalTimeToPeerTime(hgraph: Long, pftuniversaltime: Long, pftpeertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphUnregisterEvent(hpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphUpdateRecord(hgraph: Long, precord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGraphValidateDeferredRecords(hgraph: Long, crecordids: Int, precordids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupAddRecord(hgroup: Long, precord: Long, precordid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupClose(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupCloseDirectConnection(hgroup: Long, ullconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnect(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnectByAddress(hgroup: Long, caddresses: Int, paddresses: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreate(pproperties: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreateInvitation(hgroup: Long, pwzidentityinfo: Long, pftexpiration: Long, croles: Int, proles: Long, ppwzinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreatePasswordInvitation(hgroup: Long, ppwzinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupDelete(pwzidentity: Long, pwzgrouppeername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupDeleteRecord(hgroup: Long, precordid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumConnections(hgroup: Long, dwflags: Int, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumMembers(hgroup: Long, dwflags: Int, pwzidentity: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumRecords(hgroup: Long, precordtype: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportConfig(hgroup: Long, pwzpassword: Long, ppwzxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportDatabase(hgroup: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetEventData(hpeerevent: Long, ppeventdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetProperties(hgroup: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetRecord(hgroup: Long, precordid: Long, pprecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetStatus(hgroup: Long, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportConfig(pwzxml: Long, pwzpassword: Long, foverwrite: Int, ppwzidentity: Long, ppwzgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportDatabase(hgroup: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupIssueCredentials(hgroup: Long, pwzsubjectidentity: Long, pcredentialinfo: Long, dwflags: Int, ppwzinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupJoin(pwzidentity: Long, pwzinvitation: Long, pwzcloud: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpen(pwzidentity: Long, pwzgrouppeername: Long, pwzcloud: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpenDirectConnection(hgroup: Long, pwzidentity: Long, paddress: Long, pullconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupParseInvitation(pwzinvitation: Long, ppinvitationinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupPasswordJoin(pwzidentity: Long, pwzinvitation: Long, pwzpassword: Long, pwzcloud: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupPeerTimeToUniversalTime(hgroup: Long, pftpeertime: Long, pftuniversaltime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupRegisterEvent(hgroup: Long, hevent: Long, ceventregistration: Int, peventregistrations: Long, phpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupResumePasswordAuthentication(hgroup: Long, hpeereventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupSearchRecords(hgroup: Long, pwzcriteria: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupSendData(hgroup: Long, ullconnectionid: Long, ptype: Long, cbdata: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupSetProperties(hgroup: Long, pproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupStartup(wversionrequested: Short, pversiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupUniversalTimeToPeerTime(hgroup: Long, pftuniversaltime: Long, pftpeertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupUnregisterEvent(hpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerGroupUpdateRecord(hgroup: Long, precord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerHostNameToPeerName(pwzhostname: Long, ppwzpeername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerIdentityCreate(pwzclassifier: Long, pwzfriendlyname: Long, hcryptprov: Long, ppwzidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerIdentityDelete(pwzidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerIdentityExport(pwzidentity: Long, pwzpassword: Long, ppwzexportxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetCryptKey(pwzidentity: Long, phcryptprov: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetDefault(ppwzpeername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetFriendlyName(pwzidentity: Long, ppwzfriendlyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetXML(pwzidentity: Long, ppwzidentityxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerIdentityImport(pwzimportxml: Long, pwzpassword: Long, ppwzidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerIdentitySetFriendlyName(pwzidentity: Long, pwzfriendlyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerNameToPeerHostName(pwzpeername: Long, ppwzhostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerPnrpEndResolve(hresolve: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetCloudInfo(pcnumclouds: Long, ppcloudinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetEndpoint(hresolve: Long, ppendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerPnrpRegister(pcwzpeername: Long, pregistrationinfo: Long, phregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerPnrpResolve(pcwzpeername: Long, pcwzcloudname: Long, pcendpoints: Long, ppendpoints: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerPnrpShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartResolve(pcwzpeername: Long, pcwzcloudname: Long, cmaxendpoints: Int, hevent: Long, phresolve: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartup(wversionrequested: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUnregister(hregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUpdateRegistration(hregistration: Long, pregistrationinfo: Long): Int
}

public actual fun DrtClose(hdrt: Long) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtClose(hdrt)
}

public actual fun DrtContinueSearch(hsearchcontext: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtContinueSearch(hsearchcontext)

public actual fun DrtCreateDerivedKey(plocalcert: Long, pkey: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKey(plocalcert, pkey)

public actual fun DrtCreateDerivedKeySecurityProvider(prootcert: Long, plocalcert: Long, ppsecurityprovider: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtCreateDerivedKeySecurityProvider(prootcert, plocalcert, ppsecurityprovider)

public actual fun DrtCreateDnsBootstrapResolver(port: UShort, pwszaddress: PCWSTR, ppmodule: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtCreateDnsBootstrapResolver(port.toShort(), pwszaddress, ppmodule)

public actual fun DrtCreateIpv6UdpTransport(scope: DRT_SCOPE, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: Long, phtransport: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtCreateIpv6UdpTransport(scope, dwscopeid.toInt(), dwlocalitythreshold.toInt(), pwport, phtransport)

public actual fun DrtCreateNullSecurityProvider(ppsecurityprovider: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtCreateNullSecurityProvider(ppsecurityprovider)

public actual fun DrtCreatePnrpBootstrapResolver(fpublish: BOOL, pwzpeername: PCWSTR, pwzcloudname: PCWSTR, pwzpublishingidentity: PCWSTR, ppresolver: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtCreatePnrpBootstrapResolver(fpublish, pwzpeername, pwzcloudname, pwzpublishingidentity, ppresolver)

public actual fun DrtDeleteDerivedKeySecurityProvider(psecurityprovider: Long) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDerivedKeySecurityProvider(psecurityprovider)
}

public actual fun DrtDeleteDnsBootstrapResolver(presolver: Long) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteDnsBootstrapResolver(presolver)
}

public actual fun DrtDeleteIpv6UdpTransport(htransport: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteIpv6UdpTransport(htransport)

public actual fun DrtDeleteNullSecurityProvider(psecurityprovider: Long) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtDeleteNullSecurityProvider(psecurityprovider)
}

public actual fun DrtDeletePnrpBootstrapResolver(presolver: Long) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtDeletePnrpBootstrapResolver(presolver)
}

public actual fun DrtEndSearch(hsearchcontext: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtEndSearch(hsearchcontext)

public actual fun DrtGetEventData(hdrt: Long, uleventdatalen: UInt, peventdata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtGetEventData(hdrt, uleventdatalen.toInt(), peventdata)

public actual fun DrtGetEventDataSize(hdrt: Long, puleventdatalen: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtGetEventDataSize(hdrt, puleventdatalen)

public actual fun DrtGetInstanceName(hdrt: Long, ulcbinstancenamesize: UInt, pwzdrtinstancename: PWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceName(hdrt, ulcbinstancenamesize.toInt(), pwzdrtinstancename)

public actual fun DrtGetInstanceNameSize(hdrt: Long, pulcbinstancenamesize: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtGetInstanceNameSize(hdrt, pulcbinstancenamesize)

public actual fun DrtGetSearchPath(hsearchcontext: Long, ulsearchpathsize: UInt, psearchpath: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPath(hsearchcontext, ulsearchpathsize.toInt(), psearchpath)

public actual fun DrtGetSearchPathSize(hsearchcontext: Long, pulsearchpathsize: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchPathSize(hsearchcontext, pulsearchpathsize)

public actual fun DrtGetSearchResult(hsearchcontext: Long, ulsearchresultsize: UInt, psearchresult: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResult(hsearchcontext, ulsearchresultsize.toInt(), psearchresult)

public actual fun DrtGetSearchResultSize(hsearchcontext: Long, pulsearchresultsize: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtGetSearchResultSize(hsearchcontext, pulsearchresultsize)

public actual fun DrtOpen(psettings: Long, hevent: HANDLE, pvcontext: Long, phdrt: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtOpen(psettings, hevent, pvcontext, phdrt)

public actual fun DrtRegisterKey(hdrt: Long, pregistration: Long, pvkeycontext: Long, phkeyregistration: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtRegisterKey(hdrt, pregistration, pvkeycontext, phkeyregistration)

public actual fun DrtStartSearch(hdrt: Long, pkey: Long, pinfo: Long, timeout: UInt, hevent: HANDLE, pvcontext: Long, hsearchcontext: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtStartSearch(hdrt, pkey, pinfo, timeout.toInt(), hevent, pvcontext, hsearchcontext)

public actual fun DrtUnregisterKey(hkeyregistration: Long) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtUnregisterKey(hkeyregistration)
}

public actual fun DrtUpdateKey(hkeyregistration: Long, pappdata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_DrtUpdateKey(hkeyregistration, pappdata)

public actual fun PeerCollabAddContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabAddContact(pwzcontactdata, ppcontact)

public actual fun PeerCollabAsyncInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, hevent: HANDLE, phinvitation: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteContact(pccontact, pcendpoint, pcinvitation, hevent, phinvitation)

public actual fun PeerCollabAsyncInviteEndpoint(pcendpoint: Long, pcinvitation: Long, hevent: HANDLE, phinvitation: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabAsyncInviteEndpoint(pcendpoint, pcinvitation, hevent, phinvitation)

public actual fun PeerCollabCancelInvitation(hinvitation: HANDLE): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabCancelInvitation(hinvitation)

public actual fun PeerCollabCloseHandle(hinvitation: HANDLE): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabCloseHandle(hinvitation)

public actual fun PeerCollabDeleteContact(pwzpeername: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteContact(pwzpeername)

public actual fun PeerCollabDeleteEndpointData(pcendpoint: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteEndpointData(pcendpoint)

public actual fun PeerCollabDeleteObject(pobjectid: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabDeleteObject(pobjectid)

public actual fun PeerCollabEnumApplicationRegistrationInfo(registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplicationRegistrationInfo(registrationtype, phpeerenum)

public actual fun PeerCollabEnumApplications(pcendpoint: Long, papplicationid: Long, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumApplications(pcendpoint, papplicationid, phpeerenum)

public actual fun PeerCollabEnumContacts(phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumContacts(phpeerenum)

public actual fun PeerCollabEnumEndpoints(pccontact: Long, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumEndpoints(pccontact, phpeerenum)

public actual fun PeerCollabEnumObjects(pcendpoint: Long, pobjectid: Long, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumObjects(pcendpoint, pobjectid, phpeerenum)

public actual fun PeerCollabEnumPeopleNearMe(phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabEnumPeopleNearMe(phpeerenum)

public actual fun PeerCollabExportContact(pwzpeername: PCWSTR, ppwzcontactdata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabExportContact(pwzpeername, ppwzcontactdata)

public actual fun PeerCollabGetAppLaunchInfo(pplaunchinfo: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetAppLaunchInfo(pplaunchinfo)

public actual fun PeerCollabGetApplicationRegistrationInfo(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, ppapplication: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetApplicationRegistrationInfo(papplicationid, registrationtype, ppapplication)

public actual fun PeerCollabGetContact(pwzpeername: PCWSTR, ppcontact: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetContact(pwzpeername, ppcontact)

public actual fun PeerCollabGetEndpointName(ppwzendpointname: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEndpointName(ppwzendpointname)

public actual fun PeerCollabGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetEventData(hpeerevent, ppeventdata)

public actual fun PeerCollabGetInvitationResponse(hinvitation: HANDLE, ppinvitationresponse: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetInvitationResponse(hinvitation, ppinvitationresponse)

public actual fun PeerCollabGetPresenceInfo(pcendpoint: Long, pppresenceinfo: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetPresenceInfo(pcendpoint, pppresenceinfo)

public actual fun PeerCollabGetSigninOptions(pdwsigninoptions: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabGetSigninOptions(pdwsigninoptions)

public actual fun PeerCollabInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteContact(pccontact, pcendpoint, pcinvitation, ppresponse)

public actual fun PeerCollabInviteEndpoint(pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabInviteEndpoint(pcendpoint, pcinvitation, ppresponse)

public actual fun PeerCollabParseContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabParseContact(pwzcontactdata, ppcontact)

public actual fun PeerCollabQueryContactData(pcendpoint: Long, ppwzcontactdata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabQueryContactData(pcendpoint, ppwzcontactdata)

public actual fun PeerCollabRefreshEndpointData(pcendpoint: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabRefreshEndpointData(pcendpoint)

public actual fun PeerCollabRegisterApplication(pcapplication: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterApplication(pcapplication, registrationtype)

public actual fun PeerCollabRegisterEvent(hevent: HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabRegisterEvent(hevent, ceventregistration.toInt(), peventregistrations, phpeerevent)

public actual fun PeerCollabSetEndpointName(pwzendpointname: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetEndpointName(pwzendpointname)

public actual fun PeerCollabSetObject(pcobject: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetObject(pcobject)

public actual fun PeerCollabSetPresenceInfo(pcpresenceinfo: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSetPresenceInfo(pcpresenceinfo)

public actual fun PeerCollabShutdown(): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabShutdown()

public actual fun PeerCollabSignin(hwndparent: HWND, dwsigninoptions: UInt): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignin(hwndparent, dwsigninoptions.toInt())

public actual fun PeerCollabSignout(dwsigninoptions: UInt): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSignout(dwsigninoptions.toInt())

public actual fun PeerCollabStartup(wversionrequested: UShort): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabStartup(wversionrequested.toShort())

public actual fun PeerCollabSubscribeEndpointData(pcendpoint: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabSubscribeEndpointData(pcendpoint)

public actual fun PeerCollabUnregisterApplication(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterApplication(papplicationid, registrationtype)

public actual fun PeerCollabUnregisterEvent(hpeerevent: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnregisterEvent(hpeerevent)

public actual fun PeerCollabUnsubscribeEndpointData(pcendpoint: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUnsubscribeEndpointData(pcendpoint)

public actual fun PeerCollabUpdateContact(pcontact: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCollabUpdateContact(pcontact)

public actual fun PeerCreatePeerName(pwzidentity: PCWSTR, pwzclassifier: PCWSTR, ppwzpeername: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerCreatePeerName(pwzidentity, pwzclassifier, ppwzpeername)

public actual fun PeerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddContentInformation(hpeerdist, hcontenthandle, cbnumberofbytes.toInt(), pbuffer, lpoverlapped).toUInt()

public actual fun PeerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientAddData(hpeerdist, hcontenthandle, cbnumberofbytes.toInt(), pbuffer, lpoverlapped).toUInt()

public actual fun PeerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientBlockRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes.toInt(), pbuffer, dwtimeoutinmilliseconds.toInt(), lpoverlapped).toUInt()

public actual fun PeerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCancelAsyncOperation(hpeerdist, hcontenthandle, poverlapped).toUInt()

public actual fun PeerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCloseContent(hpeerdist, hcontenthandle).toUInt()

public actual fun PeerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientCompleteContentInformation(hpeerdist, hcontenthandle, lpoverlapped).toUInt()

public actual fun PeerDistClientFlushContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientFlushContent(hpeerdist, pcontenttag, hcompletionport, ulcompletionkey.toLong(), lpoverlapped).toUInt()

public actual fun PeerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS, dwbuffersize: UInt, lpinformation: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientGetInformationByHandle(hpeerdist, hcontenthandle, peerdistclientinfoclass, dwbuffersize.toInt(), lpinformation).toUInt()

public actual fun PeerDistClientOpenContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontenthandle: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientOpenContent(hpeerdist, pcontenttag, hcompletionport, ulcompletionkey.toLong(), phcontenthandle).toUInt()

public actual fun PeerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistClientStreamRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes.toInt(), pbuffer, dwtimeoutinmilliseconds.toInt(), lpoverlapped).toUInt()

public actual fun PeerDistGetOverlappedResult(lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistGetOverlappedResult(lpoverlapped, lpnumberofbytestransferred, bwait)

public actual fun PeerDistGetStatus(hpeerdist: Long, ppeerdiststatus: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatus(hpeerdist, ppeerdiststatus).toUInt()

public actual fun PeerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistGetStatusEx(hpeerdist, ppeerdiststatus).toUInt()

public actual fun PeerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotification(hpeerdist, hcompletionport, ulcompletionkey.toLong(), lpoverlapped, ppeerdiststatus).toUInt()

public actual fun PeerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistRegisterForStatusChangeNotificationEx(hpeerdist, hcompletionport, ulcompletionkey.toLong(), lpoverlapped, ppeerdiststatus).toUInt()

public actual fun PeerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, poverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCancelAsyncOperation(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier, poverlapped).toUInt()

public actual fun PeerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseContentInformation(hpeerdist, hcontentinfo).toUInt()

public actual fun PeerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerCloseStreamHandle(hpeerdist, hstream).toUInt()

public actual fun PeerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformation(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier, ullcontentoffset.toLong(), cbcontentlength.toLong(), hcompletionport, ulcompletionkey.toLong(), phcontentinfo).toUInt()

public actual fun PeerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerOpenContentInformationEx(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier, ullcontentoffset.toLong(), cbcontentlength.toLong(), pretrievaloptions, hcompletionport, ulcompletionkey.toLong(), phcontentinfo).toUInt()

public actual fun PeerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishAddToStream(hpeerdist, hstream, cbnumberofbytes.toInt(), pbuffer, lpoverlapped).toUInt()

public actual fun PeerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishCompleteStream(hpeerdist, hstream, lpoverlapped).toUInt()

public actual fun PeerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, cbcontentlength: ULong, ppublishoptions: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phstream: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerPublishStream(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier, cbcontentlength.toLong(), ppublishoptions, hcompletionport, ulcompletionkey.toLong(), phstream).toUInt()

public actual fun PeerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerRetrieveContentInformation(hpeerdist, hcontentinfo, cbmaxnumberofbytes.toInt(), pbuffer, lpoverlapped).toUInt()

public actual fun PeerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistServerUnpublish(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier).toUInt()

public actual fun PeerDistShutdown(hpeerdist: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistShutdown(hpeerdist).toUInt()

public actual fun PeerDistStartup(dwversionrequested: UInt, phpeerdist: Long, pdwsupportedversion: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistStartup(dwversionrequested.toInt(), phpeerdist, pdwsupportedversion).toUInt()

public actual fun PeerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerDistUnregisterForStatusChangeNotification(hpeerdist).toUInt()

public actual fun PeerEndEnumeration(hpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerEndEnumeration(hpeerenum)

public actual fun PeerEnumGroups(pwzidentity: PCWSTR, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerEnumGroups(pwzidentity, phpeerenum)

public actual fun PeerEnumIdentities(phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerEnumIdentities(phpeerenum)

public actual fun PeerFreeData(pvdata: Long) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerFreeData(pvdata)
}

public actual fun PeerGetItemCount(hpeerenum: Long, pcount: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGetItemCount(hpeerenum, pcount)

public actual fun PeerGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGetNextItem(hpeerenum, pcount, pppvitems)

public actual fun PeerGraphAddRecord(hgraph: Long, precord: Long, precordid: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphAddRecord(hgraph, precord, precordid)

public actual fun PeerGraphClose(hgraph: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphClose(hgraph)

public actual fun PeerGraphCloseDirectConnection(hgraph: Long, ullconnectionid: ULong): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphCloseDirectConnection(hgraph, ullconnectionid.toLong())

public actual fun PeerGraphConnect(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphConnect(hgraph, pwzpeerid, paddress, pullconnectionid)

public actual fun PeerGraphCreate(pgraphproperties: Long, pwzdatabasename: PCWSTR, psecurityinterface: Long, phgraph: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphCreate(pgraphproperties, pwzdatabasename, psecurityinterface, phgraph)

public actual fun PeerGraphDelete(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphDelete(pwzgraphid, pwzpeerid, pwzdatabasename)

public actual fun PeerGraphDeleteRecord(hgraph: Long, precordid: Long, flocal: BOOL): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphDeleteRecord(hgraph, precordid, flocal)

public actual fun PeerGraphEndEnumeration(hpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEndEnumeration(hpeerenum)

public actual fun PeerGraphEnumConnections(hgraph: Long, dwflags: UInt, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumConnections(hgraph, dwflags.toInt(), phpeerenum)

public actual fun PeerGraphEnumNodes(hgraph: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumNodes(hgraph, pwzpeerid, phpeerenum)

public actual fun PeerGraphEnumRecords(hgraph: Long, precordtype: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphEnumRecords(hgraph, precordtype, pwzpeerid, phpeerenum)

public actual fun PeerGraphExportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphExportDatabase(hgraph, pwzfilepath)

public actual fun PeerGraphFreeData(pvdata: Long) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphFreeData(pvdata)
}

public actual fun PeerGraphGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetEventData(hpeerevent, ppeventdata)

public actual fun PeerGraphGetItemCount(hpeerenum: Long, pcount: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetItemCount(hpeerenum, pcount)

public actual fun PeerGraphGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNextItem(hpeerenum, pcount, pppvitems)

public actual fun PeerGraphGetNodeInfo(hgraph: Long, ullnodeid: ULong, ppnodeinfo: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetNodeInfo(hgraph, ullnodeid.toLong(), ppnodeinfo)

public actual fun PeerGraphGetProperties(hgraph: Long, ppgraphproperties: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetProperties(hgraph, ppgraphproperties)

public actual fun PeerGraphGetRecord(hgraph: Long, precordid: Long, pprecord: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetRecord(hgraph, precordid, pprecord)

public actual fun PeerGraphGetStatus(hgraph: Long, pdwstatus: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphGetStatus(hgraph, pdwstatus)

public actual fun PeerGraphImportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphImportDatabase(hgraph, pwzfilepath)

public actual fun PeerGraphListen(hgraph: Long, dwscope: UInt, dwscopeid: UInt, wport: UShort): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphListen(hgraph, dwscope.toInt(), dwscopeid.toInt(), wport.toShort())

public actual fun PeerGraphOpen(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR, psecurityinterface: Long, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: Long, phgraph: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpen(pwzgraphid, pwzpeerid, pwzdatabasename, psecurityinterface, crecordtypesyncprecedence.toInt(), precordtypesyncprecedence, phgraph)

public actual fun PeerGraphOpenDirectConnection(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphOpenDirectConnection(hgraph, pwzpeerid, paddress, pullconnectionid)

public actual fun PeerGraphPeerTimeToUniversalTime(hgraph: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphPeerTimeToUniversalTime(hgraph, pftpeertime, pftuniversaltime)

public actual fun PeerGraphRegisterEvent(hgraph: Long, hevent: HANDLE, ceventregistrations: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphRegisterEvent(hgraph, hevent, ceventregistrations.toInt(), peventregistrations, phpeerevent)

public actual fun PeerGraphSearchRecords(hgraph: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSearchRecords(hgraph, pwzcriteria, phpeerenum)

public actual fun PeerGraphSendData(hgraph: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSendData(hgraph, ullconnectionid.toLong(), ptype, cbdata.toInt(), pvdata)

public actual fun PeerGraphSetNodeAttributes(hgraph: Long, pwzattributes: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetNodeAttributes(hgraph, pwzattributes)

public actual fun PeerGraphSetPresence(hgraph: Long, fpresent: BOOL): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetPresence(hgraph, fpresent)

public actual fun PeerGraphSetProperties(hgraph: Long, pgraphproperties: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphSetProperties(hgraph, pgraphproperties)

public actual fun PeerGraphShutdown(): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphShutdown()

public actual fun PeerGraphStartup(wversionrequested: UShort, pversiondata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphStartup(wversionrequested.toShort(), pversiondata)

public actual fun PeerGraphUniversalTimeToPeerTime(hgraph: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphUniversalTimeToPeerTime(hgraph, pftuniversaltime, pftpeertime)

public actual fun PeerGraphUnregisterEvent(hpeerevent: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphUnregisterEvent(hpeerevent)

public actual fun PeerGraphUpdateRecord(hgraph: Long, precord: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphUpdateRecord(hgraph, precord)

public actual fun PeerGraphValidateDeferredRecords(hgraph: Long, crecordids: UInt, precordids: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGraphValidateDeferredRecords(hgraph, crecordids.toInt(), precordids)

public actual fun PeerGroupAddRecord(hgroup: Long, precord: Long, precordid: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupAddRecord(hgroup, precord, precordid)

public actual fun PeerGroupClose(hgroup: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupClose(hgroup)

public actual fun PeerGroupCloseDirectConnection(hgroup: Long, ullconnectionid: ULong): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCloseDirectConnection(hgroup, ullconnectionid.toLong())

public actual fun PeerGroupConnect(hgroup: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnect(hgroup)

public actual fun PeerGroupConnectByAddress(hgroup: Long, caddresses: UInt, paddresses: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupConnectByAddress(hgroup, caddresses.toInt(), paddresses)

public actual fun PeerGroupCreate(pproperties: Long, phgroup: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreate(pproperties, phgroup)

public actual fun PeerGroupCreateInvitation(hgroup: Long, pwzidentityinfo: PCWSTR, pftexpiration: Long, croles: UInt, proles: Long, ppwzinvitation: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreateInvitation(hgroup, pwzidentityinfo, pftexpiration, croles.toInt(), proles, ppwzinvitation)

public actual fun PeerGroupCreatePasswordInvitation(hgroup: Long, ppwzinvitation: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupCreatePasswordInvitation(hgroup, ppwzinvitation)

public actual fun PeerGroupDelete(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupDelete(pwzidentity, pwzgrouppeername)

public actual fun PeerGroupDeleteRecord(hgroup: Long, precordid: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupDeleteRecord(hgroup, precordid)

public actual fun PeerGroupEnumConnections(hgroup: Long, dwflags: UInt, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumConnections(hgroup, dwflags.toInt(), phpeerenum)

public actual fun PeerGroupEnumMembers(hgroup: Long, dwflags: UInt, pwzidentity: PCWSTR, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumMembers(hgroup, dwflags.toInt(), pwzidentity, phpeerenum)

public actual fun PeerGroupEnumRecords(hgroup: Long, precordtype: Long, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupEnumRecords(hgroup, precordtype, phpeerenum)

public actual fun PeerGroupExportConfig(hgroup: Long, pwzpassword: PCWSTR, ppwzxml: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportConfig(hgroup, pwzpassword, ppwzxml)

public actual fun PeerGroupExportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupExportDatabase(hgroup, pwzfilepath)

public actual fun PeerGroupGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetEventData(hpeerevent, ppeventdata)

public actual fun PeerGroupGetProperties(hgroup: Long, ppproperties: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetProperties(hgroup, ppproperties)

public actual fun PeerGroupGetRecord(hgroup: Long, precordid: Long, pprecord: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetRecord(hgroup, precordid, pprecord)

public actual fun PeerGroupGetStatus(hgroup: Long, pdwstatus: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupGetStatus(hgroup, pdwstatus)

public actual fun PeerGroupImportConfig(pwzxml: PCWSTR, pwzpassword: PCWSTR, foverwrite: BOOL, ppwzidentity: Long, ppwzgroup: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportConfig(pwzxml, pwzpassword, foverwrite, ppwzidentity, ppwzgroup)

public actual fun PeerGroupImportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupImportDatabase(hgroup, pwzfilepath)

public actual fun PeerGroupIssueCredentials(hgroup: Long, pwzsubjectidentity: PCWSTR, pcredentialinfo: Long, dwflags: UInt, ppwzinvitation: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupIssueCredentials(hgroup, pwzsubjectidentity, pcredentialinfo, dwflags.toInt(), ppwzinvitation)

public actual fun PeerGroupJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupJoin(pwzidentity, pwzinvitation, pwzcloud, phgroup)

public actual fun PeerGroupOpen(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpen(pwzidentity, pwzgrouppeername, pwzcloud, phgroup)

public actual fun PeerGroupOpenDirectConnection(hgroup: Long, pwzidentity: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupOpenDirectConnection(hgroup, pwzidentity, paddress, pullconnectionid)

public actual fun PeerGroupParseInvitation(pwzinvitation: PCWSTR, ppinvitationinfo: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupParseInvitation(pwzinvitation, ppinvitationinfo)

public actual fun PeerGroupPasswordJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzpassword: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupPasswordJoin(pwzidentity, pwzinvitation, pwzpassword, pwzcloud, phgroup)

public actual fun PeerGroupPeerTimeToUniversalTime(hgroup: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupPeerTimeToUniversalTime(hgroup, pftpeertime, pftuniversaltime)

public actual fun PeerGroupRegisterEvent(hgroup: Long, hevent: HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupRegisterEvent(hgroup, hevent, ceventregistration.toInt(), peventregistrations, phpeerevent)

public actual fun PeerGroupResumePasswordAuthentication(hgroup: Long, hpeereventhandle: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupResumePasswordAuthentication(hgroup, hpeereventhandle)

public actual fun PeerGroupSearchRecords(hgroup: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupSearchRecords(hgroup, pwzcriteria, phpeerenum)

public actual fun PeerGroupSendData(hgroup: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupSendData(hgroup, ullconnectionid.toLong(), ptype, cbdata.toInt(), pvdata)

public actual fun PeerGroupSetProperties(hgroup: Long, pproperties: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupSetProperties(hgroup, pproperties)

public actual fun PeerGroupShutdown(): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupShutdown()

public actual fun PeerGroupStartup(wversionrequested: UShort, pversiondata: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupStartup(wversionrequested.toShort(), pversiondata)

public actual fun PeerGroupUniversalTimeToPeerTime(hgroup: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupUniversalTimeToPeerTime(hgroup, pftuniversaltime, pftpeertime)

public actual fun PeerGroupUnregisterEvent(hpeerevent: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupUnregisterEvent(hpeerevent)

public actual fun PeerGroupUpdateRecord(hgroup: Long, precord: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerGroupUpdateRecord(hgroup, precord)

public actual fun PeerHostNameToPeerName(pwzhostname: PCWSTR, ppwzpeername: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerHostNameToPeerName(pwzhostname, ppwzpeername)

public actual fun PeerIdentityCreate(pwzclassifier: PCWSTR, pwzfriendlyname: PCWSTR, hcryptprov: ULong, ppwzidentity: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityCreate(pwzclassifier, pwzfriendlyname, hcryptprov.toLong(), ppwzidentity)

public actual fun PeerIdentityDelete(pwzidentity: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityDelete(pwzidentity)

public actual fun PeerIdentityExport(pwzidentity: PCWSTR, pwzpassword: PCWSTR, ppwzexportxml: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityExport(pwzidentity, pwzpassword, ppwzexportxml)

public actual fun PeerIdentityGetCryptKey(pwzidentity: PCWSTR, phcryptprov: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetCryptKey(pwzidentity, phcryptprov)

public actual fun PeerIdentityGetDefault(ppwzpeername: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetDefault(ppwzpeername)

public actual fun PeerIdentityGetFriendlyName(pwzidentity: PCWSTR, ppwzfriendlyname: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetFriendlyName(pwzidentity, ppwzfriendlyname)

public actual fun PeerIdentityGetXML(pwzidentity: PCWSTR, ppwzidentityxml: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityGetXML(pwzidentity, ppwzidentityxml)

public actual fun PeerIdentityImport(pwzimportxml: PCWSTR, pwzpassword: PCWSTR, ppwzidentity: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerIdentityImport(pwzimportxml, pwzpassword, ppwzidentity)

public actual fun PeerIdentitySetFriendlyName(pwzidentity: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerIdentitySetFriendlyName(pwzidentity, pwzfriendlyname)

public actual fun PeerNameToPeerHostName(pwzpeername: PCWSTR, ppwzhostname: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerNameToPeerHostName(pwzpeername, ppwzhostname)

public actual fun PeerPnrpEndResolve(hresolve: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpEndResolve(hresolve)

public actual fun PeerPnrpGetCloudInfo(pcnumclouds: Long, ppcloudinfo: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetCloudInfo(pcnumclouds, ppcloudinfo)

public actual fun PeerPnrpGetEndpoint(hresolve: Long, ppendpoint: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpGetEndpoint(hresolve, ppendpoint)

public actual fun PeerPnrpRegister(pcwzpeername: PCWSTR, pregistrationinfo: Long, phregistration: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpRegister(pcwzpeername, pregistrationinfo, phregistration)

public actual fun PeerPnrpResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, pcendpoints: Long, ppendpoints: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpResolve(pcwzpeername, pcwzcloudname, pcendpoints, ppendpoints)

public actual fun PeerPnrpShutdown(): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpShutdown()

public actual fun PeerPnrpStartResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, cmaxendpoints: UInt, hevent: HANDLE, phresolve: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartResolve(pcwzpeername, pcwzcloudname, cmaxendpoints.toInt(), hevent, phresolve)

public actual fun PeerPnrpStartup(wversionrequested: UShort): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpStartup(wversionrequested.toShort())

public actual fun PeerPnrpUnregister(hregistration: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUnregister(hregistration)

public actual fun PeerPnrpUpdateRegistration(hregistration: Long, pregistrationinfo: Long): HRESULT =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_PeerPnrpUpdateRegistration(hregistration, pregistrationinfo)
