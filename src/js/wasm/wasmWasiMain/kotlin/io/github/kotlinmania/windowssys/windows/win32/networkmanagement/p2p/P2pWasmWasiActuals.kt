@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun DrtClose(hdrt: Long) {
}

public actual fun DrtContinueSearch(hsearchcontext: Long): HRESULT =
    0

public actual fun DrtCreateDerivedKey(plocalcert: Long, pkey: Long): HRESULT =
    0

public actual fun DrtCreateDerivedKeySecurityProvider(prootcert: Long, plocalcert: Long, ppsecurityprovider: Long): HRESULT =
    0

public actual fun DrtCreateDnsBootstrapResolver(port: UShort, pwszaddress: PCWSTR, ppmodule: Long): HRESULT =
    0

public actual fun DrtCreateIpv6UdpTransport(scope: DRT_SCOPE, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: Long, phtransport: Long): HRESULT =
    0

public actual fun DrtCreateNullSecurityProvider(ppsecurityprovider: Long): HRESULT =
    0

public actual fun DrtCreatePnrpBootstrapResolver(fpublish: BOOL, pwzpeername: PCWSTR, pwzcloudname: PCWSTR, pwzpublishingidentity: PCWSTR, ppresolver: Long): HRESULT =
    0

public actual fun DrtDeleteDerivedKeySecurityProvider(psecurityprovider: Long) {
}

public actual fun DrtDeleteDnsBootstrapResolver(presolver: Long) {
}

public actual fun DrtDeleteIpv6UdpTransport(htransport: Long): HRESULT =
    0

public actual fun DrtDeleteNullSecurityProvider(psecurityprovider: Long) {
}

public actual fun DrtDeletePnrpBootstrapResolver(presolver: Long) {
}

public actual fun DrtEndSearch(hsearchcontext: Long): HRESULT =
    0

public actual fun DrtGetEventData(hdrt: Long, uleventdatalen: UInt, peventdata: Long): HRESULT =
    0

public actual fun DrtGetEventDataSize(hdrt: Long, puleventdatalen: Long): HRESULT =
    0

public actual fun DrtGetInstanceName(hdrt: Long, ulcbinstancenamesize: UInt, pwzdrtinstancename: PWSTR): HRESULT =
    0

public actual fun DrtGetInstanceNameSize(hdrt: Long, pulcbinstancenamesize: Long): HRESULT =
    0

public actual fun DrtGetSearchPath(hsearchcontext: Long, ulsearchpathsize: UInt, psearchpath: Long): HRESULT =
    0

public actual fun DrtGetSearchPathSize(hsearchcontext: Long, pulsearchpathsize: Long): HRESULT =
    0

public actual fun DrtGetSearchResult(hsearchcontext: Long, ulsearchresultsize: UInt, psearchresult: Long): HRESULT =
    0

public actual fun DrtGetSearchResultSize(hsearchcontext: Long, pulsearchresultsize: Long): HRESULT =
    0

public actual fun DrtOpen(psettings: Long, hevent: HANDLE, pvcontext: Long, phdrt: Long): HRESULT =
    0

public actual fun DrtRegisterKey(hdrt: Long, pregistration: Long, pvkeycontext: Long, phkeyregistration: Long): HRESULT =
    0

public actual fun DrtStartSearch(hdrt: Long, pkey: Long, pinfo: Long, timeout: UInt, hevent: HANDLE, pvcontext: Long, hsearchcontext: Long): HRESULT =
    0

public actual fun DrtUnregisterKey(hkeyregistration: Long) {
}

public actual fun DrtUpdateKey(hkeyregistration: Long, pappdata: Long): HRESULT =
    0

public actual fun PeerCollabAddContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT =
    0

public actual fun PeerCollabAsyncInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, hevent: HANDLE, phinvitation: Long): HRESULT =
    0

public actual fun PeerCollabAsyncInviteEndpoint(pcendpoint: Long, pcinvitation: Long, hevent: HANDLE, phinvitation: Long): HRESULT =
    0

public actual fun PeerCollabCancelInvitation(hinvitation: HANDLE): HRESULT =
    0

public actual fun PeerCollabCloseHandle(hinvitation: HANDLE): HRESULT =
    0

