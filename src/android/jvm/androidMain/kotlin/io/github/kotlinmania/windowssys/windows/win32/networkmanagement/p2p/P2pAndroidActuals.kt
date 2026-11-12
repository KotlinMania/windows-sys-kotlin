@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public actual fun drtClose(hdrt: ConstPtr) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtClose(hdrt.rawAddress)
}

public actual fun drtContinueSearch(hsearchcontext: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtContinueSearch(hsearchcontext.rawAddress)

public actual fun drtCreateDerivedKey(plocalcert: ConstPtr, pkey: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKey(plocalcert.rawAddress, pkey.rawAddress)

public actual fun drtCreateDerivedKeySecurityProvider(prootcert: ConstPtr, plocalcert: ConstPtr, ppsecurityprovider: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKeySecurityProvider(prootcert.rawAddress, plocalcert.rawAddress, ppsecurityprovider.rawAddress)

public actual fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDnsBootstrapResolver(port.toShort(), pwszaddress.rawAddress, ppmodule.rawAddress)

public actual fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: MutPtr, phtransport: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreateIpv6UdpTransport(scope, dwscopeid.toInt(), dwlocalitythreshold.toInt(), pwport.rawAddress, phtransport.rawAddress)

public actual fun drtCreateNullSecurityProvider(ppsecurityprovider: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreateNullSecurityProvider(ppsecurityprovider.rawAddress)

public actual fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtCreatePnrpBootstrapResolver(fpublish, pwzpeername.rawAddress, pwzcloudname.rawAddress, pwzpublishingidentity.rawAddress, ppresolver.rawAddress)

public actual fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: ConstPtr) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDerivedKeySecurityProvider(psecurityprovider.rawAddress)
}

public actual fun drtDeleteDnsBootstrapResolver(presolver: ConstPtr) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDnsBootstrapResolver(presolver.rawAddress)
}

public actual fun drtDeleteIpv6UdpTransport(htransport: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteIpv6UdpTransport(htransport.rawAddress)

public actual fun drtDeleteNullSecurityProvider(psecurityprovider: ConstPtr) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteNullSecurityProvider(psecurityprovider.rawAddress)
}

public actual fun drtDeletePnrpBootstrapResolver(presolver: ConstPtr) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtDeletePnrpBootstrapResolver(presolver.rawAddress)
}

