package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun drtClose(hdrt: COpaquePointer?)

public expect fun drtContinueSearch(hsearchcontext: COpaquePointer?): Hresult

public expect fun drtCreateDerivedKey(plocalcert: COpaquePointer?, pkey: COpaquePointer?): Hresult

public expect fun drtCreateDerivedKeySecurityProvider(prootcert: COpaquePointer?, plocalcert: COpaquePointer?, ppsecurityprovider: COpaquePointer?): Hresult

public expect fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: COpaquePointer?): Hresult

public expect fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: COpaquePointer?, phtransport: COpaquePointer?): Hresult

public expect fun drtCreateNullSecurityProvider(ppsecurityprovider: COpaquePointer?): Hresult

public expect fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: COpaquePointer?): Hresult

public expect fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: COpaquePointer?)

public expect fun drtDeleteDnsBootstrapResolver(presolver: COpaquePointer?)

public expect fun drtDeleteIpv6UdpTransport(htransport: COpaquePointer?): Hresult

public expect fun drtDeleteNullSecurityProvider(psecurityprovider: COpaquePointer?)

public expect fun drtDeletePnrpBootstrapResolver(presolver: COpaquePointer?)

public expect fun drtEndSearch(hsearchcontext: COpaquePointer?): Hresult

public expect fun drtGetEventData(hdrt: COpaquePointer?, uleventdatalen: UInt, peventdata: COpaquePointer?): Hresult

public expect fun drtGetEventDataSize(hdrt: COpaquePointer?, puleventdatalen: COpaquePointer?): Hresult

public expect fun drtGetInstanceName(hdrt: COpaquePointer?, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult

public expect fun drtGetInstanceNameSize(hdrt: COpaquePointer?, pulcbinstancenamesize: COpaquePointer?): Hresult

public expect fun drtGetSearchPath(hsearchcontext: COpaquePointer?, ulsearchpathsize: UInt, psearchpath: COpaquePointer?): Hresult

public expect fun drtGetSearchPathSize(hsearchcontext: COpaquePointer?, pulsearchpathsize: COpaquePointer?): Hresult

public expect fun drtGetSearchResult(hsearchcontext: COpaquePointer?, ulsearchresultsize: UInt, psearchresult: COpaquePointer?): Hresult

public expect fun drtGetSearchResultSize(hsearchcontext: COpaquePointer?, pulsearchresultsize: COpaquePointer?): Hresult

public expect fun drtOpen(psettings: COpaquePointer?, hevent: Handle, pvcontext: COpaquePointer?, phdrt: COpaquePointer?): Hresult

public expect fun drtRegisterKey(hdrt: COpaquePointer?, pregistration: COpaquePointer?, pvkeycontext: COpaquePointer?, phkeyregistration: COpaquePointer?): Hresult

public expect fun drtStartSearch(hdrt: COpaquePointer?, pkey: COpaquePointer?, pinfo: COpaquePointer?, timeout: UInt, hevent: Handle, pvcontext: COpaquePointer?, hsearchcontext: COpaquePointer?): Hresult

public expect fun drtUnregisterKey(hkeyregistration: COpaquePointer?)

public expect fun drtUpdateKey(hkeyregistration: COpaquePointer?, pappdata: COpaquePointer?): Hresult

public expect fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: COpaquePointer?): Hresult

public expect fun peerCollabAsyncInviteContact(pccontact: COpaquePointer?, pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, hevent: Handle, phinvitation: COpaquePointer?): Hresult

public expect fun peerCollabAsyncInviteEndpoint(pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, hevent: Handle, phinvitation: COpaquePointer?): Hresult

public expect fun peerCollabCancelInvitation(hinvitation: Handle): Hresult

public expect fun peerCollabCloseHandle(hinvitation: Handle): Hresult

public expect fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult

public expect fun peerCollabDeleteEndpointData(pcendpoint: COpaquePointer?): Hresult

public expect fun peerCollabDeleteObject(pobjectid: COpaquePointer?): Hresult