public actual fun PeerCollabDeleteContact(pwzpeername: PCWSTR): HRESULT =
    0

public actual fun PeerCollabDeleteEndpointData(pcendpoint: Long): HRESULT =
    0

public actual fun PeerCollabDeleteObject(pobjectid: Long): HRESULT =
    0

public actual fun PeerCollabEnumApplicationRegistrationInfo(registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, phpeerenum: Long): HRESULT =
    0

public actual fun PeerCollabEnumApplications(pcendpoint: Long, papplicationid: Long, phpeerenum: Long): HRESULT =
    0

public actual fun PeerCollabEnumContacts(phpeerenum: Long): HRESULT =
    0

public actual fun PeerCollabEnumEndpoints(pccontact: Long, phpeerenum: Long): HRESULT =
    0

public actual fun PeerCollabEnumObjects(pcendpoint: Long, pobjectid: Long, phpeerenum: Long): HRESULT =
    0

public actual fun PeerCollabEnumPeopleNearMe(phpeerenum: Long): HRESULT =
    0

public actual fun PeerCollabExportContact(pwzpeername: PCWSTR, ppwzcontactdata: Long): HRESULT =
    0

public actual fun PeerCollabGetAppLaunchInfo(pplaunchinfo: Long): HRESULT =
    0

public actual fun PeerCollabGetApplicationRegistrationInfo(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, ppapplication: Long): HRESULT =
    0

public actual fun PeerCollabGetContact(pwzpeername: PCWSTR, ppcontact: Long): HRESULT =
    0

public actual fun PeerCollabGetEndpointName(ppwzendpointname: Long): HRESULT =
    0

public actual fun PeerCollabGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    0

public actual fun PeerCollabGetInvitationResponse(hinvitation: HANDLE, ppinvitationresponse: Long): HRESULT =
    0

public actual fun PeerCollabGetPresenceInfo(pcendpoint: Long, pppresenceinfo: Long): HRESULT =
    0

public actual fun PeerCollabGetSigninOptions(pdwsigninoptions: Long): HRESULT =
    0

public actual fun PeerCollabInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT =
    0

public actual fun PeerCollabInviteEndpoint(pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT =
    0

public actual fun PeerCollabParseContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT =
    0

public actual fun PeerCollabQueryContactData(pcendpoint: Long, ppwzcontactdata: Long): HRESULT =
    0

public actual fun PeerCollabRefreshEndpointData(pcendpoint: Long): HRESULT =
    0

public actual fun PeerCollabRegisterApplication(pcapplication: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT =
    0

public actual fun PeerCollabRegisterEvent(hevent: HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    0

public actual fun PeerCollabSetEndpointName(pwzendpointname: PCWSTR): HRESULT =
    0

public actual fun PeerCollabSetObject(pcobject: Long): HRESULT =
    0

public actual fun PeerCollabSetPresenceInfo(pcpresenceinfo: Long): HRESULT =
    0

public actual fun PeerCollabShutdown(): HRESULT =
    0

public actual fun PeerCollabSignin(hwndparent: HWND, dwsigninoptions: UInt): HRESULT =
    0

public actual fun PeerCollabSignout(dwsigninoptions: UInt): HRESULT =
    0

public actual fun PeerCollabStartup(wversionrequested: UShort): HRESULT =
    0

public actual fun PeerCollabSubscribeEndpointData(pcendpoint: Long): HRESULT =
    0

public actual fun PeerCollabUnregisterApplication(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT =
    0

public actual fun PeerCollabUnregisterEvent(hpeerevent: Long): HRESULT =
    0

public actual fun PeerCollabUnsubscribeEndpointData(pcendpoint: Long): HRESULT =
    0

public actual fun PeerCollabUpdateContact(pcontact: Long): HRESULT =
    0

public actual fun PeerCreatePeerName(pwzidentity: PCWSTR, pwzclassifier: PCWSTR, ppwzpeername: Long): HRESULT =
    0

public actual fun PeerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    0u

public actual fun PeerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    0u

public actual fun PeerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt =
    0u

public actual fun PeerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: Long): UInt =
    0u

public actual fun PeerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    0u

public actual fun PeerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: Long): UInt =
    0u

public actual fun PeerDistClientFlushContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long): UInt =
    0u

public actual fun PeerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS, dwbuffersize: UInt, lpinformation: Long): UInt =
    0u

