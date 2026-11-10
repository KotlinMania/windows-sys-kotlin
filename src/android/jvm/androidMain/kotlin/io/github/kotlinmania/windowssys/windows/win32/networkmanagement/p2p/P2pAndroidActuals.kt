@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32NetworkmanagementP2pJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtClose(hdrt: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtContinueSearch(hsearchcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKey(plocalcert: Long, pkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKeySecurityProvider(prootcert: Long, plocalcert: Long, ppsecurityprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtCreateDnsBootstrapResolver(port: Short, pwszaddress: Long, ppmodule: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtCreateIpv6UdpTransport(scope: Int, dwscopeid: Int, dwlocalitythreshold: Int, pwport: Long, phtransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtCreateNullSecurityProvider(ppsecurityprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtCreatePnrpBootstrapResolver(fpublish: Int, pwzpeername: Long, pwzcloudname: Long, pwzpublishingidentity: Long, ppresolver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtDeleteDerivedKeySecurityProvider(psecurityprovider: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtDeleteDnsBootstrapResolver(presolver: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtDeleteIpv6UdpTransport(htransport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtDeleteNullSecurityProvider(psecurityprovider: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtDeletePnrpBootstrapResolver(presolver: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtEndSearch(hsearchcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtGetEventData(hdrt: Long, uleventdatalen: Int, peventdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtGetEventDataSize(hdrt: Long, puleventdatalen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceName(hdrt: Long, ulcbinstancenamesize: Int, pwzdrtinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceNameSize(hdrt: Long, pulcbinstancenamesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPath(hsearchcontext: Long, ulsearchpathsize: Int, psearchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPathSize(hsearchcontext: Long, pulsearchpathsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResult(hsearchcontext: Long, ulsearchresultsize: Int, psearchresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResultSize(hsearchcontext: Long, pulsearchresultsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtOpen(psettings: Long, hevent: Long, pvcontext: Long, phdrt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtRegisterKey(hdrt: Long, pregistration: Long, pvkeycontext: Long, phkeyregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtStartSearch(hdrt: Long, pkey: Long, pinfo: Long, timeout: Int, hevent: Long, pvcontext: Long, hsearchcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtUnregisterKey(hkeyregistration: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_drtUpdateKey(hkeyregistration: Long, pappdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabAddContact(pwzcontactdata: Long, ppcontact: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, hevent: Long, phinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteEndpoint(pcendpoint: Long, pcinvitation: Long, hevent: Long, phinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabCancelInvitation(hinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabCloseHandle(hinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteContact(pwzpeername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteObject(pobjectid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplicationRegistrationInfo(registrationtype: Int, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplications(pcendpoint: Long, papplicationid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumContacts(phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumEndpoints(pccontact: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumObjects(pcendpoint: Long, pobjectid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumPeopleNearMe(phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabExportContact(pwzpeername: Long, ppwzcontactdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabGetAppLaunchInfo(pplaunchinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabGetApplicationRegistrationInfo(papplicationid: Long, registrationtype: Int, ppapplication: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabGetContact(pwzpeername: Long, ppcontact: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEndpointName(ppwzendpointname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEventData(hpeerevent: Long, ppeventdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabGetInvitationResponse(hinvitation: Long, ppinvitationresponse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabGetPresenceInfo(pcendpoint: Long, pppresenceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabGetSigninOptions(pdwsigninoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, ppresponse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteEndpoint(pcendpoint: Long, pcinvitation: Long, ppresponse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabParseContact(pwzcontactdata: Long, ppcontact: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabQueryContactData(pcendpoint: Long, ppwzcontactdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabRefreshEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterApplication(pcapplication: Long, registrationtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterEvent(hevent: Long, ceventregistration: Int, peventregistrations: Long, phpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabSetEndpointName(pwzendpointname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabSetObject(pcobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabSetPresenceInfo(pcpresenceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabSignin(hwndparent: Long, dwsigninoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabSignout(dwsigninoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabStartup(wversionrequested: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabSubscribeEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterApplication(papplicationid: Long, registrationtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterEvent(hpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabUnsubscribeEndpointData(pcendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCollabUpdateContact(pcontact: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerCreatePeerName(pwzidentity: Long, pwzclassifier: Long, ppwzpeername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: Int, pbuffer: Long, dwtimeoutinmilliseconds: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistClientFlushContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: Long, ulcompletionkey: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: Int, dwbuffersize: Int, lpinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistClientOpenContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: Long, ulcompletionkey: Long, phcontenthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: Int, pbuffer: Long, dwtimeoutinmilliseconds: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistGetOverlappedResult(lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Long, ulcompletionkey: Long, lpoverlapped: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Long, ulcompletionkey: Long, lpoverlapped: Long, ppeerdiststatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, ullcontentoffset: Long, cbcontentlength: Long, hcompletionport: Long, ulcompletionkey: Long, phcontentinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, ullcontentoffset: Long, cbcontentlength: Long, pretrievaloptions: Long, hcompletionport: Long, ulcompletionkey: Long, phcontentinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long, cbcontentlength: Long, ppublishoptions: Long, hcompletionport: Long, ulcompletionkey: Long, phstream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: Int, pbuffer: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: Int, pcontentidentifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistShutdown(hpeerdist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistStartup(dwversionrequested: Int, phpeerdist: Long, pdwsupportedversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerEndEnumeration(hpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerEnumGroups(pwzidentity: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerEnumIdentities(phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerFreeData(pvdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGetItemCount(hpeerenum: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphAddRecord(hgraph: Long, precord: Long, precordid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphClose(hgraph: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphCloseDirectConnection(hgraph: Long, ullconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphConnect(hgraph: Long, pwzpeerid: Long, paddress: Long, pullconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphCreate(pgraphproperties: Long, pwzdatabasename: Long, psecurityinterface: Long, phgraph: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphDelete(pwzgraphid: Long, pwzpeerid: Long, pwzdatabasename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphDeleteRecord(hgraph: Long, precordid: Long, flocal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphEndEnumeration(hpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumConnections(hgraph: Long, dwflags: Int, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumNodes(hgraph: Long, pwzpeerid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumRecords(hgraph: Long, precordtype: Long, pwzpeerid: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphExportDatabase(hgraph: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphFreeData(pvdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphGetEventData(hpeerevent: Long, ppeventdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphGetItemCount(hpeerenum: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNodeInfo(hgraph: Long, ullnodeid: Long, ppnodeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphGetProperties(hgraph: Long, ppgraphproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphGetRecord(hgraph: Long, precordid: Long, pprecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphGetStatus(hgraph: Long, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphImportDatabase(hgraph: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphListen(hgraph: Long, dwscope: Int, dwscopeid: Int, wport: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphOpen(pwzgraphid: Long, pwzpeerid: Long, pwzdatabasename: Long, psecurityinterface: Long, crecordtypesyncprecedence: Int, precordtypesyncprecedence: Long, phgraph: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphOpenDirectConnection(hgraph: Long, pwzpeerid: Long, paddress: Long, pullconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphPeerTimeToUniversalTime(hgraph: Long, pftpeertime: Long, pftuniversaltime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphRegisterEvent(hgraph: Long, hevent: Long, ceventregistrations: Int, peventregistrations: Long, phpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphSearchRecords(hgraph: Long, pwzcriteria: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphSendData(hgraph: Long, ullconnectionid: Long, ptype: Long, cbdata: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphSetNodeAttributes(hgraph: Long, pwzattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphSetPresence(hgraph: Long, fpresent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphSetProperties(hgraph: Long, pgraphproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphStartup(wversionrequested: Short, pversiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphUniversalTimeToPeerTime(hgraph: Long, pftuniversaltime: Long, pftpeertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphUnregisterEvent(hpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphUpdateRecord(hgraph: Long, precord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGraphValidateDeferredRecords(hgraph: Long, crecordids: Int, precordids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupAddRecord(hgroup: Long, precord: Long, precordid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupClose(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupCloseDirectConnection(hgroup: Long, ullconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupConnect(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupConnectByAddress(hgroup: Long, caddresses: Int, paddresses: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupCreate(pproperties: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupCreateInvitation(hgroup: Long, pwzidentityinfo: Long, pftexpiration: Long, croles: Int, proles: Long, ppwzinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupCreatePasswordInvitation(hgroup: Long, ppwzinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupDelete(pwzidentity: Long, pwzgrouppeername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupDeleteRecord(hgroup: Long, precordid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumConnections(hgroup: Long, dwflags: Int, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumMembers(hgroup: Long, dwflags: Int, pwzidentity: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumRecords(hgroup: Long, precordtype: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupExportConfig(hgroup: Long, pwzpassword: Long, ppwzxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupExportDatabase(hgroup: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupGetEventData(hpeerevent: Long, ppeventdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupGetProperties(hgroup: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupGetRecord(hgroup: Long, precordid: Long, pprecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupGetStatus(hgroup: Long, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupImportConfig(pwzxml: Long, pwzpassword: Long, foverwrite: Int, ppwzidentity: Long, ppwzgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupImportDatabase(hgroup: Long, pwzfilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupIssueCredentials(hgroup: Long, pwzsubjectidentity: Long, pcredentialinfo: Long, dwflags: Int, ppwzinvitation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupJoin(pwzidentity: Long, pwzinvitation: Long, pwzcloud: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupOpen(pwzidentity: Long, pwzgrouppeername: Long, pwzcloud: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupOpenDirectConnection(hgroup: Long, pwzidentity: Long, paddress: Long, pullconnectionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupParseInvitation(pwzinvitation: Long, ppinvitationinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupPasswordJoin(pwzidentity: Long, pwzinvitation: Long, pwzpassword: Long, pwzcloud: Long, phgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupPeerTimeToUniversalTime(hgroup: Long, pftpeertime: Long, pftuniversaltime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupRegisterEvent(hgroup: Long, hevent: Long, ceventregistration: Int, peventregistrations: Long, phpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupResumePasswordAuthentication(hgroup: Long, hpeereventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupSearchRecords(hgroup: Long, pwzcriteria: Long, phpeerenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupSendData(hgroup: Long, ullconnectionid: Long, ptype: Long, cbdata: Int, pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupSetProperties(hgroup: Long, pproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupStartup(wversionrequested: Short, pversiondata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupUniversalTimeToPeerTime(hgroup: Long, pftuniversaltime: Long, pftpeertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupUnregisterEvent(hpeerevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerGroupUpdateRecord(hgroup: Long, precord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerHostNameToPeerName(pwzhostname: Long, ppwzpeername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerIdentityCreate(pwzclassifier: Long, pwzfriendlyname: Long, hcryptprov: Long, ppwzidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerIdentityDelete(pwzidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerIdentityExport(pwzidentity: Long, pwzpassword: Long, ppwzexportxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetCryptKey(pwzidentity: Long, phcryptprov: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetDefault(ppwzpeername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetFriendlyName(pwzidentity: Long, ppwzfriendlyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetXML(pwzidentity: Long, ppwzidentityxml: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerIdentityImport(pwzimportxml: Long, pwzpassword: Long, ppwzidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerIdentitySetFriendlyName(pwzidentity: Long, pwzfriendlyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerNameToPeerHostName(pwzpeername: Long, ppwzhostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerPnrpEndResolve(hresolve: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetCloudInfo(pcnumclouds: Long, ppcloudinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetEndpoint(hresolve: Long, ppendpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerPnrpRegister(pcwzpeername: Long, pregistrationinfo: Long, phregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerPnrpResolve(pcwzpeername: Long, pcwzcloudname: Long, pcendpoints: Long, ppendpoints: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerPnrpShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartResolve(pcwzpeername: Long, pcwzcloudname: Long, cmaxendpoints: Int, hevent: Long, phresolve: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartup(wversionrequested: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerPnrpUnregister(hregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_p2p_peerPnrpUpdateRegistration(hregistration: Long, pregistrationinfo: Long): Int
}

public actual fun drtClose(hdrt: COpaquePointer?) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtClose((hdrt?.value ?: 0L))
}

public actual fun drtContinueSearch(hsearchcontext: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtContinueSearch((hsearchcontext?.value ?: 0L))

public actual fun drtCreateDerivedKey(plocalcert: COpaquePointer?, pkey: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKey((plocalcert?.value ?: 0L), (pkey?.value ?: 0L))

public actual fun drtCreateDerivedKeySecurityProvider(prootcert: COpaquePointer?, plocalcert: COpaquePointer?, ppsecurityprovider: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKeySecurityProvider((prootcert?.value ?: 0L), (plocalcert?.value ?: 0L), (ppsecurityprovider?.value ?: 0L))

public actual fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtCreateDnsBootstrapResolver(port.toShort(), (pwszaddress?.value ?: 0L), (ppmodule?.value ?: 0L))

public actual fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: COpaquePointer?, phtransport: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtCreateIpv6UdpTransport(scope, dwscopeid.toInt(), dwlocalitythreshold.toInt(), (pwport?.value ?: 0L), (phtransport?.value ?: 0L))

public actual fun drtCreateNullSecurityProvider(ppsecurityprovider: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtCreateNullSecurityProvider((ppsecurityprovider?.value ?: 0L))

public actual fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtCreatePnrpBootstrapResolver(fpublish, (pwzpeername?.value ?: 0L), (pwzcloudname?.value ?: 0L), (pwzpublishingidentity?.value ?: 0L), (ppresolver?.value ?: 0L))

public actual fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: COpaquePointer?) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtDeleteDerivedKeySecurityProvider((psecurityprovider?.value ?: 0L))
}

public actual fun drtDeleteDnsBootstrapResolver(presolver: COpaquePointer?) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtDeleteDnsBootstrapResolver((presolver?.value ?: 0L))
}

public actual fun drtDeleteIpv6UdpTransport(htransport: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtDeleteIpv6UdpTransport((htransport?.value ?: 0L))

public actual fun drtDeleteNullSecurityProvider(psecurityprovider: COpaquePointer?) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtDeleteNullSecurityProvider((psecurityprovider?.value ?: 0L))
}

public actual fun drtDeletePnrpBootstrapResolver(presolver: COpaquePointer?) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtDeletePnrpBootstrapResolver((presolver?.value ?: 0L))
}

public actual fun drtEndSearch(hsearchcontext: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtEndSearch((hsearchcontext?.value ?: 0L))

public actual fun drtGetEventData(hdrt: COpaquePointer?, uleventdatalen: UInt, peventdata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtGetEventData((hdrt?.value ?: 0L), uleventdatalen.toInt(), (peventdata?.value ?: 0L))

public actual fun drtGetEventDataSize(hdrt: COpaquePointer?, puleventdatalen: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtGetEventDataSize((hdrt?.value ?: 0L), (puleventdatalen?.value ?: 0L))

public actual fun drtGetInstanceName(hdrt: COpaquePointer?, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceName((hdrt?.value ?: 0L), ulcbinstancenamesize.toInt(), (pwzdrtinstancename?.value ?: 0L))

public actual fun drtGetInstanceNameSize(hdrt: COpaquePointer?, pulcbinstancenamesize: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceNameSize((hdrt?.value ?: 0L), (pulcbinstancenamesize?.value ?: 0L))

public actual fun drtGetSearchPath(hsearchcontext: COpaquePointer?, ulsearchpathsize: UInt, psearchpath: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPath((hsearchcontext?.value ?: 0L), ulsearchpathsize.toInt(), (psearchpath?.value ?: 0L))

public actual fun drtGetSearchPathSize(hsearchcontext: COpaquePointer?, pulsearchpathsize: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPathSize((hsearchcontext?.value ?: 0L), (pulsearchpathsize?.value ?: 0L))

public actual fun drtGetSearchResult(hsearchcontext: COpaquePointer?, ulsearchresultsize: UInt, psearchresult: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResult((hsearchcontext?.value ?: 0L), ulsearchresultsize.toInt(), (psearchresult?.value ?: 0L))

public actual fun drtGetSearchResultSize(hsearchcontext: COpaquePointer?, pulsearchresultsize: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResultSize((hsearchcontext?.value ?: 0L), (pulsearchresultsize?.value ?: 0L))

public actual fun drtOpen(psettings: COpaquePointer?, hevent: Handle, pvcontext: COpaquePointer?, phdrt: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtOpen((psettings?.value ?: 0L), (hevent?.value ?: 0L), (pvcontext?.value ?: 0L), (phdrt?.value ?: 0L))

public actual fun drtRegisterKey(hdrt: COpaquePointer?, pregistration: COpaquePointer?, pvkeycontext: COpaquePointer?, phkeyregistration: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtRegisterKey((hdrt?.value ?: 0L), (pregistration?.value ?: 0L), (pvkeycontext?.value ?: 0L), (phkeyregistration?.value ?: 0L))

public actual fun drtStartSearch(hdrt: COpaquePointer?, pkey: COpaquePointer?, pinfo: COpaquePointer?, timeout: UInt, hevent: Handle, pvcontext: COpaquePointer?, hsearchcontext: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtStartSearch((hdrt?.value ?: 0L), (pkey?.value ?: 0L), (pinfo?.value ?: 0L), timeout.toInt(), (hevent?.value ?: 0L), (pvcontext?.value ?: 0L), (hsearchcontext?.value ?: 0L))

public actual fun drtUnregisterKey(hkeyregistration: COpaquePointer?) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtUnregisterKey((hkeyregistration?.value ?: 0L))
}

public actual fun drtUpdateKey(hkeyregistration: COpaquePointer?, pappdata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_drtUpdateKey((hkeyregistration?.value ?: 0L), (pappdata?.value ?: 0L))

public actual fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabAddContact((pwzcontactdata?.value ?: 0L), (ppcontact?.value ?: 0L))

public actual fun peerCollabAsyncInviteContact(pccontact: COpaquePointer?, pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, hevent: Handle, phinvitation: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteContact((pccontact?.value ?: 0L), (pcendpoint?.value ?: 0L), (pcinvitation?.value ?: 0L), (hevent?.value ?: 0L), (phinvitation?.value ?: 0L))

public actual fun peerCollabAsyncInviteEndpoint(pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, hevent: Handle, phinvitation: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteEndpoint((pcendpoint?.value ?: 0L), (pcinvitation?.value ?: 0L), (hevent?.value ?: 0L), (phinvitation?.value ?: 0L))

public actual fun peerCollabCancelInvitation(hinvitation: Handle): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabCancelInvitation((hinvitation?.value ?: 0L))

public actual fun peerCollabCloseHandle(hinvitation: Handle): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabCloseHandle((hinvitation?.value ?: 0L))

public actual fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteContact((pwzpeername?.value ?: 0L))

public actual fun peerCollabDeleteEndpointData(pcendpoint: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteEndpointData((pcendpoint?.value ?: 0L))

public actual fun peerCollabDeleteObject(pobjectid: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteObject((pobjectid?.value ?: 0L))

public actual fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplicationRegistrationInfo(registrationtype, (phpeerenum?.value ?: 0L))

public actual fun peerCollabEnumApplications(pcendpoint: COpaquePointer?, papplicationid: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplications((pcendpoint?.value ?: 0L), (papplicationid?.value ?: 0L), (phpeerenum?.value ?: 0L))

public actual fun peerCollabEnumContacts(phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumContacts((phpeerenum?.value ?: 0L))

public actual fun peerCollabEnumEndpoints(pccontact: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumEndpoints((pccontact?.value ?: 0L), (phpeerenum?.value ?: 0L))

public actual fun peerCollabEnumObjects(pcendpoint: COpaquePointer?, pobjectid: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumObjects((pcendpoint?.value ?: 0L), (pobjectid?.value ?: 0L), (phpeerenum?.value ?: 0L))

public actual fun peerCollabEnumPeopleNearMe(phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumPeopleNearMe((phpeerenum?.value ?: 0L))

public actual fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabExportContact((pwzpeername?.value ?: 0L), (ppwzcontactdata?.value ?: 0L))

public actual fun peerCollabGetAppLaunchInfo(pplaunchinfo: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetAppLaunchInfo((pplaunchinfo?.value ?: 0L))

public actual fun peerCollabGetApplicationRegistrationInfo(papplicationid: COpaquePointer?, registrationtype: PeerApplicationRegistrationType, ppapplication: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetApplicationRegistrationInfo((papplicationid?.value ?: 0L), registrationtype, (ppapplication?.value ?: 0L))

public actual fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetContact((pwzpeername?.value ?: 0L), (ppcontact?.value ?: 0L))

public actual fun peerCollabGetEndpointName(ppwzendpointname: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEndpointName((ppwzendpointname?.value ?: 0L))

public actual fun peerCollabGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEventData((hpeerevent?.value ?: 0L), (ppeventdata?.value ?: 0L))

public actual fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetInvitationResponse((hinvitation?.value ?: 0L), (ppinvitationresponse?.value ?: 0L))

public actual fun peerCollabGetPresenceInfo(pcendpoint: COpaquePointer?, pppresenceinfo: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetPresenceInfo((pcendpoint?.value ?: 0L), (pppresenceinfo?.value ?: 0L))

public actual fun peerCollabGetSigninOptions(pdwsigninoptions: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetSigninOptions((pdwsigninoptions?.value ?: 0L))

public actual fun peerCollabInviteContact(pccontact: COpaquePointer?, pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, ppresponse: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteContact((pccontact?.value ?: 0L), (pcendpoint?.value ?: 0L), (pcinvitation?.value ?: 0L), (ppresponse?.value ?: 0L))

public actual fun peerCollabInviteEndpoint(pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, ppresponse: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteEndpoint((pcendpoint?.value ?: 0L), (pcinvitation?.value ?: 0L), (ppresponse?.value ?: 0L))

public actual fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabParseContact((pwzcontactdata?.value ?: 0L), (ppcontact?.value ?: 0L))

public actual fun peerCollabQueryContactData(pcendpoint: COpaquePointer?, ppwzcontactdata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabQueryContactData((pcendpoint?.value ?: 0L), (ppwzcontactdata?.value ?: 0L))

public actual fun peerCollabRefreshEndpointData(pcendpoint: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabRefreshEndpointData((pcendpoint?.value ?: 0L))

public actual fun peerCollabRegisterApplication(pcapplication: COpaquePointer?, registrationtype: PeerApplicationRegistrationType): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterApplication((pcapplication?.value ?: 0L), registrationtype)

public actual fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterEvent((hevent?.value ?: 0L), ceventregistration.toInt(), (peventregistrations?.value ?: 0L), (phpeerevent?.value ?: 0L))

public actual fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabSetEndpointName((pwzendpointname?.value ?: 0L))

public actual fun peerCollabSetObject(pcobject: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabSetObject((pcobject?.value ?: 0L))

public actual fun peerCollabSetPresenceInfo(pcpresenceinfo: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabSetPresenceInfo((pcpresenceinfo?.value ?: 0L))

public actual fun peerCollabShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabShutdown()

public actual fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabSignin((hwndparent?.value ?: 0L), dwsigninoptions.toInt())

public actual fun peerCollabSignout(dwsigninoptions: UInt): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabSignout(dwsigninoptions.toInt())

public actual fun peerCollabStartup(wversionrequested: UShort): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabStartup(wversionrequested.toShort())

public actual fun peerCollabSubscribeEndpointData(pcendpoint: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabSubscribeEndpointData((pcendpoint?.value ?: 0L))

public actual fun peerCollabUnregisterApplication(papplicationid: COpaquePointer?, registrationtype: PeerApplicationRegistrationType): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterApplication((papplicationid?.value ?: 0L), registrationtype)

public actual fun peerCollabUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterEvent((hpeerevent?.value ?: 0L))

public actual fun peerCollabUnsubscribeEndpointData(pcendpoint: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabUnsubscribeEndpointData((pcendpoint?.value ?: 0L))

public actual fun peerCollabUpdateContact(pcontact: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCollabUpdateContact((pcontact?.value ?: 0L))

public actual fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerCreatePeerName((pwzidentity?.value ?: 0L), (pwzclassifier?.value ?: 0L), (ppwzpeername?.value ?: 0L))

public actual fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddContentInformation(hpeerdist, hcontenthandle, cbnumberofbytes.toInt(), (pbuffer?.value ?: 0L), (lpoverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddData(hpeerdist, hcontenthandle, cbnumberofbytes.toInt(), (pbuffer?.value ?: 0L), (lpoverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, dwtimeoutinmilliseconds: UInt, lpoverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistClientBlockRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes.toInt(), (pbuffer?.value ?: 0L), dwtimeoutinmilliseconds.toInt(), (lpoverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistClientCancelAsyncOperation(hpeerdist, hcontenthandle, (poverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistClientCloseContent(hpeerdist, hcontenthandle).toUInt()

public actual fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistClientCompleteContentInformation(hpeerdist, hcontenthandle, (lpoverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistClientFlushContent(hpeerdist, (pcontenttag?.value ?: 0L), (hcompletionport?.value ?: 0L), ulcompletionkey.toLong(), (lpoverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistClientGetInformationByHandle(hpeerdist, hcontenthandle, peerdistclientinfoclass, dwbuffersize.toInt(), (lpinformation?.value ?: 0L)).toUInt()

public actual fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistClientOpenContent(hpeerdist, (pcontenttag?.value ?: 0L), (hcompletionport?.value ?: 0L), ulcompletionkey.toLong(), (phcontenthandle?.value ?: 0L)).toUInt()

public actual fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, dwtimeoutinmilliseconds: UInt, lpoverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistClientStreamRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes.toInt(), (pbuffer?.value ?: 0L), dwtimeoutinmilliseconds.toInt(), (lpoverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistGetOverlappedResult(lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistGetOverlappedResult((lpoverlapped?.value ?: 0L), (lpnumberofbytestransferred?.value ?: 0L), bwait)

public actual fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatus(hpeerdist, (ppeerdiststatus?.value ?: 0L)).toUInt()

public actual fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatusEx(hpeerdist, (ppeerdiststatus?.value ?: 0L)).toUInt()

public actual fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?, ppeerdiststatus: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotification(hpeerdist, (hcompletionport?.value ?: 0L), ulcompletionkey.toLong(), (lpoverlapped?.value ?: 0L), (ppeerdiststatus?.value ?: 0L)).toUInt()

public actual fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?, ppeerdiststatus: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotificationEx(hpeerdist, (hcompletionport?.value ?: 0L), ulcompletionkey.toLong(), (lpoverlapped?.value ?: 0L), (ppeerdiststatus?.value ?: 0L)).toUInt()

public actual fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistServerCancelAsyncOperation(hpeerdist, cbcontentidentifier.toInt(), (pcontentidentifier?.value ?: 0L), (poverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseContentInformation(hpeerdist, hcontentinfo).toUInt()

public actual fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseStreamHandle(hpeerdist, hstream).toUInt()

public actual fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformation(hpeerdist, cbcontentidentifier.toInt(), (pcontentidentifier?.value ?: 0L), ullcontentoffset.toLong(), cbcontentlength.toLong(), (hcompletionport?.value ?: 0L), ulcompletionkey.toLong(), (phcontentinfo?.value ?: 0L)).toUInt()

public actual fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformationEx(hpeerdist, cbcontentidentifier.toInt(), (pcontentidentifier?.value ?: 0L), ullcontentoffset.toLong(), cbcontentlength.toLong(), (pretrievaloptions?.value ?: 0L), (hcompletionport?.value ?: 0L), ulcompletionkey.toLong(), (phcontentinfo?.value ?: 0L)).toUInt()

public actual fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishAddToStream(hpeerdist, hstream, cbnumberofbytes.toInt(), (pbuffer?.value ?: 0L), (lpoverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishCompleteStream(hpeerdist, hstream, (lpoverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, cbcontentlength: ULong, ppublishoptions: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phstream: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishStream(hpeerdist, cbcontentidentifier.toInt(), (pcontentidentifier?.value ?: 0L), cbcontentlength.toLong(), (ppublishoptions?.value ?: 0L), (hcompletionport?.value ?: 0L), ulcompletionkey.toLong(), (phstream?.value ?: 0L)).toUInt()

public actual fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistServerRetrieveContentInformation(hpeerdist, hcontentinfo, cbmaxnumberofbytes.toInt(), (pbuffer?.value ?: 0L), (lpoverlapped?.value ?: 0L)).toUInt()

public actual fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistServerUnpublish(hpeerdist, cbcontentidentifier.toInt(), (pcontentidentifier?.value ?: 0L)).toUInt()

public actual fun peerDistShutdown(hpeerdist: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistShutdown(hpeerdist).toUInt()

public actual fun peerDistStartup(dwversionrequested: UInt, phpeerdist: COpaquePointer?, pdwsupportedversion: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistStartup(dwversionrequested.toInt(), (phpeerdist?.value ?: 0L), (pdwsupportedversion?.value ?: 0L)).toUInt()

public actual fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerDistUnregisterForStatusChangeNotification(hpeerdist).toUInt()

public actual fun peerEndEnumeration(hpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerEndEnumeration((hpeerenum?.value ?: 0L))

public actual fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerEnumGroups((pwzidentity?.value ?: 0L), (phpeerenum?.value ?: 0L))

public actual fun peerEnumIdentities(phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerEnumIdentities((phpeerenum?.value ?: 0L))

public actual fun peerFreeData(pvdata: COpaquePointer?) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerFreeData((pvdata?.value ?: 0L))
}

public actual fun peerGetItemCount(hpeerenum: COpaquePointer?, pcount: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGetItemCount((hpeerenum?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun peerGetNextItem(hpeerenum: COpaquePointer?, pcount: COpaquePointer?, pppvitems: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGetNextItem((hpeerenum?.value ?: 0L), (pcount?.value ?: 0L), (pppvitems?.value ?: 0L))

public actual fun peerGraphAddRecord(hgraph: COpaquePointer?, precord: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphAddRecord((hgraph?.value ?: 0L), (precord?.value ?: 0L), (precordid?.value ?: 0L))

public actual fun peerGraphClose(hgraph: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphClose((hgraph?.value ?: 0L))

public actual fun peerGraphCloseDirectConnection(hgraph: COpaquePointer?, ullconnectionid: ULong): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphCloseDirectConnection((hgraph?.value ?: 0L), ullconnectionid.toLong())

public actual fun peerGraphConnect(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphConnect((hgraph?.value ?: 0L), (pwzpeerid?.value ?: 0L), (paddress?.value ?: 0L), (pullconnectionid?.value ?: 0L))

public actual fun peerGraphCreate(pgraphproperties: COpaquePointer?, pwzdatabasename: Pcwstr, psecurityinterface: COpaquePointer?, phgraph: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphCreate((pgraphproperties?.value ?: 0L), (pwzdatabasename?.value ?: 0L), (psecurityinterface?.value ?: 0L), (phgraph?.value ?: 0L))

public actual fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphDelete((pwzgraphid?.value ?: 0L), (pwzpeerid?.value ?: 0L), (pwzdatabasename?.value ?: 0L))

public actual fun peerGraphDeleteRecord(hgraph: COpaquePointer?, precordid: COpaquePointer?, flocal: Bool): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphDeleteRecord((hgraph?.value ?: 0L), (precordid?.value ?: 0L), flocal)

public actual fun peerGraphEndEnumeration(hpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphEndEnumeration((hpeerenum?.value ?: 0L))

public actual fun peerGraphEnumConnections(hgraph: COpaquePointer?, dwflags: UInt, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumConnections((hgraph?.value ?: 0L), dwflags.toInt(), (phpeerenum?.value ?: 0L))

public actual fun peerGraphEnumNodes(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumNodes((hgraph?.value ?: 0L), (pwzpeerid?.value ?: 0L), (phpeerenum?.value ?: 0L))

public actual fun peerGraphEnumRecords(hgraph: COpaquePointer?, precordtype: COpaquePointer?, pwzpeerid: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumRecords((hgraph?.value ?: 0L), (precordtype?.value ?: 0L), (pwzpeerid?.value ?: 0L), (phpeerenum?.value ?: 0L))

public actual fun peerGraphExportDatabase(hgraph: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphExportDatabase((hgraph?.value ?: 0L), (pwzfilepath?.value ?: 0L))

public actual fun peerGraphFreeData(pvdata: COpaquePointer?) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphFreeData((pvdata?.value ?: 0L))
}

public actual fun peerGraphGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetEventData((hpeerevent?.value ?: 0L), (ppeventdata?.value ?: 0L))

public actual fun peerGraphGetItemCount(hpeerenum: COpaquePointer?, pcount: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetItemCount((hpeerenum?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun peerGraphGetNextItem(hpeerenum: COpaquePointer?, pcount: COpaquePointer?, pppvitems: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNextItem((hpeerenum?.value ?: 0L), (pcount?.value ?: 0L), (pppvitems?.value ?: 0L))

public actual fun peerGraphGetNodeInfo(hgraph: COpaquePointer?, ullnodeid: ULong, ppnodeinfo: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNodeInfo((hgraph?.value ?: 0L), ullnodeid.toLong(), (ppnodeinfo?.value ?: 0L))

public actual fun peerGraphGetProperties(hgraph: COpaquePointer?, ppgraphproperties: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetProperties((hgraph?.value ?: 0L), (ppgraphproperties?.value ?: 0L))

public actual fun peerGraphGetRecord(hgraph: COpaquePointer?, precordid: COpaquePointer?, pprecord: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetRecord((hgraph?.value ?: 0L), (precordid?.value ?: 0L), (pprecord?.value ?: 0L))

public actual fun peerGraphGetStatus(hgraph: COpaquePointer?, pdwstatus: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetStatus((hgraph?.value ?: 0L), (pdwstatus?.value ?: 0L))

public actual fun peerGraphImportDatabase(hgraph: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphImportDatabase((hgraph?.value ?: 0L), (pwzfilepath?.value ?: 0L))

public actual fun peerGraphListen(hgraph: COpaquePointer?, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphListen((hgraph?.value ?: 0L), dwscope.toInt(), dwscopeid.toInt(), wport.toShort())

public actual fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: COpaquePointer?, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: COpaquePointer?, phgraph: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphOpen((pwzgraphid?.value ?: 0L), (pwzpeerid?.value ?: 0L), (pwzdatabasename?.value ?: 0L), (psecurityinterface?.value ?: 0L), crecordtypesyncprecedence.toInt(), (precordtypesyncprecedence?.value ?: 0L), (phgraph?.value ?: 0L))

public actual fun peerGraphOpenDirectConnection(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphOpenDirectConnection((hgraph?.value ?: 0L), (pwzpeerid?.value ?: 0L), (paddress?.value ?: 0L), (pullconnectionid?.value ?: 0L))

public actual fun peerGraphPeerTimeToUniversalTime(hgraph: COpaquePointer?, pftpeertime: COpaquePointer?, pftuniversaltime: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphPeerTimeToUniversalTime((hgraph?.value ?: 0L), (pftpeertime?.value ?: 0L), (pftuniversaltime?.value ?: 0L))

public actual fun peerGraphRegisterEvent(hgraph: COpaquePointer?, hevent: Handle, ceventregistrations: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphRegisterEvent((hgraph?.value ?: 0L), (hevent?.value ?: 0L), ceventregistrations.toInt(), (peventregistrations?.value ?: 0L), (phpeerevent?.value ?: 0L))

public actual fun peerGraphSearchRecords(hgraph: COpaquePointer?, pwzcriteria: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphSearchRecords((hgraph?.value ?: 0L), (pwzcriteria?.value ?: 0L), (phpeerenum?.value ?: 0L))

public actual fun peerGraphSendData(hgraph: COpaquePointer?, ullconnectionid: ULong, ptype: COpaquePointer?, cbdata: UInt, pvdata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphSendData((hgraph?.value ?: 0L), ullconnectionid.toLong(), (ptype?.value ?: 0L), cbdata.toInt(), (pvdata?.value ?: 0L))

public actual fun peerGraphSetNodeAttributes(hgraph: COpaquePointer?, pwzattributes: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphSetNodeAttributes((hgraph?.value ?: 0L), (pwzattributes?.value ?: 0L))

public actual fun peerGraphSetPresence(hgraph: COpaquePointer?, fpresent: Bool): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphSetPresence((hgraph?.value ?: 0L), fpresent)

public actual fun peerGraphSetProperties(hgraph: COpaquePointer?, pgraphproperties: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphSetProperties((hgraph?.value ?: 0L), (pgraphproperties?.value ?: 0L))

public actual fun peerGraphShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphShutdown()

public actual fun peerGraphStartup(wversionrequested: UShort, pversiondata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphStartup(wversionrequested.toShort(), (pversiondata?.value ?: 0L))

public actual fun peerGraphUniversalTimeToPeerTime(hgraph: COpaquePointer?, pftuniversaltime: COpaquePointer?, pftpeertime: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphUniversalTimeToPeerTime((hgraph?.value ?: 0L), (pftuniversaltime?.value ?: 0L), (pftpeertime?.value ?: 0L))

public actual fun peerGraphUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphUnregisterEvent((hpeerevent?.value ?: 0L))

public actual fun peerGraphUpdateRecord(hgraph: COpaquePointer?, precord: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphUpdateRecord((hgraph?.value ?: 0L), (precord?.value ?: 0L))

public actual fun peerGraphValidateDeferredRecords(hgraph: COpaquePointer?, crecordids: UInt, precordids: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGraphValidateDeferredRecords((hgraph?.value ?: 0L), crecordids.toInt(), (precordids?.value ?: 0L))

public actual fun peerGroupAddRecord(hgroup: COpaquePointer?, precord: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupAddRecord((hgroup?.value ?: 0L), (precord?.value ?: 0L), (precordid?.value ?: 0L))

public actual fun peerGroupClose(hgroup: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupClose((hgroup?.value ?: 0L))

public actual fun peerGroupCloseDirectConnection(hgroup: COpaquePointer?, ullconnectionid: ULong): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupCloseDirectConnection((hgroup?.value ?: 0L), ullconnectionid.toLong())

public actual fun peerGroupConnect(hgroup: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupConnect((hgroup?.value ?: 0L))

public actual fun peerGroupConnectByAddress(hgroup: COpaquePointer?, caddresses: UInt, paddresses: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupConnectByAddress((hgroup?.value ?: 0L), caddresses.toInt(), (paddresses?.value ?: 0L))

public actual fun peerGroupCreate(pproperties: COpaquePointer?, phgroup: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupCreate((pproperties?.value ?: 0L), (phgroup?.value ?: 0L))

public actual fun peerGroupCreateInvitation(hgroup: COpaquePointer?, pwzidentityinfo: Pcwstr, pftexpiration: COpaquePointer?, croles: UInt, proles: COpaquePointer?, ppwzinvitation: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupCreateInvitation((hgroup?.value ?: 0L), (pwzidentityinfo?.value ?: 0L), (pftexpiration?.value ?: 0L), croles.toInt(), (proles?.value ?: 0L), (ppwzinvitation?.value ?: 0L))

public actual fun peerGroupCreatePasswordInvitation(hgroup: COpaquePointer?, ppwzinvitation: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupCreatePasswordInvitation((hgroup?.value ?: 0L), (ppwzinvitation?.value ?: 0L))

public actual fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupDelete((pwzidentity?.value ?: 0L), (pwzgrouppeername?.value ?: 0L))

public actual fun peerGroupDeleteRecord(hgroup: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupDeleteRecord((hgroup?.value ?: 0L), (precordid?.value ?: 0L))

public actual fun peerGroupEnumConnections(hgroup: COpaquePointer?, dwflags: UInt, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumConnections((hgroup?.value ?: 0L), dwflags.toInt(), (phpeerenum?.value ?: 0L))

public actual fun peerGroupEnumMembers(hgroup: COpaquePointer?, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumMembers((hgroup?.value ?: 0L), dwflags.toInt(), (pwzidentity?.value ?: 0L), (phpeerenum?.value ?: 0L))

public actual fun peerGroupEnumRecords(hgroup: COpaquePointer?, precordtype: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumRecords((hgroup?.value ?: 0L), (precordtype?.value ?: 0L), (phpeerenum?.value ?: 0L))

public actual fun peerGroupExportConfig(hgroup: COpaquePointer?, pwzpassword: Pcwstr, ppwzxml: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupExportConfig((hgroup?.value ?: 0L), (pwzpassword?.value ?: 0L), (ppwzxml?.value ?: 0L))

public actual fun peerGroupExportDatabase(hgroup: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupExportDatabase((hgroup?.value ?: 0L), (pwzfilepath?.value ?: 0L))

public actual fun peerGroupGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetEventData((hpeerevent?.value ?: 0L), (ppeventdata?.value ?: 0L))

public actual fun peerGroupGetProperties(hgroup: COpaquePointer?, ppproperties: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetProperties((hgroup?.value ?: 0L), (ppproperties?.value ?: 0L))

public actual fun peerGroupGetRecord(hgroup: COpaquePointer?, precordid: COpaquePointer?, pprecord: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetRecord((hgroup?.value ?: 0L), (precordid?.value ?: 0L), (pprecord?.value ?: 0L))

public actual fun peerGroupGetStatus(hgroup: COpaquePointer?, pdwstatus: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetStatus((hgroup?.value ?: 0L), (pdwstatus?.value ?: 0L))

public actual fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: COpaquePointer?, ppwzgroup: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupImportConfig((pwzxml?.value ?: 0L), (pwzpassword?.value ?: 0L), foverwrite, (ppwzidentity?.value ?: 0L), (ppwzgroup?.value ?: 0L))

public actual fun peerGroupImportDatabase(hgroup: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupImportDatabase((hgroup?.value ?: 0L), (pwzfilepath?.value ?: 0L))

public actual fun peerGroupIssueCredentials(hgroup: COpaquePointer?, pwzsubjectidentity: Pcwstr, pcredentialinfo: COpaquePointer?, dwflags: UInt, ppwzinvitation: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupIssueCredentials((hgroup?.value ?: 0L), (pwzsubjectidentity?.value ?: 0L), (pcredentialinfo?.value ?: 0L), dwflags.toInt(), (ppwzinvitation?.value ?: 0L))

public actual fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupJoin((pwzidentity?.value ?: 0L), (pwzinvitation?.value ?: 0L), (pwzcloud?.value ?: 0L), (phgroup?.value ?: 0L))

public actual fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupOpen((pwzidentity?.value ?: 0L), (pwzgrouppeername?.value ?: 0L), (pwzcloud?.value ?: 0L), (phgroup?.value ?: 0L))

public actual fun peerGroupOpenDirectConnection(hgroup: COpaquePointer?, pwzidentity: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupOpenDirectConnection((hgroup?.value ?: 0L), (pwzidentity?.value ?: 0L), (paddress?.value ?: 0L), (pullconnectionid?.value ?: 0L))

public actual fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupParseInvitation((pwzinvitation?.value ?: 0L), (ppinvitationinfo?.value ?: 0L))

public actual fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupPasswordJoin((pwzidentity?.value ?: 0L), (pwzinvitation?.value ?: 0L), (pwzpassword?.value ?: 0L), (pwzcloud?.value ?: 0L), (phgroup?.value ?: 0L))

public actual fun peerGroupPeerTimeToUniversalTime(hgroup: COpaquePointer?, pftpeertime: COpaquePointer?, pftuniversaltime: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupPeerTimeToUniversalTime((hgroup?.value ?: 0L), (pftpeertime?.value ?: 0L), (pftuniversaltime?.value ?: 0L))

public actual fun peerGroupRegisterEvent(hgroup: COpaquePointer?, hevent: Handle, ceventregistration: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupRegisterEvent((hgroup?.value ?: 0L), (hevent?.value ?: 0L), ceventregistration.toInt(), (peventregistrations?.value ?: 0L), (phpeerevent?.value ?: 0L))

public actual fun peerGroupResumePasswordAuthentication(hgroup: COpaquePointer?, hpeereventhandle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupResumePasswordAuthentication((hgroup?.value ?: 0L), (hpeereventhandle?.value ?: 0L))

public actual fun peerGroupSearchRecords(hgroup: COpaquePointer?, pwzcriteria: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupSearchRecords((hgroup?.value ?: 0L), (pwzcriteria?.value ?: 0L), (phpeerenum?.value ?: 0L))

public actual fun peerGroupSendData(hgroup: COpaquePointer?, ullconnectionid: ULong, ptype: COpaquePointer?, cbdata: UInt, pvdata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupSendData((hgroup?.value ?: 0L), ullconnectionid.toLong(), (ptype?.value ?: 0L), cbdata.toInt(), (pvdata?.value ?: 0L))

public actual fun peerGroupSetProperties(hgroup: COpaquePointer?, pproperties: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupSetProperties((hgroup?.value ?: 0L), (pproperties?.value ?: 0L))

public actual fun peerGroupShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupShutdown()

public actual fun peerGroupStartup(wversionrequested: UShort, pversiondata: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupStartup(wversionrequested.toShort(), (pversiondata?.value ?: 0L))

public actual fun peerGroupUniversalTimeToPeerTime(hgroup: COpaquePointer?, pftuniversaltime: COpaquePointer?, pftpeertime: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupUniversalTimeToPeerTime((hgroup?.value ?: 0L), (pftuniversaltime?.value ?: 0L), (pftpeertime?.value ?: 0L))

public actual fun peerGroupUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupUnregisterEvent((hpeerevent?.value ?: 0L))

public actual fun peerGroupUpdateRecord(hgroup: COpaquePointer?, precord: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerGroupUpdateRecord((hgroup?.value ?: 0L), (precord?.value ?: 0L))

public actual fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerHostNameToPeerName((pwzhostname?.value ?: 0L), (ppwzpeername?.value ?: 0L))

public actual fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerIdentityCreate((pwzclassifier?.value ?: 0L), (pwzfriendlyname?.value ?: 0L), hcryptprov.toLong(), (ppwzidentity?.value ?: 0L))

public actual fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerIdentityDelete((pwzidentity?.value ?: 0L))

public actual fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerIdentityExport((pwzidentity?.value ?: 0L), (pwzpassword?.value ?: 0L), (ppwzexportxml?.value ?: 0L))

public actual fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetCryptKey((pwzidentity?.value ?: 0L), (phcryptprov?.value ?: 0L))

public actual fun peerIdentityGetDefault(ppwzpeername: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetDefault((ppwzpeername?.value ?: 0L))

public actual fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetFriendlyName((pwzidentity?.value ?: 0L), (ppwzfriendlyname?.value ?: 0L))

public actual fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetXML((pwzidentity?.value ?: 0L), (ppwzidentityxml?.value ?: 0L))

public actual fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerIdentityImport((pwzimportxml?.value ?: 0L), (pwzpassword?.value ?: 0L), (ppwzidentity?.value ?: 0L))

public actual fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerIdentitySetFriendlyName((pwzidentity?.value ?: 0L), (pwzfriendlyname?.value ?: 0L))

public actual fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerNameToPeerHostName((pwzpeername?.value ?: 0L), (ppwzhostname?.value ?: 0L))

public actual fun peerPnrpEndResolve(hresolve: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerPnrpEndResolve((hresolve?.value ?: 0L))

public actual fun peerPnrpGetCloudInfo(pcnumclouds: COpaquePointer?, ppcloudinfo: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetCloudInfo((pcnumclouds?.value ?: 0L), (ppcloudinfo?.value ?: 0L))

public actual fun peerPnrpGetEndpoint(hresolve: COpaquePointer?, ppendpoint: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetEndpoint((hresolve?.value ?: 0L), (ppendpoint?.value ?: 0L))

public actual fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: COpaquePointer?, phregistration: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerPnrpRegister((pcwzpeername?.value ?: 0L), (pregistrationinfo?.value ?: 0L), (phregistration?.value ?: 0L))

public actual fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: COpaquePointer?, ppendpoints: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerPnrpResolve((pcwzpeername?.value ?: 0L), (pcwzcloudname?.value ?: 0L), (pcendpoints?.value ?: 0L), (ppendpoints?.value ?: 0L))

public actual fun peerPnrpShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerPnrpShutdown()

public actual fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartResolve((pcwzpeername?.value ?: 0L), (pcwzcloudname?.value ?: 0L), cmaxendpoints.toInt(), (hevent?.value ?: 0L), (phresolve?.value ?: 0L))

public actual fun peerPnrpStartup(wversionrequested: UShort): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartup(wversionrequested.toShort())

public actual fun peerPnrpUnregister(hregistration: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerPnrpUnregister((hregistration?.value ?: 0L))

public actual fun peerPnrpUpdateRegistration(hregistration: COpaquePointer?, pregistrationinfo: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssys_windows_win32_networkmanagement_p2p_peerPnrpUpdateRegistration((hregistration?.value ?: 0L), (pregistrationinfo?.value ?: 0L))