public actual fun drtEndSearch(hsearchcontext: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtEndSearch(hsearchcontext.rawAddress)

public actual fun drtGetEventData(hdrt: ConstPtr, uleventdatalen: UInt, peventdata: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetEventData(hdrt.rawAddress, uleventdatalen.toInt(), peventdata.rawAddress)

public actual fun drtGetEventDataSize(hdrt: ConstPtr, puleventdatalen: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetEventDataSize(hdrt.rawAddress, puleventdatalen.rawAddress)

public actual fun drtGetInstanceName(hdrt: ConstPtr, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceName(hdrt.rawAddress, ulcbinstancenamesize.toInt(), pwzdrtinstancename.rawAddress)

public actual fun drtGetInstanceNameSize(hdrt: ConstPtr, pulcbinstancenamesize: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceNameSize(hdrt.rawAddress, pulcbinstancenamesize.rawAddress)

public actual fun drtGetSearchPath(hsearchcontext: ConstPtr, ulsearchpathsize: UInt, psearchpath: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPath(hsearchcontext.rawAddress, ulsearchpathsize.toInt(), psearchpath.rawAddress)

public actual fun drtGetSearchPathSize(hsearchcontext: ConstPtr, pulsearchpathsize: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPathSize(hsearchcontext.rawAddress, pulsearchpathsize.rawAddress)

public actual fun drtGetSearchResult(hsearchcontext: ConstPtr, ulsearchresultsize: UInt, psearchresult: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResult(hsearchcontext.rawAddress, ulsearchresultsize.toInt(), psearchresult.rawAddress)

public actual fun drtGetSearchResultSize(hsearchcontext: ConstPtr, pulsearchresultsize: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResultSize(hsearchcontext.rawAddress, pulsearchresultsize.rawAddress)

public actual fun drtOpen(psettings: ConstPtr, hevent: Handle, pvcontext: ConstPtr, phdrt: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtOpen(psettings.rawAddress, hevent.rawAddress, pvcontext.rawAddress, phdrt.rawAddress)

public actual fun drtRegisterKey(hdrt: ConstPtr, pregistration: ConstPtr, pvkeycontext: ConstPtr, phkeyregistration: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtRegisterKey(hdrt.rawAddress, pregistration.rawAddress, pvkeycontext.rawAddress, phkeyregistration.rawAddress)

public actual fun drtStartSearch(hdrt: ConstPtr, pkey: ConstPtr, pinfo: ConstPtr, timeout: UInt, hevent: Handle, pvcontext: ConstPtr, hsearchcontext: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtStartSearch(hdrt.rawAddress, pkey.rawAddress, pinfo.rawAddress, timeout.toInt(), hevent.rawAddress, pvcontext.rawAddress, hsearchcontext.rawAddress)

public actual fun drtUnregisterKey(hkeyregistration: ConstPtr) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtUnregisterKey(hkeyregistration.rawAddress)
}

public actual fun drtUpdateKey(hkeyregistration: ConstPtr, pappdata: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pDrtUpdateKey(hkeyregistration.rawAddress, pappdata.rawAddress)

public actual fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAddContact(pwzcontactdata.rawAddress, ppcontact.rawAddress)

public actual fun peerCollabAsyncInviteContact(pccontact: ConstPtr, pcendpoint: ConstPtr, pcinvitation: ConstPtr, hevent: Handle, phinvitation: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteContact(pccontact.rawAddress, pcendpoint.rawAddress, pcinvitation.rawAddress, hevent.rawAddress, phinvitation.rawAddress)

public actual fun peerCollabAsyncInviteEndpoint(pcendpoint: ConstPtr, pcinvitation: ConstPtr, hevent: Handle, phinvitation: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteEndpoint(pcendpoint.rawAddress, pcinvitation.rawAddress, hevent.rawAddress, phinvitation.rawAddress)

public actual fun peerCollabCancelInvitation(hinvitation: Handle): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabCancelInvitation(hinvitation.rawAddress)

public actual fun peerCollabCloseHandle(hinvitation: Handle): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabCloseHandle(hinvitation.rawAddress)

public actual fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteContact(pwzpeername.rawAddress)

public actual fun peerCollabDeleteEndpointData(pcendpoint: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteEndpointData(pcendpoint.rawAddress)

public actual fun peerCollabDeleteObject(pobjectid: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteObject(pobjectid.rawAddress)

public actual fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplicationRegistrationInfo(registrationtype, phpeerenum.rawAddress)

public actual fun peerCollabEnumApplications(pcendpoint: ConstPtr, papplicationid: ConstPtr, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplications(pcendpoint.rawAddress, papplicationid.rawAddress, phpeerenum.rawAddress)

public actual fun peerCollabEnumContacts(phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumContacts(phpeerenum.rawAddress)

public actual fun peerCollabEnumEndpoints(pccontact: ConstPtr, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumEndpoints(pccontact.rawAddress, phpeerenum.rawAddress)

public actual fun peerCollabEnumObjects(pcendpoint: ConstPtr, pobjectid: ConstPtr, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumObjects(pcendpoint.rawAddress, pobjectid.rawAddress, phpeerenum.rawAddress)

public actual fun peerCollabEnumPeopleNearMe(phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumPeopleNearMe(phpeerenum.rawAddress)

public actual fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabExportContact(pwzpeername.rawAddress, ppwzcontactdata.rawAddress)

public actual fun peerCollabGetAppLaunchInfo(pplaunchinfo: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetAppLaunchInfo(pplaunchinfo.rawAddress)

public actual fun peerCollabGetApplicationRegistrationInfo(papplicationid: ConstPtr, registrationtype: PeerApplicationRegistrationType, ppapplication: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetApplicationRegistrationInfo(papplicationid.rawAddress, registrationtype, ppapplication.rawAddress)

public actual fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetContact(pwzpeername.rawAddress, ppcontact.rawAddress)

public actual fun peerCollabGetEndpointName(ppwzendpointname: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEndpointName(ppwzendpointname.rawAddress)

public actual fun peerCollabGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEventData(hpeerevent.rawAddress, ppeventdata.rawAddress)

public actual fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetInvitationResponse(hinvitation.rawAddress, ppinvitationresponse.rawAddress)

public actual fun peerCollabGetPresenceInfo(pcendpoint: ConstPtr, pppresenceinfo: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetPresenceInfo(pcendpoint.rawAddress, pppresenceinfo.rawAddress)

public actual fun peerCollabGetSigninOptions(pdwsigninoptions: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetSigninOptions(pdwsigninoptions.rawAddress)

public actual fun peerCollabInviteContact(pccontact: ConstPtr, pcendpoint: ConstPtr, pcinvitation: ConstPtr, ppresponse: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteContact(pccontact.rawAddress, pcendpoint.rawAddress, pcinvitation.rawAddress, ppresponse.rawAddress)

public actual fun peerCollabInviteEndpoint(pcendpoint: ConstPtr, pcinvitation: ConstPtr, ppresponse: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteEndpoint(pcendpoint.rawAddress, pcinvitation.rawAddress, ppresponse.rawAddress)

public actual fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabParseContact(pwzcontactdata.rawAddress, ppcontact.rawAddress)

public actual fun peerCollabQueryContactData(pcendpoint: ConstPtr, ppwzcontactdata: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabQueryContactData(pcendpoint.rawAddress, ppwzcontactdata.rawAddress)

public actual fun peerCollabRefreshEndpointData(pcendpoint: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRefreshEndpointData(pcendpoint.rawAddress)

public actual fun peerCollabRegisterApplication(pcapplication: ConstPtr, registrationtype: PeerApplicationRegistrationType): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterApplication(pcapplication.rawAddress, registrationtype)

public actual fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterEvent(hevent.rawAddress, ceventregistration.toInt(), peventregistrations.rawAddress, phpeerevent.rawAddress)

public actual fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetEndpointName(pwzendpointname.rawAddress)

public actual fun peerCollabSetObject(pcobject: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetObject(pcobject.rawAddress)

public actual fun peerCollabSetPresenceInfo(pcpresenceinfo: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetPresenceInfo(pcpresenceinfo.rawAddress)

public actual fun peerCollabShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown()

public actual fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignin(hwndparent.rawAddress, dwsigninoptions.toInt())

public actual fun peerCollabSignout(dwsigninoptions: UInt): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout(dwsigninoptions.toInt())

public actual fun peerCollabStartup(wversionrequested: UShort): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup(wversionrequested.toShort())

public actual fun peerCollabSubscribeEndpointData(pcendpoint: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSubscribeEndpointData(pcendpoint.rawAddress)

public actual fun peerCollabUnregisterApplication(papplicationid: ConstPtr, registrationtype: PeerApplicationRegistrationType): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterApplication(papplicationid.rawAddress, registrationtype)

public actual fun peerCollabUnregisterEvent(hpeerevent: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterEvent(hpeerevent.rawAddress)

public actual fun peerCollabUnsubscribeEndpointData(pcendpoint: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnsubscribeEndpointData(pcendpoint.rawAddress)

public actual fun peerCollabUpdateContact(pcontact: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUpdateContact(pcontact.rawAddress)

public actual fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerCreatePeerName(pwzidentity.rawAddress, pwzclassifier.rawAddress, ppwzpeername.rawAddress)

public actual fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddContentInformation(hpeerdist, hcontenthandle, cbnumberofbytes.toInt(), pbuffer.rawAddress, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddData(hpeerdist, hcontenthandle, cbnumberofbytes.toInt(), pbuffer.rawAddress, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientBlockRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes.toInt(), pbuffer.rawAddress, dwtimeoutinmilliseconds.toInt(), lpoverlapped.rawAddress).toUInt()

public actual fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCancelAsyncOperation(hpeerdist, hcontenthandle, poverlapped.rawAddress).toUInt()

public actual fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent(hpeerdist, hcontenthandle).toUInt()

public actual fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCompleteContentInformation(hpeerdist, hcontenthandle, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientFlushContent(hpeerdist, pcontenttag.rawAddress, hcompletionport.rawAddress, ulcompletionkey.toLong(), lpoverlapped.rawAddress).toUInt()

public actual fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: MutPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientGetInformationByHandle(hpeerdist, hcontenthandle, peerdistclientinfoclass, dwbuffersize.toInt(), lpinformation.rawAddress).toUInt()

public actual fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: MutPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientOpenContent(hpeerdist, pcontenttag.rawAddress, hcompletionport.rawAddress, ulcompletionkey.toLong(), phcontenthandle.rawAddress).toUInt()

public actual fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientStreamRead(hpeerdist, hcontenthandle, cbmaxnumberofbytes.toInt(), pbuffer.rawAddress, dwtimeoutinmilliseconds.toInt(), lpoverlapped.rawAddress).toUInt()

public actual fun peerDistGetOverlappedResult(lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, bwait: Bool): Bool =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetOverlappedResult(lpoverlapped.rawAddress, lpnumberofbytestransferred.rawAddress, bwait)

public actual fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: MutPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatus(hpeerdist, ppeerdiststatus.rawAddress).toUInt()

public actual fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: MutPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatusEx(hpeerdist, ppeerdiststatus.rawAddress).toUInt()

public actual fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr, ppeerdiststatus: MutPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotification(hpeerdist, hcompletionport.rawAddress, ulcompletionkey.toLong(), lpoverlapped.rawAddress, ppeerdiststatus.rawAddress).toUInt()

public actual fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr, ppeerdiststatus: MutPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotificationEx(hpeerdist, hcompletionport.rawAddress, ulcompletionkey.toLong(), lpoverlapped.rawAddress, ppeerdiststatus.rawAddress).toUInt()

public actual fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, poverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCancelAsyncOperation(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier.rawAddress, poverlapped.rawAddress).toUInt()

public actual fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation(hpeerdist, hcontentinfo).toUInt()

public actual fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle(hpeerdist, hstream).toUInt()

public actual fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformation(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier.rawAddress, ullcontentoffset.toLong(), cbcontentlength.toLong(), hcompletionport.rawAddress, ulcompletionkey.toLong(), phcontentinfo.rawAddress).toUInt()

public actual fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformationEx(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier.rawAddress, ullcontentoffset.toLong(), cbcontentlength.toLong(), pretrievaloptions.rawAddress, hcompletionport.rawAddress, ulcompletionkey.toLong(), phcontentinfo.rawAddress).toUInt()

public actual fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr, lpoverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishAddToStream(hpeerdist, hstream, cbnumberofbytes.toInt(), pbuffer.rawAddress, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishCompleteStream(hpeerdist, hstream, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr, cbcontentlength: ULong, ppublishoptions: ConstPtr, hcompletionport: Handle, ulcompletionkey: ULong, phstream: MutPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishStream(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier.rawAddress, cbcontentlength.toLong(), ppublishoptions.rawAddress, hcompletionport.rawAddress, ulcompletionkey.toLong(), phstream.rawAddress).toUInt()

public actual fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr, lpoverlapped: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerRetrieveContentInformation(hpeerdist, hcontentinfo, cbmaxnumberofbytes.toInt(), pbuffer.rawAddress, lpoverlapped.rawAddress).toUInt()

public actual fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerUnpublish(hpeerdist, cbcontentidentifier.toInt(), pcontentidentifier.rawAddress).toUInt()

public actual fun peerDistShutdown(hpeerdist: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown(hpeerdist).toUInt()

public actual fun peerDistStartup(dwversionrequested: UInt, phpeerdist: MutPtr, pdwsupportedversion: MutPtr): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistStartup(dwversionrequested.toInt(), phpeerdist.rawAddress, pdwsupportedversion.rawAddress).toUInt()

public actual fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification(hpeerdist).toUInt()

public actual fun peerEndEnumeration(hpeerenum: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerEndEnumeration(hpeerenum.rawAddress)

public actual fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerEnumGroups(pwzidentity.rawAddress, phpeerenum.rawAddress)

public actual fun peerEnumIdentities(phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerEnumIdentities(phpeerenum.rawAddress)

public actual fun peerFreeData(pvdata: ConstPtr) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerFreeData(pvdata.rawAddress)
}

public actual fun peerGetItemCount(hpeerenum: ConstPtr, pcount: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGetItemCount(hpeerenum.rawAddress, pcount.rawAddress)

public actual fun peerGetNextItem(hpeerenum: ConstPtr, pcount: MutPtr, pppvitems: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGetNextItem(hpeerenum.rawAddress, pcount.rawAddress, pppvitems.rawAddress)

public actual fun peerGraphAddRecord(hgraph: ConstPtr, precord: ConstPtr, precordid: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphAddRecord(hgraph.rawAddress, precord.rawAddress, precordid.rawAddress)

public actual fun peerGraphClose(hgraph: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphClose(hgraph.rawAddress)

public actual fun peerGraphCloseDirectConnection(hgraph: ConstPtr, ullconnectionid: ULong): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphCloseDirectConnection(hgraph.rawAddress, ullconnectionid.toLong())

public actual fun peerGraphConnect(hgraph: ConstPtr, pwzpeerid: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphConnect(hgraph.rawAddress, pwzpeerid.rawAddress, paddress.rawAddress, pullconnectionid.rawAddress)

public actual fun peerGraphCreate(pgraphproperties: ConstPtr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr, phgraph: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphCreate(pgraphproperties.rawAddress, pwzdatabasename.rawAddress, psecurityinterface.rawAddress, phgraph.rawAddress)

public actual fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphDelete(pwzgraphid.rawAddress, pwzpeerid.rawAddress, pwzdatabasename.rawAddress)

public actual fun peerGraphDeleteRecord(hgraph: ConstPtr, precordid: ConstPtr, flocal: Bool): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphDeleteRecord(hgraph.rawAddress, precordid.rawAddress, flocal)

public actual fun peerGraphEndEnumeration(hpeerenum: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEndEnumeration(hpeerenum.rawAddress)

public actual fun peerGraphEnumConnections(hgraph: ConstPtr, dwflags: UInt, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumConnections(hgraph.rawAddress, dwflags.toInt(), phpeerenum.rawAddress)

public actual fun peerGraphEnumNodes(hgraph: ConstPtr, pwzpeerid: Pcwstr, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumNodes(hgraph.rawAddress, pwzpeerid.rawAddress, phpeerenum.rawAddress)

public actual fun peerGraphEnumRecords(hgraph: ConstPtr, precordtype: ConstPtr, pwzpeerid: Pcwstr, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumRecords(hgraph.rawAddress, precordtype.rawAddress, pwzpeerid.rawAddress, phpeerenum.rawAddress)

public actual fun peerGraphExportDatabase(hgraph: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphExportDatabase(hgraph.rawAddress, pwzfilepath.rawAddress)

public actual fun peerGraphFreeData(pvdata: ConstPtr) {
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphFreeData(pvdata.rawAddress)
}

public actual fun peerGraphGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetEventData(hpeerevent.rawAddress, ppeventdata.rawAddress)

public actual fun peerGraphGetItemCount(hpeerenum: ConstPtr, pcount: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetItemCount(hpeerenum.rawAddress, pcount.rawAddress)

public actual fun peerGraphGetNextItem(hpeerenum: ConstPtr, pcount: MutPtr, pppvitems: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNextItem(hpeerenum.rawAddress, pcount.rawAddress, pppvitems.rawAddress)

public actual fun peerGraphGetNodeInfo(hgraph: ConstPtr, ullnodeid: ULong, ppnodeinfo: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNodeInfo(hgraph.rawAddress, ullnodeid.toLong(), ppnodeinfo.rawAddress)

public actual fun peerGraphGetProperties(hgraph: ConstPtr, ppgraphproperties: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetProperties(hgraph.rawAddress, ppgraphproperties.rawAddress)

public actual fun peerGraphGetRecord(hgraph: ConstPtr, precordid: ConstPtr, pprecord: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetRecord(hgraph.rawAddress, precordid.rawAddress, pprecord.rawAddress)

public actual fun peerGraphGetStatus(hgraph: ConstPtr, pdwstatus: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetStatus(hgraph.rawAddress, pdwstatus.rawAddress)

public actual fun peerGraphImportDatabase(hgraph: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphImportDatabase(hgraph.rawAddress, pwzfilepath.rawAddress)

public actual fun peerGraphListen(hgraph: ConstPtr, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphListen(hgraph.rawAddress, dwscope.toInt(), dwscopeid.toInt(), wport.toShort())

public actual fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: ConstPtr, phgraph: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpen(pwzgraphid.rawAddress, pwzpeerid.rawAddress, pwzdatabasename.rawAddress, psecurityinterface.rawAddress, crecordtypesyncprecedence.toInt(), precordtypesyncprecedence.rawAddress, phgraph.rawAddress)

public actual fun peerGraphOpenDirectConnection(hgraph: ConstPtr, pwzpeerid: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpenDirectConnection(hgraph.rawAddress, pwzpeerid.rawAddress, paddress.rawAddress, pullconnectionid.rawAddress)

public actual fun peerGraphPeerTimeToUniversalTime(hgraph: ConstPtr, pftpeertime: ConstPtr, pftuniversaltime: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphPeerTimeToUniversalTime(hgraph.rawAddress, pftpeertime.rawAddress, pftuniversaltime.rawAddress)

public actual fun peerGraphRegisterEvent(hgraph: ConstPtr, hevent: Handle, ceventregistrations: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphRegisterEvent(hgraph.rawAddress, hevent.rawAddress, ceventregistrations.toInt(), peventregistrations.rawAddress, phpeerevent.rawAddress)

public actual fun peerGraphSearchRecords(hgraph: ConstPtr, pwzcriteria: Pcwstr, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSearchRecords(hgraph.rawAddress, pwzcriteria.rawAddress, phpeerenum.rawAddress)

public actual fun peerGraphSendData(hgraph: ConstPtr, ullconnectionid: ULong, ptype: ConstPtr, cbdata: UInt, pvdata: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSendData(hgraph.rawAddress, ullconnectionid.toLong(), ptype.rawAddress, cbdata.toInt(), pvdata.rawAddress)

public actual fun peerGraphSetNodeAttributes(hgraph: ConstPtr, pwzattributes: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetNodeAttributes(hgraph.rawAddress, pwzattributes.rawAddress)

public actual fun peerGraphSetPresence(hgraph: ConstPtr, fpresent: Bool): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetPresence(hgraph.rawAddress, fpresent)

public actual fun peerGraphSetProperties(hgraph: ConstPtr, pgraphproperties: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetProperties(hgraph.rawAddress, pgraphproperties.rawAddress)

public actual fun peerGraphShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown()

public actual fun peerGraphStartup(wversionrequested: UShort, pversiondata: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphStartup(wversionrequested.toShort(), pversiondata.rawAddress)

public actual fun peerGraphUniversalTimeToPeerTime(hgraph: ConstPtr, pftuniversaltime: ConstPtr, pftpeertime: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUniversalTimeToPeerTime(hgraph.rawAddress, pftuniversaltime.rawAddress, pftpeertime.rawAddress)

public actual fun peerGraphUnregisterEvent(hpeerevent: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUnregisterEvent(hpeerevent.rawAddress)

public actual fun peerGraphUpdateRecord(hgraph: ConstPtr, precord: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUpdateRecord(hgraph.rawAddress, precord.rawAddress)

public actual fun peerGraphValidateDeferredRecords(hgraph: ConstPtr, crecordids: UInt, precordids: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGraphValidateDeferredRecords(hgraph.rawAddress, crecordids.toInt(), precordids.rawAddress)

public actual fun peerGroupAddRecord(hgroup: ConstPtr, precord: ConstPtr, precordid: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupAddRecord(hgroup.rawAddress, precord.rawAddress, precordid.rawAddress)

public actual fun peerGroupClose(hgroup: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupClose(hgroup.rawAddress)

public actual fun peerGroupCloseDirectConnection(hgroup: ConstPtr, ullconnectionid: ULong): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCloseDirectConnection(hgroup.rawAddress, ullconnectionid.toLong())

public actual fun peerGroupConnect(hgroup: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnect(hgroup.rawAddress)

public actual fun peerGroupConnectByAddress(hgroup: ConstPtr, caddresses: UInt, paddresses: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnectByAddress(hgroup.rawAddress, caddresses.toInt(), paddresses.rawAddress)

public actual fun peerGroupCreate(pproperties: ConstPtr, phgroup: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreate(pproperties.rawAddress, phgroup.rawAddress)

public actual fun peerGroupCreateInvitation(hgroup: ConstPtr, pwzidentityinfo: Pcwstr, pftexpiration: ConstPtr, croles: UInt, proles: ConstPtr, ppwzinvitation: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreateInvitation(hgroup.rawAddress, pwzidentityinfo.rawAddress, pftexpiration.rawAddress, croles.toInt(), proles.rawAddress, ppwzinvitation.rawAddress)

public actual fun peerGroupCreatePasswordInvitation(hgroup: ConstPtr, ppwzinvitation: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreatePasswordInvitation(hgroup.rawAddress, ppwzinvitation.rawAddress)

public actual fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupDelete(pwzidentity.rawAddress, pwzgrouppeername.rawAddress)

public actual fun peerGroupDeleteRecord(hgroup: ConstPtr, precordid: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupDeleteRecord(hgroup.rawAddress, precordid.rawAddress)

public actual fun peerGroupEnumConnections(hgroup: ConstPtr, dwflags: UInt, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumConnections(hgroup.rawAddress, dwflags.toInt(), phpeerenum.rawAddress)

public actual fun peerGroupEnumMembers(hgroup: ConstPtr, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumMembers(hgroup.rawAddress, dwflags.toInt(), pwzidentity.rawAddress, phpeerenum.rawAddress)

public actual fun peerGroupEnumRecords(hgroup: ConstPtr, precordtype: ConstPtr, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumRecords(hgroup.rawAddress, precordtype.rawAddress, phpeerenum.rawAddress)

public actual fun peerGroupExportConfig(hgroup: ConstPtr, pwzpassword: Pcwstr, ppwzxml: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportConfig(hgroup.rawAddress, pwzpassword.rawAddress, ppwzxml.rawAddress)

public actual fun peerGroupExportDatabase(hgroup: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportDatabase(hgroup.rawAddress, pwzfilepath.rawAddress)

public actual fun peerGroupGetEventData(hpeerevent: ConstPtr, ppeventdata: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetEventData(hpeerevent.rawAddress, ppeventdata.rawAddress)

public actual fun peerGroupGetProperties(hgroup: ConstPtr, ppproperties: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetProperties(hgroup.rawAddress, ppproperties.rawAddress)

public actual fun peerGroupGetRecord(hgroup: ConstPtr, precordid: ConstPtr, pprecord: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetRecord(hgroup.rawAddress, precordid.rawAddress, pprecord.rawAddress)

public actual fun peerGroupGetStatus(hgroup: ConstPtr, pdwstatus: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetStatus(hgroup.rawAddress, pdwstatus.rawAddress)

public actual fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: MutPtr, ppwzgroup: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportConfig(pwzxml.rawAddress, pwzpassword.rawAddress, foverwrite, ppwzidentity.rawAddress, ppwzgroup.rawAddress)

public actual fun peerGroupImportDatabase(hgroup: ConstPtr, pwzfilepath: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportDatabase(hgroup.rawAddress, pwzfilepath.rawAddress)

public actual fun peerGroupIssueCredentials(hgroup: ConstPtr, pwzsubjectidentity: Pcwstr, pcredentialinfo: ConstPtr, dwflags: UInt, ppwzinvitation: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupIssueCredentials(hgroup.rawAddress, pwzsubjectidentity.rawAddress, pcredentialinfo.rawAddress, dwflags.toInt(), ppwzinvitation.rawAddress)

public actual fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupJoin(pwzidentity.rawAddress, pwzinvitation.rawAddress, pwzcloud.rawAddress, phgroup.rawAddress)

public actual fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpen(pwzidentity.rawAddress, pwzgrouppeername.rawAddress, pwzcloud.rawAddress, phgroup.rawAddress)

public actual fun peerGroupOpenDirectConnection(hgroup: ConstPtr, pwzidentity: Pcwstr, paddress: ConstPtr, pullconnectionid: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpenDirectConnection(hgroup.rawAddress, pwzidentity.rawAddress, paddress.rawAddress, pullconnectionid.rawAddress)

public actual fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupParseInvitation(pwzinvitation.rawAddress, ppinvitationinfo.rawAddress)

public actual fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupPasswordJoin(pwzidentity.rawAddress, pwzinvitation.rawAddress, pwzpassword.rawAddress, pwzcloud.rawAddress, phgroup.rawAddress)

public actual fun peerGroupPeerTimeToUniversalTime(hgroup: ConstPtr, pftpeertime: ConstPtr, pftuniversaltime: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupPeerTimeToUniversalTime(hgroup.rawAddress, pftpeertime.rawAddress, pftuniversaltime.rawAddress)

public actual fun peerGroupRegisterEvent(hgroup: ConstPtr, hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr, phpeerevent: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupRegisterEvent(hgroup.rawAddress, hevent.rawAddress, ceventregistration.toInt(), peventregistrations.rawAddress, phpeerevent.rawAddress)

public actual fun peerGroupResumePasswordAuthentication(hgroup: ConstPtr, hpeereventhandle: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupResumePasswordAuthentication(hgroup.rawAddress, hpeereventhandle.rawAddress)

public actual fun peerGroupSearchRecords(hgroup: ConstPtr, pwzcriteria: Pcwstr, phpeerenum: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSearchRecords(hgroup.rawAddress, pwzcriteria.rawAddress, phpeerenum.rawAddress)

public actual fun peerGroupSendData(hgroup: ConstPtr, ullconnectionid: ULong, ptype: ConstPtr, cbdata: UInt, pvdata: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSendData(hgroup.rawAddress, ullconnectionid.toLong(), ptype.rawAddress, cbdata.toInt(), pvdata.rawAddress)

public actual fun peerGroupSetProperties(hgroup: ConstPtr, pproperties: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSetProperties(hgroup.rawAddress, pproperties.rawAddress)

public actual fun peerGroupShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown()

public actual fun peerGroupStartup(wversionrequested: UShort, pversiondata: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupStartup(wversionrequested.toShort(), pversiondata.rawAddress)

public actual fun peerGroupUniversalTimeToPeerTime(hgroup: ConstPtr, pftuniversaltime: ConstPtr, pftpeertime: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUniversalTimeToPeerTime(hgroup.rawAddress, pftuniversaltime.rawAddress, pftpeertime.rawAddress)

public actual fun peerGroupUnregisterEvent(hpeerevent: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUnregisterEvent(hpeerevent.rawAddress)

public actual fun peerGroupUpdateRecord(hgroup: ConstPtr, precord: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUpdateRecord(hgroup.rawAddress, precord.rawAddress)

public actual fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerHostNameToPeerName(pwzhostname.rawAddress, ppwzpeername.rawAddress)

public actual fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityCreate(pwzclassifier.rawAddress, pwzfriendlyname.rawAddress, hcryptprov.toLong(), ppwzidentity.rawAddress)

public actual fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityDelete(pwzidentity.rawAddress)

public actual fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityExport(pwzidentity.rawAddress, pwzpassword.rawAddress, ppwzexportxml.rawAddress)

public actual fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetCryptKey(pwzidentity.rawAddress, phcryptprov.rawAddress)

public actual fun peerIdentityGetDefault(ppwzpeername: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetDefault(ppwzpeername.rawAddress)

public actual fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetFriendlyName(pwzidentity.rawAddress, ppwzfriendlyname.rawAddress)

public actual fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetXML(pwzidentity.rawAddress, ppwzidentityxml.rawAddress)

public actual fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityImport(pwzimportxml.rawAddress, pwzpassword.rawAddress, ppwzidentity.rawAddress)

public actual fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerIdentitySetFriendlyName(pwzidentity.rawAddress, pwzfriendlyname.rawAddress)

public actual fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerNameToPeerHostName(pwzpeername.rawAddress, ppwzhostname.rawAddress)

public actual fun peerPnrpEndResolve(hresolve: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpEndResolve(hresolve.rawAddress)

public actual fun peerPnrpGetCloudInfo(pcnumclouds: MutPtr, ppcloudinfo: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetCloudInfo(pcnumclouds.rawAddress, ppcloudinfo.rawAddress)

public actual fun peerPnrpGetEndpoint(hresolve: ConstPtr, ppendpoint: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetEndpoint(hresolve.rawAddress, ppendpoint.rawAddress)

public actual fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: ConstPtr, phregistration: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpRegister(pcwzpeername.rawAddress, pregistrationinfo.rawAddress, phregistration.rawAddress)

public actual fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: MutPtr, ppendpoints: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpResolve(pcwzpeername.rawAddress, pcwzcloudname.rawAddress, pcendpoints.rawAddress, ppendpoints.rawAddress)

public actual fun peerPnrpShutdown(): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown()

public actual fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: MutPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartResolve(pcwzpeername.rawAddress, pcwzcloudname.rawAddress, cmaxendpoints.toInt(), hevent.rawAddress, phresolve.rawAddress)

public actual fun peerPnrpStartup(wversionrequested: UShort): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup(wversionrequested.toShort())

public actual fun peerPnrpUnregister(hregistration: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUnregister(hregistration.rawAddress)

public actual fun peerPnrpUpdateRegistration(hregistration: ConstPtr, pregistrationinfo: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementP2pJniBridge.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUpdateRegistration(hregistration.rawAddress, pregistrationinfo.rawAddress)