public actual fun PeerDistClientOpenContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontenthandle: Long): UInt =
    0u

public actual fun PeerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt =
    0u

public actual fun PeerDistGetOverlappedResult(lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    0

public actual fun PeerDistGetStatus(hpeerdist: Long, ppeerdiststatus: Long): UInt =
    0u

public actual fun PeerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: Long): UInt =
    0u

public actual fun PeerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt =
    0u

public actual fun PeerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt =
    0u

public actual fun PeerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, poverlapped: Long): UInt =
    0u

public actual fun PeerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    0u

public actual fun PeerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    0u

public actual fun PeerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt =
    0u

public actual fun PeerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt =
    0u

public actual fun PeerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    0u

public actual fun PeerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: Long): UInt =
    0u

public actual fun PeerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, cbcontentlength: ULong, ppublishoptions: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phstream: Long): UInt =
    0u

public actual fun PeerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt =
    0u

public actual fun PeerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long): UInt =
    0u

public actual fun PeerDistShutdown(hpeerdist: Long): UInt =
    0u

public actual fun PeerDistStartup(dwversionrequested: UInt, phpeerdist: Long, pdwsupportedversion: Long): UInt =
    0u

public actual fun PeerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    0u

public actual fun PeerEndEnumeration(hpeerenum: Long): HRESULT =
    0

public actual fun PeerEnumGroups(pwzidentity: PCWSTR, phpeerenum: Long): HRESULT =
    0

public actual fun PeerEnumIdentities(phpeerenum: Long): HRESULT =
    0

public actual fun PeerFreeData(pvdata: Long) {
}

public actual fun PeerGetItemCount(hpeerenum: Long, pcount: Long): HRESULT =
    0

public actual fun PeerGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT =
    0

public actual fun PeerGraphAddRecord(hgraph: Long, precord: Long, precordid: Long): HRESULT =
    0

public actual fun PeerGraphClose(hgraph: Long): HRESULT =
    0

public actual fun PeerGraphCloseDirectConnection(hgraph: Long, ullconnectionid: ULong): HRESULT =
    0

