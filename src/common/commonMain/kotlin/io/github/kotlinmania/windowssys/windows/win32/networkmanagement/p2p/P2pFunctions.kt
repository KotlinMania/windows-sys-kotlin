package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun DrtClose(hdrt: Long)

public expect fun DrtContinueSearch(hsearchcontext: Long): HRESULT

public expect fun DrtCreateDerivedKey(plocalcert: Long, pkey: Long): HRESULT

public expect fun DrtCreateDerivedKeySecurityProvider(prootcert: Long, plocalcert: Long, ppsecurityprovider: Long): HRESULT

public expect fun DrtCreateDnsBootstrapResolver(port: UShort, pwszaddress: PCWSTR, ppmodule: Long): HRESULT

public expect fun DrtCreateIpv6UdpTransport(scope: DRT_SCOPE, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: Long, phtransport: Long): HRESULT

public expect fun DrtCreateNullSecurityProvider(ppsecurityprovider: Long): HRESULT

public expect fun DrtCreatePnrpBootstrapResolver(fpublish: BOOL, pwzpeername: PCWSTR, pwzcloudname: PCWSTR, pwzpublishingidentity: PCWSTR, ppresolver: Long): HRESULT

public expect fun DrtDeleteDerivedKeySecurityProvider(psecurityprovider: Long)

public expect fun DrtDeleteDnsBootstrapResolver(presolver: Long)

public expect fun DrtDeleteIpv6UdpTransport(htransport: Long): HRESULT

public expect fun DrtDeleteNullSecurityProvider(psecurityprovider: Long)

public expect fun DrtDeletePnrpBootstrapResolver(presolver: Long)

public expect fun DrtEndSearch(hsearchcontext: Long): HRESULT

public expect fun DrtGetEventData(hdrt: Long, uleventdatalen: UInt, peventdata: Long): HRESULT

public expect fun DrtGetEventDataSize(hdrt: Long, puleventdatalen: Long): HRESULT

public expect fun DrtGetInstanceName(hdrt: Long, ulcbinstancenamesize: UInt, pwzdrtinstancename: PWSTR): HRESULT

public expect fun DrtGetInstanceNameSize(hdrt: Long, pulcbinstancenamesize: Long): HRESULT

public expect fun DrtGetSearchPath(hsearchcontext: Long, ulsearchpathsize: UInt, psearchpath: Long): HRESULT

public expect fun DrtGetSearchPathSize(hsearchcontext: Long, pulsearchpathsize: Long): HRESULT

public expect fun DrtGetSearchResult(hsearchcontext: Long, ulsearchresultsize: UInt, psearchresult: Long): HRESULT

public expect fun DrtGetSearchResultSize(hsearchcontext: Long, pulsearchresultsize: Long): HRESULT

public expect fun DrtOpen(psettings: Long, hevent: HANDLE, pvcontext: Long, phdrt: Long): HRESULT

public expect fun DrtRegisterKey(hdrt: Long, pregistration: Long, pvkeycontext: Long, phkeyregistration: Long): HRESULT

public expect fun DrtStartSearch(hdrt: Long, pkey: Long, pinfo: Long, timeout: UInt, hevent: HANDLE, pvcontext: Long, hsearchcontext: Long): HRESULT

public expect fun DrtUnregisterKey(hkeyregistration: Long)

public expect fun DrtUpdateKey(hkeyregistration: Long, pappdata: Long): HRESULT

public expect fun PeerCollabAddContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT

public expect fun PeerCollabAsyncInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, hevent: HANDLE, phinvitation: Long): HRESULT

public expect fun PeerCollabAsyncInviteEndpoint(pcendpoint: Long, pcinvitation: Long, hevent: HANDLE, phinvitation: Long): HRESULT

public expect fun PeerCollabCancelInvitation(hinvitation: HANDLE): HRESULT

public expect fun PeerCollabCloseHandle(hinvitation: HANDLE): HRESULT

public expect fun PeerCollabDeleteContact(pwzpeername: PCWSTR): HRESULT

public expect fun PeerCollabDeleteEndpointData(pcendpoint: Long): HRESULT

public expect fun PeerCollabDeleteObject(pobjectid: Long): HRESULT