public expect fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: COpaquePointer?): Hresult

public expect fun peerCollabEnumApplications(pcendpoint: COpaquePointer?, papplicationid: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult

public expect fun peerCollabEnumContacts(phpeerenum: COpaquePointer?): Hresult

public expect fun peerCollabEnumEndpoints(pccontact: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult

public expect fun peerCollabEnumObjects(pcendpoint: COpaquePointer?, pobjectid: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult

public expect fun peerCollabEnumPeopleNearMe(phpeerenum: COpaquePointer?): Hresult

public expect fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: COpaquePointer?): Hresult

public expect fun peerCollabGetAppLaunchInfo(pplaunchinfo: COpaquePointer?): Hresult

public expect fun peerCollabGetApplicationRegistrationInfo(papplicationid: COpaquePointer?, registrationtype: PeerApplicationRegistrationType, ppapplication: COpaquePointer?): Hresult

public expect fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: COpaquePointer?): Hresult

public expect fun peerCollabGetEndpointName(ppwzendpointname: COpaquePointer?): Hresult

public expect fun peerCollabGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult

public expect fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: COpaquePointer?): Hresult

public expect fun peerCollabGetPresenceInfo(pcendpoint: COpaquePointer?, pppresenceinfo: COpaquePointer?): Hresult

public expect fun peerCollabGetSigninOptions(pdwsigninoptions: COpaquePointer?): Hresult

public expect fun peerCollabInviteContact(pccontact: COpaquePointer?, pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, ppresponse: COpaquePointer?): Hresult

public expect fun peerCollabInviteEndpoint(pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, ppresponse: COpaquePointer?): Hresult

public expect fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: COpaquePointer?): Hresult

public expect fun peerCollabQueryContactData(pcendpoint: COpaquePointer?, ppwzcontactdata: COpaquePointer?): Hresult

public expect fun peerCollabRefreshEndpointData(pcendpoint: COpaquePointer?): Hresult

public expect fun peerCollabRegisterApplication(pcapplication: COpaquePointer?, registrationtype: PeerApplicationRegistrationType): Hresult

public expect fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult

public expect fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult

public expect fun peerCollabSetObject(pcobject: COpaquePointer?): Hresult

public expect fun peerCollabSetPresenceInfo(pcpresenceinfo: COpaquePointer?): Hresult

public expect fun peerCollabShutdown(): Hresult

public expect fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult

public expect fun peerCollabSignout(dwsigninoptions: UInt): Hresult

public expect fun peerCollabStartup(wversionrequested: UShort): Hresult

public expect fun peerCollabSubscribeEndpointData(pcendpoint: COpaquePointer?): Hresult

public expect fun peerCollabUnregisterApplication(papplicationid: COpaquePointer?, registrationtype: PeerApplicationRegistrationType): Hresult

public expect fun peerCollabUnregisterEvent(hpeerevent: COpaquePointer?): Hresult

public expect fun peerCollabUnsubscribeEndpointData(pcendpoint: COpaquePointer?): Hresult

public expect fun peerCollabUpdateContact(pcontact: COpaquePointer?): Hresult

public expect fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: COpaquePointer?): Hresult

public expect fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt

public expect fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt

public expect fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, dwtimeoutinmilliseconds: UInt, lpoverlapped: COpaquePointer?): UInt

public expect fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: COpaquePointer?): UInt

public expect fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt

public expect fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: COpaquePointer?): UInt

public expect fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?): UInt

public expect fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: COpaquePointer?): UInt

public expect fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: COpaquePointer?): UInt

public expect fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, dwtimeoutinmilliseconds: UInt, lpoverlapped: COpaquePointer?): UInt

public expect fun peerDistGetOverlappedResult(lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool

public expect fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: COpaquePointer?): UInt

public expect fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: COpaquePointer?): UInt

public expect fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?, ppeerdiststatus: COpaquePointer?): UInt

public expect fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?, ppeerdiststatus: COpaquePointer?): UInt

public expect fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, poverlapped: COpaquePointer?): UInt