public actual fun PeerGraphConnect(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    0

public actual fun PeerGraphCreate(pgraphproperties: Long, pwzdatabasename: PCWSTR, psecurityinterface: Long, phgraph: Long): HRESULT =
    0

public actual fun PeerGraphDelete(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR): HRESULT =
    0

public actual fun PeerGraphDeleteRecord(hgraph: Long, precordid: Long, flocal: BOOL): HRESULT =
    0

public actual fun PeerGraphEndEnumeration(hpeerenum: Long): HRESULT =
    0

public actual fun PeerGraphEnumConnections(hgraph: Long, dwflags: UInt, phpeerenum: Long): HRESULT =
    0

public actual fun PeerGraphEnumNodes(hgraph: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT =
    0

public actual fun PeerGraphEnumRecords(hgraph: Long, precordtype: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT =
    0

public actual fun PeerGraphExportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT =
    0

public actual fun PeerGraphFreeData(pvdata: Long) {
}

public actual fun PeerGraphGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    0

public actual fun PeerGraphGetItemCount(hpeerenum: Long, pcount: Long): HRESULT =
    0

public actual fun PeerGraphGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT =
    0

public actual fun PeerGraphGetNodeInfo(hgraph: Long, ullnodeid: ULong, ppnodeinfo: Long): HRESULT =
    0

public actual fun PeerGraphGetProperties(hgraph: Long, ppgraphproperties: Long): HRESULT =
    0

public actual fun PeerGraphGetRecord(hgraph: Long, precordid: Long, pprecord: Long): HRESULT =
    0

public actual fun PeerGraphGetStatus(hgraph: Long, pdwstatus: Long): HRESULT =
    0

public actual fun PeerGraphImportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT =
    0

public actual fun PeerGraphListen(hgraph: Long, dwscope: UInt, dwscopeid: UInt, wport: UShort): HRESULT =
    0

public actual fun PeerGraphOpen(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR, psecurityinterface: Long, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: Long, phgraph: Long): HRESULT =
    0

public actual fun PeerGraphOpenDirectConnection(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    0

public actual fun PeerGraphPeerTimeToUniversalTime(hgraph: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT =
    0

public actual fun PeerGraphRegisterEvent(hgraph: Long, hevent: HANDLE, ceventregistrations: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    0

public actual fun PeerGraphSearchRecords(hgraph: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT =
    0

public actual fun PeerGraphSendData(hgraph: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT =
    0

public actual fun PeerGraphSetNodeAttributes(hgraph: Long, pwzattributes: PCWSTR): HRESULT =
    0

public actual fun PeerGraphSetPresence(hgraph: Long, fpresent: BOOL): HRESULT =
    0

public actual fun PeerGraphSetProperties(hgraph: Long, pgraphproperties: Long): HRESULT =
    0

public actual fun PeerGraphShutdown(): HRESULT =
    0

public actual fun PeerGraphStartup(wversionrequested: UShort, pversiondata: Long): HRESULT =
    0

public actual fun PeerGraphUniversalTimeToPeerTime(hgraph: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT =
    0

public actual fun PeerGraphUnregisterEvent(hpeerevent: Long): HRESULT =
    0

public actual fun PeerGraphUpdateRecord(hgraph: Long, precord: Long): HRESULT =
    0

public actual fun PeerGraphValidateDeferredRecords(hgraph: Long, crecordids: UInt, precordids: Long): HRESULT =
    0

public actual fun PeerGroupAddRecord(hgroup: Long, precord: Long, precordid: Long): HRESULT =
    0

public actual fun PeerGroupClose(hgroup: Long): HRESULT =
    0

public actual fun PeerGroupCloseDirectConnection(hgroup: Long, ullconnectionid: ULong): HRESULT =
    0

public actual fun PeerGroupConnect(hgroup: Long): HRESULT =
    0

public actual fun PeerGroupConnectByAddress(hgroup: Long, caddresses: UInt, paddresses: Long): HRESULT =
    0

public actual fun PeerGroupCreate(pproperties: Long, phgroup: Long): HRESULT =
    0

public actual fun PeerGroupCreateInvitation(hgroup: Long, pwzidentityinfo: PCWSTR, pftexpiration: Long, croles: UInt, proles: Long, ppwzinvitation: Long): HRESULT =
    0

public actual fun PeerGroupCreatePasswordInvitation(hgroup: Long, ppwzinvitation: Long): HRESULT =
    0

public actual fun PeerGroupDelete(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR): HRESULT =
    0

public actual fun PeerGroupDeleteRecord(hgroup: Long, precordid: Long): HRESULT =
    0

public actual fun PeerGroupEnumConnections(hgroup: Long, dwflags: UInt, phpeerenum: Long): HRESULT =
    0

public actual fun PeerGroupEnumMembers(hgroup: Long, dwflags: UInt, pwzidentity: PCWSTR, phpeerenum: Long): HRESULT =
    0

public actual fun PeerGroupEnumRecords(hgroup: Long, precordtype: Long, phpeerenum: Long): HRESULT =
    0

public actual fun PeerGroupExportConfig(hgroup: Long, pwzpassword: PCWSTR, ppwzxml: Long): HRESULT =
    0

public actual fun PeerGroupExportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT =
    0

public actual fun PeerGroupGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT =
    0

public actual fun PeerGroupGetProperties(hgroup: Long, ppproperties: Long): HRESULT =
    0

public actual fun PeerGroupGetRecord(hgroup: Long, precordid: Long, pprecord: Long): HRESULT =
    0

public actual fun PeerGroupGetStatus(hgroup: Long, pdwstatus: Long): HRESULT =
    0

public actual fun PeerGroupImportConfig(pwzxml: PCWSTR, pwzpassword: PCWSTR, foverwrite: BOOL, ppwzidentity: Long, ppwzgroup: Long): HRESULT =
    0

public actual fun PeerGroupImportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT =
    0

public actual fun PeerGroupIssueCredentials(hgroup: Long, pwzsubjectidentity: PCWSTR, pcredentialinfo: Long, dwflags: UInt, ppwzinvitation: Long): HRESULT =
    0

public actual fun PeerGroupJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    0

public actual fun PeerGroupOpen(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    0

public actual fun PeerGroupOpenDirectConnection(hgroup: Long, pwzidentity: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT =
    0

public actual fun PeerGroupParseInvitation(pwzinvitation: PCWSTR, ppinvitationinfo: Long): HRESULT =
    0

public actual fun PeerGroupPasswordJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzpassword: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT =
    0

public actual fun PeerGroupPeerTimeToUniversalTime(hgroup: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT =
    0

public actual fun PeerGroupRegisterEvent(hgroup: Long, hevent: HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT =
    0

public actual fun PeerGroupResumePasswordAuthentication(hgroup: Long, hpeereventhandle: Long): HRESULT =
    0

public actual fun PeerGroupSearchRecords(hgroup: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT =
    0

public actual fun PeerGroupSendData(hgroup: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT =
    0

public actual fun PeerGroupSetProperties(hgroup: Long, pproperties: Long): HRESULT =
    0

public actual fun PeerGroupShutdown(): HRESULT =
    0

public actual fun PeerGroupStartup(wversionrequested: UShort, pversiondata: Long): HRESULT =
    0

public actual fun PeerGroupUniversalTimeToPeerTime(hgroup: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT =
    0

public actual fun PeerGroupUnregisterEvent(hpeerevent: Long): HRESULT =
    0

public actual fun PeerGroupUpdateRecord(hgroup: Long, precord: Long): HRESULT =
    0

public actual fun PeerHostNameToPeerName(pwzhostname: PCWSTR, ppwzpeername: Long): HRESULT =
    0

public actual fun PeerIdentityCreate(pwzclassifier: PCWSTR, pwzfriendlyname: PCWSTR, hcryptprov: ULong, ppwzidentity: Long): HRESULT =
    0

public actual fun PeerIdentityDelete(pwzidentity: PCWSTR): HRESULT =
    0

public actual fun PeerIdentityExport(pwzidentity: PCWSTR, pwzpassword: PCWSTR, ppwzexportxml: Long): HRESULT =
    0

public actual fun PeerIdentityGetCryptKey(pwzidentity: PCWSTR, phcryptprov: Long): HRESULT =
    0

public actual fun PeerIdentityGetDefault(ppwzpeername: Long): HRESULT =
    0

public actual fun PeerIdentityGetFriendlyName(pwzidentity: PCWSTR, ppwzfriendlyname: Long): HRESULT =
    0

public actual fun PeerIdentityGetXML(pwzidentity: PCWSTR, ppwzidentityxml: Long): HRESULT =
    0

public actual fun PeerIdentityImport(pwzimportxml: PCWSTR, pwzpassword: PCWSTR, ppwzidentity: Long): HRESULT =
    0

public actual fun PeerIdentitySetFriendlyName(pwzidentity: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT =
    0

public actual fun PeerNameToPeerHostName(pwzpeername: PCWSTR, ppwzhostname: Long): HRESULT =
    0

public actual fun PeerPnrpEndResolve(hresolve: Long): HRESULT =
    0

public actual fun PeerPnrpGetCloudInfo(pcnumclouds: Long, ppcloudinfo: Long): HRESULT =
    0

public actual fun PeerPnrpGetEndpoint(hresolve: Long, ppendpoint: Long): HRESULT =
    0

public actual fun PeerPnrpRegister(pcwzpeername: PCWSTR, pregistrationinfo: Long, phregistration: Long): HRESULT =
    0

public actual fun PeerPnrpResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, pcendpoints: Long, ppendpoints: Long): HRESULT =
    0

public actual fun PeerPnrpShutdown(): HRESULT =
    0

public actual fun PeerPnrpStartResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, cmaxendpoints: UInt, hevent: HANDLE, phresolve: Long): HRESULT =
    0

public actual fun PeerPnrpStartup(wversionrequested: UShort): HRESULT =
    0

public actual fun PeerPnrpUnregister(hregistration: Long): HRESULT =
    0

public actual fun PeerPnrpUpdateRegistration(hregistration: Long, pregistrationinfo: Long): HRESULT =
    0