public expect fun PeerCollabEnumApplicationRegistrationInfo(registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, phpeerenum: Long): HRESULT

public expect fun PeerCollabEnumApplications(pcendpoint: Long, papplicationid: Long, phpeerenum: Long): HRESULT

public expect fun PeerCollabEnumContacts(phpeerenum: Long): HRESULT

public expect fun PeerCollabEnumEndpoints(pccontact: Long, phpeerenum: Long): HRESULT

public expect fun PeerCollabEnumObjects(pcendpoint: Long, pobjectid: Long, phpeerenum: Long): HRESULT

public expect fun PeerCollabEnumPeopleNearMe(phpeerenum: Long): HRESULT

public expect fun PeerCollabExportContact(pwzpeername: PCWSTR, ppwzcontactdata: Long): HRESULT

public expect fun PeerCollabGetAppLaunchInfo(pplaunchinfo: Long): HRESULT

public expect fun PeerCollabGetApplicationRegistrationInfo(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE, ppapplication: Long): HRESULT

public expect fun PeerCollabGetContact(pwzpeername: PCWSTR, ppcontact: Long): HRESULT

public expect fun PeerCollabGetEndpointName(ppwzendpointname: Long): HRESULT

public expect fun PeerCollabGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT

public expect fun PeerCollabGetInvitationResponse(hinvitation: HANDLE, ppinvitationresponse: Long): HRESULT

public expect fun PeerCollabGetPresenceInfo(pcendpoint: Long, pppresenceinfo: Long): HRESULT

public expect fun PeerCollabGetSigninOptions(pdwsigninoptions: Long): HRESULT

public expect fun PeerCollabInviteContact(pccontact: Long, pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT

public expect fun PeerCollabInviteEndpoint(pcendpoint: Long, pcinvitation: Long, ppresponse: Long): HRESULT

public expect fun PeerCollabParseContact(pwzcontactdata: PCWSTR, ppcontact: Long): HRESULT

public expect fun PeerCollabQueryContactData(pcendpoint: Long, ppwzcontactdata: Long): HRESULT

public expect fun PeerCollabRefreshEndpointData(pcendpoint: Long): HRESULT

public expect fun PeerCollabRegisterApplication(pcapplication: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT

public expect fun PeerCollabRegisterEvent(hevent: HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT

public expect fun PeerCollabSetEndpointName(pwzendpointname: PCWSTR): HRESULT

public expect fun PeerCollabSetObject(pcobject: Long): HRESULT

public expect fun PeerCollabSetPresenceInfo(pcpresenceinfo: Long): HRESULT

public expect fun PeerCollabShutdown(): HRESULT

public expect fun PeerCollabSignin(hwndparent: HWND, dwsigninoptions: UInt): HRESULT

public expect fun PeerCollabSignout(dwsigninoptions: UInt): HRESULT

public expect fun PeerCollabStartup(wversionrequested: UShort): HRESULT

public expect fun PeerCollabSubscribeEndpointData(pcendpoint: Long): HRESULT

public expect fun PeerCollabUnregisterApplication(papplicationid: Long, registrationtype: PEER_APPLICATION_REGISTRATION_TYPE): HRESULT

public expect fun PeerCollabUnregisterEvent(hpeerevent: Long): HRESULT

public expect fun PeerCollabUnsubscribeEndpointData(pcendpoint: Long): HRESULT

public expect fun PeerCollabUpdateContact(pcontact: Long): HRESULT

public expect fun PeerCreatePeerName(pwzidentity: PCWSTR, pwzclassifier: PCWSTR, ppwzpeername: Long): HRESULT

public expect fun PeerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt

public expect fun PeerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt

public expect fun PeerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt

public expect fun PeerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: Long): UInt

public expect fun PeerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt

public expect fun PeerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: Long): UInt

public expect fun PeerDistClientFlushContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long): UInt

public expect fun PeerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS, dwbuffersize: UInt, lpinformation: Long): UInt

public expect fun PeerDistClientOpenContent(hpeerdist: Long, pcontenttag: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontenthandle: Long): UInt

public expect fun PeerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, dwtimeoutinmilliseconds: UInt, lpoverlapped: Long): UInt