public expect fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt

public expect fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt

public expect fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: COpaquePointer?): UInt

public expect fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: COpaquePointer?): UInt

public expect fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt

public expect fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: COpaquePointer?): UInt

public expect fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, cbcontentlength: ULong, ppublishoptions: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phstream: COpaquePointer?): UInt

public expect fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt

public expect fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?): UInt

public expect fun peerDistShutdown(hpeerdist: Long): UInt

public expect fun peerDistStartup(dwversionrequested: UInt, phpeerdist: COpaquePointer?, pdwsupportedversion: COpaquePointer?): UInt

public expect fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt

public expect fun peerEndEnumeration(hpeerenum: COpaquePointer?): Hresult

public expect fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: COpaquePointer?): Hresult

public expect fun peerEnumIdentities(phpeerenum: COpaquePointer?): Hresult

public expect fun peerFreeData(pvdata: COpaquePointer?)

public expect fun peerGetItemCount(hpeerenum: COpaquePointer?, pcount: COpaquePointer?): Hresult

public expect fun peerGetNextItem(hpeerenum: COpaquePointer?, pcount: COpaquePointer?, pppvitems: COpaquePointer?): Hresult

public expect fun peerGraphAddRecord(hgraph: COpaquePointer?, precord: COpaquePointer?, precordid: COpaquePointer?): Hresult

public expect fun peerGraphClose(hgraph: COpaquePointer?): Hresult

public expect fun peerGraphCloseDirectConnection(hgraph: COpaquePointer?, ullconnectionid: ULong): Hresult