public expect fun PeerDistGetOverlappedResult(lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL

public expect fun PeerDistGetStatus(hpeerdist: Long, ppeerdiststatus: Long): UInt

public expect fun PeerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: Long): UInt

public expect fun PeerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt

public expect fun PeerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, lpoverlapped: Long, ppeerdiststatus: Long): UInt

public expect fun PeerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, poverlapped: Long): UInt

public expect fun PeerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt

public expect fun PeerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt

public expect fun PeerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt

public expect fun PeerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phcontentinfo: Long): UInt

public expect fun PeerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt

public expect fun PeerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: Long): UInt

public expect fun PeerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long, cbcontentlength: ULong, ppublishoptions: Long, hcompletionport: HANDLE, ulcompletionkey: ULong, phstream: Long): UInt

public expect fun PeerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: Long, lpoverlapped: Long): UInt

public expect fun PeerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: Long): UInt

public expect fun PeerDistShutdown(hpeerdist: Long): UInt

public expect fun PeerDistStartup(dwversionrequested: UInt, phpeerdist: Long, pdwsupportedversion: Long): UInt

public expect fun PeerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt

public expect fun PeerEndEnumeration(hpeerenum: Long): HRESULT

public expect fun PeerEnumGroups(pwzidentity: PCWSTR, phpeerenum: Long): HRESULT

public expect fun PeerEnumIdentities(phpeerenum: Long): HRESULT

public expect fun PeerFreeData(pvdata: Long)

public expect fun PeerGetItemCount(hpeerenum: Long, pcount: Long): HRESULT

public expect fun PeerGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT

public expect fun PeerGraphAddRecord(hgraph: Long, precord: Long, precordid: Long): HRESULT

public expect fun PeerGraphClose(hgraph: Long): HRESULT

public expect fun PeerGraphCloseDirectConnection(hgraph: Long, ullconnectionid: ULong): HRESULT

public expect fun PeerGraphConnect(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT

public expect fun PeerGraphCreate(pgraphproperties: Long, pwzdatabasename: PCWSTR, psecurityinterface: Long, phgraph: Long): HRESULT

public expect fun PeerGraphDelete(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR): HRESULT

public expect fun PeerGraphDeleteRecord(hgraph: Long, precordid: Long, flocal: BOOL): HRESULT

public expect fun PeerGraphEndEnumeration(hpeerenum: Long): HRESULT

public expect fun PeerGraphEnumConnections(hgraph: Long, dwflags: UInt, phpeerenum: Long): HRESULT

public expect fun PeerGraphEnumNodes(hgraph: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT

public expect fun PeerGraphEnumRecords(hgraph: Long, precordtype: Long, pwzpeerid: PCWSTR, phpeerenum: Long): HRESULT

public expect fun PeerGraphExportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT

public expect fun PeerGraphFreeData(pvdata: Long)

public expect fun PeerGraphGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT

public expect fun PeerGraphGetItemCount(hpeerenum: Long, pcount: Long): HRESULT

public expect fun PeerGraphGetNextItem(hpeerenum: Long, pcount: Long, pppvitems: Long): HRESULT

public expect fun PeerGraphGetNodeInfo(hgraph: Long, ullnodeid: ULong, ppnodeinfo: Long): HRESULT

public expect fun PeerGraphGetProperties(hgraph: Long, ppgraphproperties: Long): HRESULT

public expect fun PeerGraphGetRecord(hgraph: Long, precordid: Long, pprecord: Long): HRESULT

public expect fun PeerGraphGetStatus(hgraph: Long, pdwstatus: Long): HRESULT

public expect fun PeerGraphImportDatabase(hgraph: Long, pwzfilepath: PCWSTR): HRESULT

public expect fun PeerGraphListen(hgraph: Long, dwscope: UInt, dwscopeid: UInt, wport: UShort): HRESULT

public expect fun PeerGraphOpen(pwzgraphid: PCWSTR, pwzpeerid: PCWSTR, pwzdatabasename: PCWSTR, psecurityinterface: Long, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: Long, phgraph: Long): HRESULT

public expect fun PeerGraphOpenDirectConnection(hgraph: Long, pwzpeerid: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT

public expect fun PeerGraphPeerTimeToUniversalTime(hgraph: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT

public expect fun PeerGraphRegisterEvent(hgraph: Long, hevent: HANDLE, ceventregistrations: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT

public expect fun PeerGraphSearchRecords(hgraph: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT

public expect fun PeerGraphSendData(hgraph: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT

public expect fun PeerGraphSetNodeAttributes(hgraph: Long, pwzattributes: PCWSTR): HRESULT

public expect fun PeerGraphSetPresence(hgraph: Long, fpresent: BOOL): HRESULT

public expect fun PeerGraphSetProperties(hgraph: Long, pgraphproperties: Long): HRESULT

public expect fun PeerGraphShutdown(): HRESULT

public expect fun PeerGraphStartup(wversionrequested: UShort, pversiondata: Long): HRESULT

public expect fun PeerGraphUniversalTimeToPeerTime(hgraph: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT

public expect fun PeerGraphUnregisterEvent(hpeerevent: Long): HRESULT

public expect fun PeerGraphUpdateRecord(hgraph: Long, precord: Long): HRESULT

public expect fun PeerGraphValidateDeferredRecords(hgraph: Long, crecordids: UInt, precordids: Long): HRESULT

public expect fun PeerGroupAddRecord(hgroup: Long, precord: Long, precordid: Long): HRESULT

public expect fun PeerGroupClose(hgroup: Long): HRESULT

public expect fun PeerGroupCloseDirectConnection(hgroup: Long, ullconnectionid: ULong): HRESULT

public expect fun PeerGroupConnect(hgroup: Long): HRESULT

public expect fun PeerGroupConnectByAddress(hgroup: Long, caddresses: UInt, paddresses: Long): HRESULT

public expect fun PeerGroupCreate(pproperties: Long, phgroup: Long): HRESULT

public expect fun PeerGroupCreateInvitation(hgroup: Long, pwzidentityinfo: PCWSTR, pftexpiration: Long, croles: UInt, proles: Long, ppwzinvitation: Long): HRESULT

public expect fun PeerGroupCreatePasswordInvitation(hgroup: Long, ppwzinvitation: Long): HRESULT

public expect fun PeerGroupDelete(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR): HRESULT

public expect fun PeerGroupDeleteRecord(hgroup: Long, precordid: Long): HRESULT

public expect fun PeerGroupEnumConnections(hgroup: Long, dwflags: UInt, phpeerenum: Long): HRESULT

public expect fun PeerGroupEnumMembers(hgroup: Long, dwflags: UInt, pwzidentity: PCWSTR, phpeerenum: Long): HRESULT

public expect fun PeerGroupEnumRecords(hgroup: Long, precordtype: Long, phpeerenum: Long): HRESULT

public expect fun PeerGroupExportConfig(hgroup: Long, pwzpassword: PCWSTR, ppwzxml: Long): HRESULT

public expect fun PeerGroupExportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT

public expect fun PeerGroupGetEventData(hpeerevent: Long, ppeventdata: Long): HRESULT

public expect fun PeerGroupGetProperties(hgroup: Long, ppproperties: Long): HRESULT

public expect fun PeerGroupGetRecord(hgroup: Long, precordid: Long, pprecord: Long): HRESULT

public expect fun PeerGroupGetStatus(hgroup: Long, pdwstatus: Long): HRESULT

public expect fun PeerGroupImportConfig(pwzxml: PCWSTR, pwzpassword: PCWSTR, foverwrite: BOOL, ppwzidentity: Long, ppwzgroup: Long): HRESULT

public expect fun PeerGroupImportDatabase(hgroup: Long, pwzfilepath: PCWSTR): HRESULT

public expect fun PeerGroupIssueCredentials(hgroup: Long, pwzsubjectidentity: PCWSTR, pcredentialinfo: Long, dwflags: UInt, ppwzinvitation: Long): HRESULT

public expect fun PeerGroupJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT

public expect fun PeerGroupOpen(pwzidentity: PCWSTR, pwzgrouppeername: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT

public expect fun PeerGroupOpenDirectConnection(hgroup: Long, pwzidentity: PCWSTR, paddress: Long, pullconnectionid: Long): HRESULT

public expect fun PeerGroupParseInvitation(pwzinvitation: PCWSTR, ppinvitationinfo: Long): HRESULT

public expect fun PeerGroupPasswordJoin(pwzidentity: PCWSTR, pwzinvitation: PCWSTR, pwzpassword: PCWSTR, pwzcloud: PCWSTR, phgroup: Long): HRESULT

public expect fun PeerGroupPeerTimeToUniversalTime(hgroup: Long, pftpeertime: Long, pftuniversaltime: Long): HRESULT

public expect fun PeerGroupRegisterEvent(hgroup: Long, hevent: HANDLE, ceventregistration: UInt, peventregistrations: Long, phpeerevent: Long): HRESULT

public expect fun PeerGroupResumePasswordAuthentication(hgroup: Long, hpeereventhandle: Long): HRESULT

public expect fun PeerGroupSearchRecords(hgroup: Long, pwzcriteria: PCWSTR, phpeerenum: Long): HRESULT

public expect fun PeerGroupSendData(hgroup: Long, ullconnectionid: ULong, ptype: Long, cbdata: UInt, pvdata: Long): HRESULT

public expect fun PeerGroupSetProperties(hgroup: Long, pproperties: Long): HRESULT

public expect fun PeerGroupShutdown(): HRESULT

public expect fun PeerGroupStartup(wversionrequested: UShort, pversiondata: Long): HRESULT

public expect fun PeerGroupUniversalTimeToPeerTime(hgroup: Long, pftuniversaltime: Long, pftpeertime: Long): HRESULT

public expect fun PeerGroupUnregisterEvent(hpeerevent: Long): HRESULT

public expect fun PeerGroupUpdateRecord(hgroup: Long, precord: Long): HRESULT

public expect fun PeerHostNameToPeerName(pwzhostname: PCWSTR, ppwzpeername: Long): HRESULT

public expect fun PeerIdentityCreate(pwzclassifier: PCWSTR, pwzfriendlyname: PCWSTR, hcryptprov: ULong, ppwzidentity: Long): HRESULT

public expect fun PeerIdentityDelete(pwzidentity: PCWSTR): HRESULT

public expect fun PeerIdentityExport(pwzidentity: PCWSTR, pwzpassword: PCWSTR, ppwzexportxml: Long): HRESULT

public expect fun PeerIdentityGetCryptKey(pwzidentity: PCWSTR, phcryptprov: Long): HRESULT

public expect fun PeerIdentityGetDefault(ppwzpeername: Long): HRESULT

public expect fun PeerIdentityGetFriendlyName(pwzidentity: PCWSTR, ppwzfriendlyname: Long): HRESULT

public expect fun PeerIdentityGetXML(pwzidentity: PCWSTR, ppwzidentityxml: Long): HRESULT

public expect fun PeerIdentityImport(pwzimportxml: PCWSTR, pwzpassword: PCWSTR, ppwzidentity: Long): HRESULT

public expect fun PeerIdentitySetFriendlyName(pwzidentity: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT

public expect fun PeerNameToPeerHostName(pwzpeername: PCWSTR, ppwzhostname: Long): HRESULT

public expect fun PeerPnrpEndResolve(hresolve: Long): HRESULT

public expect fun PeerPnrpGetCloudInfo(pcnumclouds: Long, ppcloudinfo: Long): HRESULT

public expect fun PeerPnrpGetEndpoint(hresolve: Long, ppendpoint: Long): HRESULT

public expect fun PeerPnrpRegister(pcwzpeername: PCWSTR, pregistrationinfo: Long, phregistration: Long): HRESULT

public expect fun PeerPnrpResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, pcendpoints: Long, ppendpoints: Long): HRESULT

public expect fun PeerPnrpShutdown(): HRESULT

public expect fun PeerPnrpStartResolve(pcwzpeername: PCWSTR, pcwzcloudname: PCWSTR, cmaxendpoints: UInt, hevent: HANDLE, phresolve: Long): HRESULT

public expect fun PeerPnrpStartup(wversionrequested: UShort): HRESULT

public expect fun PeerPnrpUnregister(hregistration: Long): HRESULT

public expect fun PeerPnrpUpdateRegistration(hregistration: Long, pregistrationinfo: Long): HRESULT