public expect fun peerGraphConnect(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult

public expect fun peerGraphCreate(pgraphproperties: COpaquePointer?, pwzdatabasename: Pcwstr, psecurityinterface: COpaquePointer?, phgraph: COpaquePointer?): Hresult

public expect fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult

public expect fun peerGraphDeleteRecord(hgraph: COpaquePointer?, precordid: COpaquePointer?, flocal: Bool): Hresult

public expect fun peerGraphEndEnumeration(hpeerenum: COpaquePointer?): Hresult

public expect fun peerGraphEnumConnections(hgraph: COpaquePointer?, dwflags: UInt, phpeerenum: COpaquePointer?): Hresult

public expect fun peerGraphEnumNodes(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, phpeerenum: COpaquePointer?): Hresult

public expect fun peerGraphEnumRecords(hgraph: COpaquePointer?, precordtype: COpaquePointer?, pwzpeerid: Pcwstr, phpeerenum: COpaquePointer?): Hresult

public expect fun peerGraphExportDatabase(hgraph: COpaquePointer?, pwzfilepath: Pcwstr): Hresult

public expect fun peerGraphFreeData(pvdata: COpaquePointer?)

public expect fun peerGraphGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult

public expect fun peerGraphGetItemCount(hpeerenum: COpaquePointer?, pcount: COpaquePointer?): Hresult

public expect fun peerGraphGetNextItem(hpeerenum: COpaquePointer?, pcount: COpaquePointer?, pppvitems: COpaquePointer?): Hresult

public expect fun peerGraphGetNodeInfo(hgraph: COpaquePointer?, ullnodeid: ULong, ppnodeinfo: COpaquePointer?): Hresult

public expect fun peerGraphGetProperties(hgraph: COpaquePointer?, ppgraphproperties: COpaquePointer?): Hresult

public expect fun peerGraphGetRecord(hgraph: COpaquePointer?, precordid: COpaquePointer?, pprecord: COpaquePointer?): Hresult

public expect fun peerGraphGetStatus(hgraph: COpaquePointer?, pdwstatus: COpaquePointer?): Hresult

public expect fun peerGraphImportDatabase(hgraph: COpaquePointer?, pwzfilepath: Pcwstr): Hresult

public expect fun peerGraphListen(hgraph: COpaquePointer?, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult

public expect fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: COpaquePointer?, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: COpaquePointer?, phgraph: COpaquePointer?): Hresult

public expect fun peerGraphOpenDirectConnection(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult

public expect fun peerGraphPeerTimeToUniversalTime(hgraph: COpaquePointer?, pftpeertime: COpaquePointer?, pftuniversaltime: COpaquePointer?): Hresult

public expect fun peerGraphRegisterEvent(hgraph: COpaquePointer?, hevent: Handle, ceventregistrations: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult

public expect fun peerGraphSearchRecords(hgraph: COpaquePointer?, pwzcriteria: Pcwstr, phpeerenum: COpaquePointer?): Hresult

public expect fun peerGraphSendData(hgraph: COpaquePointer?, ullconnectionid: ULong, ptype: COpaquePointer?, cbdata: UInt, pvdata: COpaquePointer?): Hresult

public expect fun peerGraphSetNodeAttributes(hgraph: COpaquePointer?, pwzattributes: Pcwstr): Hresult

public expect fun peerGraphSetPresence(hgraph: COpaquePointer?, fpresent: Bool): Hresult

public expect fun peerGraphSetProperties(hgraph: COpaquePointer?, pgraphproperties: COpaquePointer?): Hresult

public expect fun peerGraphShutdown(): Hresult

public expect fun peerGraphStartup(wversionrequested: UShort, pversiondata: COpaquePointer?): Hresult

public expect fun peerGraphUniversalTimeToPeerTime(hgraph: COpaquePointer?, pftuniversaltime: COpaquePointer?, pftpeertime: COpaquePointer?): Hresult

public expect fun peerGraphUnregisterEvent(hpeerevent: COpaquePointer?): Hresult

public expect fun peerGraphUpdateRecord(hgraph: COpaquePointer?, precord: COpaquePointer?): Hresult

public expect fun peerGraphValidateDeferredRecords(hgraph: COpaquePointer?, crecordids: UInt, precordids: COpaquePointer?): Hresult

public expect fun peerGroupAddRecord(hgroup: COpaquePointer?, precord: COpaquePointer?, precordid: COpaquePointer?): Hresult

public expect fun peerGroupClose(hgroup: COpaquePointer?): Hresult

public expect fun peerGroupCloseDirectConnection(hgroup: COpaquePointer?, ullconnectionid: ULong): Hresult

public expect fun peerGroupConnect(hgroup: COpaquePointer?): Hresult

public expect fun peerGroupConnectByAddress(hgroup: COpaquePointer?, caddresses: UInt, paddresses: COpaquePointer?): Hresult

public expect fun peerGroupCreate(pproperties: COpaquePointer?, phgroup: COpaquePointer?): Hresult

public expect fun peerGroupCreateInvitation(hgroup: COpaquePointer?, pwzidentityinfo: Pcwstr, pftexpiration: COpaquePointer?, croles: UInt, proles: COpaquePointer?, ppwzinvitation: COpaquePointer?): Hresult

public expect fun peerGroupCreatePasswordInvitation(hgroup: COpaquePointer?, ppwzinvitation: COpaquePointer?): Hresult

public expect fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult

public expect fun peerGroupDeleteRecord(hgroup: COpaquePointer?, precordid: COpaquePointer?): Hresult

public expect fun peerGroupEnumConnections(hgroup: COpaquePointer?, dwflags: UInt, phpeerenum: COpaquePointer?): Hresult

public expect fun peerGroupEnumMembers(hgroup: COpaquePointer?, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: COpaquePointer?): Hresult

public expect fun peerGroupEnumRecords(hgroup: COpaquePointer?, precordtype: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult

public expect fun peerGroupExportConfig(hgroup: COpaquePointer?, pwzpassword: Pcwstr, ppwzxml: COpaquePointer?): Hresult

public expect fun peerGroupExportDatabase(hgroup: COpaquePointer?, pwzfilepath: Pcwstr): Hresult

public expect fun peerGroupGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult

public expect fun peerGroupGetProperties(hgroup: COpaquePointer?, ppproperties: COpaquePointer?): Hresult

public expect fun peerGroupGetRecord(hgroup: COpaquePointer?, precordid: COpaquePointer?, pprecord: COpaquePointer?): Hresult

public expect fun peerGroupGetStatus(hgroup: COpaquePointer?, pdwstatus: COpaquePointer?): Hresult

public expect fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: COpaquePointer?, ppwzgroup: COpaquePointer?): Hresult

public expect fun peerGroupImportDatabase(hgroup: COpaquePointer?, pwzfilepath: Pcwstr): Hresult

public expect fun peerGroupIssueCredentials(hgroup: COpaquePointer?, pwzsubjectidentity: Pcwstr, pcredentialinfo: COpaquePointer?, dwflags: UInt, ppwzinvitation: COpaquePointer?): Hresult

public expect fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult

public expect fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult

public expect fun peerGroupOpenDirectConnection(hgroup: COpaquePointer?, pwzidentity: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult

public expect fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: COpaquePointer?): Hresult

public expect fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult

public expect fun peerGroupPeerTimeToUniversalTime(hgroup: COpaquePointer?, pftpeertime: COpaquePointer?, pftuniversaltime: COpaquePointer?): Hresult

public expect fun peerGroupRegisterEvent(hgroup: COpaquePointer?, hevent: Handle, ceventregistration: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult

public expect fun peerGroupResumePasswordAuthentication(hgroup: COpaquePointer?, hpeereventhandle: COpaquePointer?): Hresult

public expect fun peerGroupSearchRecords(hgroup: COpaquePointer?, pwzcriteria: Pcwstr, phpeerenum: COpaquePointer?): Hresult

public expect fun peerGroupSendData(hgroup: COpaquePointer?, ullconnectionid: ULong, ptype: COpaquePointer?, cbdata: UInt, pvdata: COpaquePointer?): Hresult

public expect fun peerGroupSetProperties(hgroup: COpaquePointer?, pproperties: COpaquePointer?): Hresult

public expect fun peerGroupShutdown(): Hresult

public expect fun peerGroupStartup(wversionrequested: UShort, pversiondata: COpaquePointer?): Hresult

public expect fun peerGroupUniversalTimeToPeerTime(hgroup: COpaquePointer?, pftuniversaltime: COpaquePointer?, pftpeertime: COpaquePointer?): Hresult

public expect fun peerGroupUnregisterEvent(hpeerevent: COpaquePointer?): Hresult

public expect fun peerGroupUpdateRecord(hgroup: COpaquePointer?, precord: COpaquePointer?): Hresult

public expect fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: COpaquePointer?): Hresult

public expect fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: COpaquePointer?): Hresult

public expect fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult

public expect fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: COpaquePointer?): Hresult

public expect fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: COpaquePointer?): Hresult

public expect fun peerIdentityGetDefault(ppwzpeername: COpaquePointer?): Hresult

public expect fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: COpaquePointer?): Hresult

public expect fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: COpaquePointer?): Hresult

public expect fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: COpaquePointer?): Hresult

public expect fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult

public expect fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: COpaquePointer?): Hresult

public expect fun peerPnrpEndResolve(hresolve: COpaquePointer?): Hresult

public expect fun peerPnrpGetCloudInfo(pcnumclouds: COpaquePointer?, ppcloudinfo: COpaquePointer?): Hresult

public expect fun peerPnrpGetEndpoint(hresolve: COpaquePointer?, ppendpoint: COpaquePointer?): Hresult

public expect fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: COpaquePointer?, phregistration: COpaquePointer?): Hresult

public expect fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: COpaquePointer?, ppendpoints: COpaquePointer?): Hresult

public expect fun peerPnrpShutdown(): Hresult

public expect fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: COpaquePointer?): Hresult

public expect fun peerPnrpStartup(wversionrequested: UShort): Hresult

public expect fun peerPnrpUnregister(hregistration: COpaquePointer?): Hresult

public expect fun peerPnrpUpdateRegistration(hregistration: COpaquePointer?, pregistrationinfo: COpaquePointer?): Hresult
